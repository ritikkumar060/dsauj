import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=3;
        int col=3;
        int [][]a= new int [row][col];
        
        //input thorugh the loop
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        


        //output formation
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
         
        // another method to print tghe 2d array
        for (int i=0;i<row;i++){
            System.out.println(Arrays.toString(a[i]));
        }


       //one another method (advanced for loop)
       for(int []num:a){
        System.out.println(Arrays.toString(num));

       }
   sc.close();
    }
    
}
