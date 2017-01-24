# swagger_client.CartoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cartoes_get**](CartoesApi.md#cartoes_get) | **GET** /cartoes | Obtém o número de identificação (Proxy) de um cartão
[**cartoes_id_cartao_extrato_get**](CartoesApi.md#cartoes_id_cartao_extrato_get) | **GET** /cartoes/{idCartao}/extrato | Extrato do cartão
[**cartoes_id_cartao_portador_get**](CartoesApi.md#cartoes_id_cartao_portador_get) | **GET** /cartoes/{idCartao}/portador | Informações do portador do cartão
[**cartoes_id_cartao_saldo_get**](CartoesApi.md#cartoes_id_cartao_saldo_get) | **GET** /cartoes/{idCartao}/saldo | Saldo do cartão
[**cartoes_id_cartao_saldo_put**](CartoesApi.md#cartoes_id_cartao_saldo_put) | **PUT** /cartoes/{idCartao}/saldo | Credita ou debita valor da conta de um cartão.
[**cartoes_id_cartao_status_get**](CartoesApi.md#cartoes_id_cartao_status_get) | **GET** /cartoes/{idCartao}/status | Status do cartão
[**cartoes_id_cartao_status_put**](CartoesApi.md#cartoes_id_cartao_status_put) | **PUT** /cartoes/{idCartao}/status | Altera status do cartão
[**cartoes_post**](CartoesApi.md#cartoes_post) | **POST** /cartoes | Requisita um cartão de debito


# **cartoes_get**
> CartaoDisponivel cartoes_get(tipo_cartao)

Obtém o número de identificação (Proxy) de um cartão

<p>Permite a verificação de disponibilidade de cartão e qual o número de identificação (Proxy) para posterior requisição.</p><br/><p class='obs obs-danger'> Este recurso só poderá ser utilizado em produção mediante aprovação.</p>

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
api_instance = swagger_client.CartoesApi()
tipo_cartao = 'fisico' # str | Identifica qual o tipo do cartão, físico ou virtual. (default to fisico)

try: 
    # Obtém o número de identificação (Proxy) de um cartão
    api_response = api_instance.cartoes_get(tipo_cartao)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tipo_cartao** | **str**| Identifica qual o tipo do cartão, físico ou virtual. | [default to fisico]

### Return type

[**CartaoDisponivel**](CartaoDisponivel.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_extrato_get**
> ExtratoResponse cartoes_id_cartao_extrato_get(id_cartao, data_inicial, data_final)

Extrato do cartão

<p>Permite a consulta dos movimentos por período, de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.
data_inicial = 'data_inicial_example' # str | Data inicial para a consulta.
data_final = 'data_final_example' # str | Data final para a consulta.

try: 
    # Extrato do cartão
    api_response = api_instance.cartoes_id_cartao_extrato_get(id_cartao, data_inicial, data_final)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_extrato_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **data_inicial** | **str**| Data inicial para a consulta. | 
 **data_final** | **str**| Data final para a consulta. | 

### Return type

[**ExtratoResponse**](ExtratoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_portador_get**
> PortadorResponse cartoes_id_cartao_portador_get(id_cartao)

Informações do portador do cartão

<p>Permite a consulta de informações cadastrais de um determinado portador de cartão.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.

try: 
    # Informações do portador do cartão
    api_response = api_instance.cartoes_id_cartao_portador_get(id_cartao)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_portador_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**PortadorResponse**](PortadorResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_saldo_get**
> Saldo cartoes_id_cartao_saldo_get(id_cartao)

Saldo do cartão

<p>Permite a consulta do saldo disponível de um determinado cartão.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.

try: 
    # Saldo do cartão
    api_response = api_instance.cartoes_id_cartao_saldo_get(id_cartao)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_saldo_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**Saldo**](Saldo.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_saldo_put**
> cartoes_id_cartao_saldo_put(id_cartao, saldo)

Credita ou debita valor da conta de um cartão.

<p>Permite creditar ou debitar um valor especifico em um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.
saldo = swagger_client.SetSaldo() # SetSaldo | Objeto de requisição

try: 
    # Credita ou debita valor da conta de um cartão.
    api_instance.cartoes_id_cartao_saldo_put(id_cartao, saldo)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_saldo_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **saldo** | [**SetSaldo**](SetSaldo.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_status_get**
> StatusCartaoResponse cartoes_id_cartao_status_get(id_cartao)

Status do cartão

<p>Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado , desbloqueado ou cancelado.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.

try: 
    # Status do cartão
    api_response = api_instance.cartoes_id_cartao_status_get(id_cartao)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_status_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**StatusCartaoResponse**](StatusCartaoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_id_cartao_status_put**
> cartoes_id_cartao_status_put(id_cartao, status)

Altera status do cartão

<p>Permite o bloqueio e desbloqueio de um determinado cartão.</p>

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
api_instance = swagger_client.CartoesApi()
id_cartao = 'id_cartao_example' # str | Número identificador referente ao proxy localizado no verso do cartão.
status = swagger_client.SetCardStatus() # SetCardStatus | Objeto de requisição

try: 
    # Altera status do cartão
    api_instance.cartoes_id_cartao_status_put(id_cartao, status)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_id_cartao_status_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **str**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **status** | [**SetCardStatus**](SetCardStatus.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cartoes_post**
> cartoes_post(cartao)

Requisita um cartão de debito

<p>Permite a carga de um valor especifico a um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e com fundo disponível na conta e ainda dependente de aprovação pelo agente financeiro</p> 

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
api_instance = swagger_client.CartoesApi()
cartao = swagger_client.SetNovoCartao() # SetNovoCartao | Objeto de requisição

try: 
    # Requisita um cartão de debito
    api_instance.cartoes_post(cartao)
except ApiException as e:
    print("Exception when calling CartoesApi->cartoes_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartao** | [**SetNovoCartao**](SetNovoCartao.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

