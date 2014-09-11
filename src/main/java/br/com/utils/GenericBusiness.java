package br.com.utils;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public abstract class GenericBusiness<T extends AbstractEntity> implements
		GenericRepository<T> {

	@Inject
	protected EntityManager manager;
	protected final Class<T> clazz;

	protected GenericBusiness() {
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		this.clazz = clazz;
	}

	@Override
	public Collection<T> list() {
		Query query = manager.createQuery("from " + clazz.getName());

		@SuppressWarnings("unchecked")
		Collection<T> list = query.getResultList();

		return list;
	}

	@Override
	public T find(Long id) {
		return manager.find(clazz, id);
	}

	@Override
	public void remove(T entity) {
		manager.remove(manager.getReference(clazz, entity.getId()));
	}

	@Override
	public T save(T entity) {
		if (entity.getId() == null) {
			manager.persist(entity);
			return entity;
		}
		return manager.merge(entity);
	}

	@Override
	public void delete(Long id) {
		manager.remove(find(id));
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Criteria createCriteria(Class clazz) {
		return ((Session) manager.getDelegate()).createCriteria(clazz);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List findLike(Class clazz, String fieldName) {
		Criteria c = createCriteria(clazz);
		c.add(Restrictions.ilike("nome", "%" + fieldName + "%"));
		return c.list();
	}

	@Override
	@SuppressWarnings("rawtypes")
	public List find(Class clazz, Map<String, Object> map) {
		Criteria c = createCriteria(clazz);
		for (String key : map.keySet()) {
			c.add(Restrictions.eq(key, map.get(key)));
		}
		return c.list();
	}

}
