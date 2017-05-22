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

import io.swagger.client.api.AddressesApi;

public class AddressesApiExample {

    public static void main(String[] args) {
        AddressesApi apiInstance = new AddressesApi();
        String clientId = "clientId_example"; // String | Customer identifier used for authentication.
        String accessToken = "accessToken_example"; // String | Access token used in the authentication.
        String zipcode = "zipcode_example"; // String | Zipcode to search.
        try {
            List<InlineResponse2001> result = apiInstance.addressesZipcodeGet(clientId, accessToken, zipcode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressesApi#addressesZipcodeGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/correios/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressesApi* | [**addressesZipcodeGet**](docs/AddressesApi.md#addressesZipcodeGet) | **GET** /addresses/{zipcode} | 
*PostalObjectsApi* | [**eventsEventTypeGet**](docs/PostalObjectsApi.md#eventsEventTypeGet) | **GET** /events/{eventType} | 
*PostalObjectsApi* | [**objectsGet**](docs/PostalObjectsApi.md#objectsGet) | **GET** /objects | 
*PostalObjectsApi* | [**objectsObjectCodeGet**](docs/PostalObjectsApi.md#objectsObjectCodeGet) | **GET** /objects/{objectCode} | 
*ZipcodesApi* | [**zipcodesStateGet**](docs/ZipcodesApi.md#zipcodesStateGet) | **GET** /zipcodes/{state} | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [Error](docs/Error.md)
 - [Events](docs/Events.md)
 - [EventsDetails](docs/EventsDetails.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [ObjectsEventos](docs/ObjectsEventos.md)
 - [PostalObjects](docs/PostalObjects.md)
 - [ZipcodeRange](docs/ZipcodeRange.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



