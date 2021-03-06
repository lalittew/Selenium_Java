package functionFile;

import browserFactory.DriverBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePageFunction extends DriverBaseClass {

    @FindBy(how = How.LINK_TEXT, using = "Account")
    public WebElement accountOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]/div[3]/div/div[1]/div[1]/p")
    public WebElement welcomeText;
}
