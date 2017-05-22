# SwaggerClient::ZipcodesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipcodes_state_get**](ZipcodesApi.md#zipcodes_state_get) | **GET** /zipcodes/{state} | 


# **zipcodes_state_get**
> Array&lt;InlineResponse200&gt; zipcodes_state_get(client_id, access_token, state, opts)



Searches for the range of zipcodes in the state's counties.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ZipcodesApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

state = "state_example" # String | State's abreviation.

opts = { 
  county: "county_example" # String | County's name.
}

begin
  result = api_instance.zipcodes_state_get(client_id, access_token, state, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ZipcodesApi->zipcodes_state_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **state** | **String**| State&#39;s abreviation. | 
 **county** | **String**| County&#39;s name. | [optional] 

### Return type

[**Array&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



