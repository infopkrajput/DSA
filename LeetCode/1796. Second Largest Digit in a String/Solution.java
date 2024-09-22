import javax.print.attribute.IntegerSyntax;

public class Solution {

    public static int secondHighest(String s) {
        int max1,max2;
        max1=max2 = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                if(s.charAt(i)-48 > max1)
                {
                    max2 = max1;
                    max1 = s.charAt(i)-48;
                }
                else if(s.charAt(i)-48 > max2 && s.charAt(i)-48 < max1)
                {
                    max2 = s.charAt(i)-48;
                }
            }
        }
        if(max2 == Integer.MIN_VALUE)
        {
            return -1;
        }
        return max2;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        int x = secondHighest(s);
        System.out.println(x);
    }

}
