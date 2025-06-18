public class StringOps5 {
    public static void main(String s[]) {
        String s1 = "Washington";
        String s2 = " DC";
        s1 = s1.concat(s2); // Java creates a new String object and copies the characters from the original Strings to the new object
        System.out.println("s1 " + s1);
        s1 = s1.substring(0,10); //Java creates a new String object and copies the characters from the index position passed as first parameter to the index position passed as second parameter from the original Strings to the new object.
        System.out.println("s1 " + s1);

        System.out.println("s1.substring(7,10) " + s1.substring(7,10));
        System.out.println("s1.substring(7) " + s1.substring(7));
    }
}

//If there is not second parameter passed, it takes from the String in first index position to the end of the String.