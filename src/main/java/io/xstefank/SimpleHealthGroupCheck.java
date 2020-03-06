package io.xstefank;

import io.smallrye.health.HealthGroup;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@HealthGroup("group1")
public class SimpleHealthGroupCheck implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("single");
    }
}
