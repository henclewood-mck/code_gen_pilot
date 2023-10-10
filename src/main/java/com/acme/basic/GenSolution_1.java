package com.acme.basic;
import java.util.*;
import java.lang.*;

public class GenSolution_1 {
    public List<String> separateParenGroups(String paren_string) {
        List<String> result = new ArrayList<>();
        StringBuilder current_string = new StringBuilder();
        int current_depth = 0;

        for (char c : paren_string.toCharArray()) {
            if (c == '(') {
                current_depth += 1;
                current_string.append(c);
            } else if (c == ')') {
                current_depth -= 1;
                current_string.append(c);

                if (current_depth < 0) {
                    result.add(current_string.toString());
                    current_string.setLength(0);
                }
            }
        }
        return result;

    }
}
