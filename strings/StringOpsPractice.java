/*Create a two String literals "Maple Tree" and "Maple Tree". Check their equality using ==.

Create a new String object "Maple Tree". Check their equality with the String literal using == and then check using .equals method.

Use substring to separate out "Maple" and "Tree" into two different objects.

Use concat to string the object back together as "Maple Tree".

Use toLowerCase to convert all the characters to lowercase.

Use toUpperCase to convert all the characters to lowercase. */

public class StringOpsPractice {
    public static void main(String s[]) {
        String s1 = "Maple Tree";
        String s2 = "Maple Tree";

        System.out.println("s1 == s2 "+ (s1 == s2));

        String s3 = new String("Maple Tree");
        System.out.println("s1 == s3 "+ (s1 == s3));
        System.out.println("s1.equals(s3) "+ (s1.equals(s3)));

        String s4 = s1.substring(0,5);
        String s5 = s1.substring(6);

        System.out.println("s1.substring(0,5) - s4 " + s4);
        System.out.println("s1.substring(6) - s5 " + s5);


        s1 = s4.concat(" ").concat(s5);

        System.out.println("s1 " + s1);
        System.out.println("s1.toLowerCase() " + s1.toLowerCase());
        System.out.println("s1.toUpperCase() " + s1.toUpperCase());
    }
}