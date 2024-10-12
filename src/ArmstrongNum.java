public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int rem, originalNum=num, sum = 0;
        while (num != 0){
            rem  = num%10;
            sum += Math.pow(rem, 3);
            num /=10;
        }
        if (originalNum == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}
