/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kx.examples;

import com.kx.c;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author charlie
 */
public class SerializationOnly {
    public static void main(String[] s) {
        c c = new c();
        int[] input = new int[50000];
        for (int i = 0; i < input.length; i++) input[i] = i % 10;
        try {
            System.out.println(Arrays.equals(input, (int[]) c.deserialize(c.serialize(1, input, true))));
            System.out.println(Arrays.equals(input, (int[]) c.deserialize(c.serialize(1, input, false))));
        } catch (Exception ex) {
            Logger.getLogger(SerializationOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
