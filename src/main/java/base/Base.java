package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    protected WebDriver driver;

    // Constructor in the base class
    public Base(WebDriver driver) {
        this.driver = driver;
        initializeElements();
    }

    // Common method to initialize elements using Page Factory
    private void initializeElements() {
        PageFactory.initElements(driver, this);
    }
}