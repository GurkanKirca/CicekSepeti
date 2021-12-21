import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class ÇiçekSepeti {
    public static void main(String[] args) throws InterruptedException {

//SİZİN CHROME DRIVER NERDEYSE ORAYI SEÇMELİSİNİZ

        System.setProperty("webdriver.chrome.driver", "C:\\IdeaProjects\\GurkanOtomasyon\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to a website"
        driver.get("https://www.mizu.com/login");

        //Mazimize current window & Deleting Cookies
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement signInKontrol = driver.findElement(new By.ByCssSelector("h2[class='login__heading']"));
        String signIntext = signInKontrol.getText();
        String expectedsignInkontroltext = "Sign In";

        Assert.assertEquals(signIntext, expectedsignInkontroltext);
        {
            System.out.println("Sign In Sayfası");

        }

        WebElement eMail = driver.findElement(new By.ByCssSelector("input[class='form-control js-placeholder']"));
        eMail.click();
        Thread.sleep(1500);
        eMail.sendKeys("xxxx@hotmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.click();
        password.sendKeys("XXXX");

        WebElement giris = driver.findElement(By.xpath("//*[@id=\"userLogin\"]/div[6]/button"));
        giris.click();
        Thread.sleep(4500);


    }
}
