# coding: utf-8

"""
    API do Futebolcard

    Futebolcard manipulation API

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class SubSectorDetails(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, subsector_id=None, name=None, has_tickets=None):
        """
        SubSectorDetails - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'subsector_id': 'str',
            'name': 'str',
            'has_tickets': 'int'
        }

        self.attribute_map = {
            'subsector_id': 'subsectorId',
            'name': 'name',
            'has_tickets': 'hasTickets'
        }

        self._subsector_id = subsector_id
        self._name = name
        self._has_tickets = has_tickets

    @property
    def subsector_id(self):
        """
        Gets the subsector_id of this SubSectorDetails.

        :return: The subsector_id of this SubSectorDetails.
        :rtype: str
        """
        return self._subsector_id

    @subsector_id.setter
    def subsector_id(self, subsector_id):
        """
        Sets the subsector_id of this SubSectorDetails.

        :param subsector_id: The subsector_id of this SubSectorDetails.
        :type: str
        """

        self._subsector_id = subsector_id

    @property
    def name(self):
        """
        Gets the name of this SubSectorDetails.

        :return: The name of this SubSectorDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this SubSectorDetails.

        :param name: The name of this SubSectorDetails.
        :type: str
        """

        self._name = name

    @property
    def has_tickets(self):
        """
        Gets the has_tickets of this SubSectorDetails.

        :return: The has_tickets of this SubSectorDetails.
        :rtype: int
        """
        return self._has_tickets

    @has_tickets.setter
    def has_tickets(self, has_tickets):
        """
        Sets the has_tickets of this SubSectorDetails.

        :param has_tickets: The has_tickets of this SubSectorDetails.
        :type: int
        """

        self._has_tickets = has_tickets

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
        if not isinstance(other, SubSectorDetails):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
