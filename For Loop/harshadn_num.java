public class harshadn_num {
    public static void main(String[] args) {
        int num=53;
        int temp= num;
        int count=0;
        for(;num>0;){
            int digit= num%10;
            count+=1;
            num= num/ 10;
        }
        System.out.println(temp);
        if(temp%count==0){
            System.out.println("it is a harshad number");
           
        }
        else {
            System.out.println("it is not");
        }
    }
}
