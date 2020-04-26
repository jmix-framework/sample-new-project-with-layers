package com.company.sample.app;

import com.company.sample.data.SampleDataConfiguration;
import com.company.sample.ui.SampleUiConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SampleDataConfiguration.class, SampleUiConfiguration.class})
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}
