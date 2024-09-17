/*
 * WSO2 API Manager - Developer Portal
 * This document specifies a **RESTful API** for WSO2 **API Manager** - **Developer Portal**. Please see [full OpenAPI Specification](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.7.206/components/apimgt/org.wso2.carbon.apimgt.rest.api.store.v1/src/main/resources/devportal-api.yaml) of the API which is written using [OAS 3.0](http://swagger.io/) specification.  # Authentication The Developer Portal REST API is protected using OAuth2 and access control is achieved through scopes. Before you start invoking the API, you need to obtain an access token with the required scopes. This guide will walk you through the steps that you will need to follow to obtain an access token. First you need to obtain the consumer key/secret key pair by calling the dynamic client registration (DCR) endpoint. You can add your preferred grant types in the payload. A Sample payload is shown below. ```   {   \"callbackUrl\":\"www.google.lk\",   \"clientName\":\"rest_api_devportal\",   \"owner\":\"admin\",   \"grantType\":\"client_credentials password refresh_token\",   \"saasApp\":true   } ``` Create a file (payload.json) with the above sample payload, and use the cURL shown below to invoke the DCR endpoint. Authorization header of this should contain the base64 encoded admin username and password. **Format of the request** ```   curl -X POST -H \"Authorization: Basic Base64(admin_username:admin_password)\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://<host>:<servlet_port>/client-registration/v0.17/register ``` **Sample request** ```   curl -X POST -H \"Authorization: Basic YWRtaW46YWRtaW4=\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://localhost:9443/client-registration/v0.17/register ``` Following is a sample response after invoking the above curl. ``` { \"clientId\": \"fOCi4vNJ59PpHucC2CAYfYuADdMa\", \"clientName\": \"rest_api_devportal\", \"callBackURL\": \"www.google.lk\", \"clientSecret\": \"a4FwHlq0iCIKVs2MPIIDnepZnYMa\", \"isSaasApplication\": true, \"appOwner\": \"admin\", \"jsonString\": \"{\\\"grant_types\\\":\\\"client_credentials password refresh_token\\\",\\\"redirect_uris\\\":\\\"www.google.lk\\\",\\\"client_name\\\":\\\"rest_api_devportal\\\"}\", \"jsonAppAttribute\": \"{}\", \"tokenType\": null } ``` Next you must use the above client id and secret to obtain the access token. We will be using the password grant type for this, you can use any grant type you desire. You also need to add the proper **scope** when getting the access token. All possible scopes for devportal REST API can be viewed in **OAuth2 Security** section of this document and scope for each resource is given in **authorization** section of resource documentation. Following is the format of the request if you are using the password grant type. ``` curl -k -d \"grant_type=password&username=<admin_username>&password=<admin_password>&scope=<scopes separated by space>\" \\ -H \"Authorization: Basic base64(cliet_id:client_secret)\" \\ https://<host>:<servlet_port>/oauth2/token ``` **Sample request** ``` curl https://localhost:9443/oauth2/token -k \\ -H \"Authorization: Basic Zk9DaTR2Tko1OVBwSHVjQzJDQVlmWXVBRGRNYTphNEZ3SGxxMGlDSUtWczJNUElJRG5lcFpuWU1h\" \\ -d \"grant_type=password&username=admin&password=admin&scope=apim:subscribe apim:api_key\" ``` Shown below is a sample response to the above request. ``` { \"access_token\": \"e79bda48-3406-3178-acce-f6e4dbdcbb12\", \"refresh_token\": \"a757795d-e69f-38b8-bd85-9aded677a97c\", \"scope\": \"apim:subscribe apim:api_key\", \"token_type\": \"Bearer\", \"expires_in\": 3600 } ``` Now you have a valid access token, which you can use to invoke an API. Navigate through the API descriptions to find the required API, obtain an access token as described above and invoke the API with the authentication header. If you use a different authentication mechanism, this process may change.  # Try out in Postman If you want to try-out the embedded postman collection with \"Run in Postman\" option, please follow the guidelines listed below. * All of the OAuth2 secured endpoints have been configured with an Authorization Bearer header with a parameterized access token. Before invoking any REST API resource make sure you run the `Register DCR Application` and `Generate Access Token` requests to fetch an access token with all required scopes. * Make sure you have an API Manager instance up and running. * Update the `basepath` parameter to match the hostname and port of the APIM instance.  [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/5bc0161b8aa7e701d7bf) 
 *
 * The version of the OpenAPI document: v3
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.store.api.v1.dto.APIBusinessInformationDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.AdvertiseInfoDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* APIInfoDTO
*/

public class APIInfoDTO {
        public static final String SERIALIZED_NAME_ID = "id";
        @SerializedName(SERIALIZED_NAME_ID)
            private String id;

        public static final String SERIALIZED_NAME_NAME = "name";
        @SerializedName(SERIALIZED_NAME_NAME)
            private String name;

        public static final String SERIALIZED_NAME_DESCRIPTION = "description";
        @SerializedName(SERIALIZED_NAME_DESCRIPTION)
            private String description;

