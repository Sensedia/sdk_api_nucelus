# CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cepEstadoGet**](CEPApi.md#cepEstadoGet) | **GET** /cep/{estado} | 


<a name="cepEstadoGet"></a>
# **cepEstadoGet**
> List&lt;InlineResponse200&gt; cepEstadoGet(clientId, accessToken, estado, municipio)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```java
// Import classes:
//import io.swagger.client.api.CEPApi;

CEPApi apiInstance = new CEPApi();
String clientId = "clientId_example"; // String | Identificação do cliente usado na autenticação.
String accessToken = "accessToken_example"; // String | Access token usado na autenticação.
String estado = "estado_example"; // String | Abreviação do Estado.
String municipio = "municipio_example"; // String | Nome do Município.
try {
    List<InlineResponse200> result = apiInstance.cepEstadoGet(clientId, accessToken, estado, municipio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CEPApi#cepEstadoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificação do cliente usado na autenticação. |
 **accessToken** | **String**| Access token usado na autenticação. |
 **estado** | **String**| Abreviação do Estado. |
 **municipio** | **String**| Nome do Município. | [optional]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

