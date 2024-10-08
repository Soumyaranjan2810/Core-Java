class demo{
    int x= 10;
    static int y=20;
    public static void main(String[] args) {
        demo d= new demo();
        System.out.println(d.x);
        System.out.println(y);
        for (int i=1;i<5;i++){
            System.out.println(d.x);
        }

    }
}