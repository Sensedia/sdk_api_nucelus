# IO.Swagger.Api.AddressesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddressesZipcodeGet**](AddressesApi.md#addresseszipcodeget) | **GET** /addresses/{zipcode} | 


<a name="addresseszipcodeget"></a>
# **AddressesZipcodeGet**
> List<InlineResponse2001> AddressesZipcodeGet (string clientId, string accessToken, string zipcode)



Searches for the address of a given zipcodes.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AddressesZipcodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new AddressesApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var zipcode = zipcode_example;  // string | Zipcode to search.

            try
            {
                List&lt;InlineResponse2001&gt; result = apiInstance.AddressesZipcodeGet(clientId, accessToken, zipcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressesApi.AddressesZipcodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string**| Customer identifier used for authentication. | 
 **accessToken** | **string**| Access token used in the authentication. | 
 **zipcode** | **string**| Zipcode to search. | 

### Return type

[**List<InlineResponse2001>**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

