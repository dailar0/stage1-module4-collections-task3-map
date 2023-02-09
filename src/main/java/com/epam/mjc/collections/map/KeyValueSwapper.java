package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> result = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String key = entry.getValue();
            Integer value = entry.getKey();

            Integer oldValue = result.get(key);
            if (oldValue != null) {
                value = oldValue < value ? oldValue : value;
            }

            result.put(key, value);
        }

        return result;
    }
}
