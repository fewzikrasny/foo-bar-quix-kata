Feature: Convert numbers divisible by seven or contains seven to string Quix

  Scenario Outline: Call the convert number webservices with the number fourteen divisible by 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Quix   |

    Examples:
      | inputNumber |
      | 14          |

  Scenario Outline: Call the convert number webservices with the number seven as pathvariable
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result   |
      | QuixQuix |

    Examples:
      | inputNumber |
      | 7           |

  Scenario Outline: Call the convert number webservices with the number seventy-seven divisible by 7 and contains twice the number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result       |
      | QuixQuixQuix |

    Examples:
      | inputNumber |
      | 77          |

  Scenario Outline: Call the convert number webservices with the number seventy-seven thousand seven hundred fourteen divisible by 7 and contains three times the number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result           |
      | QuixQuixQuixQuix |

    Examples:
      | inputNumber |
      | 77714       |

  Scenario Outline: Call the convert number webservices with the number seventeen which contains the number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result |
      | Quix   |

    Examples:
      | inputNumber |
      | 17          |

  Scenario Outline: Call the convert number webservices with the number seven hundred seventy-two which contains twice number 7
    Given inputNumber <inputNumber>
    When Call the convert number webservices
    Then Http response is 200
    And The resultDto must be
      | result   |
      | QuixQuix |

    Examples:
      | inputNumber |
      | 772         |
