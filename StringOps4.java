public class StringOps4 {
    public static void main(String s[]) {
        String s1 = "Washington";
        String s2 = new String("Washington");
        String s3 = "WASHINGTON";

        System.out.println("Equality check s1 and s2 - "+s1.equals(s2)); // Returns true if the content of two Strings are exactly the same including the leading and trailing space.
        System.out.println("Equality check s1 and s3 - "+s1.equals(s3));
        System.out.println("Equality check s1 and s3 ignoring case - "+s1.equalsIgnoreCase(s3)); // eturns true ignoring the case of the two Strings. But the characters have to be in the same positions in both Strings and should not have any leading and trailing spaces.

        System.out.println("s1 in lowercase - "+s1.toLowerCase());
        System.out.println("s3 in lowercase - "+s3.toLowerCase());

        /*Returns a new String object with all the characters in the String object on which it is invoked, as lowercase. 
        If there are any non-aplhabetic characters, those are kept as is.*/

        System.out.println("s1 and s3 lowercase equality check - " +
                            s1.toLowerCase().equals((s3.toLowerCase())));

        System.out.println("s1 in uppercase - "+s1.toUpperCase());
        System.out.println("s3 in uppercase - "+s3.toUpperCase()); 

        /*Returns a new String object with all the characters in the String object on which it is invoked, as uppercase. 
        If there are any non-aplhabetic characters, those are kept as is */

        String s4 = "50F1A";
        System.out.println("s4 in lowercase - "+s4.toLowerCase());

        String regexStr = "^W.*";
        System.out.println("s1 matches regex ^W.* - "+s1.matches(regexStr)); // .matches()-Matches the String as regular expression. Regex or regular expression matches a pattern.
        System.out.println("s3 matches regex ^W.* - "+s3.matches(regexStr)); //^W.* - matches all Strings that start with uppercase W followed by any characeters or any length.

        String s5 = "     WASHINGTON          ";
        System.out.println("Equality check s3 and s5 - "+s3.equals(s5));
        s5 = s5.strip(); //  Removes the leading and trailing white spaces. This is extremely useful when dealing with data.
        System.out.println("Equality check after stripping s3 and s5 - "+s3.equals(s5));
    }

}