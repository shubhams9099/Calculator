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
        int flag=0;
        String msg="Negative numbers found ";
        for (int i = 0; i < nums.length; i++) {
            int temp=Integer.parseInt(nums[i]);
            if(temp <0){
                flag =1;
                msg+=temp+ " ";
            }else
                sum+=Integer.parseInt(nums[i]);
        }
        if(flag == 1)
            throw new ArithmeticException(msg);
        return sum;
    }
}
