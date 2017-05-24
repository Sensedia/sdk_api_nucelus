# Swagger\Client\EnderecoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enderecosCepGet**](EnderecoesApi.md#enderecosCepGet) | **GET** /enderecos/{cep} | 


# **enderecosCepGet**
> \Swagger\Client\Model\InlineResponse2001[] enderecosCepGet($client_id, $access_token, $cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EnderecoesApi();
$client_id = "client_id_example"; // string | Identificação do cliente usado na autenticação.
$access_token = "access_token_example"; // string | Access token usado na autenticação.
$cep = "cep_example"; // string | CEP a ser pesquisado.

try {
    $result = $api_instance->enderecosCepGet($client_id, $access_token, $cep);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnderecoesApi->enderecosCepGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Identificação do cliente usado na autenticação. |
 **access_token** | **string**| Access token usado na autenticação. |
 **cep** | **string**| CEP a ser pesquisado. |

### Return type

[**\Swagger\Client\Model\InlineResponse2001[]**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

