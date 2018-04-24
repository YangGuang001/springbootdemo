package com.yang.spring.LogController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LogProperties.class)
@ConditionalOnClass(LogController.class)
@ConditionalOnProperty(prefix = "log", value = "enable", matchIfMissing = true)
public class LogAutoConfiguration {

    @Autowired
    private LogProperties logProperties;

    @Bean
    public LogController logController() {
        LogController logController = new LogController(logProperties.getPackagePath(),
                logProperties.getLevelName(), logProperties.getDuration());
        return logController;
    }

}
