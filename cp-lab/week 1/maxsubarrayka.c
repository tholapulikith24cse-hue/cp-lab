#include <stdio.h>

int main() {
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the array elements: ");
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int currentSum = arr[0];
    int maxSum = arr[0];
    for(int i = 1; i < n; i++) {
        if(currentSum + arr[i] > arr[i])
            currentSum = currentSum + arr[i];
        else
            currentSum = arr[i];
        if(currentSum > maxSum)
            maxSum = currentSum;
    }
    printf("Maximum Subarray Sum = %d\n", maxSum);
    return 0;
}