FROM wso2/wso2am:4.3.0
 
#Common ONEWEB
# ENV ONEWEB_HOME /oneweb/owshares
 
#For SAP
# COPY sapjco3.jar /appl/jdk-17.0.6/lib
# COPY com.oracle.jdbc.ojdbc7_12.1.0.2.jar /appl/wildfly/standalone/deployments

# RUN rm /home/wso2carbon/wso2am-4.3.0/repository/conf/deployment.toml
# COPY /source/conf/deployment.toml /home/wso2carbon/wso2am-4.3.0/repository/conf/deployment.toml

# COPY /source/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/logo.svg
# COPY /source/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/logo.svg
# RUN rm file_prefix*file_suffix
# RUN rm /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.*.bundle.js
# RUN rm /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.*.bundle.js
# COPY /source/js/index.0a947ffc1dbb86198805.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js
# COPY /source/js/index.80a2c1b7779ea3609ea6.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js
# Expose the ports we're interested in
#  8280:8280 -p 8243:8243 -p 9443:9443
# COPY ./deployment.toml /home/wso2carbon/wso2am-4.3.0/repository/conf/deployment.toml
# RUN chmod +x /home/wso2carbon/wso2am-4.3.0/repository/conf/deployment.toml

#admin
COPY ./repository/deployment/server/webapps/admin/site/public/conf/userTheme.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/conf/userTheme.js
COPY ./repository/deployment/server/webapps/admin/site/public/images/favicon.png /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/images/favicon.png
COPY ./repository/deployment/server/webapps/admin/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/images/logo.svg
COPY ./repository/deployment/server/webapps/admin/site/public/pages/index.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/pages/index.jsp

#authenticationendpoint
COPY ./repository/deployment/server/webapps/authenticationendpoint/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/images/logo.svg
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/header.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/header.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/product-title.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/product-title.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/libs/themes/default/assets/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/libs/themes/default/assets/images/favicon.ico


#devportal
COPY ./repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js
COPY ./repository/deployment/server/webapps/devportal/site/public/images/_favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/_favicon.ico
COPY ./repository/deployment/server/webapps/devportal/site/public/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/favicon.ico
COPY ./repository/deployment/server/webapps/devportal/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/logo.svg
COPY ./repository/deployment/server/webapps/devportal/site/public/pages/index.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/pages/index.jsp

#publisher
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js
COPY ./repository/deployment/server/webapps/publisher/site/public/images/_favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/_favicon.ico
COPY ./repository/deployment/server/webapps/publisher/site/public/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/favicon.ico
COPY ./repository/deployment/server/webapps/publisher/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/logo.svg


EXPOSE 8280 8243 9443