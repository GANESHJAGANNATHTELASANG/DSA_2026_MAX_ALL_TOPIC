public class arra_linear_search{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        int index = -1;
        
        for(int i=0; i<=arr.length ; i++){
            if(target == arr[i]){
                System.out.println("target founded");
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("the element is not found");
        }else{
            System.out.println("the element was founded in " + (index) );

        }            
    }
}

/*
Time Complexity:

Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)

Auxiliary Space: O(1)
*/
