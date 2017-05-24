# IO.Swagger.Api.EnderecoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnderecosCepGet**](EnderecoesApi.md#enderecoscepget) | **GET** /enderecos/{cep} | 


<a name="enderecoscepget"></a>
# **EnderecosCepGet**
> List<InlineResponse2001> EnderecosCepGet (string clientId, string accessToken, string cep)



Pesquisa pelo endereço de um dado CEP.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EnderecosCepGetExample
    {
        public void main()
        {
            
            var apiInstance = new EnderecoesApi();
            var clientId = clientId_example;  // string | Identificação do cliente usado na autenticação.
            var accessToken = accessToken_example;  // string | Access token usado na autenticação.
            var cep = cep_example;  // string | CEP a ser pesquisado.

            try
            {
                List&lt;InlineResponse2001&gt; result = apiInstance.EnderecosCepGet(clientId, accessToken, cep);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnderecoesApi.EnderecosCepGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **string**| Identificação do cliente usado na autenticação. | 
 **accessToken** | **string**| Access token usado na autenticação. | 
 **cep** | **string**| CEP a ser pesquisado. | 

### Return type

[**List<InlineResponse2001>**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

