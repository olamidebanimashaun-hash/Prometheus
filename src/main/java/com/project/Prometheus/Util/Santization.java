package com.project.Prometheus.Util;

public class Santization {
    public static String sanitizeInput(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[^a-zA-Z0-9 _.,!'-]", "");
    }
}
