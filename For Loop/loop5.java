public class loop5 {
    public static void main(String[] args) {
        int num=546;
        int rev=0;
        int sum=0;
        System.out.println("Before reverse "+ num);
        for(; num!=0;){
            int digit = num%10;
            rev=digit+ rev*10;
            num/=10;
            sum =sum+ digit;

        }
        System.out.println("After reverse "+rev);
        System.out.println("sum= "+sum);
       
    }
}