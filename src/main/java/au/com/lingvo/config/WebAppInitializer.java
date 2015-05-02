package au.com.lingvo.config;

import au.com.lingvo.filters.SimpleCORSFilter;
import org.springframework.data.rest.webmvc.RepositoryRestDispatcherServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class WebAppInitializer implements WebApplicationInitializer {

    public void onStartup(final ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);
        Dynamic dynamic = servletContext.addServlet("dispatcher", new RepositoryRestDispatcherServlet(ctx));
        dynamic.addMapping("/*");
        dynamic.setLoadOnStartup(1);

        servletContext.addFilter("simpleCORSFilter", new SimpleCORSFilter()).
                addMappingForUrlPatterns(null, false, "/*");
    }

}
