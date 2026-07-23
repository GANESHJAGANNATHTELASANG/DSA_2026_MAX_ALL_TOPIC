public class arr_Unique_Element_using_XOR {
    public static void main(String[] args) {
         int [] arr = {1,3,4,4,3,1,2};
         int ans = 0;

         for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
         }

         System.out.println("the unique number is " + ans);

        
    }
    
}
