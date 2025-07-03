/*Q1. Longest Common Prefix
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.


The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".




Problem Constraints

0 <= sum of length of all strings <= 1000000



Input Format

The only argument given is an array of strings A.



Output Format

Return the longest common prefix of all strings in A.



Example Input

Input 1:


A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];






Example Output

Output 1:

"a"
Output 2:

"ab"


Example Explanation

Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
 */
public class Q1AP_DSA_Strings_[Including_String_Immutability] {
    public String longestCommonPrefix(String[] A) {
        if (A.length == 0)
            return "";

        if (A.length == 1)
            return A[0];
        
        
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE;
        int j=0;       

        for(int i=0;i<A.length-1;i++)
        {
            j=0;

            while(j < A[i].length() && j < A[i + 1].length() && A[i].charAt(j)==A[i+1].charAt(j))
            {
                j++;
            }

            min=Math.min(min,j);
        }

        if (min == Integer.MAX_VALUE)
            min = 0;

        for(int i=0;i<min;i++)    
        {
            sb.append(A[0].charAt(i));
        }


        return sb.toString();

    }
}
