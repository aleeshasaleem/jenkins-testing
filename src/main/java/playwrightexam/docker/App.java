package playwrightexam.docker;
import com.microsoft.playwright.Browser; 
import com.microsoft.playwright.BrowserType; 
import com.microsoft.playwright.Page; 
import com.microsoft.playwright.Playwright;
public class App { 
public static void main(String[] args) {       

        Playwright playwright = Playwright.create(); 

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true)); 

        Page page = browser.newPage(); 

        page.navigate("https://saucedemo.com"); 

        System.out.println("Page Title: " + page.title()); 

        page.locator("#user-name").fill("standard_user"); 

        // Enter Password 

        page.locator("#password").fill("secret_sauce"); 

        // Click Login Button 

        page.locator("#login-button").click(); 
        // Close browser 

       // browser.close(); 

        //playwright.close(); 
    } 
}