public class StringCalculator {
    public int Add(String numbers){
        int sum=0;
        if(numbers.length() ==0)
            return sum;
        String nums[]=numbers.split(",");
        for (int i = 0; i < nums.length; i++) {
            sum+=Integer.parseInt(nums[i]);
        }
        return sum;
    }
}
