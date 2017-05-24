# SwaggerClient::EnderecoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enderecos_cep_get**](EnderecoesApi.md#enderecos_cep_get) | **GET** /enderecos/{cep} | 


# **enderecos_cep_get**
> Array&lt;InlineResponse2001&gt; enderecos_cep_get(client_id, access_token, cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::EnderecoesApi.new

client_id = "client_id_example" # String | Identificação do cliente usado na autenticação.

access_token = "access_token_example" # String | Access token usado na autenticação.

cep = "cep_example" # String | CEP a ser pesquisado.


begin
  result = api_instance.enderecos_cep_get(client_id, access_token, cep)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EnderecoesApi->enderecos_cep_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Identificação do cliente usado na autenticação. | 
 **access_token** | **String**| Access token usado na autenticação. | 
 **cep** | **String**| CEP a ser pesquisado. | 

### Return type

[**Array&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



