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

#accountrecoveryendpoint
COPY ./repository/deployment/server/webapps/accountrecoveryendpoint/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/accountrecoveryendpoint/images/logo.svg
COPY ./repository/deployment/server/webapps/accountrecoveryendpoint/includes/header.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/accountrecoveryendpoint/includes/header.jsp
COPY ./repository/deployment/server/webapps/accountrecoveryendpoint/includes/product-title.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/accountrecoveryendpoint/includes/product-title.jsp
COPY ./repository/deployment/server/webapps/accountrecoveryendpoint/includes/title.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/accountrecoveryendpoint/includes/title.jsp
COPY ./repository/deployment/server/webapps/accountrecoveryendpoint/libs/themes/default/assets/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/accountrecoveryendpoint/libs/themes/default/assets/images/favicon.ico

#admin
COPY ./repository/deployment/server/webapps/admin/admin/index.html /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/admin/index.html
COPY ./repository/deployment/server/webapps/admin/site/public/conf/userTheme.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/conf/userTheme.js
COPY ./repository/deployment/server/webapps/admin/site/public/dist/ProtectedApps.212770474efcb0451a08.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/dist/ProtectedApps.212770474efcb0451a08.bundle.js
COPY ./repository/deployment/server/webapps/admin/site/public/dist/ProtectedApps.212770474efcb0451a08.bundle.js.map /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/dist/ProtectedApps.212770474efcb0451a08.bundle.js.map
COPY ./repository/deployment/server/webapps/admin/site/public/images/favicon.png /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/images/favicon.png
COPY ./repository/deployment/server/webapps/admin/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/images/logo.svg
COPY ./repository/deployment/server/webapps/admin/site/public/locales/en.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/locales/en.json
COPY ./repository/deployment/server/webapps/admin/site/public/locales/si.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/locales/si.json
COPY ./repository/deployment/server/webapps/admin/site/public/pages/index.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/pages/index.jsp
COPY ./repository/deployment/server/webapps/admin/site/public/pages/index.jsp.hbs /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/site/public/pages/index.jsp.hbs
COPY ./repository/deployment/server/webapps/admin/source/src/app/components/APICategories/ListApiCategories.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/source/src/app/components/APICategories/ListApiCategories.jsx
COPY ./repository/deployment/server/webapps/admin/source/src/app/components/Base/index.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/source/src/app/components/Base/index.jsx
COPY ./repository/deployment/server/webapps/admin/source/src/app/components/ManageAlerts/ManageAlerts.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/source/src/app/components/ManageAlerts/ManageAlerts.jsx
COPY ./repository/deployment/server/webapps/admin/package.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/admin/package.json

#authenticationendpoint
COPY ./repository/deployment/server/webapps/authenticationendpoint/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/images/logo.svg
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/cookie-policy-content.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/cookie-policy-content.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/header.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/header.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/privacy-policy-content.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/privacy-policy-content.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/product-title.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/product-title.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/includes/title.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/includes/title.jsp
COPY ./repository/deployment/server/webapps/authenticationendpoint/libs/themes/default/assets/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/authenticationendpoint/libs/themes/default/assets/images/favicon.ico

#devportal
COPY ./repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js
COPY ./repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js.map /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/index.80a2c1b7779ea3609ea6.bundle.js.map
COPY ./repository/deployment/server/webapps/devportal/site/public/dist/ProtectedApp.c580f0aedf7447d360e1.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/ProtectedApp.c580f0aedf7447d360e1.bundle.js
COPY ./repository/deployment/server/webapps/devportal/site/public/dist/ProtectedApp.c580f0aedf7447d360e1.bundle.js.map /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/dist/ProtectedApp.c580f0aedf7447d360e1.bundle.js.map
COPY ./repository/deployment/server/webapps/devportal/site/public/images/_favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/_favicon.ico
COPY ./repository/deployment/server/webapps/devportal/site/public/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/favicon.ico
COPY ./repository/deployment/server/webapps/devportal/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/images/logo.svg
COPY ./repository/deployment/server/webapps/devportal/site/public/locales/ar.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/locales/ar.json
COPY ./repository/deployment/server/webapps/devportal/site/public/locales/en.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/locales/en.json
COPY ./repository/deployment/server/webapps/devportal/site/public/locales/es.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/locales/es.json
COPY ./repository/deployment/server/webapps/devportal/site/public/locales/si.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/locales/si.json
COPY ./repository/deployment/server/webapps/devportal/site/public/pages/index.jsp /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/pages/index.jsp
COPY ./repository/deployment/server/webapps/devportal/site/public/pages/index.jsp.hbs /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/site/public/pages/index.jsp.hbs
COPY ./repository/deployment/server/webapps/devportal/source/src/app/components/Base/index.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/source/src/app/components/Base/index.jsx
COPY ./repository/deployment/server/webapps/devportal/source/src/app/data/defaultTheme.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/source/src/app/data/defaultTheme.js
COPY ./repository/deployment/server/webapps/devportal/package.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/devportal/package.json

#publisher
COPY ./repository/deployment/server/webapps/publisher/publisher/index.html /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/publisher/index.html
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js.map /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/index.0a947ffc1dbb86198805.bundle.js.map
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js
COPY ./repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js.map /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/dist/ProtectedApps.d60522a53e82720119ae.bundle.js.map
COPY ./repository/deployment/server/webapps/publisher/site/public/images/_favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/_favicon.ico
COPY ./repository/deployment/server/webapps/publisher/site/public/images/favicon.ico /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/favicon.ico
COPY ./repository/deployment/server/webapps/publisher/site/public/images/logo.svg /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/images/logo.svg
COPY ./repository/deployment/server/webapps/publisher/site/public/locales/en.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/locales/en.json
COPY ./repository/deployment/server/webapps/publisher/site/public/locales/raw.en.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/site/public/locales/raw.en.json
COPY ./repository/deployment/server/webapps/publisher/source/src/app/components/Base/Footer/Footer.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/source/src/app/components/Base/Footer/Footer.jsx
COPY ./repository/deployment/server/webapps/publisher/source/src/app/components/Base/Footer/__snapshots__/Footer.test.jsx.snap /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/source/src/app/components/Base/Footer/__snapshots__/Footer.test.jsx.snap
COPY ./repository/deployment/server/webapps/publisher/source/src/app/components/ServiceCatalog/Listing/Onboarding.jsx /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/source/src/app/components/ServiceCatalog/Listing/Onboarding.jsx
COPY ./repository/deployment/server/webapps/publisher/source/src/app/data/defaultTheme.js /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/source/src/app/data/defaultTheme.js
COPY ./repository/deployment/server/webapps/publisher/package.json /home/wso2carbon/wso2am-4.3.0/repository/deployment/server/webapps/publisher/package.json

#carbon
COPY ./repository/components/plugins/org.wso2.carbon.ui_4.9.26.jar /home/wso2carbon/wso2am-4.3.0/repository/components/plugins/org.wso2.carbon.ui_4.9.26.jar

EXPOSE 8280 8243 9443