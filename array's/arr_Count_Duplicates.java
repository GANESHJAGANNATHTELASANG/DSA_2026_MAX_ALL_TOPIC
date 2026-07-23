public class arr_Count_Duplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,4,4,5,5};

        int point = 0;

        // Remove duplicates logically
        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[point]) {
                point++;
                arr[point] = arr[i];
            }
        }

        int uniqueElements = point + 1;
        int duplicateOccurrences = arr.length - uniqueElements;

        System.out.println("Unique Elements = " + uniqueElements);
        System.out.println("Duplicate Occurrences = " + duplicateOccurrences);
    }
    
}
