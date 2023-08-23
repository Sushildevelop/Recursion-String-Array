package Practice.Recursion_5;

public class KeyPadCombinations {
    static void combinations(String dig,String[]kp, String res){ // 253
         if (dig.length()==0){
             System.out.print(res+" ");
             return;
         }
       int currNum=  dig.charAt(0) - '0';  // 2
         String currchoices=kp[currNum]; // 'abc'
        for (int i=0;i<currchoices.length();i++){
            combinations(dig.substring(1),kp,res+currchoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s="23";
        String[]kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(s,kp,"");

    }
}
