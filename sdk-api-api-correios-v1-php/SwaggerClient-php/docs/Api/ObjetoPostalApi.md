# Swagger\Client\ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventosTipoEventoGet**](ObjetoPostalApi.md#eventosTipoEventoGet) | **GET** /eventos/{tipoEvento} | 
[**objetosCodigoObjetoGet**](ObjetoPostalApi.md#objetosCodigoObjetoGet) | **GET** /objetos/{codigoObjeto} | 
[**objetosGet**](ObjetoPostalApi.md#objetosGet) | **GET** /objetos | 


# **eventosTipoEventoGet**
> \Swagger\Client\Model\InlineResponse2003[] eventosTipoEventoGet($client_id, $access_token, $tipo_evento, $status_evento)



Retorna uma lista de possiveis status para um determinado evento.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ObjetoPostalApi();
$client_id = "client_id_example"; // string | Identificação do cliente usado na autenticação.
$access_token = "access_token_example"; // string | Access token usado na autenticação.
$tipo_evento = "tipo_evento_example"; // string | Tipo de evento a ser pesquisado.
$status_evento = "status_evento_example"; // string | Status a ser filtrado.

try {
    $result = $api_instance->eventosTipoEventoGet($client_id, $access_token, $tipo_evento, $status_evento);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ObjetoPostalApi->eventosTipoEventoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Identificação do cliente usado na autenticação. |
 **access_token** | **string**| Access token usado na autenticação. |
 **tipo_evento** | **string**| Tipo de evento a ser pesquisado. |
 **status_evento** | **string**| Status a ser filtrado. | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse2003[]**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **objetosCodigoObjetoGet**
> \Swagger\Client\Model\ObjetosEventos[] objetosCodigoObjetoGet($client_id, $access_token, $codigo_objeto, $tipo_evento)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ObjetoPostalApi();
$client_id = "client_id_example"; // string | Identificação do cliente usado na autenticação.
$access_token = "access_token_example"; // string | Access token usado na autenticação.
$codigo_objeto = "codigo_objeto_example"; // string | Codigo do objeto a ser pesquisado.
$tipo_evento = "tipo_evento_example"; // string | Tipo de evento a ser filtrado.

try {
    $result = $api_instance->objetosCodigoObjetoGet($client_id, $access_token, $codigo_objeto, $tipo_evento);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ObjetoPostalApi->objetosCodigoObjetoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Identificação do cliente usado na autenticação. |
 **access_token** | **string**| Access token usado na autenticação. |
 **codigo_objeto** | **string**| Codigo do objeto a ser pesquisado. |
 **tipo_evento** | **string**| Tipo de evento a ser filtrado. | [optional]

### Return type

[**\Swagger\Client\Model\ObjetosEventos[]**](../Model/ObjetosEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **objetosGet**
> \Swagger\Client\Model\InlineResponse2002[] objetosGet($client_id, $access_token, $codigo_objeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ObjetoPostalApi();
$client_id = "client_id_example"; // string | Identificação do cliente usado na autenticação.
$access_token = "access_token_example"; // string | Access token usado na autenticação.
$codigo_objeto = "codigo_objeto_example"; // string | Lista, separada por virgula, com codigos de objetos postais.

try {
    $result = $api_instance->objetosGet($client_id, $access_token, $codigo_objeto);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ObjetoPostalApi->objetosGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Identificação do cliente usado na autenticação. |
 **access_token** | **string**| Access token usado na autenticação. |
 **codigo_objeto** | **string**| Lista, separada por virgula, com codigos de objetos postais. |

### Return type

[**\Swagger\Client\Model\InlineResponse2002[]**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

