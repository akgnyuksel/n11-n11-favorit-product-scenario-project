package n11project.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);

        //List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all products <options> as a string
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;

    }
}
