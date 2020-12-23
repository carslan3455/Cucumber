Feature: Student Creat Delete Functionality

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully


  Scenario Outline:

    And Click on the element in the left class
      | studentParent |
      | studentsChild |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the form content class
      | firstName | <studentFirstName> |
      | lastName  | <studentLastName>  |

    And Click in the new exam form content class
      | gender                   |
      | <genderOption>           |
      | gradeLevel               |
      | <gradeLevelOption>       |
      | schoolDepartment         |
      | <schoolDepartmentOption> |
      | section                  |
      | <sectionOption>          |
      | citizienShip             |
      | <citizienShipOption>     |
      | studentDocumentType      |
      | <documentTypeOption>     |

    When User sending the keys in the form content class
      | studentDocumentNumber | <documentNumber> |

    And Click in the new exam form content class
      | representatives         |
      | repAddBtn               |
      | repSelect               |
      | <representativesOption> |

    When User sending the keys in the form content class
      | repFirstName  | <repFirstName> |
      | repLastName   | <repLastName>  |
      | repMobilPhone | <repPhone>     |

    And Click in the new exam form content class
      | repAddBtn2 |
      | saveBtn    |

    Then Success message should be displayed

    And Click on the element in the left class
      | studentParent |
      | studentsChild    |

    When User delete the form "<studentFirstName>"

    Then Success message should be displayed

    Examples:
      | studentFirstName | studentLastName | genderOption | gradeLevelOption | schoolDepartmentOption | sectionOption | citizienShipOption | representativesOption | repFirstName | repLastName | repPhone   | documentTypeOption | documentNumber |
      | Sinem            | Ars             | option2      | option3          | option1                | option1       | option4            | option1               | Cgdm         | Arsl        | 1234512345 | option1            | 2011           |
#      | Ihsan            | Ars             | option1      | option2          | option2                | option1       | option4            | option2               | Hsn          | Arsl        | 1234       | option2            | 2008           |
#      | Oz               | Oz              | option2      | option1          | option1                | option2       | option4            | option1               | Nrtn         | Oz          | 122345     | option3            | 2000           |
#      | Es               | Es              | option2      | option4          | option2                | option4       | option4            | option2               | Mhtn         | Oz          | 4512345    | option1            | 2020           |