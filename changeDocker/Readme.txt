#Copy a local file into container
docker cp ./some_file CONTAINER:/work

#images
docker cp ./source/images/logo.svg 45232e99bf35:/home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/logo.svg
docker cp ./source/images/logo.svg 45232e99bf35:/home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/logo.svg

#js
docker cp ./source/js/index.0a947ffc1dbb86198805.bundle.js 45232e99bf35:/home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js
docker cp ./source/js/index.80a2c1b7779ea3609ea6.bundle.js 45232e99bf35:/home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js