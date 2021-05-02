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

  Scenario Outline: Call the convert number webservices with the number fifty-one which is divisible by 3 and contains the number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | FooBar |

    Examples:
      | inputNumber |
      | 51          |

  Scenario Outline: Call the convert number webservices with the number fifty-three which contains the number 5 and contains the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | BarFoo |

    Examples:
      | inputNumber |
      | 53          |

  Scenario Outline: Call the convert number webservices with the number fifteen which is divisible by 3 and 5 and contains the number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result    |
      | FooBarBar |

    Examples:
      | inputNumber |
      | 15          |

  Scenario Outline: Call the convert number webservices with the number three hundred five which is divisible by 5 and contains the number 3 and 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result    |
      | BarFooBar |

    Examples:
      | inputNumber |
      | 305         |

  Scenario Outline: Call the convert number webservices with the number three hundred thirty-five which is divisible by 5 and contains two times the number 3 and a 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | BarFooFooBar |

    Examples:
      | inputNumber |
      | 335         |

  Scenario Outline: Call the convert number webservices with the number three hundred fifty-three which contains two numbers 3 and 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result    |
      | FooBarFoo |

    Examples:
      | inputNumber |
      | 353         |

  Scenario Outline: Call the convert number webservices with the number five thousand three hundred fifty-three which contains two numbers 5 and two numbers 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | BarFooBarFoo |

    Examples:
      | inputNumber |
      | 5353        |

  Scenario Outline: Call the convert number webservices with the number thirty-five thousand three hundred fifty-one which contains two numbers 3 and two numbers 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | FooBarFooBar |

    Examples:
      | inputNumber |
      | 35351       |


  Scenario Outline: Call the convert number webservices with the number twenty-seven which is divisible by 3 and contains the number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result  |
      | FooQuix |

    Examples:
      | inputNumber |
      | 27          |

  Scenario Outline: Call the convert number webservices with the number seventy-three which contains the numbers 7 and 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result  |
      | QuixFoo |

    Examples:
      | inputNumber |
      | 73          |

  Scenario Outline: Call the convert number webservices with the number seven hundred twenty-three which is divisible by 3 and contains the numbers 7 and 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result     |
      | FooQuixFoo |

    Examples:
      | inputNumber |
      | 723         |

  Scenario Outline: Call the convert number webservices with the number seven hundred thirty-seven which contains two numbers 7 and the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result      |
      | QuixFooQuix |

    Examples:
      | inputNumber |
      | 737         |

  Scenario Outline: Call the convert number webservices with the number three hundred thirty-seven which is divisible by 3 and contains the numbers 3 and 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result     |
      | FooFooQuix |

    Examples:
      | inputNumber |
      | 337         |

  Scenario Outline: Call the convert number webservices with the number seven hundred seventy-three which contains two numbers 7 and the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result      |
      | QuixQuixFoo |

    Examples:
      | inputNumber |
      | 773         |

  Scenario Outline: Call the convert number webservices with the number three thousand seven hundred thirty-seven which contains two numbers 7 and two numbers 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result         |
      | FooQuixFooQuix |

    Examples:
      | inputNumber |
      | 3737        |

  Scenario Outline: Call the convert number webservices with the number seven thousand three hundred seventy-three which contains two numbers 7 and two numbers 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result         |
      | QuixFooQuixFoo |

    Examples:
      | inputNumber |
      | 7373        |

  Scenario Outline: Call the convert number webservices with the number seventy which divisible by 5 and 7 and contains the number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result      |
      | BarQuixQuix |

    Examples:
      | inputNumber |
      | 70          |

  Scenario Outline: Call the convert number webservices with the number seven thousand five hundred fifty-two which contains the number seven and two numbers 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result     |
      | QuixBarBar |

    Examples:
      | inputNumber |
      | 7552        |

  Scenario Outline: Call the convert number webservices with the number thirty-five which is divisible by 5 and 7 and contains the number 3 and 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result        |
      | BarQuixFooBar |

    Examples:
      | inputNumber |
      | 35          |

  Scenario Outline: Call the convert number webservices with the number seven hundred fifty which divisible by 3 and 5 and contains the numbers 7 and 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result        |
      | FooBarQuixBar |

    Examples:
      | inputNumber |
      | 750         |

  Scenario Outline: Call the convert number webservices with the number three thousand five hundred seventy-two contains the numbers 3 and 5 and 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result     |
      | FooBarQuix |

    Examples:
      | inputNumber |
      | 3572        |

  Scenario Outline: Call the convert number webservices with the number nine thousand five hundred and thirteen which is divisible by 3 and 7 and contains the number 5 and 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result        |
      | FooQuixBarFoo |

    Examples:
      | inputNumber |
      | 9513        |

  Scenario Outline: Call the convert number webservices with the number seven hundred thirty-five which is divisible by 3 and 5 and 7 and contains the numbers 7 and 3 and 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result               |
      | FooBarQuixQuixFooBar |

    Examples:
      | inputNumber |
      | 735         |

  Scenario Outline: Call the convert number webservices with the number thirty-nine thousand seven hundred fifty-three which is divisible by 3 and 7 and contains the number 7 and 5 and twice 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result               |
      | FooQuixFooQuixBarFoo |

    Examples:
      | inputNumber |
      | 39753       |
