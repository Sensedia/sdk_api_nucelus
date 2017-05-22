# IO.Swagger.Api.ZipcodesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ZipcodesStateGet**](ZipcodesApi.md#zipcodesstateget) | **GET** /zipcodes/{state} | 


<a name="zipcodesstateget"></a>
# **ZipcodesStateGet**
> List<InlineResponse200> ZipcodesStateGet (string clientId, string accessToken, string state, string county = null)



Searches for the range of zipcodes in the state's counties.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ZipcodesStateGetExample
    {
        public void main()
        {
            
            var apiInstance = new ZipcodesApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var state = state_example;  // string | State's abreviation.
            var county = county_example;  // string | County's name. (optional) 

            try
            {
                List&lt;InlineResponse200&gt; result = apiInstance.ZipcodesStateGet(clientId, accessToken, state, county);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ZipcodesApi.ZipcodesStateGet: " + e.Message );
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
 **state** | **string**| State&#39;s abreviation. | 
 **county** | **string**| County&#39;s name. | [optional] 

### Return type

[**List<InlineResponse200>**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

