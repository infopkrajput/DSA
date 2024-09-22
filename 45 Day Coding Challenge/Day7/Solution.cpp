#include <iostream>
#include <vector>

using namespace std;

// Function to swap two elements
void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

// Recursive function to generate all permutations
void generatePermutations(vector<int> &arr, int start, int end) {
    // Base case: if start index equals end, print the current permutation
    if (start == end) {
        for (int i = 0; i <= end; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
        return;
    }

    // Recursive case: try all possible swaps
    for (int i = start; i <= end; i++) {
        swap(arr[start], arr[i]);                // Swap the current element with the starting element
        generatePermutations(arr, start + 1, end); // Recursively generate permutations with the rest of the array
        swap(arr[start], arr[i]);                // Backtrack to the original array
    }
}

int main() {
    int n = 3;  // You can change the value of n for different lengths of permutations
    vector<int> arr;

    // Fill the array with 1, 2, 3,..., n
    for (int i = 1; i <= n; i++) {
        arr.push_back(i);
    }

    cout << "All possible arrangements (permutations) of " << n << " numbers:\n";
    generatePermutations(arr, 0, n*2 - 1);

    return 0;
}
