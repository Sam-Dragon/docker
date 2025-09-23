## Common
> DOCKER LOGIN <br>
- docker login -u YOUR-USER-NAME <br>
- docker logout <br>

> Docker version
- docker version

> Docker information
- docker info

> Remove all unused containers, volumes, images
- docker system prune --all

## Images
> Find All Images
- docker images
- docker image list
- docker image ls 

> Build Docker Image
- docker build -t <IMAGE> .

> Remove Image
- docker rmi IMAGE

> Tag Image before Push [Local to Remote]
- docker tag IMAGE REMOTE_IMAGE 

> Push Image
- docker push <DOCKER_ID>/<IMAGE>:<IMAGE_TAG>

> Pull Image
- docker pull <DOCKER_ID>/<IMAGE>:<IMAGE_TAG>

> History
- docker history <IMAGE>

> Export Docker Image archived
- docker save CONTAINER_NAME > EXPORT_NAME.tar
- docker save CONTAINER_NAME > EXPORT_NAME.tar.gz

> Import Docker Image archived
- docker load < EXPORT_NAME.tar
- docker load < EXPORT_NAME.tar.gz

## DOCKER CONTAINER --> Dockerfile
> Active Container
- docker ps 

> All Containers
- docker ps -a

> Start Container
- docker start CONTAINER_ID / **INITIAL 3 Numbers**
- docker start CONTAINER_NAME

> Restart Container
- docker restart CONTAINER_ID
- docker restart CONTAINER_NAME

> Auto Restart a container
- docker run -dit — restart [RESTART_POLICY_VALUE] CONTAINER_NAME
- RESTART_POLICY_VALUE = Off, On-failure, Unless-stopped, Always

> Pause Container
- docker pause CONTAINER_ID
- docker pause CONTAINER_NAME

> Un-Pause Container
- docker unpause CONTAINER_ID
- docker unpause CONTAINER_NAME

> Stop Container
- docker stop CONTAINER_ID
- docker stop CONTAINER_NAME
- docker kill CONTAINER_ID
- docker kill CONTAINER_NAME

> Remove Container
- docker rm CONTAINER_ID

> Stop & Remove Container
- docker rm -f CONTAINER_ID

> Linking two container
- docker run -dp 9001:1000 --link <DATABASE_CONTAINER>:<DATABASE_IMAGE> -d <APPLICATION_IMAGE>

> Run in Detached Mode [Use this]
- docker run -d IMAGE

> Name a Container
- docker run --name CONTAINER_NAME CONTAINER_ID

> Ip of container
- docker inspect CONTAINER_NAME
- docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' CONTAINER_ID

> Pulls if not present & Run Image & Create container
- docker run IMAGE

> Port Mapping - Run in Port & detached mode [Use this]
- docker run -d -p EXPOSE_PORT:CONTAINER_PORT IMAGE

> Run in command [Use this]
- docker run -d IMAGE <COMMAND>

> Environment variables
- docker run -e VARIABLE=VALUE CONTAINER_ID

> Inspect environment variables
- docker inspect CONTAINER_ID

> Override Entry Point
- docker run --entrypoint <ENTRY_POINT_NAME> <IMAGE>:<TAG>

> Find process id
- docker exec -d ps -eaf

## Debug
> Move into Container
- docker exec -it CONTAINER_ID /bin/bash
- docker exec -it CONTAINER_ID /bin/sh

> Logs
- docker logs CONTAINER_NAME

> Stream the logs
- docker logs -f CONTAINER_NAME

> Latest logs
- docker logs CONTAINER_NAME | tail -f 100

Then you can specify db related command like cqlsh, mongo to get into that database

1. It will take you to root directory
2. Use commands like ls, pwd, cd /, env, ls PATH

## DOCKER VOLUMES
> list volumes
- docker volume ls

> Created Volumes [Database Instance]
- docker volume create VOLUME_NAME

> Run Volumes with application
- docker run -dp 3000:3000 -v VOLUME_NAME:PATH IMAGE

> Inspect Volume
- docker volume inspect VOLUME_NAME

> Drop Unused VOLUMES
- docker system prune --volumes

## DOCKER NETWORKS
- docker run <IMAGE> --network=NETWORK_NAME [NONE or HOST, BRiDGE is default]

- docker network ls
- docker network create --driver NETWORK_TYPE --subnet=IP NETWORK_NAME

# Remote Docker
> connect remotely
- docker -H=REMOTE-SERVER-ENGINE:PORT run IMAGE

## DOCKER COMPOSE [No Network Required - Put all configurations here] --> Dockerfile + DOCKER_COMPOSE.yml

> Start in detached mode
- docker compose up -d

> Start & Build in detached mode
- docker compose up -d --build

> Build all imcontainer
- docker compose build

> Start with specified file
- docker-compose -f DOCKER_COMPOSE.yml UP

> Stop with specified file
- docker-compose -f DOCKER_COMPOSE.yml DOWN

> Stop
- docker compose down

## JSON PATH
> Find 
- cat <FILE> | jpath $.property


# Mongo DB 
docker run -d  -p 27017:27017 --network mongo-network --name mongo -e MONGO_INITDB_ROOT_USERNAME=mongoadmin -e MONGO_INITDB_ROOT_PASSWORD=secret mongo

# Mongo Express
docker run -it --network mongo-network --name mongo-express -p 8081:8081 -e ME_CONFIG_MONGODB_SERVER=mongo -e ME_CONFIG_MONGODB_AUTH_USERNAME=mongoadmin -e ME_CONFIG_MONGODB_AUTH_PASSWORD=secret mongo-express

**Note** : Dont use 'Docker' keyword in IMAGE, CONTAINER names	

## BEST PRACTICES
- docker scan <image-name>
