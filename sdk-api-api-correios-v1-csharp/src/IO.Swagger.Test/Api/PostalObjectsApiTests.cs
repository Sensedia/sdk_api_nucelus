/* 
 * API dos Correios
 *
 * Postal Object tracking API
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing PostalObjectsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class PostalObjectsApiTests
    {
        private PostalObjectsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PostalObjectsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PostalObjectsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' PostalObjectsApi
            //Assert.IsInstanceOfType(typeof(PostalObjectsApi), instance, "instance is a PostalObjectsApi");
        }

        
        /// <summary>
        /// Test EventsEventTypeGet
        /// </summary>
        [Test]
        public void EventsEventTypeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string eventType = null;
            //string eventStatus = null;
            //var response = instance.EventsEventTypeGet(clientId, accessToken, eventType, eventStatus);
            //Assert.IsInstanceOf<List<InlineResponse2002>> (response, "response is List<InlineResponse2002>");
        }
        
        /// <summary>
        /// Test ObjectsGet
        /// </summary>
        [Test]
        public void ObjectsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string objectCode = null;
            //var response = instance.ObjectsGet(clientId, accessToken, objectCode);
            //Assert.IsInstanceOf<List<InlineResponse2003>> (response, "response is List<InlineResponse2003>");
        }
        
        /// <summary>
        /// Test ObjectsObjectCodeGet
        /// </summary>
        [Test]
        public void ObjectsObjectCodeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string objectCode = null;
            //string eventType = null;
            //var response = instance.ObjectsObjectCodeGet(clientId, accessToken, objectCode, eventType);
            //Assert.IsInstanceOf<List<ObjectsEventos>> (response, "response is List<ObjectsEventos>");
        }
        
    }

}
