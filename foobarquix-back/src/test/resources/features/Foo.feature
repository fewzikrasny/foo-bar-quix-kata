Feature: Convert numbers divisible by three or contains three to string Foo

  Scenario Outline: Call the convert number webservices with the number nine which is divisible by 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Foo    |

    Examples:
      | inputNumber |
      | 9           |

  Scenario Outline: Call the convert number webservices with the number three as pathvariable
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | FooFoo |

    Examples:
      | inputNumber |
      | 3           |

  Scenario Outline: Call the convert number webservices with the number thirty-three which is divisible by 3 and contains twice the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result    |
      | FooFooFoo |

    Examples:
      | inputNumber |
      | 33          |

  Scenario Outline: Call the convert number webservices with the number three hundred thirty-three which is divisible by 3 and contains three times the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | FooFooFooFoo |

    Examples:
      | inputNumber |
      | 333         |

  Scenario Outline: Call the convert number webservices with the number thirteen which contains the number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Foo    |

    Examples:
      | inputNumber |
      | 13          |

  Scenario Outline: Call the convert number webservices with the number two hundred thirty-three which contains twice number 3
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | FooFoo |

    Examples:
      | inputNumber |
      | 233         |
