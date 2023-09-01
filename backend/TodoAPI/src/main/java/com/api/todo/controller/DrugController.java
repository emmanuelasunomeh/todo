package com.api.todo.controller;

import com.api.todo.dto.DrugDTO;
import com.api.todo.entity.Drug;
import com.api.todo.service.DrugService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/drug")
@RequiredArgsConstructor
@CrossOrigin("*")
@RestController
public class DrugController {

    private final DrugService drugService;

    @PostMapping
    ResponseEntity<Drug> createDrug(@RequestBody DrugDTO dto){

        Drug drug = drugService.create(dto);

        return new ResponseEntity<>(drug, HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<Drug>> getList(){
        List<Drug> drug = drugService.getAll();
        return new ResponseEntity<>(drug, HttpStatus.OK);
    }
}
