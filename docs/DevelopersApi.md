# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/api/contas/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**perfilGet**](DevelopersApi.md#perfilGet) | **GET** /perfil/ | Retorna uma lista composta por objetos do tipo perfil



## perfilGet

> ListaPerfilUsuario perfilGet(limite, deslocamento, campos)

Retorna uma lista composta por objetos do tipo perfil

Returna uma lista composta por objetos do tipo perfil

### Example

```java
// Import classes:
//import org.openapitools.client.api.DevelopersApi;

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
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limite** | **BigDecimal**| Número máximo de elementos | [optional] [default to null]
 **deslocamento** | **BigDecimal**| Número de deslocamento (offset) dos elementos | [optional] [default to null]
 **campos** | **String**| Lista de campos para ser inclusivamente filtrados | [optional] [default to null]

### Return type

[**ListaPerfilUsuario**](ListaPerfilUsuario.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

