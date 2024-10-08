import java.util.Scanner;
public class Scanner_class {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int x=s.nextInt();
        System.out.println("The number you entered is "+x);
        System.out.println("Enter a character");
        char c=s.next().charAt(0);
        System.out.println("The Character you entered is "+c);
        System.out.println("Enter a boolean value");
        boolean b= s.nextBoolean();
        System.out.println("The boolean value You entered is "+b);
        System.out.println("Enter a String");
        String S= s.next();
        System.out.println("The String You entered is "+S);

    }
}
