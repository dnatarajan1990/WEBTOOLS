package Pageobject;

import Common.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;

public class AcmtRoutesPage extends BaseMethods {

    public AcmtRoutesPage(WebDriver driver) {
        super(driver);
    }


    public final String TO_MPID_DROPDOWN = "//select[@id='tompid-select']";
    public final String TO_ROLE_DROPDOWN = "//select[@ng-model ='$ctrl.criteria.toRole']";
    public final String FLOW_DROPDOWN = "//select[@ng-model ='$ctrl.criteria.flowId']";
    public final String VERSION_DROPDOWN = "//select[@ng-model ='$ctrl.criteria.flowVersion']";
    public final String TEST_FLAG_DROPDOWN = "//select[@ng-model ='$ctrl.criteria.testFlag']";
    public final String GATEWAY_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.gatewayId']";
    public final String HOST_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.hostId']";
    public final String FORMAT_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.flowFormat']";
    public final String FROM_MPID_BOX ="//select[@ng-model ='$ctrl.criteria.fromMpid']";
    public final String FROM_ROLE_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.fromRole']";
    public final String STATUS_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.statusInd']";
    public final String DEFERRED_DELEGATION_DROPDOWN ="//select[@ng-model ='$ctrl.criteria.defDelInd']";
    public final String CREATED_FROM_BOX ="#createddatefrom div date-picker div input";
    public final String CREATED_TO_BOX ="#createddateto div date-picker div input";
    public final String ACTIVE_FROM_BOX ="#activedatefrom div date-picker div input";
    public final String ACTIVE_TO_BOX ="#activedateto div date-picker div input";
    public final String MODIFIED_FROM_BOX ="#modifieddatefrom div date-picker div input";
    public final String MODIFIED_TO_BOX ="#modifieddateto div date-picker div input";
    public final String DELETION_FROM_BOX ="#deleteddatefrom div date-picker div input";
    public final String DELETION_TO_BOX ="#deleteddateto div date-picker div input";
    public final String SEARCH_BUTTON ="//button[@ng-click='$ctrl.findRoutes()']";
    public final String SAVE_BUTTON ="//button[@ng-click='$ctrl.saveSearchCriteria()']";
    public final String EXTRACT_BUTTON ="//button[@ng-click='$ctrl.extractRoutes($ctrl.criteria)']";
    public final String SAVE_EXTRACT_LINK = "#download";
    public final String CLOSE_EXTRACT_BUTTON = "//button[@ng-click='$dismiss()']";
    public final String RESET_BUTTON ="//button[normalize-space()='Reset']";
    //TODO when add on front
    //public final String NEW_BUTTON ="//button[@ui-sref='webtools.RoutesNew']";
    //only for test
    public final String NEW_BUTTON ="//button[@ng-click='$ctrl.saveSearchCriteria()' and @class='btn btn-default btn-sm ng-scope']";
    public final String MULTI_MODIFY_BUTTON ="//button[text()='Modify']";
    public final String COPY_BUTTON ="//button[text()='Copy']";
    public final String DELETE_BUTTON ="//button[@ng-click='$ctrl.deleteRoutes()']";
    public final String CONFIRM_DELETE_BUTTON = "//button[text()='OK']";
    public final String ANY_SINGLE_EDIT_BUTTON ="//button[normalize-space()='Edit']";



    @FindBy(xpath = DELETE_BUTTON)
    public WebElement deleteButton;

    @FindBy(xpath = ANY_SINGLE_EDIT_BUTTON)
    public WebElement anySingleEditButton;

    @FindBy(xpath = TO_MPID_DROPDOWN)
    public WebElement toMpidDropdown;

    @FindBy(xpath = TO_ROLE_DROPDOWN)
    public WebElement toRoleDropdown;

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

    @FindBy(xpath = FROM_MPID_BOX)
    public WebElement fromMpidBox;

    @FindBy(xpath = FROM_ROLE_DROPDOWN)
    public WebElement fromRoleDropdown;

    @FindBy(xpath = STATUS_DROPDOWN)
    public WebElement statusDropdown;

    @FindBy(xpath = DEFERRED_DELEGATION_DROPDOWN)
    public WebElement deferredDropdown;

    @FindBy(xpath = NEW_BUTTON)
    public WebElement newButton;

    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy(xpath = CONFIRM_DELETE_BUTTON)
    public WebElement confirmDeleteButton;

    @FindBy(xpath = MULTI_MODIFY_BUTTON)
    public WebElement multiModifyButton;

