# openapi-android-client

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
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.DevelopersApi;

public class DevelopersApiExample {

    public static void main(String[] args) {
        DevelopersApi apiInstance = new DevelopersApi();
        BigDecimal limite = 1000; // BigDecimal | Número máximo de elementos
        BigDecimal deslocamento = 10; // BigDecimal | Número de deslocamento (offset) dos elementos
        String campos = login,profissao,usPerson; // String | Lista de campos para ser inclusivamente filtrados
        try {
            ListaPerfilUsuario result = apiInstance.perfilGet(limite, deslocamento, campos);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DevelopersApi#perfilGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/api/contas/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevelopersApi* | [**perfilGet**](docs/DevelopersApi.md#perfilGet) | **GET** /perfil/ | Retorna uma lista composta por objetos do tipo perfil
*UsersApi* | [**accountAutenticacaoPost**](docs/UsersApi.md#accountAutenticacaoPost) | **POST** /autenticacao/ | Autentica um usuário que ainda não é cliente.
*UsersApi* | [**accountDocumentoConfirmacaoGet**](docs/UsersApi.md#accountDocumentoConfirmacaoGet) | **GET** /perfil/{cpf}/documento/confirmacao/ | Consulta o status de confirmação do documento que foi submetido
*UsersApi* | [**accountDocumentoPut**](docs/UsersApi.md#accountDocumentoPut) | **PUT** /perfil/{cpf}/documento/ | Anexa ou atualiza documento para conferencia de autenticidade do perfil.
*UsersApi* | [**accountIdentificacaoPost**](docs/UsersApi.md#accountIdentificacaoPost) | **POST** /identificacao/ | Cria um login para usuário.
*UsersApi* | [**accountPerfilAprovacaoGet**](docs/UsersApi.md#accountPerfilAprovacaoGet) | **GET** /perfil/{cpf}/aprovacao/ | Retorna o estado de aprovação de um perfil
*UsersApi* | [**accountPerfilCelularAutenticacaoConfirmacaoGet**](docs/UsersApi.md#accountPerfilCelularAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Estado atual de confirmação do celular
*UsersApi* | [**accountPerfilCelularAutenticacaoPost**](docs/UsersApi.md#accountPerfilCelularAutenticacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/ | Gera um código para iniciar o processo de validação do número do celular
*UsersApi* | [**accountPerfilCelularConfirmacaoPost**](docs/UsersApi.md#accountPerfilCelularConfirmacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Confirma o numero de celular, concluindo a validação
*UsersApi* | [**accountPerfilEmailAutenticacaoConfirmacaoGet**](docs/UsersApi.md#accountPerfilEmailAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/email/autenticacao/confirmacao/ | Estado atual de confirmação do email
*UsersApi* | [**accountPerfilEmailAutenticacaoPost**](docs/UsersApi.md#accountPerfilEmailAutenticacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/ | Gera um código para iniciar o processo de validação do email
*UsersApi* | [**accountPerfilEmailConfirmacaoPost**](docs/UsersApi.md#accountPerfilEmailConfirmacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/confirmacao/ | Confirma o email, concluindo a validação
*UsersApi* | [**accountPerfilGet**](docs/UsersApi.md#accountPerfilGet) | **GET** /perfil/{cpf}/ | Retorna o perfil de um usuário que ainda não foi transformado em cliente.
*UsersApi* | [**accountPerfilPost**](docs/UsersApi.md#accountPerfilPost) | **POST** /perfil/{cpf}/ | Submete o perfil de usuário associado a um login para ser criado como cliente.
*UsersApi* | [**accountPerfilPut**](docs/UsersApi.md#accountPerfilPut) | **PUT** /perfil/{cpf}/ | Atualiza perfil para criação de conta.


## Documentation for Models

 - [Aprovacao](docs/Aprovacao.md)
 - [AutenticacaoCodigoObjeto](docs/AutenticacaoCodigoObjeto.md)
 - [AutenticacaoObjeto](docs/AutenticacaoObjeto.md)
 - [Confirmado](docs/Confirmado.md)
 - [ContaBancaria](docs/ContaBancaria.md)
 - [DadosPatrimonial](docs/DadosPatrimonial.md)
 - [DadosProfissionais](docs/DadosProfissionais.md)
 - [Documento](docs/Documento.md)
 - [DocumentoCorpo](docs/DocumentoCorpo.md)
 - [Endereco](docs/Endereco.md)
 - [Erro](docs/Erro.md)
 - [ListaPerfilUsuario](docs/ListaPerfilUsuario.md)
 - [LoginCriado](docs/LoginCriado.md)
 - [LoginObjeto](docs/LoginObjeto.md)
 - [LoginSenhaObjeto](docs/LoginSenhaObjeto.md)
 - [PerfilUsuario](docs/PerfilUsuario.md)
 - [UsuarioSenhaObjeto](docs/UsuarioSenhaObjeto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Api-Key

- **Type**: HTTP basic authentication

### JWT

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

cadastro_api@orama.com.br

