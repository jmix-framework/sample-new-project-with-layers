package com.company.sample.ui;

import io.jmix.core.annotation.JmixModule;
import io.jmix.core.impl.scanning.AnnotationScanMetadataReaderFactory;
import io.jmix.ui.UiConfiguration;
import io.jmix.ui.sys.ActionsConfiguration;
import io.jmix.ui.sys.UiControllersConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Collections;

@Configuration
@ComponentScan
@JmixModule(dependsOn = {UiConfiguration.class})
@PropertySource(name = "com.company.sample.ui", value = "classpath:/com/company/sample/ui/module.properties")
public class SampleUiConfiguration {

    @Bean
    public UiControllersConfiguration uiControllersConfiguration(
            ApplicationContext applicationContext,
            AnnotationScanMetadataReaderFactory metadataReaderFactory) {

        UiControllersConfiguration uiControllers
                = new UiControllersConfiguration(applicationContext, metadataReaderFactory);
        uiControllers.setBasePackages(Collections.singletonList("com.company.sample.ui"));
        return uiControllers;
    }

    @Bean
    public ActionsConfiguration actionsConfiguration(
            ApplicationContext applicationContext,
            AnnotationScanMetadataReaderFactory metadataReaderFactory) {

        ActionsConfiguration actionsConfiguration = new ActionsConfiguration(applicationContext, metadataReaderFactory);
        actionsConfiguration.setBasePackages(Collections.singletonList("com.company.sample.ui"));
        return actionsConfiguration;
    }
}
