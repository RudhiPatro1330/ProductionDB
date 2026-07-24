package com.coding.production.entity;


import com.coding.production.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Patient_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String gender;


//    @Column(name="birthDate")
//    private LocalDate birthDate;

    private String email;

    @Enumerated(value= EnumType.STRING)
    private BloodGroupType blood_group;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
