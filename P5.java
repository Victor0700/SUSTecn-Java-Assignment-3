import java.util.Scanner;

public class P5 {
    public static boolean check1(int[][] a, int i,int j){
        int x1=i,x2=i;
        while(a[x1-1][j]!=0){
            x1--;
        }
        while(a[x2+1][j]!=0){
            x2++;
        }
        return x2-x1>=4;
    }
    public static boolean check2(int[][] a, int i,int j){
        int y1=j,y2=j;
        while(a[i][y1-1]!=0){
            y1--;
        }
        while(a[i][y2+1]!=0){
            y2++;
        }
        return y2-y1>=4;
    }
    public static boolean check3(int[][] a, int i,int j){
        int x1=i,x2=i,y1=j,y2=j;
        while(a[x1-1][y1-1]!=0){
            x1--;
            y1--;
        }
        while(a[x2+1][y2+1]!=0){
            x2++;
            y2++;
        }
        return x2-x1>=4;
    }
    public static boolean check4(int[][] a, int i,int j){
        int x1=i,x2=i,y1=j,y2=j;
        while(a[x1-1][y1+1]!=0){
            x1--;
            y1++;
        }
        while(a[x2+1][y2-1]!=0){
            x2++;
            y2--;
        }
        return x2-x1>=4;
    }
    public static boolean check(int[][] a, int i,int j){
        return check1(a,i,j)||check2(a,i,j)||check3(a,i,j)||check4(a,i,j);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[101][101];
        for(int i=6;i<=n+5;i++){
            for(int j=6;j<=n+5;j++){
                a[i][j]=in.nextInt();
            }
        }
        int t=0;
        for(int i=6;i<=n+5;i++){
            for(int j=6;j<=n+5;j++){
                if(a[i][j]==0&&check(a,i,j)){
                    System.out.printf("%d %d\n",i-5,j-5);
                    t=1;
                }
            }
        }
        if(t==0){
            System.out.println(-1);
        }
    }
}
