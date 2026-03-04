package com.mpconnect.repository;

import com.mpconnect.entity.TourProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourProgramRepository extends JpaRepository<TourProgram, String> {
}
