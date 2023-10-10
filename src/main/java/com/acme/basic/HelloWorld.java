package com.acme.basic;
import java.util.*;
import java.lang.*;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!!!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }



}

class Solution_0 {
    public boolean hasCloseElements(List<Double> numbers, double threshold) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                double distance = Math.abs(numbers.get(i) - numbers.get(j));
                if (distance < threshold) return true;
            }
        }
        return false;
    }
}
