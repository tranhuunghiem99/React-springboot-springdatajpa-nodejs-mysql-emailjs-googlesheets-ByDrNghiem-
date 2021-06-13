package com.Nghiem.tgu.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Nghiem.tgu.Model.Tutorial;
import com.Nghiem.tgu.Repository.TutorialRepository;

import Exception.ResourceNotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/khoasv/")
public class TutorialController {

	@Autowired
	TutorialRepository tutorialRepository;

	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
		try {
			List<Tutorial> tutorials = new ArrayList<Tutorial>();

			if (title == null)
				tutorialRepository.findAll().forEach(tutorials::add);
			else
				tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/tutorials")
	public Tutorial createTutorials(@RequestBody Tutorial tutorials) {
		return tutorialRepository.save(tutorials);
	}

//	@GetMapping("/tutorials/{id}")
//	public ResponseEntity<Tutorial> getTutorualById(@PathVariable Long id) {
//		Tutorial tutorials = tutorialRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + id));
//		return ResponseEntity.ok(tutorials);
//	}
	@GetMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
		Optional<Tutorial> tutorialData = tutorialRepository.findById(id);

		if (tutorialData.isPresent()) {
			return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorialsDetails) {
		Tutorial tutorials = tutorialRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + id));

		tutorials.setKhoa_name(tutorialsDetails.getKhoa_name());

		Tutorial updatedTutorial = tutorialRepository.save(tutorials);
		return ResponseEntity.ok(updatedTutorial);
	}

	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteTutorial(@PathVariable Long id) {
		Tutorial tutorial = tutorialRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Khoa not exist with id :" + id));

		tutorialRepository.delete(tutorial);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
