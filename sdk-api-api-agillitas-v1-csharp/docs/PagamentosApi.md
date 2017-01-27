# IO.Swagger.Api.PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PagamentosPost**](PagamentosApi.md#pagamentospost) | **POST** /pagamentos | Pagamento de boletos.


<a name="pagamentospost"></a>
# **PagamentosPost**
> void PagamentosPost (Pagamento boleto)

Pagamento de boletos.

<p>Permite o pagamento de boletos.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PagamentosPostExample
    {
        public void main()
        {
            
            // Configure API key authorization: access_token
            Configuration.Default.ApiKey.Add("access_token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("access_token", "Bearer");
            // Configure API key authorization: key_id
            Configuration.Default.ApiKey.Add("api_key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("api_key", "Bearer");
            // Configure API key authorization: client_id
            Configuration.Default.ApiKey.Add("client_id", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("client_id", "Bearer");

            var apiInstance = new PagamentosApi();
            var boleto = new Pagamento(); // Pagamento | Objeto de requisição

            try
            {
                // Pagamento de boletos.
                apiInstance.PagamentosPost(boleto);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PagamentosApi.PagamentosPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boleto** | [**Pagamento**](Pagamento.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

