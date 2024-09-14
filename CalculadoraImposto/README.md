# Salário Limpo: Controle Fácil de Descontos e Salário Líquido

## Regras

### Nome do projeto

Para nomear o projeto, utilizar a estrutura abaixo, com o seu RM:

```
name: RMXXXXX CP1
package name: br.com.fiap.rmxxxxxcp1
```

### Regras de Submissão - Commits e Pushes

Durante a realização do checkpoint, os seguintes procedimentos de versionamento
de código devem ser seguidos **rigorosamente**:

- **_Commits_ e _pushes_ a cada 15 minutos**:
  - É **obrigatório** realizar pelo menos **um commit** no repositório local e
  **um push** para o repositório remoto a cada **15 minutos** durante o checkpoint.
  - O commit deve refletir o progresso do código até aquele momento e ser
  acompanhado de uma mensagem descritiva e clara.

- **Proibição de `git push --force`**:
  - **Não é permitido** o uso do comando `git push --force` ou qualquer variação
  que force a sobrescrita do histórico de commits. Isso resultará em **penalidades**.

- **Penalidades**:
  - Para cada intervalo de 15 minutos em que não houver um commit e push
  válidos, será aplicada uma **penalização**.
  - O uso de `git push --force` acarretará a **anulação total do checkpoint**,
  resultando em nota zero.

- **Exemplo de Fluxo**:
  1. Desenvolva uma parte do código.
  2. Adicione os arquivos: `git add .`
  3. Efetue um commit: `git commit -m "Descrição do que foi implementado"`
  4. Realize o push: `git push`

- **Importante**:
  - O cumprimento dessas regras será monitorado através do histórico do Git.
  Certifique-se de que seu progresso seja constantemente salvo e enviado.
  - A organização do seu histórico de commits será avaliada como parte do seu
  desempenho.

## Contexto

Jordan, um analista de marketing detalhista e metódico, está determinado a 
entender quanto de seu salário realmente chega à sua conta no final do mês. 
Com o salário bruto em mãos e dois dependentes – seus gêmeos travessos, Jalen 
e Saquon, que vivem pedindo presentes e sorvetes – ele precisa de uma solução 
para decifrar os descontos misteriosos do INSS e IRPF. Afinal, entre campanhas 
de marketing e relatórios de desempenho, ele não tem paciência para planilhas.

## Vamos ajudar Jordan?

Sua missão é criar um aplicativo que, a partir do salário bruto e o número de
dependentes, seja possível calcular automaticamente os descontos e revelar o
valor do salário liquído. Assim Jordan poderá prever exatamente quanto sobrará
para pagar as compras dos gêmeos no final do mês!

## Fluxo do aplicativo

1. O usuário informa o salário bruto.
2. O usuário informa a quantidade de dependentes.
3. O usuário clica no botão calcular.
4. O aplicativo exibe os valores calculados para o usuário.

## Isenção

Caso o valor do salário base informado esteja dentro da faixa de isenção do 
imposto de renda, o aplicativo deverá informar o usuário e não exibir os valores
zerados, referentes ao imposto de renda.

## Limpar cálculo

Após realização do cálculo, não deverá ser permitida a alteração dos valores
informados. Para realização de um novo cálculo, o usuário deverá utilizar o
botão de limpeza para então informar os novos dados e realizar um novo cálculo.

## Estrutura da tela

Para suportar as funcionalidades, a tela deverá conter obrigatoriamente:

- Um campo de entrada para receber o salário bruto.
- Um campo de entrada para receber o número de dependentes.
- Um texto explicando o propósito do aplicativo.
- Um botão para solicitar o cálculo.
- Um texto para exibir o valor do imposto de renda calculado.
- Um texto para exibir o valor da contribuição ao INSS calculado.
- Um texto para exibir o valor do salário liquído.
- Um botão para limpar o cálculo atual e iniciar um novo.
- Um texto para exibir mensagens de erro.
- Um texto para exibir a alíquota efetiva do imposto de renda.
- Um texto apra exibir a alíquota efetiva do INSS.
- Um texto para exibir o teto de contribuição ao INSS.

## Requisitos

- Caso não seja informado o salário base ou o número de dependentes, uma
mensagem de erro deverá ser exibida informando o problema.

- Exibir mensagem de erro para valores inválidos.
    - Salário negativo.
    - Número de dependentes negativo.
    - Mais que dez dependentes.

- Os componentes visuais deverão ser exibidos conforme o fluxo do aplicativo.

- Após o cálculo, o aplicativo deverá:
    - Desabilitar a edição do salário bruto.
    - Desabilitar a edição do número de dependentes.
    - Desativar o botão de cálculo.
    - Exibir o valor do imposto de renda calculado.
    - Exibir a alíquota efetiva do imposto de renda.
    - Exibir o valor de contribuição para o INSS.
    - Exibir a alíquota efetiva do INSS.
    - Exibir o botão para limpeza do cálculo.

