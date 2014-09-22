CREATE DATABASE library;

CREATE TABLE `author` (
  `id` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

java -classpath lib/jooq-3.4.2.jar:lib/jooq-meta-3.4.2.jar:lib/jooq-codegen-3.4.2.jar:lib/mysql-connector-java-5.1.32-bin.jar:. org.jooq.util.GenerationTool /library.xml
