public class strong_num {
    public static void main(String[] args) {
        int num=145;
        int temp1=num;
        int digit=0;
        int temp=0;
        for(;num>0;){
            digit=num%10;
            int sum=0;
            int fact =1;
            for(int i=1;i<=digit;i++){ 
                fact= fact *i; 
            }
            sum =sum +fact;
            temp= temp +sum;
            num/=10;
        }
        System.out.println(temp);
        if(temp==temp1){
            System.out.println("it is a strong number");
        }
        else{
            System.out.println("it is not a strong number");
        }
       
       

    }
}
