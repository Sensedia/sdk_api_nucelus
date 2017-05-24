# swagger_client.ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventos_tipo_evento_get**](ObjetoPostalApi.md#eventos_tipo_evento_get) | **GET** /eventos/{tipoEvento} | 
[**objetos_codigo_objeto_get**](ObjetoPostalApi.md#objetos_codigo_objeto_get) | **GET** /objetos/{codigoObjeto} | 
[**objetos_get**](ObjetoPostalApi.md#objetos_get) | **GET** /objetos | 


# **eventos_tipo_evento_get**
> list[InlineResponse2003] eventos_tipo_evento_get(client_id, access_token, tipo_evento, status_evento=status_evento)



Retorna uma lista de possiveis status para um determinado evento.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ObjetoPostalApi()
client_id = 'client_id_example' # str | Identificação do cliente usado na autenticação.
access_token = 'access_token_example' # str | Access token usado na autenticação.
tipo_evento = 'tipo_evento_example' # str | Tipo de evento a ser pesquisado.
status_evento = 'status_evento_example' # str | Status a ser filtrado. (optional)

try: 
    api_response = api_instance.eventos_tipo_evento_get(client_id, access_token, tipo_evento, status_evento=status_evento)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ObjetoPostalApi->eventos_tipo_evento_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Identificação do cliente usado na autenticação. | 
 **access_token** | **str**| Access token usado na autenticação. | 
 **tipo_evento** | **str**| Tipo de evento a ser pesquisado. | 
 **status_evento** | **str**| Status a ser filtrado. | [optional] 

### Return type

[**list[InlineResponse2003]**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objetos_codigo_objeto_get**
> list[ObjetosEventos] objetos_codigo_objeto_get(client_id, access_token, codigo_objeto, tipo_evento=tipo_evento)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ObjetoPostalApi()
client_id = 'client_id_example' # str | Identificação do cliente usado na autenticação.
access_token = 'access_token_example' # str | Access token usado na autenticação.
codigo_objeto = 'codigo_objeto_example' # str | Codigo do objeto a ser pesquisado.
tipo_evento = 'tipo_evento_example' # str | Tipo de evento a ser filtrado. (optional)

try: 
    api_response = api_instance.objetos_codigo_objeto_get(client_id, access_token, codigo_objeto, tipo_evento=tipo_evento)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ObjetoPostalApi->objetos_codigo_objeto_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Identificação do cliente usado na autenticação. | 
 **access_token** | **str**| Access token usado na autenticação. | 
 **codigo_objeto** | **str**| Codigo do objeto a ser pesquisado. | 
 **tipo_evento** | **str**| Tipo de evento a ser filtrado. | [optional] 

### Return type

[**list[ObjetosEventos]**](ObjetosEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **objetos_get**
> list[InlineResponse2002] objetos_get(client_id, access_token, codigo_objeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ObjetoPostalApi()
client_id = 'client_id_example' # str | Identificação do cliente usado na autenticação.
access_token = 'access_token_example' # str | Access token usado na autenticação.
codigo_objeto = 'codigo_objeto_example' # str | Lista, separada por virgula, com codigos de objetos postais.

try: 
    api_response = api_instance.objetos_get(client_id, access_token, codigo_objeto)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ObjetoPostalApi->objetos_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **str**| Identificação do cliente usado na autenticação. | 
 **access_token** | **str**| Access token usado na autenticação. | 
 **codigo_objeto** | **str**| Lista, separada por virgula, com codigos de objetos postais. | 

### Return type

[**list[InlineResponse2002]**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

