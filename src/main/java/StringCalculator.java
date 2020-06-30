import java.util.regex.*;
public class StringCalculator {
    public int Add(String numbers){
        int sum=0;
        if(numbers.length() ==0)
            return sum;
        String delimeter="";
        if(numbers.startsWith("//")){
            delimeter=numbers.substring(2,3);
        }
        String restString=numbers.substring(4);
        String nums[]=restString.split(delimeter);
        for (int i = 0; i < nums.length; i++) {
            sum+=Integer.parseInt(nums[i]);
        }
        return sum;
    }
}
