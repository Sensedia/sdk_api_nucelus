/* 
 * API Agillitas Cartões Pré-pagos
 *
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
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
    ///  Class for testing CartoesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CartoesApiTests
    {
        private CartoesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CartoesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CartoesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CartoesApi
            //Assert.IsInstanceOfType(typeof(CartoesApi), instance, "instance is a CartoesApi");
        }

        
        /// <summary>
        /// Test CartoesGet
        /// </summary>
        [Test]
        public void CartoesGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string tipoCartao = null;
            //var response = instance.CartoesGet(tipoCartao);
            //Assert.IsInstanceOf<CartaoDisponivel> (response, "response is CartaoDisponivel");
        }
        
        /// <summary>
        /// Test CartoesIdCartaoExtratoGet
        /// </summary>
        [Test]
        public void CartoesIdCartaoExtratoGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //string dataInicial = null;
            //string dataFinal = null;
            //var response = instance.CartoesIdCartaoExtratoGet(idCartao, dataInicial, dataFinal);
            //Assert.IsInstanceOf<ExtratoResponse> (response, "response is ExtratoResponse");
        }
        
        /// <summary>
        /// Test CartoesIdCartaoPortadorGet
        /// </summary>
        [Test]
        public void CartoesIdCartaoPortadorGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //var response = instance.CartoesIdCartaoPortadorGet(idCartao);
            //Assert.IsInstanceOf<PortadorResponse> (response, "response is PortadorResponse");
        }
        
        /// <summary>
        /// Test CartoesIdCartaoSaldoGet
        /// </summary>
        [Test]
        public void CartoesIdCartaoSaldoGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //var response = instance.CartoesIdCartaoSaldoGet(idCartao);
            //Assert.IsInstanceOf<Saldo> (response, "response is Saldo");
        }
        
        /// <summary>
        /// Test CartoesIdCartaoSaldoPut
        /// </summary>
        [Test]
        public void CartoesIdCartaoSaldoPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //SetSaldo saldo = null;
            //instance.CartoesIdCartaoSaldoPut(idCartao, saldo);
            
        }
        
        /// <summary>
        /// Test CartoesIdCartaoStatusGet
        /// </summary>
        [Test]
        public void CartoesIdCartaoStatusGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //var response = instance.CartoesIdCartaoStatusGet(idCartao);
            //Assert.IsInstanceOf<StatusCartaoResponse> (response, "response is StatusCartaoResponse");
        }
        
        /// <summary>
        /// Test CartoesIdCartaoStatusPut
        /// </summary>
        [Test]
        public void CartoesIdCartaoStatusPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string idCartao = null;
            //SetCardStatus status = null;
            //instance.CartoesIdCartaoStatusPut(idCartao, status);
            
        }
        
        /// <summary>
        /// Test CartoesPost
        /// </summary>
        [Test]
        public void CartoesPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SetNovoCartao cartao = null;
            //instance.CartoesPost(cartao);
            
        }
        
    }

}
