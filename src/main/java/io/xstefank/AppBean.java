package io.xstefank;

import io.smallrye.health.HealthGroup;
import org.eclipse.microprofile.health.HealthCheck;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class AppBean {

    @Inject
    @Any
    Instance<HealthCheck> allHealthChecks;

    public Instance<HealthCheck> getGroup(String groupName) {
        return allHealthChecks.select(HealthGroup.Literal.of(groupName));
    }
}
