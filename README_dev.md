

#edit code
you can copy file to changeDocker/source
and edit changeDocker/Dockerfile about copy


#build
cd changeDocker
docker-compose build

#push
cd changeDocker
docker-compose push

#try run 
cd changeDocker/prod
docker-compose up

#run without docker-compose
docker run -it -p 8280:8280 -p 8243:8243 -p 9443:9443 --name api-manager wso2/wso2am:4.3.0
docker run -it -p 8280:8280 -p 8243:8243 -p 9443:9443 --name api-manager avalantglobal/api-designer:0.0.1


mapping
https://localhost:9443/carbon                                                       
https://localhost:9443/devportal
https://localhost:9443/publisher

9443 => /api-designer