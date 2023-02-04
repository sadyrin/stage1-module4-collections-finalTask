package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for(Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            String oldKey = entry.getKey();
            int key = oldKey.length();
            Set<String> value = null;

            if(!map.containsKey(key)) value = new HashSet<>();
            else value = map.get(key);

            value.add(oldKey);
            map.put(key, value);
        }

        return map;
    }
}
