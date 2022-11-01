import java.util.Scanner;
import java.util.Arrays;

public class P1 {
    public static void add(int[][] a,int[][] b,int[][] c){
        for(int i=1;i<=a.length-1;i++){
            for(int j=1;j<=a.length-1;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    public static void sub(int[][] a,int[][] b,int[][] c){
        for(int i=1;i<=a.length-1;i++){
            for(int j=1;j<=a.length-1;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
    }
    public static void rot(int[][] a){
        int[][] c=new int[a.length][a.length];
        for(int i=1;i<=a.length-1;i++){
            for(int j=1;j<=a.length-1;j++){
                c[i][j]=a[j][i];
            }
        }
        for(int i=1;i<a.length;i++){
            a[i]=Arrays.copyOf(c[i],c[i].length);
        }
    }
    public static void mul(int[][] a,int[][] b,int[][] c){
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                for(int k=1;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][][] a=new int[5][51][51],b=new int[5][51][51],c=new int[5][51][51];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2&&j<=n/2){
                    a[1][i][j]=in.nextInt();
                }
                if(i<=n/2&&j>n/2){
                    a[2][i][j-n/2]=in.nextInt();
                }
                if(i>n/2&&j<=n/2){
                    a[3][i-n/2][j]=in.nextInt();
                }
                if(i>n/2&&j>n/2){
                    a[4][i-n/2][j-n/2]=in.nextInt();
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2&&j<=n/2){
                    b[1][i][j]=in.nextInt();
                }
                if(i<=n/2&&j>n/2){
                    b[2][i][j-n/2]=in.nextInt();
                }
                if(i>n/2&&j<=n/2){
                    b[3][i-n/2][j]=in.nextInt();
                }
                if(i>n/2&&j>n/2){
                    b[4][i-n/2][j-n/2]=in.nextInt();
                }
            }
        }
        for(int i=1;i<=4;i++){
            if(i==1){
                add(a[1],b[1],c[1]);
            }
            if(i==2){
                rot(b[2]);
                mul(a[2],b[2],c[2]);
            }
            if(i==3){
                rot(a[3]);
                mul(b[3],a[3],c[3]);
            }
            if(i==4){
                sub(a[4],b[4],c[4]);
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2&&j<=n/2){
                    System.out.printf("%d ",c[1][i][j]);
                }
                if(i<=n/2&&j>n/2){
                    System.out.printf("%d ",c[2][i][j-n/2]);
                }
                if(i>n/2&&j<=n/2){
                    System.out.printf("%d ",c[3][i-n/2][j]);
                }
                if(i>n/2&&j>n/2){
                    System.out.printf("%d ",c[4][i-n/2][j-n/2]);
                }
            }
            System.out.println();
        }
    }
}
