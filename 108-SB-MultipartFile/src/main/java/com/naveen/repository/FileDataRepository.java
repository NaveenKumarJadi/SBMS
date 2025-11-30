package com.naveen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.FileData;

public interface FileDataRepository extends JpaRepository<FileData, Long> {

	Optional<FileData> findByName(String fileName);

	Optional<FileData> findByStoredName(String storedName);

}
