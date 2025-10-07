# Docker

- Packaging manager which contains application along with its dependencies and libraries which can be easily moved around
- It isolates one container from another
- It shares the System OS

> Advantage
- It is lighter in nature, consumes less memory
- It can boot up fast

## Virtual Machine
- It is also packaging manager which contains everything similar to docker along with OS
- It is designed in flavours to run on different OS
- It is overhead in nature due to OS installation
- It consumes more memory
- It gives total isolation from other VM

## Image
- Package application with all necessay configuration and dependencies
- Portable artifact are stored in artifactory which could be easily shared and moved around

## Container
- Running environment of image
- It has **layers** of images. [applicaltion layer, linux layer]
- It has virtual file system
- It has port binded for communication
- It makes development and deployment more efficient

## Docker vs VM
- Docker virtualizes application layer where as VM virtualizes applications + os kernel layer
- Image size: docker images are small in size where as VM are larger
- Speed: docker container are faster compared to VM
- Comptibility: VM of any OS can run on any other OS host but not possible with docker [possible with docker toolbox] 

## Docker Networks
- Auto creates 3 networks - Bridge [Default], None, Host
- embedded DNS is used for identify the internal ip for a container

## Docker volumes
- It is responsible for storing the data of the container
- Default path: /var/lib/docker
- It can be changed to any other path. make sure the path is not specified inside container
- volumes can be shared across the containers

## Docker Linking
- It is the process of conneting one service with another using --link option.
- It basically means that one app requires another app to function

## Docker compose
- It is one place to bring all apps in a network. Explicit linking of apps is not required
- Deployment is easy as we need single command to run all apps

## YAML [Yet Another Markup Language]
- It works on key/value pair
- child objects are indented with spaces [It can contain list[ordered] or dictionary [unordered]]

## JSON PATH
- top element of json is called root & is denoted by [**$.**]
- json contains dictionary and array
- array can be access by index and json can be access by dot
- criteria can be checked by [$[?(@)]]. ? -## query, @ -## element

- Example: cat <FILE## | jpath $.property
