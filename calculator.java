import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("This is a Calculator program");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Operand");
        int a=s.nextInt();
        System.out.println("a= "+a);
        System.out.println("Enter Second Operand");
        int b= s.nextInt();
        System.out.println("b= "+b);
        System.out.println("Enter Symbol that you want to calculate");
        char x=s.next().charAt(0);
        switch (x) {
            case '+':
                System.out.println("a+b= "+(a+b));
                break;
            case '-':
                System.out.println("a-b= "+(a-b));
                break;
                case '*':
                System.out.println("a*b= "+(a*b));
                break;
            case '/':
                System.out.println("a/b= "+(a/b));
                break;
                case '%':
                System.out.println("a%b= "+(a%b));
                break;
            default:
                System.out.println("invalid operator");
                break;
        }

    }
}
