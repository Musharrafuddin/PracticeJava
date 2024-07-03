public class Matrix {
    public static void main(String args[]){
        //Declaring arrays
        int a[][]= {{2,3,4},{5,4,3},{4,3,2}};
        int b[][]= {{4,4,5},{5,6,3},{4,3,7}};
        int c[][]= new int[3][3];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        //printing addition of arrays
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(c[i][j] +" ");
            }                System.out.println();

        }
    }
}
