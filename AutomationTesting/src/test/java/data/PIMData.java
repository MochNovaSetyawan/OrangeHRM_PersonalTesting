package data;

import java.util.Random;

public class PIMData {
    static Random random = new Random();
    static int randomNumber = random.nextInt(1000);

//===================================================================================================================================================================================================================================//

    //ADD EMPLOYEE
    public static String TRUE_PERSONALDETAILS_FIRSTNAME = "Ken";
    public static String TRUE_PERSONALDETAILS_MIDDLE = "heldser";
    public static String TRUE_PERSONALDETAILS_LAST = "fox";
    public static String TRUE_PERSONALDETAILS_EMPLOYEEID = "12" + randomNumber;

    //JOB DETAILS
    public static String TRUE_JOBDETAILS_JOINEDDATE = "2023-11-12";
}
