# coding: utf-8

"""
    API dos Correios

    API de rastreios de Objetos Postais

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class ObjetoPostalApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def eventos_tipo_evento_get(self, client_id, access_token, tipo_evento, **kwargs):
        """
        Retorna uma lista de possiveis status para um determinado evento.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.eventos_tipo_evento_get(client_id, access_token, tipo_evento, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str tipo_evento: Tipo de evento a ser pesquisado. (required)
        :param str status_evento: Status a ser filtrado.
        :return: list[InlineResponse2003]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.eventos_tipo_evento_get_with_http_info(client_id, access_token, tipo_evento, **kwargs)
        else:
            (data) = self.eventos_tipo_evento_get_with_http_info(client_id, access_token, tipo_evento, **kwargs)
            return data

    def eventos_tipo_evento_get_with_http_info(self, client_id, access_token, tipo_evento, **kwargs):
        """
        Retorna uma lista de possiveis status para um determinado evento.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.eventos_tipo_evento_get_with_http_info(client_id, access_token, tipo_evento, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str tipo_evento: Tipo de evento a ser pesquisado. (required)
        :param str status_evento: Status a ser filtrado.
        :return: list[InlineResponse2003]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['client_id', 'access_token', 'tipo_evento', 'status_evento']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method eventos_tipo_evento_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'client_id' is set
        if ('client_id' not in params) or (params['client_id'] is None):
            raise ValueError("Missing the required parameter `client_id` when calling `eventos_tipo_evento_get`")
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params) or (params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `eventos_tipo_evento_get`")
        # verify the required parameter 'tipo_evento' is set
        if ('tipo_evento' not in params) or (params['tipo_evento'] is None):
            raise ValueError("Missing the required parameter `tipo_evento` when calling `eventos_tipo_evento_get`")


        collection_formats = {}

        resource_path = '/eventos/{tipoEvento}'.replace('{format}', 'json')
        path_params = {}
        if 'tipo_evento' in params:
            path_params['tipoEvento'] = params['tipo_evento']

        query_params = {}
        if 'status_evento' in params:
            query_params['statusEvento'] = params['status_evento']

        header_params = {}
        if 'client_id' in params:
            header_params['client_id'] = params['client_id']
        if 'access_token' in params:
            header_params['access_token'] = params['access_token']

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='list[InlineResponse2003]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def objetos_codigo_objeto_get(self, client_id, access_token, codigo_objeto, **kwargs):
        """
        Pesquisa por informações relacionadas a um objeto postal especifico.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.objetos_codigo_objeto_get(client_id, access_token, codigo_objeto, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str codigo_objeto: Codigo do objeto a ser pesquisado. (required)
        :param str tipo_evento: Tipo de evento a ser filtrado.
        :return: list[ObjetosEventos]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.objetos_codigo_objeto_get_with_http_info(client_id, access_token, codigo_objeto, **kwargs)
        else:
            (data) = self.objetos_codigo_objeto_get_with_http_info(client_id, access_token, codigo_objeto, **kwargs)
            return data

    def objetos_codigo_objeto_get_with_http_info(self, client_id, access_token, codigo_objeto, **kwargs):
        """
        Pesquisa por informações relacionadas a um objeto postal especifico.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.objetos_codigo_objeto_get_with_http_info(client_id, access_token, codigo_objeto, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str codigo_objeto: Codigo do objeto a ser pesquisado. (required)
        :param str tipo_evento: Tipo de evento a ser filtrado.
        :return: list[ObjetosEventos]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['client_id', 'access_token', 'codigo_objeto', 'tipo_evento']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method objetos_codigo_objeto_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'client_id' is set
        if ('client_id' not in params) or (params['client_id'] is None):
            raise ValueError("Missing the required parameter `client_id` when calling `objetos_codigo_objeto_get`")
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params) or (params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `objetos_codigo_objeto_get`")
        # verify the required parameter 'codigo_objeto' is set
        if ('codigo_objeto' not in params) or (params['codigo_objeto'] is None):
            raise ValueError("Missing the required parameter `codigo_objeto` when calling `objetos_codigo_objeto_get`")


        collection_formats = {}

        resource_path = '/objetos/{codigoObjeto}'.replace('{format}', 'json')
        path_params = {}
        if 'codigo_objeto' in params:
            path_params['codigoObjeto'] = params['codigo_objeto']

        query_params = {}
        if 'tipo_evento' in params:
            query_params['tipoEvento'] = params['tipo_evento']

        header_params = {}
        if 'client_id' in params:
            header_params['client_id'] = params['client_id']
        if 'access_token' in params:
            header_params['access_token'] = params['access_token']

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='list[ObjetosEventos]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def objetos_get(self, client_id, access_token, codigo_objeto, **kwargs):
        """
        Pesquisa por informações relacionados a uma lista de objetos postais.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.objetos_get(client_id, access_token, codigo_objeto, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str codigo_objeto: Lista, separada por virgula, com codigos de objetos postais. (required)
        :return: list[InlineResponse2002]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.objetos_get_with_http_info(client_id, access_token, codigo_objeto, **kwargs)
        else:
            (data) = self.objetos_get_with_http_info(client_id, access_token, codigo_objeto, **kwargs)
            return data

    def objetos_get_with_http_info(self, client_id, access_token, codigo_objeto, **kwargs):
        """
        Pesquisa por informações relacionados a uma lista de objetos postais.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.objetos_get_with_http_info(client_id, access_token, codigo_objeto, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str codigo_objeto: Lista, separada por virgula, com codigos de objetos postais. (required)
        :return: list[InlineResponse2002]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['client_id', 'access_token', 'codigo_objeto']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method objetos_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'client_id' is set
        if ('client_id' not in params) or (params['client_id'] is None):
            raise ValueError("Missing the required parameter `client_id` when calling `objetos_get`")
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params) or (params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `objetos_get`")
        # verify the required parameter 'codigo_objeto' is set
        if ('codigo_objeto' not in params) or (params['codigo_objeto'] is None):
            raise ValueError("Missing the required parameter `codigo_objeto` when calling `objetos_get`")


        collection_formats = {}

        resource_path = '/objetos'.replace('{format}', 'json')
        path_params = {}

        query_params = {}
        if 'codigo_objeto' in params:
            query_params['codigoObjeto'] = params['codigo_objeto']

        header_params = {}
        if 'client_id' in params:
            header_params['client_id'] = params['client_id']
        if 'access_token' in params:
            header_params['access_token'] = params['access_token']

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='list[InlineResponse2002]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
