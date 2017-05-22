# ZipcodesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipcodesStateGet**](ZipcodesApi.md#zipcodesStateGet) | **GET** /zipcodes/{state} | 


<a name="zipcodesStateGet"></a>
# **zipcodesStateGet**
> List&lt;InlineResponse200&gt; zipcodesStateGet(clientId, accessToken, state, county)



Searches for the range of zipcodes in the state&#39;s counties.

### Example
```java
// Import classes:
//import io.swagger.client.api.ZipcodesApi;

ZipcodesApi apiInstance = new ZipcodesApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String state = "state_example"; // String | State's abreviation.
String county = "county_example"; // String | County's name.
try {
    List<InlineResponse200> result = apiInstance.zipcodesStateGet(clientId, accessToken, state, county);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipcodesApi#zipcodesStateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **state** | **String**| State&#39;s abreviation. |
 **county** | **String**| County&#39;s name. | [optional]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

