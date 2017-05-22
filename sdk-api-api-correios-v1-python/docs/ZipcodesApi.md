# swagger_client.ZipcodesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipcodes_state_get**](ZipcodesApi.md#zipcodes_state_get) | **GET** /zipcodes/{state} | 


# **zipcodes_state_get**
> list[InlineResponse200] zipcodes_state_get(client_id, access_token, state, county=county)



Searches for the range of zipcodes in the state's counties.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ZipcodesApi()
client_id = 'client_id_example' # str | Customer identifier used for authentication.
access_token = 'access_token_example' # str | Access token used in the authentication.
state = 'state_example' # str | State's abreviation.
county = 'county_example' # str | County's name. (optional)

try: 
    api_response = api_instance.zipcodes_state_get(client_id, access_token, state, county=county)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ZipcodesApi->zipcodes_state_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Customer identifier used for authentication. | 
 **access_token** | **str**| Access token used in the authentication. | 
 **state** | **str**| State&#39;s abreviation. | 
 **county** | **str**| County&#39;s name. | [optional] 

### Return type

[**list[InlineResponse200]**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

