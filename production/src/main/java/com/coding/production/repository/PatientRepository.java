package com.coding.production.repository;

import com.coding.production.dto.CBloodType;
import com.coding.production.dto.CPatientInfo;
import com.coding.production.dto.IPatientInfo;
import com.coding.production.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {


    @Query(value = "select p.id as id ,p.name as name,p.email as email from Patient_details p",nativeQuery = true) // in sql we uses normal table name
    List<IPatientInfo> getAllPatientInfo();


    @Query(value = "select new com.coding.production.dto.CPatientInfo(p.id,p.name)"+" from Patient p") // jpql use entity name i.e like patient
    List<CPatientInfo> getAllCPatientInfo();


    @Query(value="select new com.coding.production.dto.CBloodType(p.blood_group,count(p)) " + " from Patient p group by p.blood_group order by count(p) desc ")
    List<CBloodType> getAllBloodTypeCount();


    @Transactional
    @Modifying
    @Query(value="update Patient_details p set p.name=:name where p.id=:id",nativeQuery = true)
    int updateUserData(@Param("name") String name,@Param("id") long id);
}
