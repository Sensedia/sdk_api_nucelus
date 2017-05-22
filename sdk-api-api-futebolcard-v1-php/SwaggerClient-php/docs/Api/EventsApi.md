# Swagger\Client\EventsApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/futebolcard/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eventsEventIdGet**](EventsApi.md#eventsEventIdGet) | **GET** /events/{eventId} | 
[**eventsEventIdSectorsGet**](EventsApi.md#eventsEventIdSectorsGet) | **GET** /events/{eventId}/sectors | 
[**eventsEventIdSectorsSectorIdGet**](EventsApi.md#eventsEventIdSectorsSectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId} | 
[**eventsEventIdSectorsSectorIdSubsectorsGet**](EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors | 
[**eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**](EventsApi.md#eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet) | **GET** /events/{eventId}/sectors/{sectorId}/subsectors/{subsectorId} | 
[**eventsGet**](EventsApi.md#eventsGet) | **GET** /events | 


# **eventsEventIdGet**
> \Swagger\Client\Model\InlineResponse200 eventsEventIdGet($client_id, $access_token, $event_id)



Returns the details for a specific event.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_id = "event_id_example"; // string | Event to search.

try {
    $result = $api_instance->eventsEventIdGet($client_id, $access_token, $event_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsEventIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_id** | **string**| Event to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventsEventIdSectorsGet**
> \Swagger\Client\Model\InlineResponse2001 eventsEventIdSectorsGet($client_id, $access_token, $event_id)



Returns a list of sector for the given event.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_id = "event_id_example"; // string | Event to search.

try {
    $result = $api_instance->eventsEventIdSectorsGet($client_id, $access_token, $event_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsEventIdSectorsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_id** | **string**| Event to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventsEventIdSectorsSectorIdGet**
> \Swagger\Client\Model\InlineResponse2002 eventsEventIdSectorsSectorIdGet($client_id, $access_token, $event_id, $sector_id)



Returns the details of a specific sector.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_id = "event_id_example"; // string | Event to search.
$sector_id = "sector_id_example"; // string | Sector to search.

try {
    $result = $api_instance->eventsEventIdSectorsSectorIdGet($client_id, $access_token, $event_id, $sector_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsEventIdSectorsSectorIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_id** | **string**| Event to search. |
 **sector_id** | **string**| Sector to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventsEventIdSectorsSectorIdSubsectorsGet**
> \Swagger\Client\Model\InlineResponse2002[] eventsEventIdSectorsSectorIdSubsectorsGet($client_id, $access_token, $event_id, $sector_id)



Returns a list of subcsectors for a given sector.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_id = "event_id_example"; // string | Event to search.
$sector_id = "sector_id_example"; // string | Sector to search.

try {
    $result = $api_instance->eventsEventIdSectorsSectorIdSubsectorsGet($client_id, $access_token, $event_id, $sector_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsEventIdSectorsSectorIdSubsectorsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_id** | **string**| Event to search. |
 **sector_id** | **string**| Sector to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse2002[]**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet**
> \Swagger\Client\Model\InlineResponse2003[] eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet($client_id, $access_token, $event_id, $sector_id, $subsector_id)



Returns a list of seat's information for each row of a given subsector.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.
$event_id = "event_id_example"; // string | Event to search.
$sector_id = "sector_id_example"; // string | Sector to search.
$subsector_id = "subsector_id_example"; // string | Subsector to search.

try {
    $result = $api_instance->eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet($client_id, $access_token, $event_id, $sector_id, $subsector_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsEventIdSectorsSectorIdSubsectorsSubsectorIdGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |
 **event_id** | **string**| Event to search. |
 **sector_id** | **string**| Sector to search. |
 **subsector_id** | **string**| Subsector to search. |

### Return type

[**\Swagger\Client\Model\InlineResponse2003[]**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **eventsGet**
> \Swagger\Client\Model\InlineResponse200[] eventsGet($client_id, $access_token)



Returns a list of existing events.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\EventsApi();
$client_id = "client_id_example"; // string | Customer identifier used for authentication.
$access_token = "access_token_example"; // string | Access token used in the authentication.

try {
    $result = $api_instance->eventsGet($client_id, $access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EventsApi->eventsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **string**| Customer identifier used for authentication. |
 **access_token** | **string**| Access token used in the authentication. |

### Return type

[**\Swagger\Client\Model\InlineResponse200[]**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

