import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class App {
 
    public static void main(String args[]) {

        System.out.println("Please input your password: ");
        
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        //String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()-=+_]).{8,16}$";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$";

        boolean validPassword = isValidPassword(password, regex);
        System.out.println("It's valid password: \n" + validPassword);

    }
 
    public static boolean isValidPassword(String password, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}