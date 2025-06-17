public class ArrayAccess4 {
    public static void main(String s[]) {
        int num_args = s.length;
        System.out.println("the length of the array is " + num_args);
        for (int i=0; i<num_args; i++) {
            System.out.println(s[i]);
        }
    }
} 
//int num_args = s.length; - Creates a variable named num_args and stores the value of the length of the array of command line arguments in it.