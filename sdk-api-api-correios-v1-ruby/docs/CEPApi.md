# SwaggerClient::CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cep_estado_get**](CEPApi.md#cep_estado_get) | **GET** /cep/{estado} | 


# **cep_estado_get**
> Array&lt;InlineResponse200&gt; cep_estado_get(client_id, access_token, estado, opts)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CEPApi.new

client_id = "client_id_example" # String | Identificação do cliente usado na autenticação.

access_token = "access_token_example" # String | Access token usado na autenticação.

estado = "estado_example" # String | Abreviação do Estado.

opts = { 
  municipio: "municipio_example" # String | Nome do Município.
}

begin
  result = api_instance.cep_estado_get(client_id, access_token, estado, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CEPApi->cep_estado_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Identificação do cliente usado na autenticação. | 
 **access_token** | **String**| Access token usado na autenticação. | 
 **estado** | **String**| Abreviação do Estado. | 
 **municipio** | **String**| Nome do Município. | [optional] 

### Return type

[**Array&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



