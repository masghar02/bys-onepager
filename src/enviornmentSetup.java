import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class enviornmentSetup extends chromedriver {
    WebDriver wd;
    String popupskip = "skip";
    String postCode = "postcode";
    String get_a_Quote = "get-storage-price-v-35";
    String userNameid ="name";
    String userEmailid="email";
    String userphoneNumberid="customerPhone";
    String userName = "Asghar Test1";
    String email= "asgharqatest2@bystored.com";
    String phoneNumber = "7410852963";

    String emailexist = "//div[@id='popup-link']";
    String newemail ="asgharauto4@bys.uk";

    String profileHover = "//body/div[4]/ul[1]/li[4]";
    String logout = "//body/div[4]/ul[1]/li[4]/div[2]/a[2]";
    public void storedEnvironment(){
        chromedriver cs = new chromedriver();
        cs.chromsetup();
        wd = new ChromeDriver();
        wd.get("https://bystored:bystored2020@dev.bystored.com");
        wd.manage().window().maximize();

    }
//    public void closedriver(){
//        wd.close();
//        wd.quit();
//
//    }
}
