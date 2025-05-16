import java.util.*;
public class ncet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
            for(int j=k+1;j<col;j++){
                if(i%2==0){
                    if(arr[i][k]>=arr[i][j]){
                        count++;
                    }
                }
                else{
                    if(arr[i][k]<=arr[i][j]){
                        count++;
                    }
                }
            }
            }
        }
        sc.close();
System.out.println(count);
    }
}