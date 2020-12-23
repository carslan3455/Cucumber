Feature: DataTable Functionality

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully


  Scenario: Create Country

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | country    |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the dialog content class
      | nameInput | yeniBirDunya |
      | codeInput | 3455         |

    And Click on the element in the content class
      | saveBtn |

    Then Success message should be displayed


  Scenario: Creat a Nationalities

    And Click on the element in the left class
      | setupOne    |
      | parameters  |
      | nationality |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the dialog content class
      | nameInput | weblich |

    And Click on the element in the content class
      | saveBtn |

    Then Success message should be displayed


  Scenario: Creat a Fee

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the dialog content class
      | nameInput       | tamamenDuygusal |
      | codeInput       | 3333            |
      | integrationCode | 4444            |
      | priority        | 5555            |


    And Click on the element in the content class
      | saveBtn |

    Then Success message should be displayed