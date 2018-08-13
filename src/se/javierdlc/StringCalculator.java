package se.javierdlc;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else if (numbers.length() > 0) {
            List<String> nrs = Arrays.asList(numbers.split(",|\n"));
            int result = 0;
            for (String nr : nrs) {
                result += Integer.parseInt(nr);
            }
            return result;
        }
        return -1;
    }
}
