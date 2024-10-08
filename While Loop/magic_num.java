public class magic_num {
    public static void main(String[] args) {
        int num=55;
        int temp=num;
        int sum=0;
        while(num>0 ||sum >9){
            int rem=0;
            if(num==0){
                num=sum;
                sum=0;
            }
            rem=num%10;
            sum=sum+rem;
            num/=10;
            
        }
        System.out.println(sum);
        if(sum==1){
            System.out.println(temp+" is magic number");
        }
        else{
            System.out.println(temp+" is not magic number");
        }
        
    }
}