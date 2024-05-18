public class Palindrome {
    public static void main(String[] args) {
        int num = 345343;
        int temp, sum =0, rem;
        temp = num;
        while (num>0){
            rem = num%10;
            sum = (sum*10)+rem;
            num /= 10;
        }
        if (temp == sum){
            System.out.println("Num is Palindrome");
        } else System.out.println("Num is not Palindrome");
    }
}
