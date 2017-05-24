# IO.Swagger.Api.EventsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventsEventIdGet**](EventsApi.md#eventseventidget) | **GET** /events/{eventId} | 
[**EventsEventIdSectorsGet**](EventsApi.md#eventseventidsectorsget) | **GET** /events/{eventId}/sectors | 
[**EventsEventIdSectorsSectorIdGet**](EventsApi.md#eventseventidsectorssectoridget) | **GET** /events/{eventId}/sectors/{sectorId} | 
[**EventsEventIdSectorsSectorIdSubsectorsGet**](EventsApi.md#eventseventidsectorssectoridsubsectorsget) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
[**EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**](EventsApi.md#eventseventidsectorssectoridsubsectorssubsectoridget) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
[**EventsGet**](EventsApi.md#eventsget) | **GET** /events | 


<a name="eventseventidget"></a>
# **EventsEventIdGet**
> InlineResponse200 EventsEventIdGet (string clientId, string accessToken, string eventId)



Returns the details for a specific event.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventIdGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventId = eventId_example;  // string | Event to search.

            try
            {
                InlineResponse200 result = apiInstance.EventsEventIdGet(clientId, accessToken, eventId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsEventIdGet: " + e.Message );
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
 **eventId** | **string**| Event to search. | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="eventseventidsectorsget"></a>
# **EventsEventIdSectorsGet**
> InlineResponse2001 EventsEventIdSectorsGet (string clientId, string accessToken, string eventId)



Returns a list of sector for the given event.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventIdSectorsGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventId = eventId_example;  // string | Event to search.

            try
            {
                InlineResponse2001 result = apiInstance.EventsEventIdSectorsGet(clientId, accessToken, eventId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsEventIdSectorsGet: " + e.Message );
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
 **eventId** | **string**| Event to search. | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="eventseventidsectorssectoridget"></a>
# **EventsEventIdSectorsSectorIdGet**
> InlineResponse2002 EventsEventIdSectorsSectorIdGet (string clientId, string accessToken, string eventId, string sectorId)



Returns the details of a specific sector.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventIdSectorsSectorIdGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventId = eventId_example;  // string | Event to search.
            var sectorId = sectorId_example;  // string | Sector to search.

            try
            {
                InlineResponse2002 result = apiInstance.EventsEventIdSectorsSectorIdGet(clientId, accessToken, eventId, sectorId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsEventIdSectorsSectorIdGet: " + e.Message );
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
 **eventId** | **string**| Event to search. | 
 **sectorId** | **string**| Sector to search. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="eventseventidsectorssectoridsubsectorsget"></a>
# **EventsEventIdSectorsSectorIdSubsectorsGet**
> InlineResponse2002 EventsEventIdSectorsSectorIdSubsectorsGet (string clientId, string accessToken, string eventId, string sectorId)



Returns a list of subcsectors for a given sector.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventIdSectorsSectorIdSubsectorsGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventId = eventId_example;  // string | Event to search.
            var sectorId = sectorId_example;  // string | Sector to search.

            try
            {
                InlineResponse2002 result = apiInstance.EventsEventIdSectorsSectorIdSubsectorsGet(clientId, accessToken, eventId, sectorId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsEventIdSectorsSectorIdSubsectorsGet: " + e.Message );
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
 **eventId** | **string**| Event to search. | 
 **sectorId** | **string**| Sector to search. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="eventseventidsectorssectoridsubsectorssubsectoridget"></a>
# **EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**
> List<InlineResponse2003> EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet (string clientId, string accessToken, string eventId, string sectorId, string subsectorId)



Returns a list of seat's information for each row of a given subsector.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.
            var eventId = eventId_example;  // string | Event to search.
            var sectorId = sectorId_example;  // string | Sector to search.
            var subsectorId = subsectorId_example;  // string | Subsector to search.

            try
            {
                List&lt;InlineResponse2003&gt; result = apiInstance.EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet(clientId, accessToken, eventId, sectorId, subsectorId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet: " + e.Message );
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
 **eventId** | **string**| Event to search. | 
 **sectorId** | **string**| Sector to search. | 
 **subsectorId** | **string**| Subsector to search. | 

### Return type

[**List<InlineResponse2003>**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="eventsget"></a>
# **EventsGet**
> List<InlineResponse200> EventsGet (string clientId, string accessToken)



Returns a list of existing events.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventsGetExample
    {
        public void main()
        {
            
            var apiInstance = new EventsApi();
            var clientId = clientId_example;  // string | Customer identifier used for authentication.
            var accessToken = accessToken_example;  // string | Access token used in the authentication.

            try
            {
                List&lt;InlineResponse200&gt; result = apiInstance.EventsGet(clientId, accessToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EventsApi.EventsGet: " + e.Message );
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

### Return type

[**List<InlineResponse200>**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

