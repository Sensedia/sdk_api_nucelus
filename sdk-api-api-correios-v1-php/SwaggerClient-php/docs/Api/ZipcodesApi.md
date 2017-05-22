# Swagger\Client\ZipcodesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipcodesStateGet**](ZipcodesApi.md#zipcodesStateGet) | **GET** /zipcodes/{state} | 


# **zipcodesStateGet**
> \Swagger\Client\Model\InlineResponse200[] zipcodesStateGet($client_id, $access_token, $state, $county)



Searches for the range of zipcodes in the state's counties.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ZipcodesApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$state = "state_example"; // string | State's abreviation.
$county = "county_example"; // string | County's name.

try {
    $result = $api_instance->zipcodesStateGet($client_id, $access_token, $state, $county);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ZipcodesApi->zipcodesStateGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **state** | **string**| State&#39;s abreviation. |
 **county** | **string**| County&#39;s name. | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse200[]**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

