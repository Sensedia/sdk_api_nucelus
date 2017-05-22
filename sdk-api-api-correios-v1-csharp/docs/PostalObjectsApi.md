# IO.Swagger.Api.PostalObjectsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventsEventTypeGet**](PostalObjectsApi.md#eventseventtypeget) | **GET** /events/{eventType} | 
[**ObjectsGet**](PostalObjectsApi.md#objectsget) | **GET** /objects | 
[**ObjectsObjectCodeGet**](PostalObjectsApi.md#objectsobjectcodeget) | **GET** /objects/{objectCode} | 


<a name="eventseventtypeget"></a>
# **EventsEventTypeGet**
> List<InlineResponse2002> EventsEventTypeGet (string clientId, string accessToken, string eventType, string eventStatus = null)



Returns the list of possible event status for a given postal events.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventTypeGetExample
    {
        public void main()
        {
            
            var apiInstance = new PostalObjectsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventType = eventType_example;  // string | Event type to be searched.
            var eventStatus = eventStatus_example;  // string | Filter the search by a certain event status. (optional) 

            try
            {
                List&lt;InlineResponse2002&gt; result = apiInstance.EventsEventTypeGet(clientId, accessToken, eventType, eventStatus);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PostalObjectsApi.EventsEventTypeGet: " + e.Message );
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
 **eventType** | **string**| Event type to be searched. | 
 **eventStatus** | **string**| Filter the search by a certain event status. | [optional] 

### Return type

[**List<InlineResponse2002>**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="objectsget"></a>
# **ObjectsGet**
> List<InlineResponse2003> ObjectsGet (string clientId, string accessToken, string objectCode)



Searches for the events related to a list of postal objects.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ObjectsGetExample
    {
        public void main()
        {
            
            var apiInstance = new PostalObjectsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var objectCode = objectCode_example;  // string | List of comma separated codes to be consulted.

            try
            {
                List&lt;InlineResponse2003&gt; result = apiInstance.ObjectsGet(clientId, accessToken, objectCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PostalObjectsApi.ObjectsGet: " + e.Message );
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
 **objectCode** | **string**| List of comma separated codes to be consulted. | 

### Return type

[**List<InlineResponse2003>**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="objectsobjectcodeget"></a>
# **ObjectsObjectCodeGet**
> List<ObjectsEventos> ObjectsObjectCodeGet (string clientId, string accessToken, string objectCode, string eventType = null)



Searches for the informations related to a specific postal object.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ObjectsObjectCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new PostalObjectsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var objectCode = objectCode_example;  // string | Code of the object to be consulted.
            var eventType = eventType_example;  // string | Event type to be filtered. (optional) 

            try
            {
                List&lt;ObjectsEventos&gt; result = apiInstance.ObjectsObjectCodeGet(clientId, accessToken, objectCode, eventType);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PostalObjectsApi.ObjectsObjectCodeGet: " + e.Message );
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
 **objectCode** | **string**| Code of the object to be consulted. | 
 **eventType** | **string**| Event type to be filtered. | [optional] 

### Return type

[**List<ObjectsEventos>**](ObjectsEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

