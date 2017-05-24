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


class InlineResponse2001MapCoordinates(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, coordinate=None, shape=None):
        """
        InlineResponse2001MapCoordinates - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'str',
            'coordinate': 'str',
            'shape': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'coordinate': 'coordinate',
            'shape': 'shape'
        }

        self._id = id
        self._coordinate = coordinate
        self._shape = shape

    @property
    def id(self):
        """
        Gets the id of this InlineResponse2001MapCoordinates.

        :return: The id of this InlineResponse2001MapCoordinates.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this InlineResponse2001MapCoordinates.

        :param id: The id of this InlineResponse2001MapCoordinates.
        :type: str
        """

        self._id = id

    @property
    def coordinate(self):
        """
        Gets the coordinate of this InlineResponse2001MapCoordinates.

        :return: The coordinate of this InlineResponse2001MapCoordinates.
        :rtype: str
        """
        return self._coordinate

    @coordinate.setter
    def coordinate(self, coordinate):
        """
        Sets the coordinate of this InlineResponse2001MapCoordinates.

        :param coordinate: The coordinate of this InlineResponse2001MapCoordinates.
        :type: str
        """

        self._coordinate = coordinate

    @property
    def shape(self):
        """
        Gets the shape of this InlineResponse2001MapCoordinates.

        :return: The shape of this InlineResponse2001MapCoordinates.
        :rtype: str
        """
        return self._shape

    @shape.setter
    def shape(self, shape):
        """
        Sets the shape of this InlineResponse2001MapCoordinates.

        :param shape: The shape of this InlineResponse2001MapCoordinates.
        :type: str
        """

        self._shape = shape

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
        if not isinstance(other, InlineResponse2001MapCoordinates):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
