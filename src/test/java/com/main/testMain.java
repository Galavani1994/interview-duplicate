package com.main;

import com.interview.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testMain {

    @Test
    public void testDuplicateNumber(){
        List<Integer> integers=Main.duplicatNumber(new Integer[]{1, 5, 4, 7, 9, 8, 3, 6, 8, 2,7, 3});

        assertEquals(integers,Main.duplicatNumber(new Integer[]{1, 5, 4, 7, 9, 8, 3, 6, 8, 2,7, 3}));
    }
}
