public class arra_even_odd {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 90, 45, 12};
        int even=0;
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.err.print("even : " + even  + "odd : " + odd);
    }
    
}

/*
✅ Logic

✔️ Perfect.

You correctly understood that:

Traverse the whole array.

Every time the target appears:

frequency++;
No break because we want to count all occurrences.
✅ Time Complexity
O(n)

Correct.

Reason:

You visit every element exactly once.
✅ Auxiliary Space
O(1)

Correct.

Reason:

Only one extra variable (frequency) is used.
 */