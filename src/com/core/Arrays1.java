package com.core;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        System.out.println("Input Array ::"+a);
       Collections.reverse(a);

        return a;
    }

}

public class Arrays1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/srivaneshgnanasekaran/Documents/out"));

        //int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> arr = Arrays.asList(89, 12, 76, 3, 100);
        List<Integer> res = Result.reverseArray(arr);

        System.out.println("Reversed array :"+res);

//        bufferedWriter.write(
//                res.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }
}
