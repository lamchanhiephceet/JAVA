package com.codegym;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtilsAdapter {
    List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
}
