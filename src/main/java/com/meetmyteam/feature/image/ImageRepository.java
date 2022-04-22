package com.meetmyteam.feature.image;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetmyteam.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{
}
