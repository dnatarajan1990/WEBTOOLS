package Pageobject;

import Common.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcmtMultiCopyPage extends BaseMethods {
    public AcmtMultiCopyPage(WebDriver driver) {
        super(driver);
    }

    public final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
    public final String CLEAR_BUTTON = "//button[text()='Clear']";
    public final String DELETE_BUTTON ="//tr//*[contains(text(),'Delete')]";
    public final String CANCEL_BUTTON = "//button[text()='Cancel']";
    public final String PREVIEW_BUTTON = "//button[contains(text(),'Preview')]";
    public final String TO_MPID_DROPDOWN = "//div[@id='tompid']//select";
    public final String TO_ROLE_DROPDOWN = "//div[@id='torole']//select";
    public final String FLOW_DROPDOWN = "//div[@id='flowid']//select";
    public final String VERSION_DROPDOWN = "//div[@id='flowv']//select";
    public final String TEST_FLAG_DROPDOWN="//div[@id='testflag']//select";
    public final String GATEWAY_HOST_DROPDOWN = "//div[@id='gateway']//select";
    public final String FLOW_FORMAT_DROPDOWN = "//div[@id='flowformat']//select";
    public final String FROM_MPID_DROPDOWN = "//div[@id='frommpid']//select";
    public final String FROM_ROLE_DROPDOWN = "//div[@id='fromrole']//select";
    public final String CC_GATEWAY_HOST_DROPDOWN = "//div[@id='gatewaycc']//select";
    public final String ACTIVE_FROM_BOX = "//div[@id='activedatefrom']//input";
    public final String ACTIVE_FROM_HH_BOX = "//div[@id='activefromtime']//input";
    public final String ACTIVE_TO_BOX = "//div[@id='activedateto']//input";
    public final String ACTIVE_TO_HH_BOX ="//div[@id='activetotime']//input";

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = PREVIEW_BUTTON)
    public WebElement previewButton;

    @FindBy(xpath = TO_MPID_DROPDOWN)
    public WebElement toMpidDropdown;

    @FindBy(xpath = TO_ROLE_DROPDOWN)
    public WebElement toRoleDropDown;

    @FindBy(xpath = FLOW_DROPDOWN)
    public WebElement flowDropdown;

    @FindBy(xpath = VERSION_DROPDOWN)
    public WebElement versionDropdown;

    @FindBy(xpath = TEST_FLAG_DROPDOWN)
    public WebElement testFlagDropdown;

    @FindBy(xpath = GATEWAY_HOST_DROPDOWN)
    public WebElement gatewayHostDropdown;

    @FindBy(xpath = FLOW_FORMAT_DROPDOWN)
    public WebElement flowFormatDropdown;

    @FindBy(xpath = FROM_MPID_DROPDOWN)
    public WebElement fromMpidDropdown;

    @FindBy(xpath = FROM_ROLE_DROPDOWN)
    public WebElement fromRoleDropdown;

    @FindBy(xpath = CC_GATEWAY_HOST_DROPDOWN)
    public WebElement ccGatewayHostDropdown;

    @FindBy(xpath = ACTIVE_FROM_BOX)
    public WebElement activeFromBox;

    @FindBy(xpath = ACTIVE_FROM_HH_BOX)
    public WebElement activeFromHhBox;

    @FindBy(xpath = ACTIVE_TO_BOX)
    public WebElement activeToBox;

    @FindBy(xpath = ACTIVE_TO_HH_BOX)
    public WebElement activeToHhBox;

    @FindBy(xpath = CLEAR_BUTTON)
    public WebElement clearButton;

    @FindBy(xpath = DELETE_BUTTON)
    public WebElement deleteButton;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    public WebElement getTestFlagDropdown() {
        return testFlagDropdown;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getVersionDropdown() {
        return versionDropdown;
    }

    public WebElement getFlowDropdown() {
        return flowDropdown;
    }

    public WebElement getFromRoleDropdown() {
        return fromRoleDropdown;
    }

    public WebElement getFromMpidDropdown() {
        return fromMpidDropdown;
    }

    public WebElement getToMpidDropdown() {
        return toMpidDropdown;
    }

    public WebElement getActiveFromBox() {
        return activeFromBox;
    }

    public WebElement getFlowFormatDropdown() {
        return flowFormatDropdown;
    }

    public WebElement getActiveFromHhBox() {
        return activeFromHhBox;
    }

    public WebElement getActiveToBox() {
        return activeToBox;
    }

    public WebElement getActiveToHhBox() {
        return activeToHhBox;
    }

    public WebElement getCcGatewayHostDropdown() {
        return ccGatewayHostDropdown;
    }

    public WebElement getGatewayHostDropdown() {
        return gatewayHostDropdown;
    }

    public WebElement getPreviewButton() {
        return previewButton;
    }

    public WebElement getToRoleDropDown() {
        return toRoleDropDown;
    }

    public WebElement getClearButton() {
        return clearButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}

}
