/*Q2. Amazing Subarrays
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6. */
public class Q2AP_DSA_Strings_[Including_String_Immutability] {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if((A.charAt(i)=='a')||(A.charAt(i)=='A')||(A.charAt(i)=='e')||(A.charAt(i)=='E')||(A.charAt(i)=='i')||(A.charAt(i)=='I')||(A.charAt(i)=='U')||(A.charAt(i)=='o')||(A.charAt(i)=='O')||(A.charAt(i)=='u'))
                count=(count + (A.length()-i)) % 10003;
        }


        return count;
    }
}
