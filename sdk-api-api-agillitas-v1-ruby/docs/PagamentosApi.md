# SwaggerClient::PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagamentos_post**](PagamentosApi.md#pagamentos_post) | **POST** /pagamentos | Pagamento de boletos.


# **pagamentos_post**
> pagamentos_post(boleto)

Pagamento de boletos.

<p>Permite o pagamento de boletos.</p>

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

api_instance = SwaggerClient::PagamentosApi.new

boleto = SwaggerClient::Pagamento.new # Pagamento | Objeto de requisição


begin
  #Pagamento de boletos.
  api_instance.pagamentos_post(boleto)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PagamentosApi->pagamentos_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boleto** | [**Pagamento**](Pagamento.md)| Objeto de requisição | 

### Return type

nil (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



