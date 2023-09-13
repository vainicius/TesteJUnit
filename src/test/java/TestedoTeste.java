import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestedoTeste extends TesteUnit {

    @Test
    public void TesteWeb(){
        chrome.findElement(By.name("q")).sendKeys("como renomear usuario do windows me ajuda" + Keys.ENTER);
        String dado = chrome.findElement(By.id("result-stats")).getText();
        Assert.assertTrue(dado.contains("Aproximadamente"));

    }




}
