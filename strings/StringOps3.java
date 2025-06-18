public class StringOps3 {
    public static void main(String s[]) {
        String s1 = "The quick brown fox jumped over the lazy dog";

        System.out.println(s1.length());

        char[] strAsArr = s1.toCharArray(); //convert the String into a character array and stores in variable strAsArr.
        System.out.println(strAsArr.length);

        System.out.println(strAsArr);

        System.out.println("The first char of the string is " + strAsArr[0]);
        System.out.println("The last char of the string is " + strAsArr[strAsArr.length-1]);

        System.out.println("The index of T is " + s1.indexOf('T'));

        /* returns the first index of T in the String stored in s1. 
        If there is no such character, it returns -1 indicating that there is no such character in the String. */
        
        System.out.println("The index of g is " + s1.indexOf('g'));
    }
}

/*Always remember the index positions start from 0. 
So if the length of the String is say 5, the last index position is 4 (5-1). */