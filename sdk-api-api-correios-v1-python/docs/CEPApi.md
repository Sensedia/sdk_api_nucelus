# swagger_client.CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cep_estado_get**](CEPApi.md#cep_estado_get) | **GET** /cep/{estado} | 


# **cep_estado_get**
> list[InlineResponse200] cep_estado_get(client_id, access_token, estado, municipio=municipio)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CEPApi()
client_id = 'client_id_example' # str | Identificação do cliente usado na autenticação.
access_token = 'access_token_example' # str | Access token usado na autenticação.
estado = 'estado_example' # str | Abreviação do Estado.
municipio = 'municipio_example' # str | Nome do Município. (optional)

try: 
    api_response = api_instance.cep_estado_get(client_id, access_token, estado, municipio=municipio)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CEPApi->cep_estado_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Identificação do cliente usado na autenticação. | 
 **access_token** | **str**| Access token usado na autenticação. | 
 **estado** | **str**| Abreviação do Estado. | 
 **municipio** | **str**| Nome do Município. | [optional] 

### Return type

[**list[InlineResponse200]**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

