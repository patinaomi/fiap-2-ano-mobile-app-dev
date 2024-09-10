# Desafio: Calculadora de Descontos

## Contexto

Clara é uma mulher apaixonada por compras, especialmente em outlets, onde sempre busca as melhores
ofertas. No entanto, ela tem dificuldades em calcular rapidamente os descontos aplicados nas suas compras.
Para ajudá-la a aproveitar melhor as promoções, você deverá desenvolver uma aplicação que facilite esses cálculos para ela.

Imagine a situação: Clara encontrou uma jaqueta incrível com um desconto de 35%, mas não tem certeza
de quanto vai pagar de verdade. O seu aplicativo será uma ferramenta essencial para garantir que Clara
aproveite as melhores ofertas sem confusão. :shopping: :moneybag:

## Objetivo

Desenvolver uma aplicação onde Clara possa inserir o valor original do produto e o desconto aplicado,
e o aplicativo calculará o valor final com o desconto. Se o desconto for de 100%, o aplicativo deverá
mostrar que o produto é **GRÁTIS**.

## Instruções

- O aplicativo deverá conter dois campos de entrada:
    - Um para Clara inserir o preço original do produto.
    - Outro para inserir o desconto em porcentagem.

- O app deverá conter um botão "Calcular" que, quando pressionado, irá calcular o valor final do produto com o desconto.

- O aplicativo deverá conter uma área para exibir o resultado do cálculo.

- Caso Clara insira valores inválidos ou deixe campos em branco, uma mensagem de erro deverá ser exibida.

## Requisitos

- O layout deve conter:
    - Um elemento com o `id` configurado para `priceEditText` para Clara inserir o preço do produto.
    - Um elemento com o `id` configurado para `discountEditText` para inserir o desconto.
    - Um botão com o `id` configurado para `calculateButton` com o texto **Calcular**.
    - Um elemento com o `id` configurado para `resultTextView` para exibir o resultado final do cálculo.
        - Se o desconto for de 100%, exibir **GRÁTIS** no lugar do valor.
    - Um elemento com o `id` configurado para `errorTextView` para exibir mensagens de erro.

- O aplicativo deverá validar que:
    - O preço e o desconto são números válidos.
    - O preço não pode ser negativo.
    - O desconto deve ser um número entre 0 e 100.

- Se valores inválidos forem inseridos, Clara deverá receber uma mensagem de erro.

- Caso contrário, o resultado deverá ser exibido, mostrando o valor final a ser pago após a aplicação do desconto.

## Testes

O projeto possui testes unitários para te ajudar a validar se o aplicativo está funcionando corretamente.
Os testes cobrem os cenários de cálculo com preços e descontos válidos, além de verificarem se as
mensagens de erro são exibidas corretamente quando Clara insere valores inválidos ou em branco.

## Exemplo de Fluxo

1. Clara insere o valor **R$ 150,00** para o preço do produto.
2. Ela insere **20%** para o desconto.
3. Ao pressionar **Calcular**, o aplicativo exibe o valor final: **R$ 120,00**.
4. Se Clara insere um desconto de **100%**, o aplicativo exibirá a mensagem **GRÁTIS**.
5. Se Clara não preencher algum campo ou inserir valores inválidos, uma mensagem de erro será exibida.

---

Boa sorte e ajude Clara a fazer compras com tranquilidade! 🛍️ :sparkles: :shipit:
