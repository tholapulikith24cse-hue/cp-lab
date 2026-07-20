public class divideconquer {

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int maxCrossingSum(int arr[], int left, int mid, int right) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;

        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            if (sum > leftSum)
                leftSum = sum;
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;

        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            if (sum > rightSum)
                rightSum = sum;
        }

        return leftSum + rightSum;
    }

    static int maxSubArraySum(int arr[], int left, int right) {
        if (left == right)
            return arr[left];

        int mid = (left + right) / 2;

        return max(
            maxSubArraySum(arr, left, mid),
            maxSubArraySum(arr, mid + 1, right),
            maxCrossingSum(arr, left, mid, right)
        );
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = maxSubArraySum(arr, 0, arr.length - 1);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}