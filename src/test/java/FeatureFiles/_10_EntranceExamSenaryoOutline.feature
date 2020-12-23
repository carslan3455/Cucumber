#Bir önceki(_09_ Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#

#| examName    | academicPeriodOption | gradeLevelOption | documentTypeOption |
#| Math exam   | option2              | option4          | option4            |
#| IT exam     | option1              | option1          | option1            |
#| Oracle exam | option2              | option2          | option2            |
#| Math exam   | option1              | option3          | option3            |

Feature: Enterance Exam Functionality Scenario Outline

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully


  Scenario Outline:
    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the form content class
      | nameInput | <examName> |

    And Click in the new exam form content class
      | academicPeriod         |
      | <academicPeriodOption> |
      | gradeLevel             |
      | <gradeLevelOption>     |
      | documentType           |
      | <documentTypeOption>   |
      | examsAddBtn            |
      | saveBtn                |

    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    When User delete the "<examName>"

    Then Success message should be displayed


    Examples:
      | examName      | academicPeriodOption | gradeLevelOption | documentTypeOption |
      | Math exam34   | option2              | option4          | option4            |
      | IT exam34     | option1              | option1          | option1            |
      | Oracle exam34 | option2              | option2          | option2            |
      | Math exam34   | option1              | option3          | option3            |