# Swagger\Client\CartoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cartoesGet**](CartoesApi.md#cartoesGet) | **GET** /cartoes | Obtém o número de identificação (Proxy) de um cartão
[**cartoesIdCartaoExtratoGet**](CartoesApi.md#cartoesIdCartaoExtratoGet) | **GET** /cartoes/{idCartao}/extrato | Extrato do cartão
[**cartoesIdCartaoPortadorGet**](CartoesApi.md#cartoesIdCartaoPortadorGet) | **GET** /cartoes/{idCartao}/portador | Informações do portador do cartão
[**cartoesIdCartaoSaldoGet**](CartoesApi.md#cartoesIdCartaoSaldoGet) | **GET** /cartoes/{idCartao}/saldo | Saldo do cartão
[**cartoesIdCartaoSaldoPut**](CartoesApi.md#cartoesIdCartaoSaldoPut) | **PUT** /cartoes/{idCartao}/saldo | Credita ou debita valor da conta de um cartão.
[**cartoesIdCartaoStatusGet**](CartoesApi.md#cartoesIdCartaoStatusGet) | **GET** /cartoes/{idCartao}/status | Status do cartão
[**cartoesIdCartaoStatusPut**](CartoesApi.md#cartoesIdCartaoStatusPut) | **PUT** /cartoes/{idCartao}/status | Altera status do cartão
[**cartoesPost**](CartoesApi.md#cartoesPost) | **POST** /cartoes | Requisita um cartão de debito


# **cartoesGet**
> \Swagger\Client\Model\CartaoDisponivel cartoesGet($tipo_cartao)

Obtém o número de identificação (Proxy) de um cartão

<p>Permite a verificação de disponibilidade de cartão e qual o número de identificação (Proxy) para posterior requisição.</p><br/><p class='obs obs-danger'> Este recurso só poderá ser utilizado em produção mediante aprovação.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$tipo_cartao = "fisico"; // string | Identifica qual o tipo do cartão, físico ou virtual.

try {
    $result = $api_instance->cartoesGet($tipo_cartao);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tipo_cartao** | **string**| Identifica qual o tipo do cartão, físico ou virtual. | [default to fisico]

### Return type

[**\Swagger\Client\Model\CartaoDisponivel**](../Model/CartaoDisponivel.md)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoExtratoGet**
> \Swagger\Client\Model\ExtratoResponse cartoesIdCartaoExtratoGet($id_cartao, $data_inicial, $data_final)

Extrato do cartão

<p>Permite a consulta dos movimentos por período, de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.
$data_inicial = "data_inicial_example"; // string | Data inicial para a consulta.
$data_final = "data_final_example"; // string | Data final para a consulta.

try {
    $result = $api_instance->cartoesIdCartaoExtratoGet($id_cartao, $data_inicial, $data_final);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoExtratoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |
 **data_inicial** | **string**| Data inicial para a consulta. |
 **data_final** | **string**| Data final para a consulta. |

### Return type

[**\Swagger\Client\Model\ExtratoResponse**](../Model/ExtratoResponse.md)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoPortadorGet**
> \Swagger\Client\Model\PortadorResponse cartoesIdCartaoPortadorGet($id_cartao)

Informações do portador do cartão

<p>Permite a consulta de informações cadastrais de um determinado portador de cartão.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.

try {
    $result = $api_instance->cartoesIdCartaoPortadorGet($id_cartao);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoPortadorGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**\Swagger\Client\Model\PortadorResponse**](../Model/PortadorResponse.md)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoSaldoGet**
> \Swagger\Client\Model\Saldo cartoesIdCartaoSaldoGet($id_cartao)

Saldo do cartão

<p>Permite a consulta do saldo disponível de um determinado cartão.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.

try {
    $result = $api_instance->cartoesIdCartaoSaldoGet($id_cartao);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoSaldoGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**\Swagger\Client\Model\Saldo**](../Model/Saldo.md)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoSaldoPut**
> cartoesIdCartaoSaldoPut($id_cartao, $saldo)

Credita ou debita valor da conta de um cartão.

<p>Permite creditar ou debitar um valor especifico em um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.
$saldo = new \Swagger\Client\Model\SetSaldo(); // \Swagger\Client\Model\SetSaldo | Objeto de requisição

try {
    $api_instance->cartoesIdCartaoSaldoPut($id_cartao, $saldo);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoSaldoPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |
 **saldo** | [**\Swagger\Client\Model\SetSaldo**](../Model/\Swagger\Client\Model\SetSaldo.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoStatusGet**
> \Swagger\Client\Model\StatusCartaoResponse cartoesIdCartaoStatusGet($id_cartao)

Status do cartão

<p>Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado , desbloqueado ou cancelado.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.

try {
    $result = $api_instance->cartoesIdCartaoStatusGet($id_cartao);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoStatusGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**\Swagger\Client\Model\StatusCartaoResponse**](../Model/StatusCartaoResponse.md)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesIdCartaoStatusPut**
> cartoesIdCartaoStatusPut($id_cartao, $status)

Altera status do cartão

<p>Permite o bloqueio e desbloqueio de um determinado cartão.</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$id_cartao = "id_cartao_example"; // string | Número identificador referente ao proxy localizado no verso do cartão.
$status = new \Swagger\Client\Model\SetCardStatus(); // \Swagger\Client\Model\SetCardStatus | Objeto de requisição

try {
    $api_instance->cartoesIdCartaoStatusPut($id_cartao, $status);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesIdCartaoStatusPut: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_cartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. |
 **status** | [**\Swagger\Client\Model\SetCardStatus**](../Model/\Swagger\Client\Model\SetCardStatus.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **cartoesPost**
> cartoesPost($cartao)

Requisita um cartão de debito

<p>Permite a carga de um valor especifico a um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e com fundo disponível na conta e ainda dependente de aprovação pelo agente financeiro</p>

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

$api_instance = new Swagger\Client\Api\CartoesApi();
$cartao = new \Swagger\Client\Model\SetNovoCartao(); // \Swagger\Client\Model\SetNovoCartao | Objeto de requisição

try {
    $api_instance->cartoesPost($cartao);
} catch (Exception $e) {
    echo 'Exception when calling CartoesApi->cartoesPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartao** | [**\Swagger\Client\Model\SetNovoCartao**](../Model/\Swagger\Client\Model\SetNovoCartao.md)| Objeto de requisição |

### Return type

void (empty response body)

### Authorization

[access_token](../../README.md#access_token), [key_id](../../README.md#key_id), [client_id](../../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

