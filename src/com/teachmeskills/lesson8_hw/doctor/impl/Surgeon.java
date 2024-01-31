package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.ICure;

/**
 * This class implements the ICure interface.
 */
public class Surgeon implements ICure {
    @Override
    public void treat() {
        System.out.println("The surgeon is treating!");
    }
}
