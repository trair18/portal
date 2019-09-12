package com.trair.portal.config;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class FlywayConfig implements FlywayMigrationStrategy {
    @Override
    public void migrate(Flyway flyway) {
        flyway.clean();
        flyway.migrate();
    }
}