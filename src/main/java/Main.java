import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //Napisati program koji na sajtu:
        //http://automationpractice.com
        //dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a, izbacuje jedan proizvod, a drugom povecava kolicinu za 1.
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        webDriver.get("http://automationpractice.com");
        WebElement product1 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(product1).perform();
        WebElement addToCart = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        addToCart.click();
        WebElement close = webDriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        close.click();

        WebElement product2 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]"));
        Actions actions2 = new Actions(webDriver);
        actions2.moveToElement(product2).perform();
        WebElement addToCart2 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]"));
        addToCart2.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        close.click();

        WebElement product4 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]"));
        Actions actions4 = new Actions(webDriver);
        actions4.moveToElement(product4).perform();
        WebElement addToCart4 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]"));
        addToCart4.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        close.click();


        WebElement product3 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]"));
        Actions actions3 = new Actions(webDriver);
        actions3.moveToElement(product3).perform();
        WebElement addToCart3 = webDriver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]"));
        addToCart3.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement cart = webDriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        cart.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement delete = webDriver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[7]"));
        delete.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement add = webDriver.findElement(By.xpath("//*[@id=\"cart_quantity_up_4_16_0_0\"]"));
        add.click();
    }


}
