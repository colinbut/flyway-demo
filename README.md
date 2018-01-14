# Flyway Demo

This is a short and quick demo github project of the Flyway - Database Migration Tool

Flyway allows migration of database scripts to be done via multiple ways.

You can migrate using a build tool such as Maven or Gradle. You can also migrate using Flyway Java API. 
Thirdly, it is also possible to use Flyway's own command line tool directly. 

### Setting Things Up

Before you begin migrating you require to do some initial setup first.

By default this demo project provides migration into a H2 embedded in-memory database. 
However, you can choose to use a different relational database.

For example, if using MySQL:

1. Downloading and Install MySQL server
2. Run the `init-db.sql` file on MySQL to create the database, and its access credentials
3. Follow any of the steps below to run the migration

`reset-db.sql` script is provided for dropping the already created database.


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

via Maven:

```bash
mvn package exec:java -Dexec.mainClass=com.mycompany.flyway.FlywayMigration
```

or Just run the `com.mycompany.flyway.FlywayMigration.java` class from an IDE

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

## Other Editions

Flyway Pro edition and above (Enterprise Edition) allows:

1. ~~Repeatable Migrations~~
2. Undo Migrations (_rollbacks_)
3. Error Handling (_treating errors as warnings by skipping_)


## Issues

If you find any issues with this demo project, please raise a Github issue.
