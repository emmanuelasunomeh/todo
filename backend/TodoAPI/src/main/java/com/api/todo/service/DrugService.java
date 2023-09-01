package com.api.todo.service;

import com.api.todo.dto.DrugDTO;
import com.api.todo.entity.Drug;
import com.api.todo.repository.DrugRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DrugService {

    private final DrugRepo drugRepo;

    public Drug create(DrugDTO dto) {
        Drug drug = new Drug();
        drug.setDateCreated(new Date());
        drug.setName(dto.getName());
        drug.setBrandName(dto.getBrandName());
        drug.setStatus("ACTIVE");
        drugRepo.save(drug);
        return drug;
    }

    public List<Drug> getAll() {
        return drugRepo.findAll();
    }
}
