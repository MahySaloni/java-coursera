public class StringOps {
    public static void main(String s[]) {
        String s1 = "Hello World";
        System.out.println(s1);
        String s2 = new String("Hello World");
        System.out.println(s2);
    }
}

/*String s1 = "Hello World"; - create a String literal
String s2 = "Hello World"; - creates a String Object */

/*As observed from the output, String s1 = "Hello World"; and String s2 = new String("Hello World"); may seem identical, but there's a subtle difference:

s1 is a String literal and s2 is a String object.

String Literal (s1): When you write String s1 = "Hello World";, Java creates a String literal in the String constant pool. 
This pool is a memory area where Java stores String literals. 
If the same string literal is used again in the code, Java reuses the existing instance from the pool, instead of allocating memory for another one.

String Object (s2): When you write String s2 = new String("Hello World");, Java creates a new String object on the heap memory. 
This object is not stored in the String constant pool. 
Every time you use new String("Hello World") a new object is created in the memory, though the content are the same. */