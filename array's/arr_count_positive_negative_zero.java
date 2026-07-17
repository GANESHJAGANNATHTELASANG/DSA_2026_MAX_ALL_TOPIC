public class arr_count_positive_negative_zero {
    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 8, -2, 0, 7};
        int positive = 0;
        int  negative = 0;
        int zero = 0;


        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positive++;

            }else if(arr[i]<0){
                negative++;
                
            }else{
                zero++;
            }

        }

        System.out.println("possitive : " + positive);
        System.out.println("negative : " + negative);
        System.out.println("zero's : " + zero);


     }
    
}

/*
Output:

Positive : 3
Negative : 2
Zero : 2

✅ Correct.

✅ Time Complexity

You traverse the array once.

O(n)
✅ Auxiliary Space

Only three integer variables.

O(1)
*/
