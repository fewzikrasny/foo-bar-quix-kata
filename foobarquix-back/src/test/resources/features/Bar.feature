Feature: Convert numbers divisible by five or contains five to string Bar

  Scenario Outline: Call the convert number webservices with the number ten which is divisible by 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Bar    |

    Examples:
      | inputNumber |
      | 10          |
