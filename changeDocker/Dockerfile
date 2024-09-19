FROM wso2/wso2am:4.3.0
 
#Common ONEWEB
# ENV ONEWEB_HOME /oneweb/owshares
 
#For SAP
# COPY sapjco3.jar /appl/jdk-17.0.6/lib
# COPY com.oracle.jdbc.ojdbc7_12.1.0.2.jar /appl/wildfly/standalone/deployments
COPY /source/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/logo.svg
COPY /source/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/logo.svg
COPY /source/js/index.0a947ffc1dbb86198805.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js
COPY /source/js/index.80a2c1b7779ea3609ea6.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js
# Expose the ports we're interested in
#  8280:8280 -p 8243:8243 -p 9443:9443
EXPOSE 8280 8243 9443