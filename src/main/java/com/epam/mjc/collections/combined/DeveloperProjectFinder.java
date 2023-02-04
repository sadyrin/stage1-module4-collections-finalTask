package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        
        for(Map.Entry<String, Set<String>> entry : projects.entrySet()){
            if(entry.getValue().contains(developer)) list.add(entry.getKey());
        }

        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length() < s2.length() ? 1 :
                    s1.length() == s2.length() ? s2.compareTo(s1) : -1;
            }
        });

        return list;
    }
}
