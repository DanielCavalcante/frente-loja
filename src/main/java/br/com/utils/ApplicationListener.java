package br.com.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("context",
				sce.getServletContext().getContextPath());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}