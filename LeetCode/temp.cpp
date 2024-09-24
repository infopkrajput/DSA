#include <iostream>
using namespace std;

int removeElement(int arr[], int n, int k) {
    int newLength = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] != k) {
            arr[newLength] = arr[i];  // Shift the element if it's not equal to k
            newLength++;  // Increase the length of the array with valid elements
        }
    }
    
    return newLength;
}

int main() {
    int arr[] = {3, 2, 2, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 3;

    // Remove elements equal to k and get the new length
    int newLength = removeElement(arr, n, k);

    // Output the modified array
    cout << "Modified array: ";
    for (int i = 0; i < newLength; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    return 0;
}
