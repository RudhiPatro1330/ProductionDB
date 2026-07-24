package com.coding.production;


import com.coding.production.dto.CBloodType;
import com.coding.production.dto.CPatientInfo;
import com.coding.production.dto.IPatientInfo;
import com.coding.production.entity.Patient;
import com.coding.production.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {


    @Autowired
    private  PatientRepository patientRepository;

    @Test
    void testRepository4() throws  Exception{
//        List<Patient> patients = patientRepository.findAll();
//
//        for (Patient patient : patients) {
//            System.out.println(patient);
//        }


        List<IPatientInfo> list = patientRepository.getAllPatientInfo();

                for(IPatientInfo patientInfo : list){
                    System.out.println(patientInfo.getName());
                }

    }

    @Test
    void testRepository5() throws  Exception{
        List<CPatientInfo> list = patientRepository.getAllCPatientInfo();

        for (CPatientInfo cPatientInfo : list){
            System.out.println(cPatientInfo.getName());
        }
    }

    @Test
    void testRepository6() throws  Exception{
        List<CBloodType> list = patientRepository.getAllBloodTypeCount();

        for (CBloodType cBloodType : list){
            System.out.println(cBloodType);
        }
    }

    @Test
    void testRepository7() throws  Exception{
        int  i = patientRepository.updateUserData("Rudhi Patro",1);
        System.out.println(i);
    }
}
