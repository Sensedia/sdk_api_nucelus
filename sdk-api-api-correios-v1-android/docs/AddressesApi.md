# AddressesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressesZipcodeGet**](AddressesApi.md#addressesZipcodeGet) | **GET** /addresses/{zipcode} | 


<a name="addressesZipcodeGet"></a>
# **addressesZipcodeGet**
> List&lt;InlineResponse2001&gt; addressesZipcodeGet(clientId, accessToken, zipcode)



Searches for the address of a given zipcodes.

### Example
```java
// Import classes:
//import io.swagger.client.api.AddressesApi;

AddressesApi apiInstance = new AddressesApi();
String clientId = "clientId_example"; // String | Customer identifier used for authentication.
String accessToken = "accessToken_example"; // String | Access token used in the authentication.
String zipcode = "zipcode_example"; // String | Zipcode to search.
try {
    List<InlineResponse2001> result = apiInstance.addressesZipcodeGet(clientId, accessToken, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#addressesZipcodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Customer identifier used for authentication. |
 **accessToken** | **String**| Access token used in the authentication. |
 **zipcode** | **String**| Zipcode to search. |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

