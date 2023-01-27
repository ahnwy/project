package com.example.project.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "error")
public class CustomProperties {
    private String error403;
    private String error404;
    private String error500;

    public String getError403() {
        return error403;
    }

    public void setError403(String error403) {
        this.error403 = error403;
    }

    public String getError404() {
        return error404;
    }

    public void setError404(String error404) {
        this.error404 = error404;
    }

    public String getError500() {
        return error500;
    }

    public void setError500(String error500) {
        this.error500 = error500;
    }
}
