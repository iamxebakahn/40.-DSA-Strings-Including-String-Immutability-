/*Q1. Longest Palindromic Substring
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints

1 <= N <= 6000



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the longest palindromic substring of string A.



Example Input

Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output

Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation

Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".
 */

public class Q1_DSA_Strings_[Including_String_Immutability] {
    public String longestPalindrome(String A) {
        String s=A;
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (single character center)
            String oddPalindrome = expandFromCenter(s, i, i);

            // Even length palindrome (two character center)
            String evenPalindrome = expandFromCenter(s, i, i + 1);

            // Update longest if needed
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Substring from (left + 1) to (right - 1) inclusive
        return s.substring(left + 1, right);
    }
    
}
