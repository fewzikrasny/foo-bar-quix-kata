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

  Scenario Outline: Call the convert number webservices with the number five as pathvariable
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | BarBar |

    Examples:
      | inputNumber |
      | 5           |

  Scenario Outline: Call the convert number webservices with the number fifty-five which is divisible by 5 and contains twice the number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result    |
      | BarBarBar |

    Examples:
      | inputNumber |
      | 55          |

  Scenario Outline: Call the convert number webservices with the number five thousand five hundred fifteen which is divisible by 5 and contains three times the number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | BarBarBarBar |

    Examples:
      | inputNumber |
      | 5515         |

  Scenario Outline: Call the convert number webservices with the number fifty-eight which contains the number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Bar    |

    Examples:
      | inputNumber |
      | 58          |

  Scenario Outline: Call the convert number webservices with the number five hundred fifty-one which contains twice number 5
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | BarBar |

    Examples:
      | inputNumber |
      | 551         |
