# SwaggerClient::ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventos_tipo_evento_get**](ObjetoPostalApi.md#eventos_tipo_evento_get) | **GET** /eventos/{tipoEvento} | 
[**objetos_codigo_objeto_get**](ObjetoPostalApi.md#objetos_codigo_objeto_get) | **GET** /objetos/{codigoObjeto} | 
[**objetos_get**](ObjetoPostalApi.md#objetos_get) | **GET** /objetos | 


# **eventos_tipo_evento_get**
> Array&lt;InlineResponse2003&gt; eventos_tipo_evento_get(client_id, access_token, tipo_evento, opts)



Retorna uma lista de possiveis status para um determinado evento.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ObjetoPostalApi.new

client_id = "client_id_example" # String | Identificação do cliente usado na autenticação.

access_token = "access_token_example" # String | Access token usado na autenticação.

tipo_evento = "tipo_evento_example" # String | Tipo de evento a ser pesquisado.

opts = { 
  status_evento: "status_evento_example" # String | Status a ser filtrado.
}

begin
  result = api_instance.eventos_tipo_evento_get(client_id, access_token, tipo_evento, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ObjetoPostalApi->eventos_tipo_evento_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Identificação do cliente usado na autenticação. | 
 **access_token** | **String**| Access token usado na autenticação. | 
 **tipo_evento** | **String**| Tipo de evento a ser pesquisado. | 
 **status_evento** | **String**| Status a ser filtrado. | [optional] 

### Return type

[**Array&lt;InlineResponse2003&gt;**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **objetos_codigo_objeto_get**
> Array&lt;ObjetosEventos&gt; objetos_codigo_objeto_get(client_id, access_token, codigo_objeto, opts)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ObjetoPostalApi.new

client_id = "client_id_example" # String | Identificação do cliente usado na autenticação.

access_token = "access_token_example" # String | Access token usado na autenticação.

codigo_objeto = "codigo_objeto_example" # String | Codigo do objeto a ser pesquisado.

opts = { 
  tipo_evento: "tipo_evento_example" # String | Tipo de evento a ser filtrado.
}

begin
  result = api_instance.objetos_codigo_objeto_get(client_id, access_token, codigo_objeto, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ObjetoPostalApi->objetos_codigo_objeto_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Identificação do cliente usado na autenticação. | 
 **access_token** | **String**| Access token usado na autenticação. | 
 **codigo_objeto** | **String**| Codigo do objeto a ser pesquisado. | 
 **tipo_evento** | **String**| Tipo de evento a ser filtrado. | [optional] 

### Return type

[**Array&lt;ObjetosEventos&gt;**](ObjetosEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **objetos_get**
> Array&lt;InlineResponse2002&gt; objetos_get(client_id, access_token, codigo_objeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ObjetoPostalApi.new

client_id = "client_id_example" # String | Identificação do cliente usado na autenticação.

access_token = "access_token_example" # String | Access token usado na autenticação.

codigo_objeto = "codigo_objeto_example" # String | Lista, separada por virgula, com codigos de objetos postais.


begin
  result = api_instance.objetos_get(client_id, access_token, codigo_objeto)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ObjetoPostalApi->objetos_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **String**| Identificação do cliente usado na autenticação. | 
 **access_token** | **String**| Access token usado na autenticação. | 
 **codigo_objeto** | **String**| Lista, separada por virgula, com codigos de objetos postais. | 

### Return type

[**Array&lt;InlineResponse2002&gt;**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



