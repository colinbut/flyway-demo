/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.flyway;

import org.flywaydb.core.Flyway;

public final class FlywayMigration {

    private FlywayMigration() {
    }

    /**
     * mvn package exec:java -Dexec.mainClass=com.mycompany.flyway.FlywayMigration
     *
     * @param args
     */
    public static void main(String[] args) {

        // Creating the Flyway instance
        Flyway flyway = new Flyway();

        // pointing it to the database
        flyway.setDataSource("", "SA", null);

        // migration
        flyway.migrate();
    }
}
