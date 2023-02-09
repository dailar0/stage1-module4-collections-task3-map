package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer value : functionMap.values()) {
            if (value == requiredValue)
                return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer, Integer> map = new HashMap<>();
        sourceList.forEach(integer -> map.put(integer, applyFunction(integer)));
        return map;
    }

    private int applyFunction(int value) {
        return 5 * value + 2;
    }
}
