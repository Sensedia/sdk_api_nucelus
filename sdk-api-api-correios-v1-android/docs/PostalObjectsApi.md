# PostalObjectsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventTypeGet**](PostalObjectsApi.md#eventsEventTypeGet) | **GET** /events/{eventType} | 
[**objectsGet**](PostalObjectsApi.md#objectsGet) | **GET** /objects | 
[**objectsObjectCodeGet**](PostalObjectsApi.md#objectsObjectCodeGet) | **GET** /objects/{objectCode} | 


<a name="eventsEventTypeGet"></a>
# **eventsEventTypeGet**
> List&lt;InlineResponse2002&gt; eventsEventTypeGet(clientId, accessToken, eventType, eventStatus)



Returns the list of possible event status for a given postal events.

### Example
```java
// Import classes:
//import io.swagger.client.api.PostalObjectsApi;

PostalObjectsApi apiInstance = new PostalObjectsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String eventType = "eventType_example"; // String | Event type to be searched.
String eventStatus = "eventStatus_example"; // String | Filter the search by a certain event status.
try {
    List<InlineResponse2002> result = apiInstance.eventsEventTypeGet(clientId, accessToken, eventType, eventStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalObjectsApi#eventsEventTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **eventType** | **String**| Event type to be searched. |
 **eventStatus** | **String**| Filter the search by a certain event status. | [optional]

### Return type

[**List&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="objectsGet"></a>
# **objectsGet**
> List&lt;InlineResponse2003&gt; objectsGet(clientId, accessToken, objectCode)



Searches for the events related to a list of postal objects.

### Example
```java
// Import classes:
//import io.swagger.client.api.PostalObjectsApi;

PostalObjectsApi apiInstance = new PostalObjectsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String objectCode = "objectCode_example"; // String | List of comma separated codes to be consulted.
try {
    List<InlineResponse2003> result = apiInstance.objectsGet(clientId, accessToken, objectCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalObjectsApi#objectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **objectCode** | **String**| List of comma separated codes to be consulted. |

### Return type

[**List&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="objectsObjectCodeGet"></a>
# **objectsObjectCodeGet**
> List&lt;ObjectsEventos&gt; objectsObjectCodeGet(clientId, accessToken, objectCode, eventType)



Searches for the informations related to a specific postal object.

### Example
```java
// Import classes:
//import io.swagger.client.api.PostalObjectsApi;

PostalObjectsApi apiInstance = new PostalObjectsApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String objectCode = "objectCode_example"; // String | Code of the object to be consulted.
String eventType = "eventType_example"; // String | Event type to be filtered.
try {
    List<ObjectsEventos> result = apiInstance.objectsObjectCodeGet(clientId, accessToken, objectCode, eventType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostalObjectsApi#objectsObjectCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **objectCode** | **String**| Code of the object to be consulted. |
 **eventType** | **String**| Event type to be filtered. | [optional]

### Return type

[**List&lt;ObjectsEventos&gt;**](ObjectsEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

