package com.example.springActuators.controllers;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "example")
public class CustomActuatorEndpoint {
    @ReadOperation
    public String customEndpoint() {
        return "Here  is a custom endpoint";
    }
}