- Ao solicitar a limpeza do cálculo, espera-se:
    - Edição do salário bruto habilitada e sem valores preenchidos.
    - Edição do número de dependentes habilitada e sem valores preenchidos.
    - Habilitar o botão de cálculo.
    - Não exibir o valor do imposto de renda calculado.
    - Não exibir a alíquota efetiva do imposto de renda.
    - Não exibir o valor de contribuição para o INSS.
    - Não exibir a alíquota efetiva do INSS.
    - Esconder o botão de limpeza do cálculo.

- Se o valor de contribuição ao INSS for o teto, ou seja, o máximo de
contribuição permitido, deverá ser informado ao usuário esta situação.

- Se o valor de imposto de renda a ser descontado for zero, exibir a informação
de contribuinte isento e não exibir o valor nem a taxa efetiva.

## Tabelas

### Tabela do Imposto de Renda

| Faixa Salarial (R$)                  | Alíquota (%) | Dedução (R$) |
|--------------------------------------|--------------|--------------|
| Até R$ 2.259,20                      | -            | -            |
| De R$ 2.259,21 até R$ 2.826,65       | 7,5%         | R$ 169,44    |
| De R$ 2.826,66 até R$ 3.751,05       | 15,0%        | R$ 381,44    |
| De R$ 3.751,06 até R$ 4.664,68       | 22,5%        | R$ 662,77    |
| Acima de R$ 4.664,68                 | 27,5%        | R$ 896,00    |


### Tabela de contribuição ao INSS

| Faixa Salarial (R$)              | Alíquota (%) |
|----------------------------------|--------------|
| Até R$ 1.412,00                  | 7,5%         |
| De R$ 1.412,01 a R$ 2.666,68     | 9%           |
| De R$ 2.666,69 até R$ 4.000,03   | 12%          |
| De R$ 4.000,04 até R$ 7.786,02   | 14%          |

## Regra de cálculo da contribuição ao INSS

Como o INSS não aceita contribuições acima do teto estabelecido, você deve 
respeitar esta regra, utilizando o valor `R$ 7.786,02` como salário base.

Você deve dividir o valor do salário base, após aplicação da regra anterior, em 
faixas de contribuição. Para cada faixa, aplicar a alíquota correspondente e 
descobrir o valor da contribuição daquela faixa. Então, deve-se somar todas os 
valores encontrados para chegar no valor final da contribuição.

A fórmula abaixo esboça este cálculo:

```
faixa1 = valor do salario referente a faixa 1 * 7,5%
faixa2 = valor do salario referente a faixa 2 * 9%
faixa3 = valor do salario referente a faixa 3 * 12%
faixa4 = valor do salario referente a faixa 4 * 14%
contribuição = faixa1 + faixa2 + faix3 + faixa4
```

## Regra de cálculo do imposto de renda

Para realização do cálculo do imposto de renda, primeiro é necessário calcular o 
valor base do cálculo, que é encontrado através da fórmula:

```
valor base = valor bruto - contribuição INSS - (número de dependentes * parcela)
```

Sendo a `parcela` um valor fixo de `R$ 189,59`.

Após o cálculo do valor base, pode-se encontrar o valor do imposto através da
fórmula abaixo:

```
valor devido = (valor base * alíquota) - dedução
```

Os valores da `alíquota` e da `dedução` deverão ser determinados de acordo com a
faixa a qual o valor base se encontrar.

## Exemplos

| Nome    | Profissão             | Salário bruto | Dependentes | INSS      | IRPF        | Salário liquído |
|---------|-----------------------|---------------|-------------|-----------|-------------|-----------------|
| Jordan  | Analista de marketing |   R$ 4.561,23 |           2 | R$ 457,39 |   R$ 177,26 |     R$ 3.926,58 |
| Louise  | Dev Mobile Jr         |   R$ 6.326,72 |           0 | R$ 704,50 |   R$ 650,09 |     R$ 4.972,08 |
| Patrick | Dev Mobile Pleno      |   R$ 9.558,19 |           1 | R$ 908,86 | R$ 1.430,42 |     R$ 7.218,91 |
| Tom     | Professor             |   R$ 1.412,00 |           3 | R$ 105,89 |     R$ 0,00 |     R$ 1.306,11 |
| Annita  | Dev Mobile Sr         |  R$ 15.134,47 |           1 | R$ 908,86 | R$ 2.963,90 |    R$ 11.261,71 |

## Dicas

- Quebre o problema em partes, resolva um de cada vez. :carpentry_saw:
- Não será levado em conta problemas de arredondamento. :1234:
- Feito é melhor que perfeito. :clinking_glasses:
- Para desabilitar um botão, utilize a propriedade `isEnabled` :white_check_mark: 
- Para não permitir edição de um campo de entrada, utilize a propriedade `isEnabled` :white_check_mark: 
- A organização visual neste desafio não vale pontos, só precisa estar funcional,
então não precisa investir tempo deixando seu aplicativo lindo. :sparkles:
