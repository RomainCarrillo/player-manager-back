package com.meetmyteam.feature.image;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.meetmyteam.domain.Image;
import com.meetmyteam.utils.ImageUtility;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

	@Autowired
	ImageRepository imageRepository;
	
	@PostMapping()
	public void postImage(@RequestParam("image") MultipartFile file) throws IOException {
		imageRepository.save(
				Image.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .image(ImageUtility.compressImage(file.getBytes())).build());
	}
	
}

/*
* https://www.techgeeknext.com/angular-upload-image-spring-boot-example
* https://www.techgeeknext.com/spring-boot/spring-boot-upload-image
*/