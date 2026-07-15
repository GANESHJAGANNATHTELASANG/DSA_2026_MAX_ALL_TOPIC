
public class arra_2nd_largest_num {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 70, 40};

        if (arr.length < 2) {
            System.out.println("No second largest element.");
            return;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
    
}
