# coding: utf-8

"""
    API Agillitas Cartões Pré-pagos

    API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class NovoCartao(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id_cartao=None, valor=None, contrasenha=None, portador=None):
        """
        NovoCartao - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id_cartao': 'str',
            'valor': 'float',
            'contrasenha': 'str',
            'portador': 'NovoCartaoPortador'
        }

        self.attribute_map = {
            'id_cartao': 'idCartao',
            'valor': 'valor',
            'contrasenha': 'contrasenha',
            'portador': 'portador'
        }

        self._id_cartao = id_cartao
        self._valor = valor
        self._contrasenha = contrasenha
        self._portador = portador

    @property
    def id_cartao(self):
        """
        Gets the id_cartao of this NovoCartao.
        Número identificador referente ao proxy do cartão.

        :return: The id_cartao of this NovoCartao.
        :rtype: str
        """
        return self._id_cartao

    @id_cartao.setter
    def id_cartao(self, id_cartao):
        """
        Sets the id_cartao of this NovoCartao.
        Número identificador referente ao proxy do cartão.

        :param id_cartao: The id_cartao of this NovoCartao.
        :type: str
        """

        self._id_cartao = id_cartao

    @property
    def valor(self):
        """
        Gets the valor of this NovoCartao.
        Valor monetário a ser creditado na conta do cartão.

        :return: The valor of this NovoCartao.
        :rtype: float
        """
        return self._valor

    @valor.setter
    def valor(self, valor):
        """
        Sets the valor of this NovoCartao.
        Valor monetário a ser creditado na conta do cartão.

        :param valor: The valor of this NovoCartao.
        :type: float
        """

        self._valor = valor

    @property
    def contrasenha(self):
        """
        Gets the contrasenha of this NovoCartao.
        Senha informada ao se requisitar o do cartão

        :return: The contrasenha of this NovoCartao.
        :rtype: str
        """
        return self._contrasenha

    @contrasenha.setter
    def contrasenha(self, contrasenha):
        """
        Sets the contrasenha of this NovoCartao.
        Senha informada ao se requisitar o do cartão

        :param contrasenha: The contrasenha of this NovoCartao.
        :type: str
        """

        self._contrasenha = contrasenha

    @property
    def portador(self):
        """
        Gets the portador of this NovoCartao.

        :return: The portador of this NovoCartao.
        :rtype: NovoCartaoPortador
        """
        return self._portador

    @portador.setter
    def portador(self, portador):
        """
        Sets the portador of this NovoCartao.

        :param portador: The portador of this NovoCartao.
        :type: NovoCartaoPortador
        """

        self._portador = portador

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
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
