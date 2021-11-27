# :dart: forum-alura
This project is an example of implementing a Rest API using Spring Boot following instructions from the alura course.

## Summary
*   [`Requirements`](#requirements)
*   [`How to use?`](#how-to-use)
*   [`Endpoints`](#endpoints)
*   [`Adding H2 Database dependency and Console Browser`](#adding-h2-database-dependency-and-console-browser)

### `Requirements`:
- [**Maven**](https://maven.apache.org/install.html) :gear:
- **Java 8+** :coffee:

## `How to use?`
**Run the command to compile:** <p>
`mvn clean install`

**To start the project. Run:** <p>
`mvn spring-boot:run`<p>
| ![spring_run](https://user-images.githubusercontent.com/1026153/143613408-70c527df-9d7b-400b-87f1-8e844b55c82d.png)|
|:--:|
| <b>Image containing command result mvn spring-boot:run</b>|


After running the above command, the application will be available at: `http://localhost:8080`

## `Endpoints`
**List Topics:**<p>
**Link:** :link: `http://localhost:8080/topicos`<p>
|![topicos_request](https://user-images.githubusercontent.com/1026153/143613392-80e49fb8-4efd-4c7c-b971-bdf82f190e60.png)|
|:--:|
| <b>Result of the request output in the browser.</b>|

  
## `Adding H2 Database dependency and Console Browser`
**Connection Settings:** :game_die:


<pre>
<b>Driver Class:</b> org.h2.Driver
<b>JDBC URL:</b> jdbc:h2:mem:alura-forum
<b>User Name:</b> sa
<b>Password: (leave this field empty)
</pre>

  :link:[Commit #3f7ac98e5c](https://github.com/rogeriofonseca/forum-alura/commit/3f7ac98e5c88a79f8304d71b47c560b476ea5d4a)
|![H2_Console](https://user-images.githubusercontent.com/1026153/143659243-bdb8c45d-95f1-4e53-b578-9bf2127fcc41.png)|
|:--:|  
| <b>H2 database interface showing tables in a column on the left of the screen.</b>|
