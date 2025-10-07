# Docker Installtion Steps

systemctl stop docker
sudo systemctl disable docker
sudo rpm -qa | grep docker
sudo yum remove -y docker docker-ce-rootless-extras-26.1.3-1.el8.x86_64 docker-buildx-plugin-0.14.0-1.el8.x86_64
docker-ce-cli-26.1.3-1.el8.x86_64 docker-compose-plugin-2.27.0-1.el8.x86_64 docker-ce-26.1.3-1.el8.x86_64

sudo yum remove -y docker docker-compose-plugin-2.27.0-1.el8.x86_64 docker-buildx-plugin-0.14.0-1.el8.x86_64 docker-ce-cli-26.1.3-1.el8.x86_64 docker-ce-rootless-extras-26.1.3-1.el8.x86_64 docker-ce-26.1.3-1.el8.x86_64
sudo rm -rf /var/lib/docker/ 
sudo rm -rf /etc/docker
sudo rm -rf /run/docker
sudo rm -rf /var/run/docker.sock
sudo groupdel docker
sudo yum autoremove -y
which docker
