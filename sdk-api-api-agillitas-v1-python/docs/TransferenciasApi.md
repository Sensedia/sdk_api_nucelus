# swagger_client.TransferenciasApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferencias_cadastros_post**](TransferenciasApi.md#transferencias_cadastros_post) | **POST** /transferencias/cadastros | Cadastro de beneficiário
[**transferencias_post**](TransferenciasApi.md#transferencias_post) | **POST** /transferencias | Transferência de valor


# **transferencias_cadastros_post**
> transferencias_cadastros_post(beneficiario)

Cadastro de beneficiário

<p>Permite o cadastro de beneficiário para uma transferencia.</p>

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
api_instance = swagger_client.TransferenciasApi()
beneficiario = swagger_client.TransferenciaCadastroBenificiario() # TransferenciaCadastroBenificiario | Objeto de requisição

try: 
    # Cadastro de beneficiário
    api_instance.transferencias_cadastros_post(beneficiario)
except ApiException as e:
    print("Exception when calling TransferenciasApi->transferencias_cadastros_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiario** | [**TransferenciaCadastroBenificiario**](TransferenciaCadastroBenificiario.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transferencias_post**
> transferencias_post(transferencia)

Transferência de valor

<p>Permite a transferência de valor entre dois cartões pré cadastrados.</p>

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
api_instance = swagger_client.TransferenciasApi()
transferencia = swagger_client.Transferencia() # Transferencia | Objeto de requisição

try: 
    # Transferência de valor
    api_instance.transferencias_post(transferencia)
except ApiException as e:
    print("Exception when calling TransferenciasApi->transferencias_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferencia** | [**Transferencia**](Transferencia.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

