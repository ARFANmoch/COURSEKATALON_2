Feature: masuk

  Scenario Outline: masuk berhasil
    Given User navigate to login page
    When Click Button Login and Registrasi
    And Enter <username> and <password>
    And Click Button login
    Then User navigate to homepage

    Examples: 
      | username           | password                 |
      | mcharfnn@gmail.com | MG57uhWAPTj38XXpmmrHxQ== |
