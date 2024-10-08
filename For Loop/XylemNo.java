public class XylemNo {
    public static void main(String [] args){
        // check the num is xylem number or phoelem number
        int num= 102;
        int last_digit= num %10;
        num = num /10;
        int msum=0, esum = 0;
            for(;num>=10;){
                int mdigit= num % 10;
                msum= msum + mdigit;
                num/=10;
        }
        int first_digit = num;
        esum= first_digit + last_digit;
        if(msum==esum){
            System.out.println("This is a Xylem Number");
        }
        else {
            System.out.println("This is  a pholem Number");
        }

    }
}