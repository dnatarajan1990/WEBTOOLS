package Pageobject;

import Common.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcmtSingleEditPage extends BaseMethods {

    public AcmtSingleEditPage(WebDriver driver) {
        super(driver);
    }

    public static final String TO_MPID_DROPDOWN = "//div[@id='tompid']/select";
    public static final String TO_ROLE_DROPDOWN = "//div[@id='torole']/select";
    public static final String FROM_MPID_DROPDOWN = "//div[@id='frompid']/select";
    public static final String FROM_ROLE_DROPDOWN ="//div[@id='fromrole']/select";
    public static final String FLOW_DROPDOWN = "//div[@id='flowid']/select";
    public static final String VERSION_DROPDOWN = "//div[@id='flowversion']/select";
    public static final String TEST_FLAG_DROPDOWN = "//div[@id='testflag']/select";
    public static final String GATEWAY_DROPDOWN = "//div[@id='gwnum']/div/select";
    public static final String HOST_DROPDOWN = "//div[@id='hostid']/select";
    public static final String FORMAT_DROPDOWN = "//div[@id='format']/select";
    public static final String GATEWAY_COPY_DROPDOWN = "//div[@id='copygwnum']/select";
    public static final String HOST_COPY_DROPDOWN = "//div[@id='copyhostid']/select";
    public static final String FORMAT_COPY_DROPDOWN = "//div[@id='copyformat']/select";
    public static final String ALL_RECIPANT_CHECKBOX = "//div[@id='allflows']/div/label/input";
    public static final String ACTIVE_FROM = "//div[@id='activefromdate']//../div/input";
    public static final String ACTIVE_TO = "//div[@id='activetodate']//../div/input";
    public static final String CANCEL_BUTTON = "//div[@id='buttons']/button[contains(text(),'Cancel')]";
    public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";

    @FindBy(xpath = TO_MPID_DROPDOWN)
    public WebElement toMpidDropdown;
    @FindBy(xpath = TO_ROLE_DROPDOWN)
    public WebElement toRoleDropdown;
    @FindBy(xpath = FROM_MPID_DROPDOWN)
    public WebElement fromMpidDropdown;
    @FindBy(xpath = FROM_ROLE_DROPDOWN)
    public WebElement fromRoleDropdown;
    @FindBy(xpath = FLOW_DROPDOWN)
    public WebElement flowDropdown;
    @FindBy(xpath = VERSION_DROPDOWN)
    public WebElement versionDropdown;
    @FindBy(xpath = TEST_FLAG_DROPDOWN)
    public WebElement testFlagDropdown;
    @FindBy(xpath = GATEWAY_DROPDOWN)
    public WebElement gatewayDropdown;
    @FindBy(xpath = HOST_DROPDOWN)
    public WebElement hostDropdown;
    @FindBy(xpath = FORMAT_DROPDOWN)
    public WebElement formatDropdown;
    @FindBy(xpath = GATEWAY_COPY_DROPDOWN)
    public WebElement gatewayCopyDropdown;
    @FindBy(xpath = HOST_COPY_DROPDOWN)
    public WebElement hostCopyDropdown;
    @FindBy(xpath = FORMAT_COPY_DROPDOWN)
    public WebElement formatCopyDropdown;
    @FindBy(xpath = ALL_RECIPANT_CHECKBOX)
    public WebElement allRecipientCheckbox;
    @FindBy(xpath = ACTIVE_FROM)
    public WebElement activeFrom;
    @FindBy(xpath = ACTIVE_TO)
    public WebElement activeTo;
    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;
    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    public WebElement getToMpidDropdown() {
        return toMpidDropdown;
    }
    public WebElement getToRoleDropdown() {
        return toRoleDropdown;
    }
    public WebElement getFromMpidDropdown() {
        return fromMpidDropdown;
    }
    public WebElement getFromRoleDropdown() {
        return fromRoleDropdown;
    }
    public WebElement getFlowDropdown() {
        return flowDropdown;
    }
    public WebElement getVersionDropdown() {
        return versionDropdown;
    }
    public WebElement getActiveFrom() {
        return activeFrom;
    }
    public WebElement getActiveTo() {
        return activeTo;
    }
    public WebElement getAllRecipientCheckbox() {
        return allRecipientCheckbox;
    }
    public WebElement getFormatCopyDropdown() {
        return formatCopyDropdown;
    }
    public WebElement getFormatDropdown() {
        return formatDropdown;
    }
    public WebElement getCancelButton() {
        return cancelButton;
    }
    public WebElement getGatewayCopyDropdown() {
        return gatewayCopyDropdown;
    }
    public WebElement getGatewayDropdown() {
        return gatewayDropdown;
    }
    public WebElement getHostCopyDropdown() {
        return hostCopyDropdown;
    }
    public WebElement getHostDropdown() {
        return hostDropdown;
    }
    public WebElement getSaveButton() {
        return saveButton;
    }
    public WebElement getTestFlagDropdown() {
        return testFlagDropdown;
    }

}
