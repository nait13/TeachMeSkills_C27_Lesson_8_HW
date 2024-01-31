package com.teachmeskills.lesson8_hw.patient;

import com.teachmeskills.lesson8_hw.doctor.ICure;

/**
 * This class creates a "patient" object
 */

public class Patient {
    public String name;
    public int treatmentPlan;
    public ICure doctor;

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
