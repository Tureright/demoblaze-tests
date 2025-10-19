@PurchaseFlow
Feature: Flujo de compra de demoblaze

  @PurchaseTwoItems
  Scenario Outline: Comprar dos productos en demoblaze con datos inconsistentes
    Given Estoy en el home de demoblaze
    When Agrego los produtos Samsung galaxy s6 y Sony vaio i5 al carrito
    And Hago clic en el botón de "Place Order" dentro del cerrito de compras
    And Completo el formulario de compra con los datos "<Name>", "<Country>", "<City>", "<Credit card>", "<Month>" y "<Year>"
    And Finalizo la compra
    Then No me permite comprar productos con los datos proporcionados
    Examples:
      | Name            | Country  | City  | Credit card | Month | Year   |
      | ' OR '1'='1' -- | Ecuadro1 | 12@   | 1748SA12    | -13L  | -2025A |
      | Santi           | Santi    | Santi | Santi       | Santi | Santi  |