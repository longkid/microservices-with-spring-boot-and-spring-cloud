This folder contains properties of multiple environments (such as dev, qa, etc.) which are used by limits-service.

- Basically, you should initialize it as a git repository (run `git init`).
- Then update that folder path as value of `spring.cloud.config.server.git.uri` in
  file: `spring-cloud-config-server/src/main/resources/application.properties`
