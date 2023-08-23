package Practice.Recursion_5.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class String_into_palindorme_substrings {
    static void palindormesubstring(String s , ArrayList<String> ans, int start){
        // base case
        if (start==s.length()){
            System.out.println(ans+" ");
            return;
        }
        String curr="";
        for (int end=start;end<s.length();end++){
            curr+=s.charAt(end);
            if (ispalindrome(curr)){
                ans.add(curr);
                palindormesubstring(s,ans,end+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    static boolean ispalindrome(String s){
        int left=0, right=s.length()-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        ArrayList<String>ans=new ArrayList<>();
        palindormesubstring(s,ans,0);
    }

}
