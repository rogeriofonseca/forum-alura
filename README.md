# :dart: forum-alura
This project is an example of implementing a Rest API using Spring Boot following instructions from the alura course.

## Summary
*   [`Requirements`](#requirements)
*   [`How to use?`](#how-to-use)
*   [`Endpoints`](#endpoints)
*   [`Adding H2 Database dependency and Console Browser`](#adding-h2-database-dependency-and-console-browser)
*   [`Commits Log`](commits-history)
*   [`Swagger`](swagger)

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

To search topics using the filter, you must enter the parameter in the URL:
[http://localhost:8080/topicos?param=Spring+Boot](http://localhost:8080/topicos?param=Spring+Boot)

## Swagger

The URL to access the Swagger is:
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

First, you must authenticate with a user, through endpoint `/auth` using for example:
```json
{
  "email": "aluno@email.com",
  "senha": "123456"
}
```

There are two credentials available:<br>
```javascript
  login: aluno@email.com
  password: 123456
```
```javascript
login: moderador@email.com
password: 123456
```


|![swagger](https://user-images.githubusercontent.com/1026153/159200093-ceef48ba-7be8-4ec8-b568-4166950fe615.png) |
|:--:|  
| <b>Swagger's screenshot.</b> |

## :hourglass_flowing_sand: `Commits History`
* [H2 Database Settings](https://github.com/rogeriofonseca/forum-alura/commit/3f7ac98e5c88a79f8304d71b47c560b476ea5d4a)
* [Data Spring Settings](https://github.com/rogeriofonseca/forum-alura/commit/e1cc0a9db84477b53065cdb2bfac54433dda694a)
* [Filter using Spring Data](https://github.com/rogeriofonseca/forum-alura/commit/07c7d303a4b784cbdca83aad5e0da86f2c14df75)
* [Bean Validations](https://github.com/rogeriofonseca/forum-alura/commit/496d6948724172c06126ee96cd764351ad807fe2)
* [Pagination Feature](https://github.com/rogeriofonseca/forum-alura/commit/2231ef2b34eea9549a4ffa04a7a12d516ac531f1)
* [Cache Feature](https://github.com/rogeriofonseca/forum-alura/commit/48934f6f282ce331825290611511f0c7aed20c52)
* [Session Authentication](https://github.com/rogeriofonseca/forum-alura/commit/2fb577a64c1309edaf653c92406319f0047451d5)
* [Token Authentication](https://github.com/rogeriofonseca/forum-alura/commit/31965d0a5bebcfc218cbf22ec1e104aa6c4bc7c2)
* [Rules Settings](https://github.com/rogeriofonseca/forum-alura/commit/ccdca1dcb6202e7db0c12cc28bb8542f2164d427)
