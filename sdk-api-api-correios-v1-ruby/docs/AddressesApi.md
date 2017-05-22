# SwaggerClient::AddressesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addresses_zipcode_get**](AddressesApi.md#addresses_zipcode_get) | **GET** /addresses/{zipcode} | 


# **addresses_zipcode_get**
> Array&lt;InlineResponse2001&gt; addresses_zipcode_get(client_id, access_token, zipcode)



Searches for the address of a given zipcodes.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AddressesApi.new

client_id = "client_id_example" # String | Customer identifier used for authentication.

access_token = "access_token_example" # String | Access token used in the authentication.

zipcode = "zipcode_example" # String | Zipcode to search.


begin
  result = api_instance.addresses_zipcode_get(client_id, access_token, zipcode)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AddressesApi->addresses_zipcode_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Customer identifier used for authentication. | 
 **access_token** | **String**| Access token used in the authentication. | 
 **zipcode** | **String**| Zipcode to search. | 

### Return type

[**Array&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



