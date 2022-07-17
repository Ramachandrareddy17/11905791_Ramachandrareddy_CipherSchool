import java.util.Scanner;

public class Triology {
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1,2,3}, {2,5,0}, {1,1,4}, {3,4,0}, {2,6,0}, {3,1,0}};

        int[] X = new int[A];
        int[] Y = new int[A];

        for(int i=0;i<B.length;i++){
            if(B[i][0]==1){
                //code1
                for (int j=B[i][1]-1;j<B[i][2];j++){
                    if(X[j]==0){
                        X[j]=1;
                    }else{
                        X[j]=0;
                    }
                }
            }else if (B[i][0]==2){
                //code2
                for (int j=0;j<Y.length;j++){
                    Y[j]=Y[j]+X[j]*B[i][1];
                }
            } else if (B[i][0]==3) {
                //code3
                System.out.println(Y[B[i][1]-1]);

            }
        }
//        for (int x=0;x<X.length;x++){
//            System.out.print("X["+x+"] "+X[x]);
//            System.out.println(" Y["+x+"] "+Y[x]);
//        }

    }
}
