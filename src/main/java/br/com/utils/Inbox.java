package br.com.utils;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("inbox")
public class Inbox implements Serializable {

	private static final long serialVersionUID = 1L;
	private Map<String, InboxMessage> messages = new LinkedHashMap<String, InboxMessage>();
	private String lastId;

	private enum MessageType {
		DANGER, WARNING, INFO, SUCCESS
	}

	public class InboxMessage implements Comparable<InboxMessage> {
		private String id;
		private String key;
		private Object[] params;
		private MessageType messageType;
		private String title;

		public InboxMessage(String key, Object... params) {
			this.id = key + "." + System.currentTimeMillis() + Math.random();
			this.key = key;
			this.params = params;
			this.messageType = MessageType.INFO;
			lastId = id;
			messages.put(id, this);
		}

		public void success() {
			this.messageType = MessageType.SUCCESS;
		}

		public void danger() {
			this.messageType = MessageType.DANGER;
		}

		public void info() {
			this.messageType = MessageType.INFO;
		}

		public void warning() {
			this.messageType = MessageType.WARNING;
		}

		public String getType() {
			return messageType.toString().toLowerCase();
		}

		public InboxMessage title(String title) {
			this.title = title;
			return this;
		}

		@Override
		public int compareTo(InboxMessage o) {
			return messageType.compareTo(o.getMessageType());
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Object[] getParams() {
			return params;
		}

		public void setParams(Object[] params) {
			this.params = params;
		}

		public MessageType getMessageType() {
			return messageType;
		}

		public void setMessageType(MessageType messageType) {
			this.messageType = messageType;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
	}

	public InboxMessage message(String key, Object... params) {
		new InboxMessage(key, params);
		return messages.get(lastId);
	}

	public Collection<InboxMessage> getMessages() {
		List<InboxMessage> list = new ArrayList<InboxMessage>(messages.values());
		Collections.sort(list);
		clear();
		return list;
	}

	@SuppressWarnings("rawtypes")
	public void listaVazia(Collection list) {
		if (list == null || list.isEmpty())
			message("msg.lista.vazia").info();
	}
	
	public void informeTodosOsCamposObrigatorios() {
		message("msg.informe.todos.campos.obrigatorios").warning();
	}
	
	public void operacaoNaoRealizada() {
		message("msg.operacao.nao.realizada").danger();
	}
	
	public void clear() {
		messages = new LinkedHashMap<String, InboxMessage>();
	}

}
