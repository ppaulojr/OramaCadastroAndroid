

# PerfilUsuario

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usPerson** | **Boolean** | define se o usuário pode ou não ser enquadrado como US person de acordo com a definição da CVM |  [optional]
**politicamenteExposto** | **Boolean** | define se o usuário pode ou não ser enquadrado como pessoa politicamente exposta de acordo com a definição da Deliberação Coremec nº 2, de 1º de dezembro de 2006 |  [optional]
**nacionalidade** | [**NacionalidadeEnum**](#NacionalidadeEnum) | Definição de Nacionalidade de acordo com o Art. 12 da CF |  [optional]
**ufNascimento** | **String** | Unidade da Federação em que a pessoa nasceu |  [optional]
**cidadeNascimento** | **String** | Município em que a pessoa nascida no Brasil nasceu. Formato é o nome lexicograficamente igual a descrição do IBGE ou o código de cidade completo do IBGE |  [optional]
**dataNascimento** | [**Date**](Date.md) | Data de nascimento da pessoa no formato YYYY-MM-DD (cf. RFC 3339, section 5.8) |  [optional]
**paisNascimento** | **String** | País em que a pessoa nasceu. Código ISO 3166-1 alpha-2 |  [optional]
**sexo** | [**SexoEnum**](#SexoEnum) | Sexo do indivíduo |  [optional]
**estadoCivil** | [**EstadoCivilEnum**](#EstadoCivilEnum) | Estado civil do usuário |  [optional]
**nomeConjuge** | **String** | Nome do conjuge ou companheiro, necessário em casos que o estado civil seja &#39;Casado(a)&#39; ou &#39;União estável&#39; |  [optional]
**nomeMae** | **String** | Nome da mãe do usuário |  [optional]
**nomePai** | **String** | Nome do pai do usuário |  [optional]
**login** | [**LoginObjeto**](LoginObjeto.md) |  |  [optional]
**documento** | [**List&lt;Documento&gt;**](Documento.md) |  |  [optional]
**profissao** | [**DadosProfissionais**](DadosProfissionais.md) |  |  [optional]
**endereco** | [**Endereco**](Endereco.md) |  |  [optional]
**patrimonio** | [**DadosPatrimonial**](DadosPatrimonial.md) |  |  [optional]
**contaBancaria** | [**List&lt;ContaBancaria&gt;**](ContaBancaria.md) |  |  [optional]


## Enum: NacionalidadeEnum

Name | Value
---- | -----


## Enum: SexoEnum

Name | Value
---- | -----


## Enum: EstadoCivilEnum

Name | Value
---- | -----




