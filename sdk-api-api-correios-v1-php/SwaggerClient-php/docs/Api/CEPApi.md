# Swagger\Client\CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cepEstadoGet**](CEPApi.md#cepEstadoGet) | **GET** /cep/{estado} | 


# **cepEstadoGet**
> \Swagger\Client\Model\InlineResponse200[] cepEstadoGet($client_id, $access_token, $estado, $municipio)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\CEPApi();
$client_id = "client_id_example"; // string | Identificação do cliente usado na autenticação.
$access_token = "access_token_example"; // string | Access token usado na autenticação.
$estado = "estado_example"; // string | Abreviação do Estado.
$municipio = "municipio_example"; // string | Nome do Município.

try {
    $result = $api_instance->cepEstadoGet($client_id, $access_token, $estado, $municipio);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CEPApi->cepEstadoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Identificação do cliente usado na autenticação. |
 **access_token** | **string**| Access token usado na autenticação. |
 **estado** | **string**| Abreviação do Estado. |
 **municipio** | **string**| Nome do Município. | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse200[]**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

