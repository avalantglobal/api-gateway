/*
 * Internal Utility API
 * This API allows you to access internal data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.internal.api.dto;

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

/**
 * RevokedJWTConsumerKeyDTO
 */

public class RevokedJWTConsumerKeyDTO {
  @SerializedName("consumer_key")
  private String consumerKey = null;

  @SerializedName("revocation_time")
  private Long revocationTime = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("organization")
  private String organization = null;

  public RevokedJWTConsumerKeyDTO consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * consumer key of the JWT.
   * @return consumerKey
  **/
  @ApiModelProperty(value = "consumer key of the JWT.")
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  public RevokedJWTConsumerKeyDTO revocationTime(Long revocationTime) {
    this.revocationTime = revocationTime;
    return this;
  }

   /**
   * revocation timestamp.
   * @return revocationTime
  **/
  @ApiModelProperty(value = "revocation timestamp.")
  public Long getRevocationTime() {
    return revocationTime;
  }

  public void setRevocationTime(Long revocationTime) {
    this.revocationTime = revocationTime;
  }

  public RevokedJWTConsumerKeyDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * revoked consumer key type.
   * @return type
  **/
  @ApiModelProperty(value = "revoked consumer key type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RevokedJWTConsumerKeyDTO organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * organization of the revoked consumer key
   * @return organization
  **/
  @ApiModelProperty(value = "organization of the revoked consumer key")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokedJWTConsumerKeyDTO revokedJWTConsumerKey = (RevokedJWTConsumerKeyDTO) o;
    return Objects.equals(this.consumerKey, revokedJWTConsumerKey.consumerKey) &&
        Objects.equals(this.revocationTime, revokedJWTConsumerKey.revocationTime) &&
        Objects.equals(this.type, revokedJWTConsumerKey.type) &&
        Objects.equals(this.organization, revokedJWTConsumerKey.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerKey, revocationTime, type, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokedJWTConsumerKeyDTO {\n");
    
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    revocationTime: ").append(toIndentedString(revocationTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

