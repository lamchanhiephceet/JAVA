package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public List<Integer> generateList(int size, int min, int max){
        List<Integer> numbers = new ArrayList<>();
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < size; i++){
            int randomInteger = randomNumber.generateInteger(min, max);
            numbers.add(randomInteger);
        }
        return numbers;
    }
}
