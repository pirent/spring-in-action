package chapter5.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// @Configuration class returned from this method is used for 
		// configure application context created by ContextLoaderListener
		// these beans are typically the mid-tier and data-tier components
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// asks the DispatcherServlet load its application context
		// with beans defined in the following configuration class
		// these beans are web components such as controller, view resolver and handler mapping
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// Specify one or more paths that Dispatcher Servlet will be mapped to
		// in this case, it will be the application's default server
		return new String[] { "/" };
	}

}
