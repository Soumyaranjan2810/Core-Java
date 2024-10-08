public class decrement_op {
    public static void main(String[] args) {
        int x= 123;
        int y= 124;
        int a= x++ - --x + y++ - --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        
        char x1= 'd';
        char x2= --x1;
        System.out.println(x2);
        // int x3= 2;
        // int y3 = ++(++x3);
        // System.out.println(x3);
        // System.out.println(y3);

    }
}
