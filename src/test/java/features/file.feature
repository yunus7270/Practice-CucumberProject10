Feature: Application LogIn

Scenario: Login verification

Given Visiting the webpage "https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022"
When Using credentials "y.ogurlu@mmsaweb.org" and "Mmsa@2014"
Then The text shlould be available "2021-2022 FAFSA Completion Project"
And The login is success "true"
