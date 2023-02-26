package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (String projectName : projects.keySet()) {
            Set<String> developers = projects.get(projectName);
            if (developers.contains(developer)) {
                result.add(projectName);
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lenComp = Integer.compare(s2.length(), s1.length());
                if (lenComp != 0) {
                    return lenComp;
                } else {
                    return s2.compareTo(s1);
                }
            }
        });
        return result;
    }
}