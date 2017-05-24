/* 
 * API dos Correios
 *
 * API de rastreios de Objetos Postais
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
    ///  Class for testing ObjetoPostalApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ObjetoPostalApiTests
    {
        private ObjetoPostalApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ObjetoPostalApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ObjetoPostalApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ObjetoPostalApi
            //Assert.IsInstanceOfType(typeof(ObjetoPostalApi), instance, "instance is a ObjetoPostalApi");
        }

        
        /// <summary>
        /// Test EventosTipoEventoGet
        /// </summary>
        [Test]
        public void EventosTipoEventoGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string tipoEvento = null;
            //string statusEvento = null;
            //var response = instance.EventosTipoEventoGet(clientId, accessToken, tipoEvento, statusEvento);
            //Assert.IsInstanceOf<List<InlineResponse2003>> (response, "response is List<InlineResponse2003>");
        }
        
        /// <summary>
        /// Test ObjetosCodigoObjetoGet
        /// </summary>
        [Test]
        public void ObjetosCodigoObjetoGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string codigoObjeto = null;
            //string tipoEvento = null;
            //var response = instance.ObjetosCodigoObjetoGet(clientId, accessToken, codigoObjeto, tipoEvento);
            //Assert.IsInstanceOf<List<ObjetosEventos>> (response, "response is List<ObjetosEventos>");
        }
        
        /// <summary>
        /// Test ObjetosGet
        /// </summary>
        [Test]
        public void ObjetosGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string clientId = null;
            //string accessToken = null;
            //string codigoObjeto = null;
            //var response = instance.ObjetosGet(clientId, accessToken, codigoObjeto);
            //Assert.IsInstanceOf<List<InlineResponse2002>> (response, "response is List<InlineResponse2002>");
        }
        
    }

}
