public class prime_range {
    public static void main(String[] args) {
        int a= 1;
        int b=20;
        while (a<b) {
            int i=0;
            int count=0;
            while (i<=a) {
                if(a%i==0){
                count++;
                }
                i++;  
            }
            if(count==2){
                System.out.println(a + " is prime");
            }
            a++;
        }
    }
}