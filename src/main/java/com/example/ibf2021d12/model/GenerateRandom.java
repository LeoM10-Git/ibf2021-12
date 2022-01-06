package com.example.ibf2021d12.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandom {
    private final List<Integer> imageNumbers = new ArrayList<>();
    public GenerateRandom() {
    }

    public List<Integer> generateRandom(Integer number) {
        Random random = new Random();
        while (imageNumbers.size() != number){
                int rNumber = random.nextInt(30);
                if (!imageNumbers.contains(rNumber)){
                    imageNumbers.add(random.nextInt(30));
            }
        }
//        System.out.println(imageNumbers);
        return imageNumbers;
    }

}
