package org.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class FinalResults {
    public static void main(String[] args) {
        Map<String, Integer> finalGrades = new HashMap<>();
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();

        for(var entry : makeupGrades.entrySet()){
            finalGrades.put(entry.getKey(), Math.max(entry.getValue(), originalGrades.get(entry.getKey())));
        }

        finalGrades.forEach(
                (k,v)->System.out.println(k + ": " + v)
        );
    }
}
