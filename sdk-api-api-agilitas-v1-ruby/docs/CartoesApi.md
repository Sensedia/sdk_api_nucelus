# SwaggerClient::CartoesApi

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
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

tipo_cartao = "fisico" # String | Identifica qual o tipo do cartão, físico ou virtual.


begin
  #Obtém o número de identificação (Proxy) de um cartão
  result = api_instance.cartoes_get(tipo_cartao)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tipo_cartao** | **String**| Identifica qual o tipo do cartão, físico ou virtual. | [default to fisico]

### Return type

[**CartaoDisponivel**](CartaoDisponivel.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_extrato_get**
> ExtratoResponse cartoes_id_cartao_extrato_get(id_cartao, data_inicial, data_final)

Extrato do cartão

<p>Permite a consulta dos movimentos por período, de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.

data_inicial = "data_inicial_example" # String | Data inicial para a consulta.

data_final = "data_final_example" # String | Data final para a consulta.


begin
  #Extrato do cartão
  result = api_instance.cartoes_id_cartao_extrato_get(id_cartao, data_inicial, data_final)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_extrato_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **data_inicial** | **String**| Data inicial para a consulta. | 
 **data_final** | **String**| Data final para a consulta. | 

### Return type

[**ExtratoResponse**](ExtratoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_portador_get**
> PortadorResponse cartoes_id_cartao_portador_get(id_cartao)

Informações do portador do cartão

<p>Permite a consulta de informações cadastrais de um determinado portador de cartão.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.


begin
  #Informações do portador do cartão
  result = api_instance.cartoes_id_cartao_portador_get(id_cartao)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_portador_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**PortadorResponse**](PortadorResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_saldo_get**
> Saldo cartoes_id_cartao_saldo_get(id_cartao)

Saldo do cartão

<p>Permite a consulta do saldo disponível de um determinado cartão.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.


begin
  #Saldo do cartão
  result = api_instance.cartoes_id_cartao_saldo_get(id_cartao)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_saldo_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**Saldo**](Saldo.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_saldo_put**
> cartoes_id_cartao_saldo_put(id_cartao, saldo)

Credita ou debita valor da conta de um cartão.

<p>Permite creditar ou debitar um valor especifico em um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.

saldo = SwaggerClient::SetSaldo.new # SetSaldo | Objeto de requisição


begin
  #Credita ou debita valor da conta de um cartão.
  api_instance.cartoes_id_cartao_saldo_put(id_cartao, saldo)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_saldo_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **saldo** | [**SetSaldo**](SetSaldo.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_status_get**
> StatusCartaoResponse cartoes_id_cartao_status_get(id_cartao)

Status do cartão

<p>Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado , desbloqueado ou cancelado.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.


begin
  #Status do cartão
  result = api_instance.cartoes_id_cartao_status_get(id_cartao)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_status_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**StatusCartaoResponse**](StatusCartaoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_id_cartao_status_put**
> cartoes_id_cartao_status_put(id_cartao, status)

Altera status do cartão

<p>Permite o bloqueio e desbloqueio de um determinado cartão.</p>

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

id_cartao = "id_cartao_example" # String | Número identificador referente ao proxy localizado no verso do cartão.

status = SwaggerClient::SetCardStatus.new # SetCardStatus | Objeto de requisição


begin
  #Altera status do cartão
  api_instance.cartoes_id_cartao_status_put(id_cartao, status)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_id_cartao_status_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **status** | [**SetCardStatus**](SetCardStatus.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **cartoes_post**
> cartoes_post(cartao)

Requisita um cartão de debito

<p>Permite a carga de um valor especifico a um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e com fundo disponível na conta e ainda dependente de aprovação pelo agente financeiro</p> 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: access_token
  config.api_key['access_token'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['access_token'] = 'Bearer'

  # Configure API key authorization: key_id
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'

  # Configure API key authorization: client_id
  config.api_key['client_id'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['client_id'] = 'Bearer'
end

api_instance = SwaggerClient::CartoesApi.new

cartao = SwaggerClient::SetNovoCartao.new # SetNovoCartao | Objeto de requisição


begin
  #Requisita um cartão de debito
  api_instance.cartoes_post(cartao)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CartoesApi->cartoes_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartao** | [**SetNovoCartao**](SetNovoCartao.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



