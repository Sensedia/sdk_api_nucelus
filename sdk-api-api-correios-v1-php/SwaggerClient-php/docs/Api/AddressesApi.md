# Swagger\Client\AddressesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressesZipcodeGet**](AddressesApi.md#addressesZipcodeGet) | **GET** /addresses/{zipcode} | 


# **addressesZipcodeGet**
> \Swagger\Client\Model\InlineResponse2001[] addressesZipcodeGet($client_id, $access_token, $zipcode)



Searches for the address of a given zipcodes.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AddressesApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$zipcode = "zipcode_example"; // string | Zipcode to search.

try {
    $result = $api_instance->addressesZipcodeGet($client_id, $access_token, $zipcode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressesApi->addressesZipcodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **zipcode** | **string**| Zipcode to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse2001[]**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

