package com.charly.hospital;

import com.charly.hospital.entities.Medecin;
import com.charly.hospital.entities.Patient;
import com.charly.hospital.repositories.MedecinRepository;
import com.charly.hospital.repositories.PatientRepository;
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
    CommandLineRunner start(PatientRepository patientRepository,
                            MedecinRepository medecinRepository) {
        return args -> {

            Stream.of("Mohammed","Youssef","Ali")
                    .forEach(name -> {
                        Patient patient=Patient.builder()
                                .nom(name)
                                .dateNaissance(LocalDate.of(2004,2,7))
                                .malade(false)
                                .build();
                        patientRepository.save(patient);
                    });

            Stream.of("Sergine","Alex","Fatima")
                    .forEach(name -> {
                        Medecin medecin=Medecin.builder()
                                .nom(name)
                                .specialite(Math.random()>0.5?"Cardio":"Chirurgie")
                                .email(name+"@gmail.com")
                                .build();
                        medecinRepository.save(medecin);
                    });
        };
    }

}
