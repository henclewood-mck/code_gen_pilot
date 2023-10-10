package com.acme.basic;
import java.util.*;
import java.lang.*;

import org.junit.Test;

public class GenSolution_1Test {
    @Test
    public void GenSolution_1Test() {
        RefSolution_1 s = new RefSolution_1();
        List<Boolean> correct = Arrays.asList(
                s.separateParenGroups("(()()) ((())) () ((())()())").equals(Arrays.asList(
                        "(()())", "((()))", "()", "((())()())"
                )),
                s.separateParenGroups("() (()) ((())) (((())))").equals(Arrays.asList(
                        "()", "(())", "((()))", "(((())))"
                )),
                s.separateParenGroups("(()(())((())))").equals(Arrays.asList(
                        "(()(())((())))"
                )),
                s.separateParenGroups("( ) (( )) (( )( ))").equals(Arrays.asList("()", "(())", "(()())"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
    
}
