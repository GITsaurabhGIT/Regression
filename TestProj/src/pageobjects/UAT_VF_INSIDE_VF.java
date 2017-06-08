package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ VF_ INSIDE_ VF"                                
               , summary=""
               , page="UAT_VF_INSIDE_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="Summer17"
     )             
public class UAT_VF_INSIDE_VF {

	@PageWaitAfter.Timed(durationSeconds = 5)
	@PageWait.Timed(durationSeconds = 10)
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	@LinkType()
	@FindBy(linkText = "6/8/2017")
	public WebElement testDate;
	
}
