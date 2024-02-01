package com.teachmeskills.lesson8_hw.runner;

import com.teachmeskills.lesson8_hw.doctor.impl.Therapist;
import com.teachmeskills.lesson8_hw.patient.Patient;

/**
 * Here is the starting point of the program.
 */
public class Runner {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Oleg",3);
        Patient patient2 = new Patient("Alex",1);
        Patient patient3 = new Patient("Mark",2);

        Therapist therapist = new Therapist();

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient3);
        therapist.assignDoctor(patient2);


    }
}
