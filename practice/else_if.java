public class else_if {
    public static void main(String[] args) {
        // wap to print the grade of student
        int s= 84;
        if (s>=91 & s<=100){
            System.out.println("grade is A+");
        }
        else if (s>=81 & s<=90) {
            System.out.println("grade is A");
        }
        else if (s>=71 & s<=80) {
            System.out.println("grade is B+");
        }
        else if (s>=61 & s<=70) {
            System.out.println("grade is B");
        }
        else if (s>=51 & s<=60) {
            System.out.println("grade is C");
        }
        else if (s>=41 & s<=50) {
            System.out.println("grade is D");
        }
        else if (s>=31 & s<=40) {
            System.out.println("grade is E");
        }
        else {
            System.out.println("grade is F");
        }

    }
}
