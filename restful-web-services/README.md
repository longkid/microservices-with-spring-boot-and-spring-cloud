# RESTful Web Services

## Social Media Application Resource Mappings

### User -> Posts

- Retrieve all Users - GET /users
- Create a User - POST /users
- Retrieve one User - GET /users/{id} -> /users/1
- Delete a User - DELETE /users/{id} -> /users/1

- Retrieve all posts for a User - GET /users/{id}/posts
- Create a post for a User - POST /users/{id}/posts
- Retrieve details of a post - GET /users/{id}/posts/{post_id}

### API Versioning

- Media type versioning (a.k.a "content negotiation" or "Accept" header)
    - GitHub
- (Custom) headers versioning
    - Microsoft
- URI versioning
    - Twitter
- Request Parameter versioning
    - Amazon

**No Perfect Solution! Things to consider:**

- URI Pollution (URI versioning cons.)
- Misuse of HTTP Headers (header versioning cons.)
- Caching (header versioning cons.)
- Can we execute the request on the browser? (header versioning cons.)
- API documentation

### How to test

- Step 19:
  ```
  curl --location --request GET 'localhost:8080/users' --header 'Accept: application/xml'
  ```
- Step 20: Open browser at `localhost:8080/swagger-ui.html`
- Step 22: Open browser at `http://localhost:8080/actuator` to view actuator endpoints
- Step 27:
    - URI versioning
  ```
  curl --location --request GET 'localhost:8080/person/v1'
  curl --location --request GET 'localhost:8080/person/v2'
  ```
    - Request param versioning
  ```
  curl --location --request GET 'localhost:8080/person/param?version=1'
  curl --location --request GET 'localhost:8080/person/param?version=2'
  ```
    - (Custom) header versioning
  ```
  curl --location --request GET 'localhost:8080/person/header' --header 'X-API-VERSION: 1'
  curl --location --request GET 'localhost:8080/person/header' --header 'X-API-VERSION: 2'
  ```
    - Media type versioning
  ```
  curl --location --request GET 'localhost:8080/person/produce' --header 'Accept: application/vnd.company.app-v1+json'
  curl --location --request GET 'localhost:8080/person/produce' --header 'Accept: application/vnd.company.app-v2+json'
  ```
- Step 29: Open h2 console at http://localhost:8080/h2-console