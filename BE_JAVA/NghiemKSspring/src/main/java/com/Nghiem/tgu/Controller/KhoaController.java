package com.Nghiem.tgu.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nghiem.tgu.Model.*;
import com.Nghiem.tgu.Repository.KhoaRepository;

import Exception.ResourceNotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/khoasv/")
public class KhoaController {
	@Autowired
	private KhoaRepository khoaRepository;
	
	// get all employees
	@GetMapping("/show_khoa_sv")
	public List<Khoa> getAllKhoa(){
		return khoaRepository.findAll();
	}
	// create khoa rest api
	@PostMapping("/show_khoa_sv")
	public Khoa createKhoa(@RequestBody Khoa khoa) {
		return khoaRepository.save(khoa);
	}
	// get khoa by id rest api
	@GetMapping("/show_khoa_sv/{khoa_id}")
	public ResponseEntity<Khoa> getKhoaById(@PathVariable Long khoa_id) {
		Khoa khoa = khoaRepository.findById(khoa_id)
				.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + khoa_id));
		return ResponseEntity.ok(khoa);
	}
	// update khoa rest api
	
		@PutMapping("/show_khoa_sv/{khoa_id}")
		public ResponseEntity<Khoa> updateKhoa(@PathVariable Long khoa_id, @RequestBody Khoa khoaDetails){
			Khoa khoa = khoaRepository.findById(khoa_id)
					.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + khoa_id));
			
			khoa.setTenkhoa(khoaDetails.getTenkhoa());
			
			
			Khoa updatedKhoa = khoaRepository.save(khoa);
			return ResponseEntity.ok(updatedKhoa);
		}
		
		// delete khoa rest api
		@DeleteMapping("/show_khoa_sv/{khoa_id}")
		public ResponseEntity<Map<String, Boolean>> deleteKhoa(@PathVariable Long khoa_id){
			Khoa khoa = khoaRepository.findById(khoa_id)
					.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + khoa_id));
			
			khoaRepository.delete(khoa);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}
