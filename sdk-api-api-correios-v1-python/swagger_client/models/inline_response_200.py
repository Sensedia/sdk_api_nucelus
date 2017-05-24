# coding: utf-8

"""
    API dos Correios

    API de rastreios de Objetos Postais

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class InlineResponse200(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, nome=None, inicio=None, fim=None):
        """
        InlineResponse200 - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'nome': 'str',
            'inicio': 'str',
            'fim': 'str'
        }

        self.attribute_map = {
            'nome': 'nome',
            'inicio': 'inicio',
            'fim': 'fim'
        }

        self._nome = nome
        self._inicio = inicio
        self._fim = fim

    @property
    def nome(self):
        """
        Gets the nome of this InlineResponse200.
        Nome do municipio

        :return: The nome of this InlineResponse200.
        :rtype: str
        """
        return self._nome

    @nome.setter
    def nome(self, nome):
        """
        Sets the nome of this InlineResponse200.
        Nome do municipio

        :param nome: The nome of this InlineResponse200.
        :type: str
        """

        self._nome = nome

    @property
    def inicio(self):
        """
        Gets the inicio of this InlineResponse200.
        inicio da faixa de CEP

        :return: The inicio of this InlineResponse200.
        :rtype: str
        """
        return self._inicio

    @inicio.setter
    def inicio(self, inicio):
        """
        Sets the inicio of this InlineResponse200.
        inicio da faixa de CEP

        :param inicio: The inicio of this InlineResponse200.
        :type: str
        """

        self._inicio = inicio

    @property
    def fim(self):
        """
        Gets the fim of this InlineResponse200.
        Fim da faixa de CEP

        :return: The fim of this InlineResponse200.
        :rtype: str
        """
        return self._fim

    @fim.setter
    def fim(self, fim):
        """
        Sets the fim of this InlineResponse200.
        Fim da faixa de CEP

        :param fim: The fim of this InlineResponse200.
        :type: str
        """

        self._fim = fim

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, InlineResponse200):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
