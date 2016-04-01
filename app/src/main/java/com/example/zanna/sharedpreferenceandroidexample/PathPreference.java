package com.example.zanna.sharedpreferenceandroidexample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zanna on 01/04/16.
 */
public enum PathPreference {
    NO_PREFERENCE(0), ELEVATOR_PREFERENCE(1), STAIR_PREFERENCE(2);

    private final int value;

    private static final Map<Integer, PathPreference> map = new HashMap<>();

    static {
        for (PathPreference pref : PathPreference.values()) {
            map.put(pref.value, pref);
        }
    }

    PathPreference(int value) {
        this.value = value;
    }

    public static PathPreference valueOf(int pref) {
        return map.get(pref);
    }

    public int getValue() {
        return value;
    }
}
