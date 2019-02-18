import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class SimpleGoogleTest {
    WebDriver drv;

    @Before
    public void googleTest_setup(){

    }

    @Test
    public void googleTest() {
        drv = new ChromeDriver(); //Driver init
        drv.get("https://www.seleniumhq.org/");
        drv.quit();
    }
    @Test
    public void ieTest() {
        drv = new InternetExplorerDriver();
        drv.get("https://www.seleniumhq.org/");
        drv.quit();
    }
    @Test
    public void firefoxTest() {
        drv = new FirefoxDriver();
        drv.get("https://www.seleniumhq.org/");
        drv.quit();
    }
    @Test
    public void edgeTest(){
        drv = new EdgeDriver();
        drv.get("https://www.seleniumhq.org/");
    }



    @After
    public void googleTest_cleanup(){
        drv.quit();
    }

}
