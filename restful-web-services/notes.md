# RESTful Web Services

## Social Media Application Resource Mappings

### User -> Posts

- Retrieve all Users    - GET   /users
- Create a User         - POST  /users
- Retrieve one User     - GET   /users/{id} -> /users/1
- Delete a User         - DELETE    /users/{id} -> /users/1

- Retrieve all posts for a User     - GET /users/{id}/posts
- Create a post for a User          - POST /users/{id}/posts
- Retrieve details of a post        - GET /users/{id}/posts/{post_id}

### How to test API

- Step 19:
  ```
  curl --location --request GET 'localhost:8080/users' --header 'Accept: application/xml'
  ```