# ZeroError

## Description

Api server for ZeroError Android App



## Requirements

- JDK 11
- Gradle 7
- Spring Boot 2.7.3
- MySQL 8
- IntelliJ IDEA
  - Install lombok Plugin on IntelliJ IDEA



## Execution

### Configuration

- Edit requirement_example.yml file

  - Rename [requirement_example](https://github.com/PurpleCheck/Backend/blob/main/zeroError/src/main/resources/application_example.yml) to requirement

  - Change code

    ~~~
    spring:
      datasource:
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://{database_access_point}/{database_name}
        username: {user_name}
        password: {password}
    ~~~

  - example

    ~~~
    spring:
      datasource:
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/test
        username: root
        password: 12345678
    ~~~



### Run MySQL

- Run MySQL server

- Use [database](https://github.com/PurpleCheck/Backend/tree/main/database) files or your own sql file

  - {path}: where your sql query locate

    ~~~
    # schema
    mysql> source {path}/Create_Table_Script.sql;
    
    # dummy data
    mysql> source {path}/Dummy_Data_Sript.sql;
    ~~~

  
  

### Run Spring Boot

- Build

  - Go to the location of the gradle file and execute the code

    ~~~
    # for mac
    ./gradlew build
    
    # for window
    ./gradlew.bat build
    ~~~

- Run

   - Go to the location where .jar file generated (ex. /build/libs) and execute the code

     ~~~
     java -jar {spring_boot_file_generated.jar}
     ~~~

     
