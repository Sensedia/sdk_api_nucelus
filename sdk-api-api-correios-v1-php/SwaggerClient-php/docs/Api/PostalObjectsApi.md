# Swagger\Client\PostalObjectsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventTypeGet**](PostalObjectsApi.md#eventsEventTypeGet) | **GET** /events/{eventType} | 
[**objectsGet**](PostalObjectsApi.md#objectsGet) | **GET** /objects | 
[**objectsObjectCodeGet**](PostalObjectsApi.md#objectsObjectCodeGet) | **GET** /objects/{objectCode} | 


# **eventsEventTypeGet**
> \Swagger\Client\Model\InlineResponse2002[] eventsEventTypeGet($client_id, $access_token, $event_type, $event_status)



Returns the list of possible event status for a given postal events.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PostalObjectsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_type = "event_type_example"; // string | Event type to be searched.
$event_status = "event_status_example"; // string | Filter the search by a certain event status.

try {
    $result = $api_instance->eventsEventTypeGet($client_id, $access_token, $event_type, $event_status);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PostalObjectsApi->eventsEventTypeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_type** | **string**| Event type to be searched. |
 **event_status** | **string**| Filter the search by a certain event status. | [optional]

### Return type

[**\Swagger\Client\Model\InlineResponse2002[]**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **objectsGet**
> \Swagger\Client\Model\InlineResponse2003[] objectsGet($client_id, $access_token, $object_code)



Searches for the events related to a list of postal objects.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PostalObjectsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$object_code = "object_code_example"; // string | List of comma separated codes to be consulted.

try {
    $result = $api_instance->objectsGet($client_id, $access_token, $object_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PostalObjectsApi->objectsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **object_code** | **string**| List of comma separated codes to be consulted. |

### Return type

[**\Swagger\Client\Model\InlineResponse2003[]**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **objectsObjectCodeGet**
> \Swagger\Client\Model\ObjectsEventos[] objectsObjectCodeGet($client_id, $access_token, $object_code, $event_type)



Searches for the informations related to a specific postal object.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PostalObjectsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$object_code = "object_code_example"; // string | Code of the object to be consulted.
$event_type = "event_type_example"; // string | Event type to be filtered.

try {
    $result = $api_instance->objectsObjectCodeGet($client_id, $access_token, $object_code, $event_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PostalObjectsApi->objectsObjectCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **object_code** | **string**| Code of the object to be consulted. |
 **event_type** | **string**| Event type to be filtered. | [optional]

### Return type

[**\Swagger\Client\Model\ObjectsEventos[]**](../Model/ObjectsEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

