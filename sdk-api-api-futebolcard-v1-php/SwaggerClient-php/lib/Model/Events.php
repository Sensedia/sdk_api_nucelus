<?php
/**
 * Events
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * API do Futebolcard
 *
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Events Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Events implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Events';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'event_id' => 'string',
        'categorie_name' => 'string',
        'internet_sale_start_date' => 'string',
        'internet_sale_end_date' => 'string',
        'sale_start_date' => 'string',
        'sale_end_date' => 'string',
        'member_sale_start_date' => 'string',
        'member_sale_end_date' => 'string',
        'event_date' => 'string',
        'event_time' => 'string',
        'stadium_name' => 'string',
        'city' => 'string',
        'state' => 'string',
        'principal_club' => 'string',
        'opponent_club' => 'string',
        'principal_club_image' => 'string',
        'opponent_club_image' => 'string',
        'express_sale' => 'string'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'event_id' => 'eventId',
        'categorie_name' => 'categorieName',
        'internet_sale_start_date' => 'internetSaleStartDate',
        'internet_sale_end_date' => 'internetSaleEndDate',
        'sale_start_date' => 'saleStartDate',
        'sale_end_date' => 'saleEndDate',
        'member_sale_start_date' => 'memberSaleStartDate',
        'member_sale_end_date' => 'memberSaleEndDate',
        'event_date' => 'eventDate',
        'event_time' => 'eventTime',
        'stadium_name' => 'stadiumName',
        'city' => 'city',
        'state' => 'state',
        'principal_club' => 'principalClub',
        'opponent_club' => 'opponentClub',
        'principal_club_image' => 'principalClubImage',
        'opponent_club_image' => 'opponentClubImage',
        'express_sale' => 'expressSale'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'event_id' => 'setEventId',
        'categorie_name' => 'setCategorieName',
        'internet_sale_start_date' => 'setInternetSaleStartDate',
        'internet_sale_end_date' => 'setInternetSaleEndDate',
        'sale_start_date' => 'setSaleStartDate',
        'sale_end_date' => 'setSaleEndDate',
        'member_sale_start_date' => 'setMemberSaleStartDate',
        'member_sale_end_date' => 'setMemberSaleEndDate',
        'event_date' => 'setEventDate',
        'event_time' => 'setEventTime',
        'stadium_name' => 'setStadiumName',
        'city' => 'setCity',
        'state' => 'setState',
        'principal_club' => 'setPrincipalClub',
        'opponent_club' => 'setOpponentClub',
        'principal_club_image' => 'setPrincipalClubImage',
        'opponent_club_image' => 'setOpponentClubImage',
        'express_sale' => 'setExpressSale'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'event_id' => 'getEventId',
        'categorie_name' => 'getCategorieName',
        'internet_sale_start_date' => 'getInternetSaleStartDate',
        'internet_sale_end_date' => 'getInternetSaleEndDate',
        'sale_start_date' => 'getSaleStartDate',
        'sale_end_date' => 'getSaleEndDate',
        'member_sale_start_date' => 'getMemberSaleStartDate',
        'member_sale_end_date' => 'getMemberSaleEndDate',
        'event_date' => 'getEventDate',
        'event_time' => 'getEventTime',
        'stadium_name' => 'getStadiumName',
        'city' => 'getCity',
        'state' => 'getState',
        'principal_club' => 'getPrincipalClub',
        'opponent_club' => 'getOpponentClub',
        'principal_club_image' => 'getPrincipalClubImage',
        'opponent_club_image' => 'getOpponentClubImage',
        'express_sale' => 'getExpressSale'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['event_id'] = isset($data['event_id']) ? $data['event_id'] : null;
        $this->container['categorie_name'] = isset($data['categorie_name']) ? $data['categorie_name'] : null;
        $this->container['internet_sale_start_date'] = isset($data['internet_sale_start_date']) ? $data['internet_sale_start_date'] : null;
        $this->container['internet_sale_end_date'] = isset($data['internet_sale_end_date']) ? $data['internet_sale_end_date'] : null;
        $this->container['sale_start_date'] = isset($data['sale_start_date']) ? $data['sale_start_date'] : null;
        $this->container['sale_end_date'] = isset($data['sale_end_date']) ? $data['sale_end_date'] : null;
        $this->container['member_sale_start_date'] = isset($data['member_sale_start_date']) ? $data['member_sale_start_date'] : null;
        $this->container['member_sale_end_date'] = isset($data['member_sale_end_date']) ? $data['member_sale_end_date'] : null;
        $this->container['event_date'] = isset($data['event_date']) ? $data['event_date'] : null;
        $this->container['event_time'] = isset($data['event_time']) ? $data['event_time'] : null;
        $this->container['stadium_name'] = isset($data['stadium_name']) ? $data['stadium_name'] : null;
        $this->container['city'] = isset($data['city']) ? $data['city'] : null;
        $this->container['state'] = isset($data['state']) ? $data['state'] : null;
        $this->container['principal_club'] = isset($data['principal_club']) ? $data['principal_club'] : null;
        $this->container['opponent_club'] = isset($data['opponent_club']) ? $data['opponent_club'] : null;
        $this->container['principal_club_image'] = isset($data['principal_club_image']) ? $data['principal_club_image'] : null;
        $this->container['opponent_club_image'] = isset($data['opponent_club_image']) ? $data['opponent_club_image'] : null;
        $this->container['express_sale'] = isset($data['express_sale']) ? $data['express_sale'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        return true;
    }


    /**
     * Gets event_id
     * @return string
     */
    public function getEventId()
    {
        return $this->container['event_id'];
    }

    /**
     * Sets event_id
     * @param string $event_id
     * @return $this
     */
    public function setEventId($event_id)
    {
        $this->container['event_id'] = $event_id;

        return $this;
    }

    /**
     * Gets categorie_name
     * @return string
     */
    public function getCategorieName()
    {
        return $this->container['categorie_name'];
    }

    /**
     * Sets categorie_name
     * @param string $categorie_name
     * @return $this
     */
    public function setCategorieName($categorie_name)
    {
        $this->container['categorie_name'] = $categorie_name;

        return $this;
    }

    /**
     * Gets internet_sale_start_date
     * @return string
     */
    public function getInternetSaleStartDate()
    {
        return $this->container['internet_sale_start_date'];
    }

    /**
     * Sets internet_sale_start_date
     * @param string $internet_sale_start_date
     * @return $this
     */
    public function setInternetSaleStartDate($internet_sale_start_date)
    {
        $this->container['internet_sale_start_date'] = $internet_sale_start_date;

        return $this;
    }

    /**
     * Gets internet_sale_end_date
     * @return string
     */
    public function getInternetSaleEndDate()
    {
        return $this->container['internet_sale_end_date'];
    }

    /**
     * Sets internet_sale_end_date
     * @param string $internet_sale_end_date
     * @return $this
     */
    public function setInternetSaleEndDate($internet_sale_end_date)
    {
        $this->container['internet_sale_end_date'] = $internet_sale_end_date;

        return $this;
    }

    /**
     * Gets sale_start_date
     * @return string
     */
    public function getSaleStartDate()
    {
        return $this->container['sale_start_date'];
    }

    /**
     * Sets sale_start_date
     * @param string $sale_start_date
     * @return $this
     */
    public function setSaleStartDate($sale_start_date)
    {
        $this->container['sale_start_date'] = $sale_start_date;

        return $this;
    }

    /**
     * Gets sale_end_date
     * @return string
     */
    public function getSaleEndDate()
    {
        return $this->container['sale_end_date'];
    }

    /**
     * Sets sale_end_date
     * @param string $sale_end_date
     * @return $this
     */
    public function setSaleEndDate($sale_end_date)
    {
        $this->container['sale_end_date'] = $sale_end_date;

        return $this;
    }

    /**
     * Gets member_sale_start_date
     * @return string
     */
    public function getMemberSaleStartDate()
    {
        return $this->container['member_sale_start_date'];
    }

    /**
     * Sets member_sale_start_date
     * @param string $member_sale_start_date
     * @return $this
     */
    public function setMemberSaleStartDate($member_sale_start_date)
    {
        $this->container['member_sale_start_date'] = $member_sale_start_date;

        return $this;
    }

    /**
     * Gets member_sale_end_date
     * @return string
     */
    public function getMemberSaleEndDate()
    {
        return $this->container['member_sale_end_date'];
    }

    /**
     * Sets member_sale_end_date
     * @param string $member_sale_end_date
     * @return $this
     */
    public function setMemberSaleEndDate($member_sale_end_date)
    {
        $this->container['member_sale_end_date'] = $member_sale_end_date;

        return $this;
    }

    /**
     * Gets event_date
     * @return string
     */
    public function getEventDate()
    {
        return $this->container['event_date'];
    }

    /**
     * Sets event_date
     * @param string $event_date
     * @return $this
     */
    public function setEventDate($event_date)
    {
        $this->container['event_date'] = $event_date;

        return $this;
    }

    /**
     * Gets event_time
     * @return string
     */
    public function getEventTime()
    {
        return $this->container['event_time'];
    }

    /**
     * Sets event_time
     * @param string $event_time
     * @return $this
     */
    public function setEventTime($event_time)
    {
        $this->container['event_time'] = $event_time;

        return $this;
    }

    /**
     * Gets stadium_name
     * @return string
     */
    public function getStadiumName()
    {
        return $this->container['stadium_name'];
    }

    /**
     * Sets stadium_name
     * @param string $stadium_name
     * @return $this
     */
    public function setStadiumName($stadium_name)
    {
        $this->container['stadium_name'] = $stadium_name;

        return $this;
    }

    /**
     * Gets city
     * @return string
     */
    public function getCity()
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     * @param string $city
     * @return $this
     */
    public function setCity($city)
    {
        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets state
     * @return string
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     * @param string $state
     * @return $this
     */
    public function setState($state)
    {
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets principal_club
     * @return string
     */
    public function getPrincipalClub()
    {
        return $this->container['principal_club'];
    }

    /**
     * Sets principal_club
     * @param string $principal_club
     * @return $this
     */
    public function setPrincipalClub($principal_club)
    {
        $this->container['principal_club'] = $principal_club;

        return $this;
    }

    /**
     * Gets opponent_club
     * @return string
     */
    public function getOpponentClub()
    {
        return $this->container['opponent_club'];
    }

    /**
     * Sets opponent_club
     * @param string $opponent_club
     * @return $this
     */
    public function setOpponentClub($opponent_club)
    {
        $this->container['opponent_club'] = $opponent_club;

        return $this;
    }

    /**
     * Gets principal_club_image
     * @return string
     */
    public function getPrincipalClubImage()
    {
        return $this->container['principal_club_image'];
    }

    /**
     * Sets principal_club_image
     * @param string $principal_club_image
     * @return $this
     */
    public function setPrincipalClubImage($principal_club_image)
    {
        $this->container['principal_club_image'] = $principal_club_image;

        return $this;
    }

    /**
     * Gets opponent_club_image
     * @return string
     */
    public function getOpponentClubImage()
    {
        return $this->container['opponent_club_image'];
    }

    /**
     * Sets opponent_club_image
     * @param string $opponent_club_image
     * @return $this
     */
    public function setOpponentClubImage($opponent_club_image)
    {
        $this->container['opponent_club_image'] = $opponent_club_image;

        return $this;
    }

    /**
     * Gets express_sale
     * @return string
     */
    public function getExpressSale()
    {
        return $this->container['express_sale'];
    }

    /**
     * Sets express_sale
     * @param string $express_sale
     * @return $this
     */
    public function setExpressSale($express_sale)
    {
        $this->container['express_sale'] = $express_sale;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


