package org.minioasis.library.controller;

import org.minioasis.library.domain.Photo;
import org.minioasis.library.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photo")
public class PhotoRestController {

	@Autowired
	private PhotoRepository photoRepository;

	@GetMapping(path = "/patron/{id}", produces = "application/json")
	public Photo photoWithId(@PathVariable("id") String id) {

		Photo photo = null;
		
		try {

			photo = photoRepository.findPatronByIc(id);

		} catch (Exception ex) {

		}

		return photo;
	}

}