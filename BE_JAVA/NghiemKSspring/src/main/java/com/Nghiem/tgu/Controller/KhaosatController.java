package com.Nghiem.tgu.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Nghiem.tgu.Model.Khaosat;
import com.Nghiem.tgu.Model.Khoa;
import com.Nghiem.tgu.Model.Tutorial;
import com.Nghiem.tgu.Repository.KhaoSatRepository;
import com.Nghiem.tgu.Repository.KhoaRepository;

import Exception.ResourceNotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/khoasv")
public class KhaosatController {
	@Autowired
	KhaoSatRepository khaoSatRepository;
	
	@GetMapping("/khao_sat")
	public List<Khaosat> getAllKhaosat(){
		return khaoSatRepository .findAll();
	}

	@GetMapping("/khao_sat/{id}")
	public ResponseEntity<Khaosat> getKhaosatById(@PathVariable Long id) {
		Khaosat khaosat = khaoSatRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + id));
		return ResponseEntity.ok(khaosat);
	}



}
