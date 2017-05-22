# SwaggerClient::PostalObjectsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events_event_type_get**](PostalObjectsApi.md#events_event_type_get) | **GET** /events/{eventType} | 
[**objects_get**](PostalObjectsApi.md#objects_get) | **GET** /objects | 
[**objects_object_code_get**](PostalObjectsApi.md#objects_object_code_get) | **GET** /objects/{objectCode} | 


# **events_event_type_get**
> Array&lt;InlineResponse2002&gt; events_event_type_get(client_id, access_token, event_type, opts)



Returns the list of possible event status for a given postal events.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PostalObjectsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_type = "event_type_example" # String | Event type to be searched.

opts = { 
  event_status: "event_status_example" # String | Filter the search by a certain event status.
}

begin
  result = api_instance.events_event_type_get(client_id, access_token, event_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PostalObjectsApi->events_event_type_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_type** | **String**| Event type to be searched. | 
 **event_status** | **String**| Filter the search by a certain event status. | [optional] 

### Return type

[**Array&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **objects_get**
> Array&lt;InlineResponse2003&gt; objects_get(client_id, access_token, object_code)



Searches for the events related to a list of postal objects.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PostalObjectsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

object_code = "object_code_example" # String | List of comma separated codes to be consulted.


begin
  result = api_instance.objects_get(client_id, access_token, object_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PostalObjectsApi->objects_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **object_code** | **String**| List of comma separated codes to be consulted. | 

### Return type

[**Array&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **objects_object_code_get**
> Array&lt;ObjectsEventos&gt; objects_object_code_get(client_id, access_token, object_code, opts)



Searches for the informations related to a specific postal object.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PostalObjectsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

object_code = "object_code_example" # String | Code of the object to be consulted.

opts = { 
  event_type: "event_type_example" # String | Event type to be filtered.
}

begin
  result = api_instance.objects_object_code_get(client_id, access_token, object_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PostalObjectsApi->objects_object_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **object_code** | **String**| Code of the object to be consulted. | 
 **event_type** | **String**| Event type to be filtered. | [optional] 

### Return type

[**Array&lt;ObjectsEventos&gt;**](ObjectsEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



