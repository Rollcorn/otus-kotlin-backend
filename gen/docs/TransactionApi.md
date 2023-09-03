# TransactionApi

All URIs are relative to *http://localhost:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionCreate**](TransactionApi.md#transactionCreate) | **POST** /transaction/create | Create transaction
[**transactionDelete**](TransactionApi.md#transactionDelete) | **POST** /transaction/delete | Delete transaction
[**transactionRead**](TransactionApi.md#transactionRead) | **POST** /transaction/read | Read transaction
[**transactionUpdate**](TransactionApi.md#transactionUpdate) | **POST** /transaction/update | Update transaction


<a name="transactionCreate"></a>
# **transactionCreate**
> TransactionCreateResponse transactionCreate(transactionCreateRequest)

Create transaction

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCreateRequest** | [**TransactionCreateRequest**](TransactionCreateRequest.md)| Request body |

### Return type

[**TransactionCreateResponse**](TransactionCreateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="transactionDelete"></a>
# **transactionDelete**
> TransactionDeleteResponse transactionDelete(transactionDeleteRequest)

Delete transaction

### Example
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
    TransactionDeleteRequest transactionDeleteRequest = new TransactionDeleteRequest(); // TransactionDeleteRequest | Request body
    try {
      TransactionDeleteResponse result = apiInstance.transactionDelete(transactionDeleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#transactionDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionDeleteRequest** | [**TransactionDeleteRequest**](TransactionDeleteRequest.md)| Request body |

### Return type

[**TransactionDeleteResponse**](TransactionDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="transactionRead"></a>
# **transactionRead**
> TransactionReadResponse transactionRead(transactionReadRequest)

Read transaction

### Example
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
    TransactionReadRequest transactionReadRequest = new TransactionReadRequest(); // TransactionReadRequest | Request body
    try {
      TransactionReadResponse result = apiInstance.transactionRead(transactionReadRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#transactionRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionReadRequest** | [**TransactionReadRequest**](TransactionReadRequest.md)| Request body |

### Return type

[**TransactionReadResponse**](TransactionReadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="transactionUpdate"></a>
# **transactionUpdate**
> TransactionUpdateResponse transactionUpdate(transactionUpdateRequest)

Update transaction

### Example
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
    TransactionUpdateRequest transactionUpdateRequest = new TransactionUpdateRequest(); // TransactionUpdateRequest | Request body
    try {
      TransactionUpdateResponse result = apiInstance.transactionUpdate(transactionUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#transactionUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionUpdateRequest** | [**TransactionUpdateRequest**](TransactionUpdateRequest.md)| Request body |

### Return type

[**TransactionUpdateResponse**](TransactionUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

