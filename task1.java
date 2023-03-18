public class task1 {
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Facebook {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/");

            WebElement eposta = driver.findElement(By.xpath("//input[@id='email']"));

            eposta.sendKeys("test@gmail.com");

            WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

            password.sendKeys("Test");

            driver.findElement(By.xpath("//button[@name= 'login']")).click();

            // hata uyarisini kontrol et

            WebElement resultText = driver.findElement(By.xpath("//div[@class = '_9ay7'"));

            String expectedResultText = "The password you've entered is incorrect. Forgot Password?";
            String actualResultText = resultText.getText();

            if (expectedResultText.equals(actualResultText)){

                System.out.println("Passed");

            }
            else {
                System.out.println("Failed");
            }


            driver.close();
        }
    }








}
