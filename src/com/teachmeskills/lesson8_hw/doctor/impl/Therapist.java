package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.ICure;
import com.teachmeskills.lesson8_hw.patient.Patient;

/**
 * This class implements the ICure interface and assigns a doctor.
 */
public class Therapist implements ICure {

    public void treat(Patient patient) {
        System.out.println(patient.getName() + ", Therapist prescribes tablets!");
    }

    public void assignDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());

        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());

        } else {
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treat(patient);
    }
}
