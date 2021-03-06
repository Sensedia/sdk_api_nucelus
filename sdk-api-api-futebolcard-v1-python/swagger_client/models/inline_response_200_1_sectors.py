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


class InlineResponse2001Sectors(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, name=None, select_seats=None, available=None, has_tickets=None):
        """
        InlineResponse2001Sectors - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'select_seats': 'str',
            'available': 'int',
            'has_tickets': 'int'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'select_seats': 'selectSeats',
            'available': 'available',
            'has_tickets': 'hasTickets'
        }

        self._id = id
        self._name = name
        self._select_seats = select_seats
        self._available = available
        self._has_tickets = has_tickets

    @property
    def id(self):
        """
        Gets the id of this InlineResponse2001Sectors.

        :return: The id of this InlineResponse2001Sectors.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this InlineResponse2001Sectors.

        :param id: The id of this InlineResponse2001Sectors.
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """
        Gets the name of this InlineResponse2001Sectors.

        :return: The name of this InlineResponse2001Sectors.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this InlineResponse2001Sectors.

        :param name: The name of this InlineResponse2001Sectors.
        :type: str
        """

        self._name = name

    @property
    def select_seats(self):
        """
        Gets the select_seats of this InlineResponse2001Sectors.

        :return: The select_seats of this InlineResponse2001Sectors.
        :rtype: str
        """
        return self._select_seats

    @select_seats.setter
    def select_seats(self, select_seats):
        """
        Sets the select_seats of this InlineResponse2001Sectors.

        :param select_seats: The select_seats of this InlineResponse2001Sectors.
        :type: str
        """

        self._select_seats = select_seats

    @property
    def available(self):
        """
        Gets the available of this InlineResponse2001Sectors.

        :return: The available of this InlineResponse2001Sectors.
        :rtype: int
        """
        return self._available

    @available.setter
    def available(self, available):
        """
        Sets the available of this InlineResponse2001Sectors.

        :param available: The available of this InlineResponse2001Sectors.
        :type: int
        """

        self._available = available

    @property
    def has_tickets(self):
        """
        Gets the has_tickets of this InlineResponse2001Sectors.

        :return: The has_tickets of this InlineResponse2001Sectors.
        :rtype: int
        """
        return self._has_tickets

    @has_tickets.setter
    def has_tickets(self, has_tickets):
        """
        Sets the has_tickets of this InlineResponse2001Sectors.

        :param has_tickets: The has_tickets of this InlineResponse2001Sectors.
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
        if not isinstance(other, InlineResponse2001Sectors):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