        public static final String SERIALIZED_NAME_CONTEXT = "context";
        @SerializedName(SERIALIZED_NAME_CONTEXT)
            private String context;

        public static final String SERIALIZED_NAME_VERSION = "version";
        @SerializedName(SERIALIZED_NAME_VERSION)
            private String version;

        public static final String SERIALIZED_NAME_TYPE = "type";
        @SerializedName(SERIALIZED_NAME_TYPE)
            private String type;

        public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
        @SerializedName(SERIALIZED_NAME_CREATED_TIME)
            private String createdTime;

        public static final String SERIALIZED_NAME_PROVIDER = "provider";
        @SerializedName(SERIALIZED_NAME_PROVIDER)
            private String provider;

        public static final String SERIALIZED_NAME_LIFE_CYCLE_STATUS = "lifeCycleStatus";
        @SerializedName(SERIALIZED_NAME_LIFE_CYCLE_STATUS)
            private String lifeCycleStatus;

        public static final String SERIALIZED_NAME_THUMBNAIL_URI = "thumbnailUri";
        @SerializedName(SERIALIZED_NAME_THUMBNAIL_URI)
            private String thumbnailUri;

        public static final String SERIALIZED_NAME_AVG_RATING = "avgRating";
        @SerializedName(SERIALIZED_NAME_AVG_RATING)
            private String avgRating;

        public static final String SERIALIZED_NAME_THROTTLING_POLICIES = "throttlingPolicies";
        @SerializedName(SERIALIZED_NAME_THROTTLING_POLICIES)
            private List<String> throttlingPolicies = null;

        public static final String SERIALIZED_NAME_ADVERTISE_INFO = "advertiseInfo";
        @SerializedName(SERIALIZED_NAME_ADVERTISE_INFO)
            private AdvertiseInfoDTO advertiseInfo;

        public static final String SERIALIZED_NAME_BUSINESS_INFORMATION = "businessInformation";
        @SerializedName(SERIALIZED_NAME_BUSINESS_INFORMATION)
            private APIBusinessInformationDTO businessInformation;

        public static final String SERIALIZED_NAME_IS_SUBSCRIPTION_AVAILABLE = "isSubscriptionAvailable";
        @SerializedName(SERIALIZED_NAME_IS_SUBSCRIPTION_AVAILABLE)
            private Boolean isSubscriptionAvailable;

        public static final String SERIALIZED_NAME_MONETIZATION_LABEL = "monetizationLabel";
        @SerializedName(SERIALIZED_NAME_MONETIZATION_LABEL)
            private String monetizationLabel;


        public APIInfoDTO id(String id) {
        
        this.id = id;
        return this;
        }

