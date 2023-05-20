# player-manager-back

## HOW TO RUN

You need Docker on your machine.

In "player-manager-back" repo :
- mvn package
- docker image build -t player-manager-api .
- docker compuse up

Will download images :
- mysql:latest
- adminer:latest

Will start Docker network "player-manager-back" with containers:
- db-1 3306:3306 (mysql)
- player-manager-1 8080:8080 (player-manager-api)
- adminer-1 8081:8081 (adminer)


## DOCUMENTATION
 ### OPENAPI JSON
 http://localhost:8081/v3/api-docs/

 ### OPENAPI SWAGGER GUI
http://localhost:8080/swagger-ui/index.html


