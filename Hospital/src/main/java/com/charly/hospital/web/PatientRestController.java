package com.charly.hospital.web;

import com.charly.hospital.entities.Patient;
import com.charly.hospital.repositories.PatientRepository;
import com.charly.hospital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> listPatient(){
      return patientRepository.findAll();
    };
}
