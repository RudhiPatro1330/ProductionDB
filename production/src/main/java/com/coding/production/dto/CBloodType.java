package com.coding.production.dto;


import com.coding.production.entity.type.BloodGroupType;
import lombok.Data;


@Data
public class CBloodType {

    private final BloodGroupType bloodGroupType;

    private final Long count;

}
