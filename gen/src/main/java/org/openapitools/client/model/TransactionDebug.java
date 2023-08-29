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
import org.openapitools.client.model.TransactionRequestDebugMode;
import org.openapitools.client.model.TransactionRequestDebugStubs;

/**
 * TransactionDebug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T01:36:05.858934277+03:00[Europe/Moscow]")
public class TransactionDebug {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TransactionRequestDebugMode mode;

  public static final String SERIALIZED_NAME_STUB = "stub";
  @SerializedName(SERIALIZED_NAME_STUB)
  private TransactionRequestDebugStubs stub;


  public TransactionDebug mode(TransactionRequestDebugMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionRequestDebugMode getMode() {
    return mode;
  }


  public void setMode(TransactionRequestDebugMode mode) {
    this.mode = mode;
  }


  public TransactionDebug stub(TransactionRequestDebugStubs stub) {
    
    this.stub = stub;
    return this;
  }

   /**
   * Get stub
   * @return stub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionRequestDebugStubs getStub() {
    return stub;
  }


  public void setStub(TransactionRequestDebugStubs stub) {
    this.stub = stub;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDebug transactionDebug = (TransactionDebug) o;
    return Objects.equals(this.mode, transactionDebug.mode) &&
        Objects.equals(this.stub, transactionDebug.stub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, stub);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDebug {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    stub: ").append(toIndentedString(stub)).append("\n");
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
