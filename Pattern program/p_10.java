public class p_10 {
    public static void main(String[] args) {
        int n=4,m= 9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m/2;j++){
                if(i+j <= m/2+1){
                    System.out.print("  ");
                }
            }
            for(int j=1; j<=m/2+1;j++){
                if(i+j==m/2+1|| i+j>=6){
                    System.out.print("* ");
                }
            }
            for(int j=m/2+1;j<=m;j++){
                    if(i<j){
                        System.out.print("* ");
                    }
            }
            for(int j=m/2+1;j<=m;j++){
                if(i<j){
                    System.out.print(" ");
                }
        }
            
            System.out.println();
        }
    }
}