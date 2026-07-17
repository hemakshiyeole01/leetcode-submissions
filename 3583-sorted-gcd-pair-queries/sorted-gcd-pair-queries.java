public class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        // 1. Find the maximum element in nums to define bounds
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        // 2. Count the frequency of each number in the array
        int[] freq = new int[maxNum + 1];
        for (int num : nums) {
            freq[num]++;
        }

        // 3. Count how many elements are divisible by each divisor `i`
        long[] countGcdPair = new long[maxNum + 1];
        for (int i = 1; i <= maxNum; i++) {
            long totalDivisible = 0;
            for (int j = i; j <= maxNum; j += i) {
                totalDivisible += freq[j];
            }
            // Number of unique pairs whose items are both divisible by `i`
            countGcdPair[i] = totalDivisible * (totalDivisible - 1) / 2;
        }

        // 4. Adjust counts via inclusion-exclusion (backwards sieve)
        // Extract pairs whose EXACT Greatest Common Divisor is `i`
        for (int i = maxNum; i >= 1; i--) {
            for (int j = 2 * i; j <= maxNum; j += i) {
                countGcdPair[i] -= countGcdPair[j];
            }
        }

        // 5. Construct a running/prefix sum array of the sorted GCD occurrences
        long[] prefixCount = new long[maxNum + 1];
        for (int i = 1; i <= maxNum; i++) {
            prefixCount[i] = prefixCount[i - 1] + countGcdPair[i];
        }

        // 6. Map and answer each query utilizing Binary Search
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(prefixCount, queries[i]);
        }

        return ans;
    }

    private int binarySearch(long[] prefixCount, long target) {
        int low = 1;
        int high = prefixCount.length - 1;
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // A target index maps to a GCD if it sits within its cumulative bounds
            if (prefixCount[mid] > target) {
                result = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
