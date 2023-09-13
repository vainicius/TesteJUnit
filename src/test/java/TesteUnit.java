import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TesteUnit {

protected static WebDriver chrome;


    @BeforeClass
    public static void iniciar(){
    chrome = new ChromeDriver();
    chrome.manage().window().fullscreen();
    chrome.get("http://www.google.com");
    }

    @AfterClass
    public static void finalizar(){
        chrome.quit();
    }

}
