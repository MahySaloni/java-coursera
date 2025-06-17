public class ArrayAccess2 {
    public static void main(String s[]) {
        int years[] = new int[6];
        years[1] = 2021;
        years[3] = 2023;
        System.out.println(years[0]);
        System.out.println(years[1]);
        System.out.println(years[2]);
        System.out.println(years[3]);
        System.out.println(years[4]);
        System.out.println(years[5]);
    }
}
/*Heres an explanation of the code:

int years[] = new int[6]; - An array named years of type int is declared The array is initialized to hold six (6) elements. 
When an array initializes, depending on the type of array, the array has default values. An int array by default, has valuee the value of zero (0).

years[n] - Allocates an element at the specified index n. In this example at 1 and 3.

System.out.println(years[n]); - Prints the element in nth position, where n starts from 0. In this example, as you are only assigning values to index, you will see what values are allocated to the rest of the elements when you compile and run the code. */