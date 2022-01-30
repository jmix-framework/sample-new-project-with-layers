package com.company.sample.data;

import io.jmix.core.annotation.JmixModule;
import io.jmix.eclipselink.EclipselinkConfiguration;
import io.jmix.securitydata.SecurityDataConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@JmixModule(dependsOn = {EclipselinkConfiguration.class, SecurityDataConfiguration.class})
@PropertySource(name = "com.company.sample.data", value = "classpath:/com/company/sample/data/module.properties")
public class SampleDataConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties("main.datasource")
    DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("main.datasource.hikari")
    DataSource dataSource(DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
}
