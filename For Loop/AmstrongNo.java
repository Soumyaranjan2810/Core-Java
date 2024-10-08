import java.util.Scanner;
class AmstrongNo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();//153
        int temp=num;
        int digit=0;
        int sum=0;
        for(;num!=0;){
            digit= num % 10;
            sum= sum + digit * digit * digit;
            num /=10;
        }
        if(sum==temp){
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}               