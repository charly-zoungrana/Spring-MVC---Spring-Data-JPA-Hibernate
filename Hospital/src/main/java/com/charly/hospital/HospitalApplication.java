package com.charly.hospital;

import com.charly.hospital.entities.*;
import com.charly.hospital.repositories.ConsultationRepository;
import com.charly.hospital.repositories.MedecinRepository;
import com.charly.hospital.repositories.PatientRepository;
import com.charly.hospital.repositories.RendezVousRepository;
import com.charly.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IHospitalService hospitalService) {
        return args -> {

            Stream.of("Mohammed","Youssef","Ali")
                    .forEach(name -> {
                        Patient patient=Patient.builder()
                                .nom(name)
                                .dateNaissance(LocalDate.of(2004,2,7))
                                .malade(false)
                                .build();
                        hospitalService.savePatient(patient);
                    });

            Stream.of("Sergine","Alex","Fatima")
                    .forEach(name -> {
                        Medecin medecin=Medecin.builder()
                                .nom(name)
                                .specialite(Math.random()>0.5?"Cardio":"Chirurgie")
                                .email(name+"@gmail.com")
                                .build();
                        hospitalService.saveMedecin(medecin);
                    });

            Patient patient1=hospitalService.getPatientById(1L);
            Patient patient2=hospitalService.getPatientByNom("Mohammed");

            Medecin medecin=hospitalService.getMedecinByNom("Sergine");

            RendezVous rendezVous=RendezVous.builder()
                    .date(LocalDate.now())
                    .statusRDV(StatusRDV.PENDING)
                    .medecin(medecin)
                    .patient(patient1)
                    .build();

            hospitalService.saveRDV(rendezVous);

            RendezVous rendezVous1=hospitalService.getRDVById(1L);
            Consultation consultation=Consultation.builder()
                    .dateConsultation(rendezVous1 != null ? rendezVous1.getDate() : null)
                    .rendezVous(rendezVous1)
                    .rapport("Rapport de la consultation...")
                    .build();
            hospitalService.saveConsultation(consultation);


        };
    }

}
