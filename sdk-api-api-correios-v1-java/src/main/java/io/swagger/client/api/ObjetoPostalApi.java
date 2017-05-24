/*
 * API dos Correios
 * API de rastreios de Objetos Postais
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse400;
import io.swagger.client.model.ObjetosEventos;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjetoPostalApi {
    private ApiClient apiClient;

    public ObjetoPostalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjetoPostalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for eventosTipoEventoGet */
    private com.squareup.okhttp.Call eventosTipoEventoGetCall(String clientId, String accessToken, String tipoEvento, String statusEvento, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/eventos/{tipoEvento}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tipoEvento" + "\\}", apiClient.escapeString(tipoEvento.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (statusEvento != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "statusEvento", statusEvento));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call eventosTipoEventoGetValidateBeforeCall(String clientId, String accessToken, String tipoEvento, String statusEvento, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling eventosTipoEventoGet(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling eventosTipoEventoGet(Async)");
        }
        
        // verify the required parameter 'tipoEvento' is set
        if (tipoEvento == null) {
            throw new ApiException("Missing the required parameter 'tipoEvento' when calling eventosTipoEventoGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = eventosTipoEventoGetCall(clientId, accessToken, tipoEvento, statusEvento, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Retorna uma lista de possiveis status para um determinado evento.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param tipoEvento Tipo de evento a ser pesquisado. (required)
     * @param statusEvento Status a ser filtrado. (optional)
     * @return List&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InlineResponse2003> eventosTipoEventoGet(String clientId, String accessToken, String tipoEvento, String statusEvento) throws ApiException {
        ApiResponse<List<InlineResponse2003>> resp = eventosTipoEventoGetWithHttpInfo(clientId, accessToken, tipoEvento, statusEvento);
        return resp.getData();
    }

    /**
     * 
     * Retorna uma lista de possiveis status para um determinado evento.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param tipoEvento Tipo de evento a ser pesquisado. (required)
     * @param statusEvento Status a ser filtrado. (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse2003&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InlineResponse2003>> eventosTipoEventoGetWithHttpInfo(String clientId, String accessToken, String tipoEvento, String statusEvento) throws ApiException {
        com.squareup.okhttp.Call call = eventosTipoEventoGetValidateBeforeCall(clientId, accessToken, tipoEvento, statusEvento, null, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retorna uma lista de possiveis status para um determinado evento.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param tipoEvento Tipo de evento a ser pesquisado. (required)
     * @param statusEvento Status a ser filtrado. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call eventosTipoEventoGetAsync(String clientId, String accessToken, String tipoEvento, String statusEvento, final ApiCallback<List<InlineResponse2003>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = eventosTipoEventoGetValidateBeforeCall(clientId, accessToken, tipoEvento, statusEvento, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InlineResponse2003>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for objetosCodigoObjetoGet */
    private com.squareup.okhttp.Call objetosCodigoObjetoGetCall(String clientId, String accessToken, String codigoObjeto, String tipoEvento, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/objetos/{codigoObjeto}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "codigoObjeto" + "\\}", apiClient.escapeString(codigoObjeto.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (tipoEvento != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call objetosCodigoObjetoGetValidateBeforeCall(String clientId, String accessToken, String codigoObjeto, String tipoEvento, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling objetosCodigoObjetoGet(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling objetosCodigoObjetoGet(Async)");
        }
        
        // verify the required parameter 'codigoObjeto' is set
        if (codigoObjeto == null) {
            throw new ApiException("Missing the required parameter 'codigoObjeto' when calling objetosCodigoObjetoGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = objetosCodigoObjetoGetCall(clientId, accessToken, codigoObjeto, tipoEvento, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Pesquisa por informações relacionadas a um objeto postal especifico.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Codigo do objeto a ser pesquisado. (required)
     * @param tipoEvento Tipo de evento a ser filtrado. (optional)
     * @return List&lt;ObjetosEventos&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ObjetosEventos> objetosCodigoObjetoGet(String clientId, String accessToken, String codigoObjeto, String tipoEvento) throws ApiException {
        ApiResponse<List<ObjetosEventos>> resp = objetosCodigoObjetoGetWithHttpInfo(clientId, accessToken, codigoObjeto, tipoEvento);
        return resp.getData();
    }

    /**
     * 
     * Pesquisa por informações relacionadas a um objeto postal especifico.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Codigo do objeto a ser pesquisado. (required)
     * @param tipoEvento Tipo de evento a ser filtrado. (optional)
     * @return ApiResponse&lt;List&lt;ObjetosEventos&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ObjetosEventos>> objetosCodigoObjetoGetWithHttpInfo(String clientId, String accessToken, String codigoObjeto, String tipoEvento) throws ApiException {
        com.squareup.okhttp.Call call = objetosCodigoObjetoGetValidateBeforeCall(clientId, accessToken, codigoObjeto, tipoEvento, null, null);
        Type localVarReturnType = new TypeToken<List<ObjetosEventos>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Pesquisa por informações relacionadas a um objeto postal especifico.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Codigo do objeto a ser pesquisado. (required)
     * @param tipoEvento Tipo de evento a ser filtrado. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call objetosCodigoObjetoGetAsync(String clientId, String accessToken, String codigoObjeto, String tipoEvento, final ApiCallback<List<ObjetosEventos>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = objetosCodigoObjetoGetValidateBeforeCall(clientId, accessToken, codigoObjeto, tipoEvento, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ObjetosEventos>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for objetosGet */
    private com.squareup.okhttp.Call objetosGetCall(String clientId, String accessToken, String codigoObjeto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/objetos".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (codigoObjeto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "codigoObjeto", codigoObjeto));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call objetosGetValidateBeforeCall(String clientId, String accessToken, String codigoObjeto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling objetosGet(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling objetosGet(Async)");
        }
        
        // verify the required parameter 'codigoObjeto' is set
        if (codigoObjeto == null) {
            throw new ApiException("Missing the required parameter 'codigoObjeto' when calling objetosGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = objetosGetCall(clientId, accessToken, codigoObjeto, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Pesquisa por informações relacionados a uma lista de objetos postais.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais. (required)
     * @return List&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InlineResponse2002> objetosGet(String clientId, String accessToken, String codigoObjeto) throws ApiException {
        ApiResponse<List<InlineResponse2002>> resp = objetosGetWithHttpInfo(clientId, accessToken, codigoObjeto);
        return resp.getData();
    }

    /**
     * 
     * Pesquisa por informações relacionados a uma lista de objetos postais.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais. (required)
     * @return ApiResponse&lt;List&lt;InlineResponse2002&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InlineResponse2002>> objetosGetWithHttpInfo(String clientId, String accessToken, String codigoObjeto) throws ApiException {
        com.squareup.okhttp.Call call = objetosGetValidateBeforeCall(clientId, accessToken, codigoObjeto, null, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2002>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Pesquisa por informações relacionados a uma lista de objetos postais.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param codigoObjeto Lista, separada por virgula, com codigos de objetos postais. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call objetosGetAsync(String clientId, String accessToken, String codigoObjeto, final ApiCallback<List<InlineResponse2002>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = objetosGetValidateBeforeCall(clientId, accessToken, codigoObjeto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InlineResponse2002>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
