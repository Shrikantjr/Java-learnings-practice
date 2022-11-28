public class BubbleSorting {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String []args) {
        
        int arr[]={7,8,3,1,2};

        //1 bubble sorting 
        // time complexity of buddle sorting = O(n^2) 
        //means high coz loops are running more time ..which is not good practice to use
        //(hightest number will be at last in array)
        //outer loop (n-1 iteration ie.,1st highest will shift to end then 2nd hightest and so on)
        //n-1 is nothing but size of array minus 1 ie., 5-1 times loop

        for(int i=0; i<arr.length-1; i++){
            //outer loop no element will be sort at first loop as i =0
            for(int j=0; j<arr.length-i-1; j++){
                //inner loop drives j by arr length minus i minus 1
                if(arr[j] > arr[j + 1]){
                    //checking in if condition (means 1st num is > than 2ns num then swap by using swap)
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        printArr(arr);

        
    }
    
}
