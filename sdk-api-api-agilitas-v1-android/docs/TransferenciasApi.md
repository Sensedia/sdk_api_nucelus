# TransferenciasApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transferenciasCadastrosPost**](TransferenciasApi.md#transferenciasCadastrosPost) | **POST** /transferencias/cadastros | Cadastro de beneficiário
[**transferenciasPost**](TransferenciasApi.md#transferenciasPost) | **POST** /transferencias | Transferência de valor


<a name="transferenciasCadastrosPost"></a>
# **transferenciasCadastrosPost**
> transferenciasCadastrosPost(beneficiario)

Cadastro de beneficiário

&lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;

### Example
```java
// Import classes:
//import io.swagger.client.api.TransferenciasApi;

TransferenciasApi apiInstance = new TransferenciasApi();
TransferenciaCadastroBenificiario beneficiario = new TransferenciaCadastroBenificiario(); // TransferenciaCadastroBenificiario | Objeto de requisição
try {
    apiInstance.transferenciasCadastrosPost(beneficiario);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasApi#transferenciasCadastrosPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiario** | [**TransferenciaCadastroBenificiario**](TransferenciaCadastroBenificiario.md)| Objeto de requisição |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferenciasPost"></a>
# **transferenciasPost**
> transferenciasPost(transferencia)

Transferência de valor

&lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;

### Example
```java
// Import classes:
//import io.swagger.client.api.TransferenciasApi;

TransferenciasApi apiInstance = new TransferenciasApi();
Transferencia transferencia = new Transferencia(); // Transferencia | Objeto de requisição
try {
    apiInstance.transferenciasPost(transferencia);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasApi#transferenciasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferencia** | [**Transferencia**](Transferencia.md)| Objeto de requisição |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

