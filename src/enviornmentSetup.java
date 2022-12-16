import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import org.openqa.selenium.interactions.Action;

public class enviornmentSetup extends chromedriver {
    WebDriver wd;
    String popupskip = "skip";
    String Postcode = "postcode";
    String get_a_Quote = "get-storage-price-v-35";
    String userNameid ="name";
    String userEmailid="email";
    String userphoneNumberid="customerPhone";
    String userName = "Asghar Test1";

    String email= "asgharwfh@gmail.com";
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


    public String Randomemail(){
        String alphabet = "asgharwfh01";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 9;
        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());
            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }
        String randomString = sb.toString().toLowerCase();
        return randomString+"@gmail.com";
//        System.out.println("Random String is: " + randomString);
    }

    public String Randonumber(){
        String alphabet = "7410852123";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 9;
        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());
            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
//        System.out.println("Random String is: " + randomString);
    }
//    public void closedriver(){
//        wd.close();
//        wd.quit();
//
//    }
}
