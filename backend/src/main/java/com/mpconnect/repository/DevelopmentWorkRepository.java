package com.mpconnect.repository;

import com.mpconnect.entity.DevelopmentWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopmentWorkRepository extends JpaRepository<DevelopmentWork, String> {
}
