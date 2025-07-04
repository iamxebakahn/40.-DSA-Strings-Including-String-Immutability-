/*Q2. String operations
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.



Problem Constraints

1<=N<=100000


Input Format

First argument is a string A of size N.



Output Format

Return the resultant string.



Example Input

Input 1:
A="aeiOUz"
Input 2:
A="AbcaZeoB"


Example Output

Output 1:
"###z###z"
Output 2:
"bc###bc###"


Example Explanation

Explanatino 1:
First concatenate the string with itself so string A becomes "aeiOUzaeiOUz".
Delete all the uppercase letters so string A becomes "aeizaeiz".
Now replace vowel with '#', A becomes "###z###z".
Explanatino 2:
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#', A becomes "bc###bc###". */
public class Q2_DSA_Strings_[Including_String_Immutability] {
    public String solve(String A) {
        StringBuilder sb=new StringBuilder(A);
        sb.append(A);
        
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
            {
                sb.deleteCharAt(i);
                i--;
            }       
        }
        
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
            {
                sb.setCharAt(i,'#');
            }   
        }

        return sb.toString();
    }

}
