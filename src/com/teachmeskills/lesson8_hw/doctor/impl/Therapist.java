package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.ICure;
import com.teachmeskills.lesson8_hw.patient.Patient;

/**
 * This class implements the ICure interface and assigns a doctor.
 */
public class Therapist implements ICure {

    public void treat() {
        System.out.println("Therapist prescribes tablets!");
    }

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.setDoctor(new Dentist());

        } else if (patient.treatmentPlan == 2) {
            patient.setDoctor(new Surgeon());

        } else {
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treat();
    }
}
