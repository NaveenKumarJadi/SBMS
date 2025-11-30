package com.naveen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.FileStorage;

public interface StorageRepository extends JpaRepository<FileStorage,Long> {

	 Optional<FileStorage> findByFileName(String fileName);
}

