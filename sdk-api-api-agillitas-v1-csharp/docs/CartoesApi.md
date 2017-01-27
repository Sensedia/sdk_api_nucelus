# IO.Swagger.Api.CartoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CartoesGet**](CartoesApi.md#cartoesget) | **GET** /cartoes | Obtém o número de identificação (Proxy) de um cartão
[**CartoesIdCartaoExtratoGet**](CartoesApi.md#cartoesidcartaoextratoget) | **GET** /cartoes/{idCartao}/extrato | Extrato do cartão
[**CartoesIdCartaoPortadorGet**](CartoesApi.md#cartoesidcartaoportadorget) | **GET** /cartoes/{idCartao}/portador | Informações do portador do cartão
[**CartoesIdCartaoSaldoGet**](CartoesApi.md#cartoesidcartaosaldoget) | **GET** /cartoes/{idCartao}/saldo | Saldo do cartão
[**CartoesIdCartaoSaldoPut**](CartoesApi.md#cartoesidcartaosaldoput) | **PUT** /cartoes/{idCartao}/saldo | Credita ou debita valor da conta de um cartão.
[**CartoesIdCartaoStatusGet**](CartoesApi.md#cartoesidcartaostatusget) | **GET** /cartoes/{idCartao}/status | Status do cartão
[**CartoesIdCartaoStatusPut**](CartoesApi.md#cartoesidcartaostatusput) | **PUT** /cartoes/{idCartao}/status | Altera status do cartão
[**CartoesPost**](CartoesApi.md#cartoespost) | **POST** /cartoes | Requisita um cartão de debito


<a name="cartoesget"></a>
# **CartoesGet**
> CartaoDisponivel CartoesGet (string tipoCartao)

Obtém o número de identificação (Proxy) de um cartão

<p>Permite a verificação de disponibilidade de cartão e qual o número de identificação (Proxy) para posterior requisição.</p><br/><p class='obs obs-danger'> Este recurso só poderá ser utilizado em produção mediante aprovação.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesGetExample
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

            var apiInstance = new CartoesApi();
            var tipoCartao = tipoCartao_example;  // string | Identifica qual o tipo do cartão, físico ou virtual. (default to fisico)

            try
            {
                // Obtém o número de identificação (Proxy) de um cartão
                CartaoDisponivel result = apiInstance.CartoesGet(tipoCartao);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tipoCartao** | **string**| Identifica qual o tipo do cartão, físico ou virtual. | [default to fisico]

### Return type

[**CartaoDisponivel**](CartaoDisponivel.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaoextratoget"></a>
# **CartoesIdCartaoExtratoGet**
> ExtratoResponse CartoesIdCartaoExtratoGet (string idCartao, string dataInicial, string dataFinal)

Extrato do cartão

<p>Permite a consulta dos movimentos por período, de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoExtratoGetExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.
            var dataInicial = dataInicial_example;  // string | Data inicial para a consulta.
            var dataFinal = dataFinal_example;  // string | Data final para a consulta.

            try
            {
                // Extrato do cartão
                ExtratoResponse result = apiInstance.CartoesIdCartaoExtratoGet(idCartao, dataInicial, dataFinal);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoExtratoGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **dataInicial** | **string**| Data inicial para a consulta. | 
 **dataFinal** | **string**| Data final para a consulta. | 

### Return type

[**ExtratoResponse**](ExtratoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaoportadorget"></a>
# **CartoesIdCartaoPortadorGet**
> PortadorResponse CartoesIdCartaoPortadorGet (string idCartao)

Informações do portador do cartão

<p>Permite a consulta de informações cadastrais de um determinado portador de cartão.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoPortadorGetExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.

            try
            {
                // Informações do portador do cartão
                PortadorResponse result = apiInstance.CartoesIdCartaoPortadorGet(idCartao);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoPortadorGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**PortadorResponse**](PortadorResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaosaldoget"></a>
# **CartoesIdCartaoSaldoGet**
> Saldo CartoesIdCartaoSaldoGet (string idCartao)

Saldo do cartão

<p>Permite a consulta do saldo disponível de um determinado cartão.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoSaldoGetExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.

            try
            {
                // Saldo do cartão
                Saldo result = apiInstance.CartoesIdCartaoSaldoGet(idCartao);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoSaldoGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**Saldo**](Saldo.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaosaldoput"></a>
# **CartoesIdCartaoSaldoPut**
> void CartoesIdCartaoSaldoPut (string idCartao, SetSaldo saldo)

Credita ou debita valor da conta de um cartão.

<p>Permite creditar ou debitar um valor especifico em um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoSaldoPutExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.
            var saldo = new SetSaldo(); // SetSaldo | Objeto de requisição

            try
            {
                // Credita ou debita valor da conta de um cartão.
                apiInstance.CartoesIdCartaoSaldoPut(idCartao, saldo);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoSaldoPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **saldo** | [**SetSaldo**](SetSaldo.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaostatusget"></a>
# **CartoesIdCartaoStatusGet**
> StatusCartaoResponse CartoesIdCartaoStatusGet (string idCartao)

Status do cartão

<p>Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado , desbloqueado ou cancelado.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoStatusGetExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.

            try
            {
                // Status do cartão
                StatusCartaoResponse result = apiInstance.CartoesIdCartaoStatusGet(idCartao);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoStatusGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 

### Return type

[**StatusCartaoResponse**](StatusCartaoResponse.md)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoesidcartaostatusput"></a>
# **CartoesIdCartaoStatusPut**
> void CartoesIdCartaoStatusPut (string idCartao, SetCardStatus status)

Altera status do cartão

<p>Permite o bloqueio e desbloqueio de um determinado cartão.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesIdCartaoStatusPutExample
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

            var apiInstance = new CartoesApi();
            var idCartao = idCartao_example;  // string | Número identificador referente ao proxy localizado no verso do cartão.
            var status = new SetCardStatus(); // SetCardStatus | Objeto de requisição

            try
            {
                // Altera status do cartão
                apiInstance.CartoesIdCartaoStatusPut(idCartao, status);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesIdCartaoStatusPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCartao** | **string**| Número identificador referente ao proxy localizado no verso do cartão. | 
 **status** | [**SetCardStatus**](SetCardStatus.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cartoespost"></a>
# **CartoesPost**
> void CartoesPost (SetNovoCartao cartao)

Requisita um cartão de debito

<p>Permite a carga de um valor especifico a um determinado cartão.</p><br/><p class='obs obs-danger'>Este recurso deve ser utilizado somente pelo reseller e com fundo disponível na conta e ainda dependente de aprovação pelo agente financeiro</p> 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CartoesPostExample
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

            var apiInstance = new CartoesApi();
            var cartao = new SetNovoCartao(); // SetNovoCartao | Objeto de requisição

            try
            {
                // Requisita um cartão de debito
                apiInstance.CartoesPost(cartao);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CartoesApi.CartoesPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartao** | [**SetNovoCartao**](SetNovoCartao.md)| Objeto de requisição | 

### Return type

void (empty response body)

### Authorization

[access_token](../README.md#access_token), [key_id](../README.md#key_id), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

