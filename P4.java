import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt(),n=in.nextInt(),t;
        int x=0,y=1,cnt=1;
        int[][] a=new int[51][51],b=new int[51][51];
        for(int p=1;p<=m;p++){
            for(int q=1;q<=n;q++){
                if(cnt%4==1&&(x+1>m||b[x+1][y]==1)) {
                    cnt++;
                }
                else if(cnt%4==2&&(y+1>n||b[x][y+1]==1)){
                    cnt++;
                }
                else if(cnt%4==3&&(x-1<1||b[x-1][y]==1)){
                    cnt++;
                }
                else if(cnt%4==0&&(y-1<1||b[x][y-1]==1)){
                    cnt++;
                }
                if(cnt%4==1){
                    x++;
                }
                if(cnt%4==2){
                    y++;
                }
                if(cnt%4==3){
                    x--;
                }
                if(cnt%4==0){
                    y--;
                }
                t=in.nextInt();
                a[x][y]=t;
                b[x][y]=1;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
    }
}