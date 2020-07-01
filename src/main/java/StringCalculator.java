import java.util.ArrayList;
import java.util.regex.*;
public class StringCalculator {
    protected static int count=0;
    public StringCalculator() {
        int count=0;
    }

    public int Add(String numbers){
        count+=1;
        int sum=0;
        if(numbers.length() ==0)
            return sum;
        ArrayList<String> delimeters=new ArrayList<>();
        Pattern pattern=Pattern.compile("\\[(.*?)\\]");
        Matcher matcher=pattern.matcher(numbers);
        while(matcher.find()){
            String match=matcher.group();
            delimeters.add(match.substring(1,match.length()-1));
        }

        String remString=numbers.substring(numbers.indexOf('n')+1);
        String p="(\\d)*[^";
        for (int i = 0; i < delimeters.size(); i++) {
            p+=("("+delimeters.get(i)+")");
        }
        p+="](\\d)*";
        Pattern pattern2 =Pattern.compile(p);
        Matcher matcher2 =pattern2.matcher(remString);
        int flag=0;
        String msg="Negative numbers found ";
        while(matcher2.find()){
            String match=matcher2.group();
            int temp=Integer.parseInt(match);
            if(temp <0){
                flag =1;
                msg+=temp+ " ";
            }else{
                if(temp >1000)
                    temp=0;
                sum+=temp;
            }
        }
        if(flag == 1)
            throw new ArithmeticException(msg);
        return sum;
    }
    public int GetCalledCount(){
        return count;
    }
}
