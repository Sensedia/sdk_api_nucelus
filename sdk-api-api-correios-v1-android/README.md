# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.CEPApi;

public class CEPApiExample {

    public static void main(String[] args) {
        CEPApi apiInstance = new CEPApi();
        String clientId = "clientId_example"; // String | Identificação do cliente usado na autenticação.
        String accessToken = "accessToken_example"; // String | Access token usado na autenticação.
        String estado = "estado_example"; // String | Abreviação do Estado.
        String municipio = "municipio_example"; // String | Nome do Município.
        try {
            List<InlineResponse200> result = apiInstance.cepEstadoGet(clientId, accessToken, estado, municipio);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CEPApi#cepEstadoGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CEPApi* | [**cepEstadoGet**](docs/CEPApi.md#cepEstadoGet) | **GET** /cep/{estado} | 
*EnderecoesApi* | [**enderecosCepGet**](docs/EnderecoesApi.md#enderecosCepGet) | **GET** /enderecos/{cep} | 
*ObjetoPostalApi* | [**eventosTipoEventoGet**](docs/ObjetoPostalApi.md#eventosTipoEventoGet) | **GET** /eventos/{tipoEvento} | 
*ObjetoPostalApi* | [**objetosCodigoObjetoGet**](docs/ObjetoPostalApi.md#objetosCodigoObjetoGet) | **GET** /objetos/{codigoObjeto} | 
*ObjetoPostalApi* | [**objetosGet**](docs/ObjetoPostalApi.md#objetosGet) | **GET** /objetos | 


## Documentation for Models

 - [DetalhesEventos](docs/DetalhesEventos.md)
 - [Endereco](docs/Endereco.md)
 - [Erro](docs/Erro.md)
 - [Eventos](docs/Eventos.md)
 - [FaixaCEP](docs/FaixaCEP.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [ObjetoPostal](docs/ObjetoPostal.md)
 - [ObjetosEventos](docs/ObjetosEventos.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



