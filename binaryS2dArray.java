public class binaryS2dArray {
    public static void main(String[] args) {
        int [][]arr= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };



        int target=11;
        // int row=arr.length;
        // int col=arr[0].length;
   int row=0;
   int col=3;
        while(row<=3 && col>=0)
        {
            if (arr[row][col]==target){
                System.out.println(row+" " +col);
                return;
            }
            else if (arr[row][col]>target){
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("element not found in the 2d array");
    }
    
}
