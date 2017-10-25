package org.iob.ls.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Ayoub on 25/10/2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.iob.ls")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
