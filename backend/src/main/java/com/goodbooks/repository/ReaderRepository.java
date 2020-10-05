package com.goodbooks.repository;

import com.goodbooks.domain.Reader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
    
}
