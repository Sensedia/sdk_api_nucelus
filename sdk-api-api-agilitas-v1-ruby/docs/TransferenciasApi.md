# SwaggerClient::TransferenciasApi

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

api_instance = SwaggerClient::TransferenciasApi.new

beneficiario = SwaggerClient::TransferenciaCadastroBenificiario.new # TransferenciaCadastroBenificiario | Objeto de requisição


begin
  #Cadastro de beneficiário
  api_instance.transferencias_cadastros_post(beneficiario)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TransferenciasApi->transferencias_cadastros_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiario** | [**TransferenciaCadastroBenificiario**](TransferenciaCadastroBenificiario.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **transferencias_post**
> transferencias_post(transferencia)

Transferência de valor

<p>Permite a transferência de valor entre dois cartões pré cadastrados.</p>

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

api_instance = SwaggerClient::TransferenciasApi.new

transferencia = SwaggerClient::Transferencia.new # Transferencia | Objeto de requisição


begin
  #Transferência de valor
  api_instance.transferencias_post(transferencia)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling TransferenciasApi->transferencias_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferencia** | [**Transferencia**](Transferencia.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



