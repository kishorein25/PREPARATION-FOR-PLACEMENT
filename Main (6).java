import java.util.*;
class Main{
    public static void solve(int[][] arr){
        int sum = 0;
        int n = arr.length;
        int m = arr[0].length;
        
        for(int j = 0; j < m; j++){
            sum = sum + arr[0][j];
        }
        
        for(int j = 0; j < arr[n-1].length; j++){
            sum = sum + arr[n-1][j];
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
               if((i+j == 3) && i!= j){
                   sum = sum + arr[i][j];
               }
            }
        }
        
        System.out.print(sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {
            {3,8,10,6},
            {11,2,1,7},
            {9,4,5,8},
            {1,13,10,2}
        };
        solve(arr);
    }
}