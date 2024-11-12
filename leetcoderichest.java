import java.util.*;
public class leetcoderichest {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row,col;
    System.out.println("enter the no of row(no of person):");
    row=sc.nextInt();
    System.out.println("enter the no of account of each person:");
    col=sc.nextInt();
    int [][]arr=new int [row][col];
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    
    int max=0;
    for (int i=0;i<row;i++){
        int sum=0;
        for (int j=0;j<col;j++){
            sum=sum+arr[i][j];
        }
        if (sum>max){
            max=sum;
        }
    }


    System.out.println("maximum wealth among the people will be "+max);

    sc.close();
}    
}
