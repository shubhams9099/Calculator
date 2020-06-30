import java.util.regex.*;
public class StringCalculator {
    public int Add(String numbers){
        int sum=0;
        if(numbers.length() ==0)
            return sum;
        Pattern pattern =Pattern.compile("(\\d)*[^\n,](\\d)*");
        Matcher matcher=pattern.matcher(numbers);
        while(matcher.find()){
            sum+= Integer.parseInt(matcher.group());
        }
        return sum;
    }
}
