public class arr_Frequency_Of_EveryElement_brute_force {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4};

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyCounted = false;

            // Check if current element appeared before
            for (int j = 0; j < i; j++) {

                if (arr[j] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            // Skip if already counted
            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            // Count frequency
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
    
}



