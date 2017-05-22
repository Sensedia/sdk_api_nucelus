# SwaggerClient::EventsApi

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
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_id = "event_id_example" # String | Event to search.


begin
  result = api_instance.events_event_id_get(client_id, access_token, event_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_event_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_id** | **String**| Event to search. | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **events_event_id_sectors_get**
> InlineResponse2001 events_event_id_sectors_get(client_id, access_token, event_id)



Returns a list of sector for the given event.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_id = "event_id_example" # String | Event to search.


begin
  result = api_instance.events_event_id_sectors_get(client_id, access_token, event_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_event_id_sectors_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_id** | **String**| Event to search. | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **events_event_id_sectors_sector_id_get**
> InlineResponse2002 events_event_id_sectors_sector_id_get(client_id, access_token, event_id, sector_id)



Returns the details of a specific sector.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_id = "event_id_example" # String | Event to search.

sector_id = "sector_id_example" # String | Sector to search.


begin
  result = api_instance.events_event_id_sectors_sector_id_get(client_id, access_token, event_id, sector_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_event_id_sectors_sector_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_id** | **String**| Event to search. | 
 **sector_id** | **String**| Sector to search. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **events_event_id_sectors_sector_id_subsectors_get**
> Array&lt;InlineResponse2002&gt; events_event_id_sectors_sector_id_subsectors_get(client_id, access_token, event_id, sector_id)



Returns a list of subcsectors for a given sector.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_id = "event_id_example" # String | Event to search.

sector_id = "sector_id_example" # String | Sector to search.


begin
  result = api_instance.events_event_id_sectors_sector_id_subsectors_get(client_id, access_token, event_id, sector_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_event_id_sectors_sector_id_subsectors_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_id** | **String**| Event to search. | 
 **sector_id** | **String**| Sector to search. | 

### Return type

[**Array&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **events_event_id_sectors_sector_id_subsectors_subsector_id_get**
> Array&lt;InlineResponse2003&gt; events_event_id_sectors_sector_id_subsectors_subsector_id_get(client_id, access_token, event_id, sector_id, subsector_id)



Returns a list of seat's information for each row of a given subsector.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

event_id = "event_id_example" # String | Event to search.

sector_id = "sector_id_example" # String | Sector to search.

subsector_id = "subsector_id_example" # String | Subsector to search.


begin
  result = api_instance.events_event_id_sectors_sector_id_subsectors_subsector_id_get(client_id, access_token, event_id, sector_id, subsector_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_event_id_sectors_sector_id_subsectors_subsector_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **event_id** | **String**| Event to search. | 
 **sector_id** | **String**| Sector to search. | 
 **subsector_id** | **String**| Subsector to search. | 

### Return type

[**Array&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **events_get**
> Array&lt;InlineResponse200&gt; events_get(client_id, access_token)



Returns a list of existing events.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EventsApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.


begin
  result = api_instance.events_get(client_id, access_token)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EventsApi->events_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 

### Return type

[**Array&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



