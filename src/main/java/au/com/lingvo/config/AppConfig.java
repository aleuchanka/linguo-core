package au.com.lingvo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("au.com.lingvo")
@EnableWebMvc
@EnableJpaRepositories(basePackages = "au.com.lingvo")
@Import(RepositoryRestMvcConfiguration.class)
@EnableScheduling
public class AppConfig extends RepositoryRestMvcConfiguration {

}
