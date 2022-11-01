import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),op,x,y;
        int[][] a=new int[211][211],b=new int[211][211],c=new int[211][211];
        int[][] d=new int[211][211];
        for(int i=1;i<=n;i++){
            op=in.nextInt();
            x=in.nextInt()+102;
            y=in.nextInt()+102;
            if(op==2){
                a[x][y]=1;
                a[x+1][y]=1;
                a[x][y+1]=1;
                a[x+1][y+1]=1;
                b[x][y]=1;
            }
            else{
                if(b[x][y]==0){
                    if(a[x][y]==0){
                        a[x][y]=2;
                        c[x][y]=1;
                        d[x][y]++;
                    }
                    else if(a[x][y]==2||a[x][y]==3){
                        if(d[x][y]==2){
                            a[x][y]=1;
                        }
                        else{
                            if(c[x][y]==2||c[x][y]==3){
                                a[x][y]=3;
                            }
                            else{
                                a[x][y]=1;
                            }
                            d[x][y]++;
                        }
                    }
                    if(a[x+1][y]==0){
                        a[x+1][y]=2;
                        c[x+1][y]=2;
                        d[x+1][y]++;
                    }
                    else if(a[x+1][y]==2||a[x+1][y]==3){
                        if(d[x+1][y]==2){
                            a[x+1][y]=1;
                        }
                        else{
                            if(c[x+1][y]==1||c[x+1][y]==4){
                                a[x+1][y]=3;
                            }
                            else{
                                a[x+1][y]=1;
                            }
                            d[x+1][y]++;
                        }
                    }
                    if(a[x][y+1]==0){
                        a[x][y+1]=2;
                        c[x][y+1]=3;
                        d[x][y+1]++;
                    }
                    else if(a[x][y+1]==2||a[x][y+1]==3){
                        if(d[x][y+1]==2){
                            a[x][y+1]=1;
                        }
                        else{
                            if(c[x][y+1]==1||c[x][y+1]==4){
                                a[x][y+1]=3;
                            }
                            else{
                                a[x][y+1]=1;
                            }
                            d[x][y+1]++;
                        }

                    }
                    if(a[x+1][y+1]==0){
                        a[x+1][y+1]=2;
                        c[x+1][y+1]=4;
                        d[x+1][y+1]++;
                    }
                    else if(a[x+1][y+1]==2||a[x+1][y+1]==3){
                        if(d[x+1][y+1]==2){
                            a[x+1][y+1]=1;
                        }
                        else{
                            if(c[x+1][y+1]==2||c[x+1][y+1]==3){
                                a[x+1][y+1]=3;
                            }
                            else{
                                a[x+1][y+1]=1;
                            }
                            d[x+1][y+1]++;
                        }
                    }
                    b[x][y]=1;
                }
            }
        }
        double ans=0;
        for(int i=1;i<=210;i++){
            for(int j=1;j<=210;j++){
                if(a[i][j]==1){
                    ans+=1;
                }
                if(a[i][j]==2){
                    ans+=Math.PI/4;
                }
                if(a[i][j]==3){
                    ans+=Math.PI/6+Math.sqrt(3)/4;
                }
            }
        }
        System.out.printf("%.5f",ans);
    }
}
