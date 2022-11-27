package day1;

import java.io.*;
import java.util.ArrayList;
// start by importing all needed stuff
public class Main {

    // tells the compiler that there will be an input - output exception
    public static void main(String[] args) throws IOException {

        // this looks at the input and uses it as a stream of data that the program can look through
        // from the resources folder
        InputStream is = Main.class.getClassLoader().getResourceAsStream("day-1/input.txt");
        assert is != null;

        // this takes our input stream and buffers the file into memory so we can read line by line
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        // this makes a new array that doesn't use primitive types
        ArrayList<Integer> numList = new ArrayList<>();

        // this is a while loop that reads line by line until we are at the end of the file
        String line;
        while ((line = br.readLine()) != null) {
            // this takes a string and converts it to a non-primitive integer, and then adds the number to the list of numbers
            numList.add(Integer.valueOf(line));
        }

        // we have a list numbers
        // numList
        // take number(int1) and compare it to number(int2) and see if there's an increase between int1 and int2
        // start our count at 0
        int count = 0;
        // set last to the first number in the list
        int last = numList.get(0);
        // this looks at the last number and determines whether or not it is larger than the last number, and if
        // it was then it does not add to the count
        for (Integer i : numList) {
            if (last < i) {
                count = count + 1;
            }
            // update last with the current number
            last = i;
        }
        // this ends the program by returning whatever the count of increases was
        System.out.println(count);
    }
}