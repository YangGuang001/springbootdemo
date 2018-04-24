package com.yang.spring.LogController;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "log")
public class LogProperties {
    private String packagePath;
    private String levelName;
    private int duration;
}
