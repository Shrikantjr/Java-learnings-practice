public class SelectorSorting {
    
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[]args) {


        //selector sorting
        //will shift the smallest number to the 1st or starting position
        //in selector sorting we won't do mutiple swapping
        //will run the loop and do 1 swap ie., 1 swap for 1 iteration

        int []arr= {7, 8, 3, 1, 2};
        for(int i=0; i<arr.length-1; i++){
            int smallest =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]> arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
        
    }
}
