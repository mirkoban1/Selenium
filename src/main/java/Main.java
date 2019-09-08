import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\ChromeDriver75.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.booking.com");

        System.out.println(driver.getCurrentUrl());
        WebElement element = driver.findElement(By.className("sb-destination__input"));

        // jeśli w terminalu po git commit nic sie nie pojawi, to wpisuje nazwe commit i naciskam ":" w(save) q(exit)
        // new comment
    }
}
