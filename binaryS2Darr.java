public class binaryS2Darr {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
		int key=10;
		int p=0;
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0){
		    if(arr[row][col]==key){
		        p=1;
		        System.out.println("found");
		        break;
		    }
		    else if(key>arr[row][col]){
		        row++;
		    }
		    else{
		        col--;
		    }
		}
		if(p==0){
		    System.out.println("not found");
		}
	}
}
