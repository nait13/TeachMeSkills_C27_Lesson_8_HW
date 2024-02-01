package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.ICure;
import com.teachmeskills.lesson8_hw.patient.Patient;

/**
 * This class implements the ICure interface.
 */
public class Surgeon implements ICure {
    @Override
    public void treat(Patient patient) {
        System.out.println(patient.getName() + ", The surgeon is treating! ");
    }
}
