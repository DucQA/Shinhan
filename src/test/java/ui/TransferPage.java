package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class TransferPage {
    public static Target bankNameDropdownBtn = Target.the("Bank Name Dropdown Button")
            .locatedBy("(//XCUIElementTypeImage[@name='icAngleDownBlack'])[2]");

    public static Target accountNumberField = Target.the("Account Number Field")
            .located(AppiumBy.accessibilityId("Account number"));

    public static Target transferAmountField = Target.the("Transfer Amount Field")
            .located(AppiumBy.accessibilityId("Transfer amount"));

    public static Target searchField = Target.the("Search Field")
            .located(AppiumBy.accessibilityId("Search here"));

    public static Target nextButton = Target.the("Next Button")
            .located(AppiumBy.accessibilityId("Next"));

    public static Target confirmButton = Target.the("Confirm Button")
            .located(AppiumBy.accessibilityId("Confirm"));

    public static Target keyboardReturnButton = Target.the("Keyboard Return Button")
            .located(AppiumBy.accessibilityId("Return"));

    public static Target keyboardDoneButton = Target.the("Keyboard Return Button")
            .located(AppiumBy.accessibilityId("Done"));

    public static Target backButton = Target.the("Back Button")
            .located(AppiumBy.accessibilityId("icArrowLeftWhite"));

    public static Target transferToOthersButton = Target.the("Transfer to Others Button")
            .located(AppiumBy.accessibilityId("Transfer to others"));

    public static Target searchResult(String keyword) {
        return Target.the("Search result for bank name: " + keyword)
                .located(AppiumBy.xpath("//*[@name='" + keyword.toUpperCase() + "']"));
    }

    public static Target errorPopup(String message) {
        return Target.the("Error Popup with message: " + message)
                .located(AppiumBy.xpath("//*[@name='" + message + "']"));
    }

    public static Target showErrorDetailButton = Target.the("Show Error Detail Button")
            .located(AppiumBy.accessibilityId("layer btn open nor"));
}





