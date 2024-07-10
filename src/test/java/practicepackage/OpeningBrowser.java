package practicepackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        //driver.get("https://facebook.com");
        driver.get("https://amazon.com");
       // driver.get("https://twitter.com");
        driver.manage().window().maximize();
       // driver.quit();
    }
}
