# Swagger\Client\TransferenciasApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferenciasCadastrosPost**](TransferenciasApi.md#transferenciasCadastrosPost) | **POST** /transferencias/cadastros | Cadastro de beneficiário
[**transferenciasPost**](TransferenciasApi.md#transferenciasPost) | **POST** /transferencias | Transferência de valor


# **transferenciasCadastrosPost**
> transferenciasCadastrosPost($beneficiario)

Cadastro de beneficiário

<p>Permite o cadastro de beneficiário para uma transferencia.</p>

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

$api_instance = new Swagger\Client\Api\TransferenciasApi();
$beneficiario = new \Swagger\Client\Model\TransferenciaCadastroBenificiario(); // \Swagger\Client\Model\TransferenciaCadastroBenificiario | Objeto de requisição

try {
    $api_instance->transferenciasCadastrosPost($beneficiario);
} catch (Exception $e) {
    echo 'Exception when calling TransferenciasApi->transferenciasCadastrosPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiario** | [**\Swagger\Client\Model\TransferenciaCadastroBenificiario**](../Model/\Swagger\Client\Model\TransferenciaCadastroBenificiario.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transferenciasPost**
> transferenciasPost($transferencia)

Transferência de valor

<p>Permite a transferência de valor entre dois cartões pré cadastrados.</p>

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

$api_instance = new Swagger\Client\Api\TransferenciasApi();
$transferencia = new \Swagger\Client\Model\Transferencia(); // \Swagger\Client\Model\Transferencia | Objeto de requisição

try {
    $api_instance->transferenciasPost($transferencia);
} catch (Exception $e) {
    echo 'Exception when calling TransferenciasApi->transferenciasPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferencia** | [**\Swagger\Client\Model\Transferencia**](../Model/\Swagger\Client\Model\Transferencia.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

