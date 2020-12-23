Feature:Enterance Exam Functionality

  Background:
    Given Navigate to website basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Creat  Enterance exam


    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    And Click on the element in the content class
      | addBtn |

    When User sending the keys in the form content class
      | nameInput | ITKursu |

    And Click in the new exam form content class
      | academicPeriod |
      | option1        |
      | gradeLevel     |
      | option1        |
      | documentType   |
      | option1        |
      | examsAddBtn    |
      | saveBtn        |


    Then Success message should be displayed

    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |


    When User delete the "ITKursu"

    Then Success message should be displayed
