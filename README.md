# Flyway Demo

This is a short and quick demo github project of the Flyway - Database Migration Tool

Flyway allows migration of database scripts to be done via multiple ways.

You can migrate using a build tool such as Maven or Gradle. You can also migrate using Flyway Java API. 
Thirdly, it is also possible to use Flyway's own command line tool directly. 

#### Maven

Steps:

1. Add `flyway-maven-plugin` to the `pom.xml`
2. Create the migration scripts and place them into the migration folder
3. run the following command on maven:

```bash
mvn flyway:migrate
```

#### Java API

For instance, if using H2 database:

1. Add Flyway and H2 to `pom.xml`
2. Integrate Flyway - write a Java class
3. Create the migration scripts and place them into the migration folder
4. Execute the migration java class

#### Flyway command line tool

1. Download the Flyway command line tool
2. Edit the `conf/flyway.conf` configuration file with the appropriate details where necessary
3. Create the migration scripts and place them into the migration folder (`/sql`)
4. Run command

```bash
flyway migrate
```

### Useful Commands

Common Flyway commands, regardless whether of using maven or the command line tool.

Migrate:

```bash
flyway migrate
```

Reviewing the status:

```bash
flyway info
```
