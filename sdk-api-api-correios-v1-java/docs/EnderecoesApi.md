# EnderecoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enderecosCepGet**](EnderecoesApi.md#enderecosCepGet) | **GET** /enderecos/{cep} | 


<a name="enderecosCepGet"></a>
# **enderecosCepGet**
> List&lt;InlineResponse2001&gt; enderecosCepGet(clientId, accessToken, cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnderecoesApi;


EnderecoesApi apiInstance = new EnderecoesApi();
String clientId = "clientId_example"; // String | Identificação do cliente usado na autenticação.
String accessToken = "accessToken_example"; // String | Access token usado na autenticação.
String cep = "cep_example"; // String | CEP a ser pesquisado.
try {
    List<InlineResponse2001> result = apiInstance.enderecosCepGet(clientId, accessToken, cep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnderecoesApi#enderecosCepGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificação do cliente usado na autenticação. |
 **accessToken** | **String**| Access token usado na autenticação. |
 **cep** | **String**| CEP a ser pesquisado. |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

