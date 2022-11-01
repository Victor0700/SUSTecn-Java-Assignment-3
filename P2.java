import java.util.Scanner;

public class P2 {
    public static int check(int[][] a,int x,int y){
        int cnt=0;
        if(a[x-1][y]==1){
            cnt++;
        }
        if(a[x+1][y]==1){
            cnt++;
        }
        if(a[x][y+1]==1){
            cnt++;
        }
        if(a[x][y-1]==1){
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[1001][1001];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i][j]==1){
                    int cnt=check(a,i,j);
                    ans+=4-cnt;
                }
            }
        }
        System.out.println(ans);
    }
}
