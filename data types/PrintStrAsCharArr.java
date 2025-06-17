public class PrintStrAsCharArr {
        public static void main(String s[]) {
        String myStr = "The quick brown fox jumped over the lazy dog";

        char[] chrArr = myStr.toCharArray();
        for (int i=0;i<chrArr.length;i++) {
            System.out.print(chrArr[i]);
        }
    }
}
/*Exercise 1
Create and initialize an int array with 10 elements.

Print each element of the array without using the 'for' loop.

Print each element of the array using the 'for' loop.

Exercise 2
Create and initialize a string.

Convert the string to a char array using the toCharArray() method.

Print each element of the array using the 'for' loop. */