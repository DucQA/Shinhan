Feature: Fund Transfer - Error Handling and Insufficient Balance

  Background:
    Given I am on the transfer screen of the SOL Vietnam app

  Scenario Outline: Display error when recipient account information is not found
    When I search for the receiving bank using the keyword "<keyword>"
    And I enter the account number "<accountNumber>"
    Then I should see a message saying "<errorMessage>"

    Examples:
      | keyword       | accountNumber   | errorMessage                 |
      | uob           | 369704456462283 | Information not found        |
      | techcom bank  | 985038683881683 | Information not found        |
      | vietcom bank  | 005833422860961 | Data Communication Time Over |
      | kbhn          | 540798452142324 | Information not found        |
      | pgbank        | 411905181850184 | Data Communication Time Over |
      | indovina bank | 208228560388866 | Information not found        |
      | mb bank       | 112474363762318 | Data Communication Time Over |
      | nhb hn        | 038516258337644 | Information not found        |
      | ubank         | 738903769209258 | Information not found        |

  Scenario Outline: Prevent transfer when user has insufficient balance
    When I search for the receiving bank using the keyword "<keyword>"
    And I select the bank from the search results
    And I enter the account number "<accountNumber>"
    And I enter the transfer amount "<amount>"
    Then I should see a message saying "<errorMessage>"

    Examples:
      | keyword       | accountNumber   | amount   | errorMessage                           |
      | acb           | 8375837         | 49370727 | The available balance is insufficient. |
      | vietin bank   | 0942888332      | 49590821 | The available balance is insufficient. |
      | bidv          | 21510002318917  | 20395183 | The available balance is insufficient. |
      | techcom bank  | 19036757068015  | 22128125 | The available balance is insufficient. |
      | mb bank       | 0982820157      | 55419496 | The available balance is insufficient. |
      | vp bank       | 19202801        | 76444983 | The available balance is insufficient. |
      | vietcom bank  | 1031655692      | 51988639 | The available balance is insufficient. |
      | maritime bank | 88898017447844  | 67529402 | The available balance is insufficient. |
      | vib bank      | 003704060213804 | 35372793 | The available balance is insufficient. |
      | cake          | 0369470898      | 76444983 | The available balance is insufficient. |
