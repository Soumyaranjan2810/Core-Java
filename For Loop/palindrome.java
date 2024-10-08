public class palindrome {
    public static void main(String[] args) {
        int num=545;
        int temp=num;
        int rev=0;
        System.out.println("Before reverse "+ num);
        for(; num!=0;){
            int digit = num%10;
            rev=digit+ rev*10;
            num/=10;

        }
        System.out.println("After reverse "+rev);
       if(temp==rev){
        System.out.println("It is a Palindrome Number");
       }
       else{
        System.out.println("It is not a Palindrome Number");
       }
    }
}