    @FindBy(xpath = COPY_BUTTON)
    public WebElement copyButton;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetButton;



    public WebElement getToMpidDropdown(){return  toMpidDropdown;}
    public WebElement getToRoleDropdown(){return toRoleDropdown;}
    public WebElement getFlowDropdown() {return  flowDropdown;}
    public WebElement getVersionDropdown() {return  versionDropdown;}
    public WebElement getTestFlagDropdown() {return testFlagDropdown;}
    public WebElement getGatewayDropdown() {return gatewayDropdown;}
    public WebElement getHostDropdown() {return hostDropdown;}
    public WebElement getFormatDropdown() {return formatDropdown;}
    public WebElement getFromMpidBox() {return fromMpidBox;}
    public WebElement getFromRoleDropdown() {return fromRoleDropdown;}
    public WebElement getStatusDropdown() {return statusDropdown;}
    public WebElement getDeferredDropdown() {return deferredDropdown;}
    public WebElement getDeleteButton() {return deleteButton;}
    public WebElement getAnySingleEditButton() {return  anySingleEditButton;}
    public WebElement getNewButton() {
        return newButton;
    }
    public WebElement getConfirmDeleteButton(){ return confirmDeleteButton;}
    public WebElement getSearchButton(){ return searchButton;}
    public WebElement getCopyButton() {
        return copyButton;
    }
    public WebElement getMultiModifyButton() {
        return multiModifyButton;
    }
    public WebElement getResetButton() { return resetButton;}
    //TODO start working on ACMT Routes page object when front is done.


    public void findAndClickEditButtonForSingleRoute(String fromMpid,String toMpid,String gateway,String host, String testFlag){
        WebElement editButton = driver.findElement(By.xpath(" //table/tbody/tr/td[text()='"+fromMpid+"']//..//td[text()="+toMpid+"']//..//td[text()='"+gateway+"']//..//td[text()='"+host+"']//..//td[text()='"+testFlag+"']//../td/button[text()='Edit']"));
        assertTrue("Can't find  Edit button for specified values",editButton.isDisplayed());
        editButton.click();
    }

    public boolean verifyIsStarDisplayedForSingleNewRoute(String fromMpid,String toMpid,String gateway,String host, String testFlag) throws InterruptedException {
        try{
            WebElement startIcon = driver.findElement(By.xpath(" //table/tbody/tr/td[text()='"+fromMpid+"']//..//td[text()='"+toMpid+"']//..//td[text()='"+gateway+"']//..//td[text()='"+host+"']//..//td[text()='"+testFlag+"']//../td/span[@ng-if='item.extended.routeActivated']"));
            if(!verifyIsElementNotDisplayed(startIcon)) {
                return true;
            }else {
                return false;
            }
        }catch (NoSuchElementException e){
            return false;
        }

    }

    public boolean verifyIsRouteMarkedForDeletion(String fromMpid,String toMpid,String gateway,String host, String testFlag) throws InterruptedException {

        WebElement startIcon = driver.findElement(By.xpath(" //table/tbody/tr/td[text()='"+fromMpid+"']//..//td[text()='"+toMpid+"']//..//td[text()='"+gateway+"']//..//td[text()='"+host+"']//..//td[text()='"+testFlag+"']//../td/span[@ng-if='item.base.inactiveDate']"));

        if(!verifyIsElementNotDisplayed(startIcon)) {
            return true;
        }else {
            return false;
        }
    }
    public void clickEditOnGivenRout(String fromMpid,String toMpid,String gateway,String host, String testFlag) throws InterruptedException {
        WebElement editButton = driver.findElement(By.xpath("//td[text()='"+fromMpid+"']//..//td[text()='"+toMpid+"']//..//td[text()='"+gateway+"']//..//td[text()='"+host+"']//..//td[text()='"+testFlag+"']//..//button[contains(text(),'Edit')]"));
        waitForElement(editButton);
        editButton.click();
    }
    public void markCheckboxOnGivenRout(String fromMpid,String toMpid,String gateway,String host, String testFlag) throws InterruptedException {
        WebElement checkbox = driver.findElement(By.xpath("//td[text()='"+fromMpid+"']//..//td[text()='"+toMpid+"']//..//td[text()='"+gateway+"']//..//td[text()='"+host+"']//..//td[text()='"+testFlag+"']//..//td/input"));
        waitForElement(checkbox);
        checkbox.click();
    }

}
