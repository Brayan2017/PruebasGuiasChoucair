#Autor:bryan camilo herrera
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in sreenplay at the Choucair Academy with the Automation course

  @scenario1
  Scenario Outline: Search for a automation course
    Given than brayan want to learn automation at the Academy Choucair
      | strUser   | strPassword  |
      | <strUser> | <strPassword> |
    When he search for the course on the choucair academy plaform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called
      | strCourse   |
      | <strCourse> |

    Examples:
      |strUser     |strPassword    |strCourse                  |
      |1037644784  |Choucair2021*  |Workshop de Automatización |