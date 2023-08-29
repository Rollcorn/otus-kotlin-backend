/*
 * Marketplace ${VERSION_APP}
 * This is a place where sellers and buyers meat each other
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.IRequest;
import org.openapitools.client.model.TransactionCreateRequest;
import org.openapitools.client.model.TransactionDebug;
import org.openapitools.client.model.TransactionDeleteRequest;
import org.openapitools.client.model.TransactionReadObject;
import org.openapitools.client.model.TransactionReadRequest;
import org.openapitools.client.model.TransactionReadRequestAllOf;
import org.openapitools.client.model.TransactionRequestDebug;
import org.openapitools.client.model.TransactionUpdateRequest;

/**
 * TransactionReadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T01:36:05.858934277+03:00[Europe/Moscow]")
public class TransactionReadRequest extends IRequest {
  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private TransactionDebug debug;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private TransactionReadObject transaction = null;

  public TransactionReadRequest() {
    this.requestType = this.getClass().getSimpleName();
  }

  public TransactionReadRequest debug(TransactionDebug debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionDebug getDebug() {
    return debug;
  }


  public void setDebug(TransactionDebug debug) {
    this.debug = debug;
  }


  public TransactionReadRequest transaction(TransactionReadObject transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionReadObject getTransaction() {
    return transaction;
  }


  public void setTransaction(TransactionReadObject transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReadRequest transactionReadRequest = (TransactionReadRequest) o;
    return Objects.equals(this.debug, transactionReadRequest.debug) &&
        Objects.equals(this.transaction, transactionReadRequest.transaction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debug, transaction, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReadRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
