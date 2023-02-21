package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalPagination extends TechGlobalBasePage{

    public TechGlobalPagination(){
        super();
    }

    @FindBy(id = "main_heading")
    public WebElement mainHeading;

    @FindBy(id = "sub_heading")
    public WebElement subHeading;

    @FindBy(id = "content")
    public WebElement paragraph;

    @FindBy(id = "next")
    public WebElement nextBtn;

    @FindBy(id ="previous")
    public WebElement previousBtn;

    @FindBy(css = "div[class$=\"up2c0\"]>p")
    public List<WebElement> cityInfo;

    @FindBy(css = ".city_image")
    public WebElement cityImage;
}
