=begin
#API Agillitas Cartões Pré-pagos

#API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::SetCardStatus
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'SetCardStatus' do
  before do
    # run before each test
    @instance = SwaggerClient::SetCardStatus.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SetCardStatus' do
    it 'should create an instact of SetCardStatus' do
      expect(@instance).to be_instance_of(SwaggerClient::SetCardStatus)
    end
  end
  describe 'test attribute "status"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["bloqueado", "desbloqueado"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.status = value }.not_to raise_error
       #end
    end
  end

end

