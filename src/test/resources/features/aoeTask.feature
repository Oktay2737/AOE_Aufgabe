Feature:Filter of job offerings feature of the AOE website is working.
  @wip
  Scenario: Control of job offerings filter
    Given The User opens the webpage
    And   The User Navigates to the "Vacancies" page of the "Careers" section
   Then The User writes "frontend" as keyword
    Then Check the returned list for the keyword
    And  Open the first entry which is displayed
   Then Check the content of this job offering is being displayed.
