// source page ------ https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
  public static void main(String[] args) {
    Solution solution = new Solution();
    char[] letters = {'c', 'f', 'j'};
    char target = 'a';
    char result = solution.nextGreatestLetter(letters, target);
    System.out.println("The next greatest letter after '" + target + "' is: '" + result + "'");     // output :- 'c'
  }

  public char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (letters[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    // The start index will point to the next greatest letter
    return letters[start % letters.length];  // 2%4 = 2 but 4%4 = 0
  }
}
