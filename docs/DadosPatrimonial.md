

# DadosPatrimonial

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valorDePatrimonio** | [**ValorDePatrimonioEnum**](#ValorDePatrimonioEnum) | Código do valor total do patrimonio. Cada número representa um intervalo de valor em reais (R$). Por exemplo, 0: &#39;Nenhum&#39;, 1: &#39;Até R$50.000,00&#39;, 2: &#39;De R$50.000,01 à R$100.000,00&#39;, 3: &#39;De R$100.000,01 à R$200.000,00&#39;, 4: &#39;De R$200.000,01 à R$300.000,00&#39;, 5: &#39;De R$300.000,01 à R$1.000.000,00&#39;, 6: &#39;Acima de R$1.000.000,00&#39; |  [optional]
**valorDeInvestimento** | [**BigDecimal**](BigDecimal.md) | Valor em R$ (inteiro) disponível para investimento |  [optional]
**rendimentoMensal** | [**RendimentoMensalEnum**](#RendimentoMensalEnum) | Código do valor que representa a renta bruta mensal. Cada número representa um intervalo de valor em reais (R$). Por exemplo, 0: &#39;Nenhum&#39;, 1: &#39;Até R$5.000,00&#39;, 2: &#39;De R$5.000,01 à R$10.000,00&#39;, 3: &#39;De R$10.000,01 à R$20.000,00&#39;, 4: &#39;De R$20.000,01 à R$30.000,00&#39;, 5: &#39;De R$30.000,01 à R$100.000,00&#39;, 6: &#39;Acima de R$100.000,00&#39; |  [optional]
**outrosBensValor** | [**BigDecimal**](BigDecimal.md) | Valor em R$ de outros bens do usuário |  [optional]


## Enum: ValorDePatrimonioEnum

Name | Value
---- | -----


## Enum: RendimentoMensalEnum

Name | Value
---- | -----




