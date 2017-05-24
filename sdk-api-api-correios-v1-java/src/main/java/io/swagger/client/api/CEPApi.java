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


import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CEPApi {
    private ApiClient apiClient;

    public CEPApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CEPApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for cepEstadoGet */
    private com.squareup.okhttp.Call cepEstadoGetCall(String clientId, String accessToken, String estado, String municipio, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cep/{estado}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "estado" + "\\}", apiClient.escapeString(estado.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (municipio != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "municipio", municipio));

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
    private com.squareup.okhttp.Call cepEstadoGetValidateBeforeCall(String clientId, String accessToken, String estado, String municipio, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling cepEstadoGet(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling cepEstadoGet(Async)");
        }
        
        // verify the required parameter 'estado' is set
        if (estado == null) {
            throw new ApiException("Missing the required parameter 'estado' when calling cepEstadoGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cepEstadoGetCall(clientId, accessToken, estado, municipio, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Pesquisa pela faixa de CEPs nos municipios de um Estado.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param estado Abreviação do Estado. (required)
     * @param municipio Nome do Município. (optional)
     * @return List&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InlineResponse200> cepEstadoGet(String clientId, String accessToken, String estado, String municipio) throws ApiException {
        ApiResponse<List<InlineResponse200>> resp = cepEstadoGetWithHttpInfo(clientId, accessToken, estado, municipio);
        return resp.getData();
    }

    /**
     * 
     * Pesquisa pela faixa de CEPs nos municipios de um Estado.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param estado Abreviação do Estado. (required)
     * @param municipio Nome do Município. (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InlineResponse200>> cepEstadoGetWithHttpInfo(String clientId, String accessToken, String estado, String municipio) throws ApiException {
        com.squareup.okhttp.Call call = cepEstadoGetValidateBeforeCall(clientId, accessToken, estado, municipio, null, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Pesquisa pela faixa de CEPs nos municipios de um Estado.
     * @param clientId Identificação do cliente usado na autenticação. (required)
     * @param accessToken Access token usado na autenticação. (required)
     * @param estado Abreviação do Estado. (required)
     * @param municipio Nome do Município. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cepEstadoGetAsync(String clientId, String accessToken, String estado, String municipio, final ApiCallback<List<InlineResponse200>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cepEstadoGetValidateBeforeCall(clientId, accessToken, estado, municipio, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
