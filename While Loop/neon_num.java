public class neon_num {
    public static void main(String[] args) {
        int num=9;
        int temp =num;
        num=num *num;
        int sum=0;
        while(num!=0){
            sum= sum+ num%10;
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("it is neon number");
        }
        else{
            System.out.println("it is not a neon number");
        }

    }
}
