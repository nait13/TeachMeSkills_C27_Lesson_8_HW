package com.teachmeskills.lesson8_hw.patient;

import com.teachmeskills.lesson8_hw.doctor.ICure;

/**
 * This class creates a "patient" object
 */

public class Patient {
    private String name;
    private int treatmentPlan;

    public String getName() {
        String s = "Patient: " + name;
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ICure doctor;

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public ICure getDoctor() {
        return doctor;
    }

    public void setDoctor(ICure doctor) {
        this.doctor = doctor;
    }


}
