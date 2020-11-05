package com.company.sample.data;

import io.jmix.core.annotation.JmixModule;
import io.jmix.data.DataConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@JmixModule(dependsOn = {DataConfiguration.class})
@PropertySource(name = "com.company.sample.data", value = "classpath:/com/company/sample/data/module.properties")
public class SampleDataConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "main.datasource")
    DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
