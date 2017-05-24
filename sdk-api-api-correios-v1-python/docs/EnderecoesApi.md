# swagger_client.EnderecoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enderecos_cep_get**](EnderecoesApi.md#enderecos_cep_get) | **GET** /enderecos/{cep} | 


# **enderecos_cep_get**
> list[InlineResponse2001] enderecos_cep_get(client_id, access_token, cep)



Pesquisa pelo endereço de um dado CEP.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.EnderecoesApi()
client_id = 'client_id_example' # str | Identificação do cliente usado na autenticação.
access_token = 'access_token_example' # str | Access token usado na autenticação.
cep = 'cep_example' # str | CEP a ser pesquisado.

try: 
    api_response = api_instance.enderecos_cep_get(client_id, access_token, cep)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EnderecoesApi->enderecos_cep_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Identificação do cliente usado na autenticação. | 
 **access_token** | **str**| Access token usado na autenticação. | 
 **cep** | **str**| CEP a ser pesquisado. | 

### Return type

[**list[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

