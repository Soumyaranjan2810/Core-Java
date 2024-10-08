public class loop4 {
    public static void main(String[] args) 
    {
        int sum=0;
        // wap to print even number from range 1 to 20 and sum of all even  numbers
        for(int i=0;i<=20;i++)
        {

            if (i%2==0)
            {
                System.out.println(i);
                sum= sum +i;

            }

            
        }
        System.out.println("sum = "+ sum);
    }
}
