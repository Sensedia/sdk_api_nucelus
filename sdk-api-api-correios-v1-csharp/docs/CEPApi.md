# IO.Swagger.Api.CEPApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CepEstadoGet**](CEPApi.md#cepestadoget) | **GET** /cep/{estado} | 


<a name="cepestadoget"></a>
# **CepEstadoGet**
> List<InlineResponse200> CepEstadoGet (string clientId, string accessToken, string estado, string municipio = null)



Pesquisa pela faixa de CEPs nos municipios de um Estado.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CepEstadoGetExample
    {
        public void main()
        {
            
            var apiInstance = new CEPApi();
            var clientId = clientId_example;  // string | Identificação do cliente usado na autenticação.
            var accessToken = accessToken_example;  // string | Access token usado na autenticação.
            var estado = estado_example;  // string | Abreviação do Estado.
            var municipio = municipio_example;  // string | Nome do Município. (optional) 

            try
            {
                List&lt;InlineResponse200&gt; result = apiInstance.CepEstadoGet(clientId, accessToken, estado, municipio);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CEPApi.CepEstadoGet: " + e.Message );
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
 **estado** | **string**| Abreviação do Estado. | 
 **municipio** | **string**| Nome do Município. | [optional] 

### Return type

[**List<InlineResponse200>**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

