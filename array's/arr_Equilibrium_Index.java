public class arr_Equilibrium_Index {
    public static int sum(int left, int right, int[] prefix) {

        // No elements in the range
        if (left > right) {
            return 0;
        }

        // Range starts from index 0
        if (left == 0) {
            return prefix[right];
        }

        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        // Build Prefix Sum
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // User gives the index
        int index = 3;

        int leftSum = sum(0, index - 1, prefix);
        int rightSum = sum(index + 1, arr.length - 1, prefix);

        if (leftSum == rightSum) {
            System.out.println(index + " is an Equilibrium Index");
        } else {
            System.out.println(index + " is NOT an Equilibrium Index");
        }
    }
}