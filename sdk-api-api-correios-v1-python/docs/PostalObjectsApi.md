# swagger_client.PostalObjectsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events_event_type_get**](PostalObjectsApi.md#events_event_type_get) | **GET** /events/{eventType} | 
[**objects_get**](PostalObjectsApi.md#objects_get) | **GET** /objects | 
[**objects_object_code_get**](PostalObjectsApi.md#objects_object_code_get) | **GET** /objects/{objectCode} | 


# **events_event_type_get**
> list[InlineResponse2002] events_event_type_get(client_id, access_token, event_type, event_status=event_status)



Returns the list of possible event status for a given postal events.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PostalObjectsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
event_type = 'event_type_example' # str | Event type to be searched.
event_status = 'event_status_example' # str | Filter the search by a certain event status. (optional)

try: 
    api_response = api_instance.events_event_type_get(client_id, access_token, event_type, event_status=event_status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PostalObjectsApi->events_event_type_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **event_type** | **str**| Event type to be searched. | 
 **event_status** | **str**| Filter the search by a certain event status. | [optional] 

### Return type

[**list[InlineResponse2002]**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_get**
> list[InlineResponse2003] objects_get(client_id, access_token, object_code)



Searches for the events related to a list of postal objects.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PostalObjectsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
object_code = 'object_code_example' # str | List of comma separated codes to be consulted.

try: 
    api_response = api_instance.objects_get(client_id, access_token, object_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PostalObjectsApi->objects_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **object_code** | **str**| List of comma separated codes to be consulted. | 

### Return type

[**list[InlineResponse2003]**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objects_object_code_get**
> list[ObjectsEventos] objects_object_code_get(client_id, access_token, object_code, event_type=event_type)



Searches for the informations related to a specific postal object.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PostalObjectsApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
object_code = 'object_code_example' # str | Code of the object to be consulted.
event_type = 'event_type_example' # str | Event type to be filtered. (optional)

try: 
    api_response = api_instance.objects_object_code_get(client_id, access_token, object_code, event_type=event_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PostalObjectsApi->objects_object_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **object_code** | **str**| Code of the object to be consulted. | 
 **event_type** | **str**| Event type to be filtered. | [optional] 

### Return type

[**list[ObjectsEventos]**](ObjectsEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

