public class tech_num {
    // static int num= 1312;
    public static void main(String[] args) {
        // wap to chek wheather a number is tech number or not
         int num= 2025;
         int div = num/100;
        System.out.println(num);
        int rem = num%100;
        int add= div + rem;
        int mul=  add * add;
        if(mul == num){
            System.out.println(num+" is a tech number");
        }
        else {
            System.out.println(num+" is not a tech number");
        }
    }
}
