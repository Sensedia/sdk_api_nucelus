# swagger_client.AddressesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addresses_zipcode_get**](AddressesApi.md#addresses_zipcode_get) | **GET** /addresses/{zipcode} | 


# **addresses_zipcode_get**
> list[InlineResponse2001] addresses_zipcode_get(client_id, access_token, zipcode)



Searches for the address of a given zipcodes.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AddressesApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
zipcode = 'zipcode_example' # str | Zipcode to search.

try: 
    api_response = api_instance.addresses_zipcode_get(client_id, access_token, zipcode)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressesApi->addresses_zipcode_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **zipcode** | **str**| Zipcode to search. | 

### Return type

[**list[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

