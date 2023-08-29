# openapi-java-client

Marketplace ${VERSION_APP}
- API version: 1.0.0
  - Build date: 2023-08-29T01:36:05.858934277+03:00[Europe/Moscow]

This is a place where sellers and buyers meat each other


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/v1");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    TransactionCreateRequest transactionCreateRequest = new TransactionCreateRequest(); // TransactionCreateRequest | Request body
    try {
      TransactionCreateResponse result = apiInstance.transactionCreate(transactionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#transactionCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TransactionApi* | [**transactionCreate**](docs/TransactionApi.md#transactionCreate) | **POST** /transaction/create | Create transaction
*TransactionApi* | [**transactionDelete**](docs/TransactionApi.md#transactionDelete) | **POST** /transaction/delete | Delete transaction
*TransactionApi* | [**transactionRead**](docs/TransactionApi.md#transactionRead) | **POST** /transaction/read | Read transaction
*TransactionApi* | [**transactionUpdate**](docs/TransactionApi.md#transactionUpdate) | **POST** /transaction/update | Update transaction


## Documentation for Models

 - [BaseTransaction](docs/BaseTransaction.md)
 - [Error](docs/Error.md)
 - [IRequest](docs/IRequest.md)
 - [IResponse](docs/IResponse.md)
 - [ResponseResult](docs/ResponseResult.md)
 - [TransactionCreateObject](docs/TransactionCreateObject.md)
 - [TransactionCreateRequest](docs/TransactionCreateRequest.md)
 - [TransactionCreateRequestAllOf](docs/TransactionCreateRequestAllOf.md)
 - [TransactionCreateResponse](docs/TransactionCreateResponse.md)
 - [TransactionDebug](docs/TransactionDebug.md)
 - [TransactionDeleteObject](docs/TransactionDeleteObject.md)
 - [TransactionDeleteRequest](docs/TransactionDeleteRequest.md)
 - [TransactionDeleteRequestAllOf](docs/TransactionDeleteRequestAllOf.md)
 - [TransactionDeleteResponse](docs/TransactionDeleteResponse.md)
 - [TransactionInitResponse](docs/TransactionInitResponse.md)
 - [TransactionPermissions](docs/TransactionPermissions.md)
 - [TransactionReadObject](docs/TransactionReadObject.md)
 - [TransactionReadObjectAllOf](docs/TransactionReadObjectAllOf.md)
 - [TransactionReadRequest](docs/TransactionReadRequest.md)
 - [TransactionReadRequestAllOf](docs/TransactionReadRequestAllOf.md)
 - [TransactionReadResponse](docs/TransactionReadResponse.md)
 - [TransactionRequestDebug](docs/TransactionRequestDebug.md)
 - [TransactionRequestDebugMode](docs/TransactionRequestDebugMode.md)
 - [TransactionRequestDebugStubs](docs/TransactionRequestDebugStubs.md)
 - [TransactionResponseMulti](docs/TransactionResponseMulti.md)
 - [TransactionResponseMultiAllOf](docs/TransactionResponseMultiAllOf.md)
 - [TransactionResponseObject](docs/TransactionResponseObject.md)
 - [TransactionResponseObjectAllOf](docs/TransactionResponseObjectAllOf.md)
 - [TransactionResponseSingle](docs/TransactionResponseSingle.md)
 - [TransactionResponseSingleAllOf](docs/TransactionResponseSingleAllOf.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransactionUpdateObject](docs/TransactionUpdateObject.md)
 - [TransactionUpdateObjectAllOf](docs/TransactionUpdateObjectAllOf.md)
 - [TransactionUpdateRequest](docs/TransactionUpdateRequest.md)
 - [TransactionUpdateRequestAllOf](docs/TransactionUpdateRequestAllOf.md)
 - [TransactionUpdateResponse](docs/TransactionUpdateResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


