# IO.Swagger.Api.ObjetoPostalApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EventosTipoEventoGet**](ObjetoPostalApi.md#eventostipoeventoget) | **GET** /eventos/{tipoEvento} | 
[**ObjetosCodigoObjetoGet**](ObjetoPostalApi.md#objetoscodigoobjetoget) | **GET** /objetos/{codigoObjeto} | 
[**ObjetosGet**](ObjetoPostalApi.md#objetosget) | **GET** /objetos | 


<a name="eventostipoeventoget"></a>
# **EventosTipoEventoGet**
> List<InlineResponse2003> EventosTipoEventoGet (string clientId, string accessToken, string tipoEvento, string statusEvento = null)



Retorna uma lista de possiveis status para um determinado evento.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class EventosTipoEventoGetExample
    {
        public void main()
        {
            
            var apiInstance = new ObjetoPostalApi();
            var clientId = clientId_example;  // string | Identificação do cliente usado na autenticação.
            var accessToken = accessToken_example;  // string | Access token usado na autenticação.
            var tipoEvento = tipoEvento_example;  // string | Tipo de evento a ser pesquisado.
            var statusEvento = statusEvento_example;  // string | Status a ser filtrado. (optional) 

            try
            {
                List&lt;InlineResponse2003&gt; result = apiInstance.EventosTipoEventoGet(clientId, accessToken, tipoEvento, statusEvento);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ObjetoPostalApi.EventosTipoEventoGet: " + e.Message );
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
 **tipoEvento** | **string**| Tipo de evento a ser pesquisado. | 
 **statusEvento** | **string**| Status a ser filtrado. | [optional] 

### Return type

[**List<InlineResponse2003>**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="objetoscodigoobjetoget"></a>
# **ObjetosCodigoObjetoGet**
> List<ObjetosEventos> ObjetosCodigoObjetoGet (string clientId, string accessToken, string codigoObjeto, string tipoEvento = null)



Pesquisa por informações relacionadas a um objeto postal especifico.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ObjetosCodigoObjetoGetExample
    {
        public void main()
        {
            
            var apiInstance = new ObjetoPostalApi();
            var clientId = clientId_example;  // string | Identificação do cliente usado na autenticação.
            var accessToken = accessToken_example;  // string | Access token usado na autenticação.
            var codigoObjeto = codigoObjeto_example;  // string | Codigo do objeto a ser pesquisado.
            var tipoEvento = tipoEvento_example;  // string | Tipo de evento a ser filtrado. (optional) 

            try
            {
                List&lt;ObjetosEventos&gt; result = apiInstance.ObjetosCodigoObjetoGet(clientId, accessToken, codigoObjeto, tipoEvento);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ObjetoPostalApi.ObjetosCodigoObjetoGet: " + e.Message );
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
 **codigoObjeto** | **string**| Codigo do objeto a ser pesquisado. | 
 **tipoEvento** | **string**| Tipo de evento a ser filtrado. | [optional] 

### Return type

[**List<ObjetosEventos>**](ObjetosEventos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="objetosget"></a>
# **ObjetosGet**
> List<InlineResponse2002> ObjetosGet (string clientId, string accessToken, string codigoObjeto)



Pesquisa por informações relacionados a uma lista de objetos postais.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ObjetosGetExample
    {
        public void main()
        {
            
            var apiInstance = new ObjetoPostalApi();
            var clientId = clientId_example;  // string | Identificação do cliente usado na autenticação.
            var accessToken = accessToken_example;  // string | Access token usado na autenticação.
            var codigoObjeto = codigoObjeto_example;  // string | Lista, separada por virgula, com codigos de objetos postais.

            try
            {
                List&lt;InlineResponse2002&gt; result = apiInstance.ObjetosGet(clientId, accessToken, codigoObjeto);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ObjetoPostalApi.ObjetosGet: " + e.Message );
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
 **codigoObjeto** | **string**| Lista, separada por virgula, com codigos de objetos postais. | 

### Return type

[**List<InlineResponse2002>**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

