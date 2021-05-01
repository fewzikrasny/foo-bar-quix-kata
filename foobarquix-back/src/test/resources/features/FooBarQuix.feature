Feature: Convert the numbers divisible or contains the numbers three, five and seven to string

  Scenario Outline: Call the convert number webservices with the number one as pathvariable
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | 1      |

    Examples:
      | inputNumber |
      | 1           |
