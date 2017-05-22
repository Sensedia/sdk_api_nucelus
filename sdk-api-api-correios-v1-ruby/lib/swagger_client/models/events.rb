=begin
#API dos Correios

#Postal Object tracking API

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient
  # Customer Model
  class Events
    # 
    attr_accessor :object_code

    # 
    attr_accessor :event_type

    # 
    attr_accessor :event_status

    # 
    attr_accessor :event_description

    # 
    attr_accessor :unit_name

    # 
    attr_accessor :sro_code

    # 
    attr_accessor :county

    # 
    attr_accessor :state

    # 
    attr_accessor :mcu_code

    # 
    attr_accessor :dr_code

    # 
    attr_accessor :dr_abbreviation

    # 
    attr_accessor :list_number

    # 
    attr_accessor :station

    # 
    attr_accessor :user

    # 
    attr_accessor :recording_date

    # 
    attr_accessor :deliveryman

    # 
    attr_accessor :creation_date

    # 
    attr_accessor :block_action


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'object_code' => :'objectCode',
        :'event_type' => :'eventType',
        :'event_status' => :'eventStatus',
        :'event_description' => :'eventDescription',
        :'unit_name' => :'unitName',
        :'sro_code' => :'SROCode',
        :'county' => :'county',
        :'state' => :'state',
        :'mcu_code' => :'MCUCode',
        :'dr_code' => :'DRCode',
        :'dr_abbreviation' => :'DRAbbreviation',
        :'list_number' => :'listNumber',
        :'station' => :'station',
        :'user' => :'user',
        :'recording_date' => :'recordingDate',
        :'deliveryman' => :'deliveryman',
        :'creation_date' => :'creationDate',
        :'block_action' => :'blockAction'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'object_code' => :'String',
        :'event_type' => :'String',
        :'event_status' => :'Integer',
        :'event_description' => :'String',
        :'unit_name' => :'String',
        :'sro_code' => :'String',
        :'county' => :'String',
        :'state' => :'String',
        :'mcu_code' => :'String',
        :'dr_code' => :'String',
        :'dr_abbreviation' => :'String',
        :'list_number' => :'String',
        :'station' => :'Integer',
        :'user' => :'String',
        :'recording_date' => :'String',
        :'deliveryman' => :'String',
        :'creation_date' => :'String',
        :'block_action' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'objectCode')
        self.object_code = attributes[:'objectCode']
      end

      if attributes.has_key?(:'eventType')
        self.event_type = attributes[:'eventType']
      end

      if attributes.has_key?(:'eventStatus')
        self.event_status = attributes[:'eventStatus']
      end

      if attributes.has_key?(:'eventDescription')
        self.event_description = attributes[:'eventDescription']
      end

      if attributes.has_key?(:'unitName')
        self.unit_name = attributes[:'unitName']
      end

      if attributes.has_key?(:'SROCode')
        self.sro_code = attributes[:'SROCode']
      end

      if attributes.has_key?(:'county')
        self.county = attributes[:'county']
      end

      if attributes.has_key?(:'state')
        self.state = attributes[:'state']
      end

      if attributes.has_key?(:'MCUCode')
        self.mcu_code = attributes[:'MCUCode']
      end

      if attributes.has_key?(:'DRCode')
        self.dr_code = attributes[:'DRCode']
      end

      if attributes.has_key?(:'DRAbbreviation')
        self.dr_abbreviation = attributes[:'DRAbbreviation']
      end

      if attributes.has_key?(:'listNumber')
        self.list_number = attributes[:'listNumber']
      end

      if attributes.has_key?(:'station')
        self.station = attributes[:'station']
      end

      if attributes.has_key?(:'user')
        self.user = attributes[:'user']
      end

      if attributes.has_key?(:'recordingDate')
        self.recording_date = attributes[:'recordingDate']
      end

      if attributes.has_key?(:'deliveryman')
        self.deliveryman = attributes[:'deliveryman']
      end

      if attributes.has_key?(:'creationDate')
        self.creation_date = attributes[:'creationDate']
      end

      if attributes.has_key?(:'blockAction')
        self.block_action = attributes[:'blockAction']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          object_code == o.object_code &&
          event_type == o.event_type &&
          event_status == o.event_status &&
          event_description == o.event_description &&
          unit_name == o.unit_name &&
          sro_code == o.sro_code &&
          county == o.county &&
          state == o.state &&
          mcu_code == o.mcu_code &&
          dr_code == o.dr_code &&
          dr_abbreviation == o.dr_abbreviation &&
          list_number == o.list_number &&
          station == o.station &&
          user == o.user &&
          recording_date == o.recording_date &&
          deliveryman == o.deliveryman &&
          creation_date == o.creation_date &&
          block_action == o.block_action
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [object_code, event_type, event_status, event_description, unit_name, sro_code, county, state, mcu_code, dr_code, dr_abbreviation, list_number, station, user, recording_date, deliveryman, creation_date, block_action].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map{ |v| _deserialize($1, v) } )
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map{ |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end