package com.exercises.util;

import java.util.List;

public class ListUtil {

    public static <T> T getLast(List<T> list) {
        return list.get(list.size() - 1);
    }
}
