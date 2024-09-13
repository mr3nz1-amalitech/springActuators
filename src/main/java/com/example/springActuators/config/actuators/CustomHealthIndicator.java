package com.example.springActuators.config.actuators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
//        might execute some logic to check the health
        boolean isHealthy = true;


//        based on the outcome might return some different responses
        if (isHealthy) return Health.up().withDetail("Custom health", "All systems seem to be ok").build();

        return Health.down().withDetail("Custom health", "All systems seem to be down").build();
    }
}
