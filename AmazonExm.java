public class AmazonExm {
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class AmazonExm {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            //Navigate to amozon.com
            driver.get("https://www.amazon.com/");
            Thread.sleep(2000);
            //Find searchBox element and we send iPhone text to searchBox
            WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone");
            Thread.sleep(2000);
            //We click on search btn
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);
            //We print the title of the new page
            System.out.println(driver.getTitle());
            //finding the searchBox again
            driver.findElement(By.id("twotabsearchtextbox")).clear();
            //Typing Samsung in search box
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
            //We click on search btn
            driver.findElement(By.id("nav-search-submit-button")).click();
            //We print the title of the new page
            System.out.println(driver.getTitle());
            //We close the browser
            driver.quit();
        }}














}
