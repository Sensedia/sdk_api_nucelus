# swagger_client.PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagamentos_post**](PagamentosApi.md#pagamentos_post) | **POST** /pagamentos | Pagamento de boletos.


# **pagamentos_post**
> pagamentos_post(boleto)

Pagamento de boletos.

<p>Permite o pagamento de boletos.</p>

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: access_token
swagger_client.configuration.api_key['access_token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['access_token'] = 'Bearer'
# Configure API key authorization: key_id
swagger_client.configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['api_key'] = 'Bearer'
# Configure API key authorization: client_id
swagger_client.configuration.api_key['client_id'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# swagger_client.configuration.api_key_prefix['client_id'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.PagamentosApi()
boleto = swagger_client.Pagamento() # Pagamento | Objeto de requisição

try: 
    # Pagamento de boletos.
    api_instance.pagamentos_post(boleto)
except ApiException as e:
    print("Exception when calling PagamentosApi->pagamentos_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boleto** | [**Pagamento**](Pagamento.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

