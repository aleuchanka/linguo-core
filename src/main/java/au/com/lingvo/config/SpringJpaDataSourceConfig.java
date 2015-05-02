package au.com.lingvo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class SpringJpaDataSourceConfig {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";

    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";

    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";

    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

    private final Logger log = LoggerFactory.getLogger(SpringJpaDataSourceConfig.class);

    @Resource
    private Environment environment;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws PropertyVetoException {
        HikariConfig config = new HikariConfig();
        config.setDataSourceClassName(environment.getProperty(PROPERTY_NAME_DATABASE_DRIVER));
        config.addDataSourceProperty("url", environment.getProperty(PROPERTY_NAME_DATABASE_URL));
        config.addDataSourceProperty("user", environment.getProperty(PROPERTY_NAME_DATABASE_USERNAME));
        config.addDataSourceProperty("password", environment.getProperty(PROPERTY_NAME_DATABASE_PASSWORD));
        return new HikariDataSource(config);

    }
}

