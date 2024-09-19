# Docker

> Image
- Package application with all necessay configuration and dependencies
- Portable artifact are stored in artifactory which could be easily shared and moved around

> Container
- Running environment of image
- It has **layers** of images. [applicaltion layer, linux layer]
- It has virtual file system
- It has port binded for communication
- It makes development and deployment more efficient

> Docker vs VM
- Docker virtualizes application layer where as VM virtualizes applications + os kernel layer
- Image size: docker images are small in size where as VM are larger
- Speed: docker container are faster compared to VM
- Comptibility: VM of any OS can run on any other OS host but not possible with docker [possible with docker toolbox] 
