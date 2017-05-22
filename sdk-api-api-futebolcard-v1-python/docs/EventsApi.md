# swagger_client.EventsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events_event_id_get**](EventsApi.md#events_event_id_get) | **GET** /events/{eventId} | 
[**events_event_id_sectors_get**](EventsApi.md#events_event_id_sectors_get) | **GET** /events/{eventId}/sectors | 
[**events_event_id_sectors_sector_id_get**](EventsApi.md#events_event_id_sectors_sector_id_get) | **GET** /events/{eventId}/sectors/{sectorId} | 
[**events_event_id_sectors_sector_id_subsectors_get**](EventsApi.md#events_event_id_sectors_sector_id_subsectors_get) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
[**events_event_id_sectors_sector_id_subsectors_subsector_id_get**](EventsApi.md#events_event_id_sectors_sector_id_subsectors_subsector_id_get) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
[**events_get**](EventsApi.md#events_get) | **GET** /events | 


# **events_event_id_get**
> InlineResponse200 events_event_id_get(client_id, access_token, event_id)



Returns the details for a specific event.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_id = 'event_id_example' # str | Event to search.

try: 
    api_response = api_instance.events_event_id_get(client_id, access_token, event_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_event_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_id** | **str**| Event to search. | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **events_event_id_sectors_get**
> InlineResponse2001 events_event_id_sectors_get(client_id, access_token, event_id)



Returns a list of sector for the given event.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_id = 'event_id_example' # str | Event to search.

try: 
    api_response = api_instance.events_event_id_sectors_get(client_id, access_token, event_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_event_id_sectors_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_id** | **str**| Event to search. | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **events_event_id_sectors_sector_id_get**
> InlineResponse2002 events_event_id_sectors_sector_id_get(client_id, access_token, event_id, sector_id)



Returns the details of a specific sector.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_id = 'event_id_example' # str | Event to search.
sector_id = 'sector_id_example' # str | Sector to search.

try: 
    api_response = api_instance.events_event_id_sectors_sector_id_get(client_id, access_token, event_id, sector_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_event_id_sectors_sector_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_id** | **str**| Event to search. | 
 **sector_id** | **str**| Sector to search. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **events_event_id_sectors_sector_id_subsectors_get**
> list[InlineResponse2002] events_event_id_sectors_sector_id_subsectors_get(client_id, access_token, event_id, sector_id)



Returns a list of subcsectors for a given sector.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_id = 'event_id_example' # str | Event to search.
sector_id = 'sector_id_example' # str | Sector to search.

try: 
    api_response = api_instance.events_event_id_sectors_sector_id_subsectors_get(client_id, access_token, event_id, sector_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_event_id_sectors_sector_id_subsectors_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_id** | **str**| Event to search. | 
 **sector_id** | **str**| Sector to search. | 

### Return type

[**list[InlineResponse2002]**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **events_event_id_sectors_sector_id_subsectors_subsector_id_get**
> list[InlineResponse2003] events_event_id_sectors_sector_id_subsectors_subsector_id_get(client_id, access_token, event_id, sector_id, subsector_id)



Returns a list of seat's information for each row of a given subsector.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_id = 'event_id_example' # str | Event to search.
sector_id = 'sector_id_example' # str | Sector to search.
subsector_id = 'subsector_id_example' # str | Subsector to search.

try: 
    api_response = api_instance.events_event_id_sectors_sector_id_subsectors_subsector_id_get(client_id, access_token, event_id, sector_id, subsector_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_event_id_sectors_sector_id_subsectors_subsector_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_id** | **str**| Event to search. | 
 **sector_id** | **str**| Sector to search. | 
 **subsector_id** | **str**| Subsector to search. | 

### Return type

[**list[InlineResponse2003]**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **events_get**
> list[InlineResponse200] events_get(client_id, access_token)



Returns a list of existing events.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EventsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.

try: 
    api_response = api_instance.events_get(client_id, access_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventsApi->events_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 

### Return type

[**list[InlineResponse200]**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

