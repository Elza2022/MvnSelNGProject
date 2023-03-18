public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Navigate to Guru99
        driver.get("https://www.guru99.com/selenium-tutorial.html");
        Thread.sleep(2000);

        //In email text box type your email
        driver.findElement(By.id("awf_field-111232675")).sendKeys("val@email.com");
        Thread.sleep(2000);

        //Click submit btn (We are using By.className (class attr) in order to find submit btn)
        driver.findElement(By.className("submit")).click();

        //Create an object of WebElement class and assign the value
        WebElement submitBtn = driver.findElement(By.className("submit"));

        //use object for clicking
        submitBtn.click();

        Thread.sleep(2000);

        System.out.println(driver.getTitle());

        driver.quit();




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
        }

}
