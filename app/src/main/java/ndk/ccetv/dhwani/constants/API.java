package ndk.ccetv.dhwani.constants;

/**
 * Created by Nabeel on 24-01-2018.
 */

public class API {
    public static String select_Members = "select_Members.php";
    public static String select_Departments = "select_Departments.php";
    public static String select_Semesters = "select_Semesters.php";
    public static String insert_Member = "insert_Member.php";
    public static String insert_Transaction = "insert_Transaction.php";
    public static String select_Configuration = "select_Configuration.php";

    public static String get_Android_API(String API_Method)
    {
        return Server_Endpiont.SERVER_IP_ADDRESS+"/android/"+API_Method;
    }
}
