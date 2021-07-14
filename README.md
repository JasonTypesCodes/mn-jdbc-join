## Running

1. Start the database
  + `docker-compose -f ./src/main/docker/postgres.yml up`
2. Start the app
  + `./gradlew run`
3. Retrieve items
  + `http localhost:8080/item`
