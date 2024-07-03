public class Sorting {
    public static void main (String args []){
        int arr[] = {9,4,10,2,5,8,7,1};
        for(int i=0;i<(arr.length);i++){
            for(int j=i;j<(arr.length);j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
// print sorted array
        for(int x=0;x<(arr.length);x++){
            System.out.print(arr[x]);

        }
    }
}