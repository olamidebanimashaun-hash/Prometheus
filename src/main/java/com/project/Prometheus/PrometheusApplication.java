package com.project.Prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project")
public class PrometheusApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrometheusApplication.class, args);
    }
}