public class Main {
    public static void main(String[] args)  throws InterruptedException {


            try {
                    elementcallingclass stored_elements = new elementcallingclass();
                    Thread.sleep(5000);
                    stored_elements.GetPostcode();
                    Thread.sleep(5000);
                    stored_elements.Unitsection();
                    Thread.sleep(10000);
                    stored_elements.Monthsection();
                    Thread.sleep(5000);
                    stored_elements.Addressanddetailsection();
                    Thread.sleep(5000);
                    stored_elements.Datetimeseciton();
                    Thread.sleep(5000);
                    stored_elements.Packingassistanceandmoverssection();
                    Thread.sleep(5000);
                    stored_elements.Continuetoreservation();
                    Thread.sleep(25000);
//            stored_elements.closedriver();
                    System.out.println("Successfully run");
            }catch (Throwable e) {
                    System.out.println(e.getMessage());
            }
//            stored_elements.GetPostcode();
//            Thread.sleep(1000);
//            stored_elements.Step1flow();
//            Thread.sleep(1000);
////        stored_elements.selectunit();
////        Thread.sleep(1000);
////        stored_elements.step1click();
////        Thread.sleep(1000);
//            stored_elements.pickup_address();
////        Thread.sleep(1000);
////        stored_elements.addressline1();
////        Thread.sleep(1500);
////        stored_elements.addressline2();
//            Thread.sleep(1000);
//            stored_elements.monthdropdow();
////        stored_elements.selectmonth();
//            Thread.sleep(1000);
//            stored_elements.datetimeselection();
//            Thread.sleep(1500);
//            stored_elements.packingassistancecheck();
//            Thread.sleep(2000);
//            stored_elements.discountCode();
//            Thread.sleep(2000);
//            stored_elements.step2click();
//            Thread.sleep(3000);
//            stored_elements.packingmaterals_materials_and_bundle();
//            Thread.sleep(3000);
//            stored_elements.userdetails();
//            Thread.sleep(30000);
//            stored_elements.logoutMethod();
//            Thread.sleep(30000);
//            stored_elements.closedriver();
//            System.out.println("Successfully Run Done");
//        } catch (Throwable e) {
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//            e.getStackTrace();
//            System.out.println("Add new branch2");




    }
}