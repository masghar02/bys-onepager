import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class elementcallingclass extends enviornmentSetup{

    enviornmentSetup envsetup;
    elementcallingclass ec;

    public void GetPostcode() throws InterruptedException {

        envsetup = new enviornmentSetup();
        envsetup.storedEnvironment();
        Thread.sleep(5);
        JavascriptExecutor js = (JavascriptExecutor) envsetup.wd;
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(2);
        envsetup.wd.findElement(By.id(envsetup.Postcode)).sendKeys("BN9 0AA");
        envsetup.wd.findElement(By.id(envsetup.get_a_Quote)).click();
//        envsetup.wd.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
    }
    public  void Unitsection() throws InterruptedException{
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) envsetup.wd;
        js.executeScript("window.scrollBy(0,450)");
        //25 Sq.ft
        envsetup.wd.findElement(By.xpath
                ("//body/section[@id='section1']/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]")).click();
        Thread.sleep(3000);
        // 75Sq.ft
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section1']/div[1]/div[1]/div[3]/div[2]/div[2]")).click();
//        Thread.sleep(2000);
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section1']/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[1]")).click();
        envsetup.wd.findElement(By.id("step1-cta-next")).click();
        Thread.sleep(3000);
    }
    public  void Monthsection () throws InterruptedException{
        //Month to Month promotion

//        envsetup.wd.findElement(By.xpath("//body/section[@id='section2']/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(3000);
        //6 months promotion
        envsetup.wd.findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[1]/ul[1]/li[3]")).click();
//        Thread.sleep(1000);
        envsetup.wd.findElement(By.xpath("//button[@id='step2-cta-next']")).click();
        Thread.sleep(3000);
    }
    //    public void selectunit(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/div[1]/div[1]/div[1]/div[3]/div[1]/li[1]")).click();
//        envsetup.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//    public  void step1click(){
//        envsetup.wd.findElement(By.id("v-35-step1-cta-next")).click();
//    }
    public  void Addressanddetailsection() throws InterruptedException{
        Thread.sleep(3000);
        envsetup.wd.findElement(By.id("address")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.xpath("//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.xpath("//body[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("fname")).sendKeys("Asghar");
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("lname")).sendKeys("25Sqa");
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("email")).sendKeys(envsetup.Randomemail());
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("phone")).sendKeys("7410147852");
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("step3-cta-next")).click();
        Thread.sleep(2000);
        //brighton address
    }
    //    public  void addressline1(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
//
//    }
//    public void addressline2(){
//        envsetup.wd.findElement(By.xpath("//body[1]/main[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
//
//    }

    //    public void selectmonth(){
//        envsetup.wd.findElement(By.xpath("//li[@id='73']")).click();
//        envsetup.wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    }
    public void Datetimeseciton() throws InterruptedException{
        envsetup.wd.findElement(By.xpath("//tbody/tr[4]/td[2]")).click();
        Thread.sleep(5000);
        envsetup.wd.findElement(By.xpath("//body[1]/section[4]/div[2]/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(2000);
        envsetup.wd.findElement(By.id("move-assistance-mover")).click();
        Thread.sleep(2000);
    }
//    public void packingassistancecheck() throws InterruptedException{
//        envsetup.wd.findElement(By.xpath("//body/main[1]/div[1]/div[3]/div[1]/form[1]/div[6]/div[2]/label[1]/span[1]")).click();
//        Thread.sleep(2000);
//    }
//    public void discountCode(){
//        envsetup.wd.findElement(By.id("coupon-code")).sendKeys("scape");
//    }
//    public void step2click(){
//        envsetup.wd.findElement(By.id("v-35-step2-cta-next")).click();
//    }


//    public void packingmaterals_materials_and_bundle() throws InterruptedException{
//        envsetup.wd.findElement(By.id("addBundleCartBtn_38")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.xpath("//body/main[@id='st-container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.id("plus_18")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.id("addCartBtn_18")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.id("submitCart")).click();
//
//    }
//    public void userdetails() throws InterruptedException{
//        envsetup.wd.findElement(By.id(envsetup.userNameid)).sendKeys(userName);
////        String emailexist = envsetup.wd.findElement(By.xpath(envsetup.emailexist)).isDisplayed();
//        envsetup.wd.findElement(By.id(envsetup.userEmailid)).sendKeys(email);
//        envsetup.wd.findElement(By.id(envsetup.userphoneNumberid)).sendKeys(phoneNumber);
//        envsetup.wd.findElement(By.id("v-35-step3-cta-next")).click();
//        Thread.sleep(3000);
//        WebElement element = envsetup.wd.findElement(By.xpath(envsetup.emailexist));
//        if(element.isDisplayed()==true){
//            envsetup.wd.findElement(By.id(envsetup.userEmailid)).clear();
//            System.out.println("Email Already exist");
////            Select select = new Select(element);
//
//            envsetup.wd.close();
//            envsetup.wd.quit();
//        }
//        else {
//            envsetup.wd.findElement(By.id(envsetup.userEmailid)).clear();
//            envsetup.wd.findElement(By.id(envsetup.userEmailid)).sendKeys(newemail);
//            envsetup.wd.findElement(By.id("v-35-step3-cta-next")).click();
//        }
//
////        envsetup.wd.findElement(By.id(envsetup.userphoneNumberid)).sendKeys(phoneNumber);
////        envsetup.wd.findElement(By.id("v-35-step3-cta-next")).click();
//    }

//    public void logoutMethod() throws InterruptedException{
//        Actions action = new Actions(envsetup.wd);
//        String profile = String.valueOf(envsetup.wd.findElement(By.xpath(envsetup.profileHover)));
//        action.moveToElement(envsetup.wd.findElement(By.xpath(envsetup.profileHover))).perform();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.xpath(envsetup.logout)).click();
//
//    }
    public void Packingassistanceandmoverssection() throws  InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) envsetup.wd;
        js.executeScript("window.scrollBy(0,250)");
        //30P pakcing assistance and one man pickup
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section6']/div[1]/ul[1]/li[1]")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section7']/div[1]/ul[1]/li[1]")).click();
//        Thread.sleep(3000);
        //30p packing assistance and two-man pickup
        envsetup.wd.findElement(By.xpath("//body/section[@id='section6']/div[1]/ul[1]/li[1]")).click();
        Thread.sleep(3000);
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section7']/div[1]/ul[1]/li[2]")).click();
//        Thread.sleep(3000);
//        // free packing assistance and one man pickup
//        envsetup.wd.findElement(By.xpath("//body[1]/section[6]/div[1]/ul[1]/li[2]")).click();
//        Thread.sleep(5000);
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section7']/div[1]/ul[1]/li[1]")).click();
//        Thread.sleep(5000);
//        //free packing assistance and two man pickup
//        envsetup.wd.findElement(By.xpath("//body[1]/section[6]/div[1]/ul[1]/li[2]")).click();
//        Thread.sleep(3000);
//        envsetup.wd.findElement(By.xpath("//body/section[@id='section7']/div[1]/ul[1]/li[2]")).click();
//        Thread.sleep(3000);
    }

    public  void  Continuetoreservation(){

        envsetup.wd.findElement(By.id("continueReservation")).click();
    }

    public void closedriver(){
            envsetup.wd.close();
            envsetup.wd.quit();

    }
}
