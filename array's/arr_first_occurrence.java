public class arr_first_occurrence {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 20};
        int target = 20;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("the element is not founded");
        }else{
            System.out.println("the element is founded at " + index + " index");
        }
    }

    
}

/*
Complexity
Time Complexity
Best Case: O(1)
Worst Case: O(n)
Auxiliary Space
O(1)
 */
