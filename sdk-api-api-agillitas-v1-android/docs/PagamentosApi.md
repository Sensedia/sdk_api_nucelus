# PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagamentosPost**](PagamentosApi.md#pagamentosPost) | **POST** /pagamentos | Pagamento de boletos.


<a name="pagamentosPost"></a>
# **pagamentosPost**
> pagamentosPost(boleto)

Pagamento de boletos.

&lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;

### Example
```java
// Import classes:
//import io.swagger.client.api.PagamentosApi;

PagamentosApi apiInstance = new PagamentosApi();
Pagamento boleto = new Pagamento(); // Pagamento | Objeto de requisição
try {
    apiInstance.pagamentosPost(boleto);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentosApi#pagamentosPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boleto** | [**Pagamento**](Pagamento.md)| Objeto de requisição |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

