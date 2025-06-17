public class ArrayAccess3 {
    public static void main(String s[]) {
        int years[] = new int[6];
        years[0] = 2020;
        years[1] = 2021;
        years[2] = 2022;
        years[3] = 2023;
        years[4] = 2024;
        years[5] = 2025;
        int count_years = years.length;
        System.out.println("the length of the array is " + count_years);
        for (int i=0; i<count_years; i++) {
            System.out.println(years[i]);
        }
    }
}
/*int count_years = years.length; - Creates a variable named count_years and stores the value of the length of the array in the variable.

for (int i=0; i<count_years; i++) - Creates a for loop. The for has 3 parts. The initial value, the condition, and the incremental value. In this exercise, you are going to use variable i to traverse through the index positions of the array.

The code begin with the initial value of i equal to zero(0). 
The code checks the condition to see if value of i is less than the length of the array and then increments the value of i after one loop is executed. 
The code checks the condition every time the loop increments. 
The code block enclosed within the brackets after creation of the for loop continues to run until the condition is met. */