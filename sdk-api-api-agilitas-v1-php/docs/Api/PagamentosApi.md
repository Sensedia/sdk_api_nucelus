# Swagger\Client\PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagamentosPost**](PagamentosApi.md#pagamentosPost) | **POST** /pagamentos | Pagamento de boletos.


# **pagamentosPost**
> pagamentosPost($boleto)

Pagamento de boletos.

<p>Permite o pagamento de boletos.</p>

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: access_token
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('access_token', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('access_token', 'Bearer');
// Configure API key authorization: key_id
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');
// Configure API key authorization: client_id
Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('client_id', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('client_id', 'Bearer');

$api_instance = new Swagger\Client\Api\PagamentosApi();
$boleto = new \Swagger\Client\Model\Pagamento(); // \Swagger\Client\Model\Pagamento | Objeto de requisição

try {
    $api_instance->pagamentosPost($boleto);
} catch (Exception $e) {
    echo 'Exception when calling PagamentosApi->pagamentosPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boleto** | [**\Swagger\Client\Model\Pagamento**](../Model/\Swagger\Client\Model\Pagamento.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

