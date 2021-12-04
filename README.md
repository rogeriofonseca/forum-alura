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

## `How to use`?
**Run the command to compile:<p>**
`mvn clean install`


**To start the project. Run:** <p>
`mvn spring-boot:run`<p>
| ![spring_run](https://user-images.githubusercontent.com/1026153/143613408-70c527df-9d7b-400b-87f1-8e844b55c82d.png)|
|:--:|
| <b>Image containing command result mvn spring-boot:run</b>|


After running the above command, the application will be available at: `http://localhost:8080`

## `Endpoints`
### **List Topics:**<p>
**Link:** :link: `http://localhost:8080/topicos?page=0&size=2&sort=id,asc` **Method GET**<p>

<details>
<summary>Postman Screenshot *[Click Here!]* :point_left: &nbsp; :framed_picture:</summary>
  
  |![Screenshot_03_12_21_23_00](https://user-images.githubusercontent.com/1026153/144692974-19309201-1fbb-43da-b7d1-c38f702a5582.png)|
  |:--:|
  | <b>Postman Screenshot with Request Result</b>|
</details>


**Link:** :link: `http://localhost:8080/topicos/{ID}` **Method POST**<p>
  If you want to add a new record to try the endpoint, you can run the following CURL command in the terminal. And that will create a new record.
```
  curl -X POST \
  http://localhost:8080/topicos \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
    "titulo": "Question About Spring Validation",
    "mensagem": "Currently, should I add a new dependency for this to work?",
    "nomeCurso": "Spring Boot"
}'
```
Or it's also possible through postman:
|![postman_topicos_post_cadastrar](https://user-images.githubusercontent.com/1026153/144537417-3a8a81a8-fa61-44fb-b64e-d59149583ac4.png) |
|:--:|  
| <b>Screenshot with the request made through postman.</b> |

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
| <b>H2 database interface showing tables in a column on the left of the screen.</b> |

## Initial Data Load

The data located in the following path will be loaded at startup.

**Initial data structure:** [src/main/resources/data.sql](https://github.com/rogeriofonseca/forum-alura/blob/main/src/main/resources/data.sql) :page_facing_up:

## Filter using Spring Data

:link:[Commit ##07c7d303a4](https://github.com/rogeriofonseca/forum-alura/blob/07c7d303a4b784cbdca83aad5e0da86f2c14df75/src/main/java/br/com/alura/forum/controller/TopicosController.java#L22)<br>
To search topics using the filter, you must enter the parameter in the URL:
[http://localhost:8080/topicos?param=Spring+Boot](http://localhost:8080/topicos?param=Spring+Boot)