    /**
        * Get id
    * @return id
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


        public APIInfoDTO name(String name) {
        
        this.name = name;
        return this;
        }

    /**
        * Get name
    * @return name
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "CalculatorAPI", value = "")
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


        public APIInfoDTO description(String description) {
        
        this.description = description;
        return this;
        }

    /**
        * Get description
    * @return description
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
    
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


        public APIInfoDTO context(String context) {
        
        this.context = context;
        return this;
        }

    /**
        * Get context
    * @return context
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "CalculatorAPI", value = "")
    
    public String getContext() {
        return context;
    }


    public void setContext(String context) {
        this.context = context;
    }


        public APIInfoDTO version(String version) {
        
        this.version = version;
        return this;
        }

    /**
        * Get version
    * @return version
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "1.0.0", value = "")
    
    public String getVersion() {
        return version;
    }


    public void setVersion(String version) {
        this.version = version;
    }


        public APIInfoDTO type(String type) {
        
        this.type = type;
        return this;
        }

    /**
        * Get type
    * @return type
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "WS", value = "")
    
    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


        public APIInfoDTO createdTime(String createdTime) {
        
        this.createdTime = createdTime;
        return this;
        }

    /**
        * Get createdTime
    * @return createdTime
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "1614020559444", value = "")
    
    public String getCreatedTime() {
        return createdTime;
    }


    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


        public APIInfoDTO provider(String provider) {
        
        this.provider = provider;
        return this;
        }

    /**
        * If the provider value is not given, the user invoking the API will be used as the provider. 
    * @return provider
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "admin", value = "If the provider value is not given, the user invoking the API will be used as the provider. ")
    
    public String getProvider() {
        return provider;
    }


    public void setProvider(String provider) {
        this.provider = provider;
    }


        public APIInfoDTO lifeCycleStatus(String lifeCycleStatus) {
        
        this.lifeCycleStatus = lifeCycleStatus;
        return this;
        }

    /**
        * Get lifeCycleStatus
    * @return lifeCycleStatus
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "PUBLISHED", value = "")
    
    public String getLifeCycleStatus() {
        return lifeCycleStatus;
    }


    public void setLifeCycleStatus(String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }


        public APIInfoDTO thumbnailUri(String thumbnailUri) {
        
        this.thumbnailUri = thumbnailUri;
        return this;
        }

    /**
        * Get thumbnailUri
    * @return thumbnailUri
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "/apis/01234567-0123-0123-0123-012345678901/thumbnail", value = "")
    
    public String getThumbnailUri() {
        return thumbnailUri;
    }


    public void setThumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
    }


        public APIInfoDTO avgRating(String avgRating) {
        
        this.avgRating = avgRating;
        return this;
        }

    /**
        * Average rating of the API
    * @return avgRating
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "4.5", value = "Average rating of the API")
    
    public String getAvgRating() {
        return avgRating;
    }


    public void setAvgRating(String avgRating) {
        this.avgRating = avgRating;
    }


        public APIInfoDTO throttlingPolicies(List<String> throttlingPolicies) {
        
        this.throttlingPolicies = throttlingPolicies;
        return this;
        }

    /**
        * List of throttling policies of the API
    * @return throttlingPolicies
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "[\"Unlimited\",\"Bronze\"]", value = "List of throttling policies of the API")
    
    public List<String> getThrottlingPolicies() {
        return throttlingPolicies;
    }


    public void setThrottlingPolicies(List<String> throttlingPolicies) {
        this.throttlingPolicies = throttlingPolicies;
    }


        public APIInfoDTO advertiseInfo(AdvertiseInfoDTO advertiseInfo) {
        
        this.advertiseInfo = advertiseInfo;
        return this;
        }

    /**
        * Get advertiseInfo
    * @return advertiseInfo
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "")
    
    public AdvertiseInfoDTO getAdvertiseInfo() {
        return advertiseInfo;
    }


    public void setAdvertiseInfo(AdvertiseInfoDTO advertiseInfo) {
        this.advertiseInfo = advertiseInfo;
    }


        public APIInfoDTO businessInformation(APIBusinessInformationDTO businessInformation) {
        
        this.businessInformation = businessInformation;
        return this;
        }

    /**
        * Get businessInformation
    * @return businessInformation
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "")
    
    public APIBusinessInformationDTO getBusinessInformation() {
        return businessInformation;
    }


    public void setBusinessInformation(APIBusinessInformationDTO businessInformation) {
        this.businessInformation = businessInformation;
    }


        public APIInfoDTO isSubscriptionAvailable(Boolean isSubscriptionAvailable) {
        
        this.isSubscriptionAvailable = isSubscriptionAvailable;
        return this;
        }

    /**
        * Get isSubscriptionAvailable
    * @return isSubscriptionAvailable
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "false", value = "")
    
    public Boolean isIsSubscriptionAvailable() {
        return isSubscriptionAvailable;
    }


    public void setIsSubscriptionAvailable(Boolean isSubscriptionAvailable) {
        this.isSubscriptionAvailable = isSubscriptionAvailable;
    }


        public APIInfoDTO monetizationLabel(String monetizationLabel) {
        
        this.monetizationLabel = monetizationLabel;
        return this;
        }

    /**
        * Get monetizationLabel
    * @return monetizationLabel
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "Free", value = "")
    
    public String getMonetizationLabel() {
        return monetizationLabel;
    }


    public void setMonetizationLabel(String monetizationLabel) {
        this.monetizationLabel = monetizationLabel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            APIInfoDTO apIInfo = (APIInfoDTO) o;
            return Objects.equals(this.id, apIInfo.id) &&
            Objects.equals(this.name, apIInfo.name) &&
            Objects.equals(this.description, apIInfo.description) &&
            Objects.equals(this.context, apIInfo.context) &&
            Objects.equals(this.version, apIInfo.version) &&
            Objects.equals(this.type, apIInfo.type) &&
            Objects.equals(this.createdTime, apIInfo.createdTime) &&
            Objects.equals(this.provider, apIInfo.provider) &&
            Objects.equals(this.lifeCycleStatus, apIInfo.lifeCycleStatus) &&
            Objects.equals(this.thumbnailUri, apIInfo.thumbnailUri) &&
            Objects.equals(this.avgRating, apIInfo.avgRating) &&
            Objects.equals(this.throttlingPolicies, apIInfo.throttlingPolicies) &&
            Objects.equals(this.advertiseInfo, apIInfo.advertiseInfo) &&
            Objects.equals(this.businessInformation, apIInfo.businessInformation) &&
            Objects.equals(this.isSubscriptionAvailable, apIInfo.isSubscriptionAvailable) &&
            Objects.equals(this.monetizationLabel, apIInfo.monetizationLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, context, version, type, createdTime, provider, lifeCycleStatus, thumbnailUri, avgRating, throttlingPolicies, advertiseInfo, businessInformation, isSubscriptionAvailable, monetizationLabel);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class APIInfoDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    thumbnailUri: ").append(toIndentedString(thumbnailUri)).append("\n");
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
    sb.append("    throttlingPolicies: ").append(toIndentedString(throttlingPolicies)).append("\n");
    sb.append("    advertiseInfo: ").append(toIndentedString(advertiseInfo)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    isSubscriptionAvailable: ").append(toIndentedString(isSubscriptionAvailable)).append("\n");
    sb.append("    monetizationLabel: ").append(toIndentedString(monetizationLabel)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}

