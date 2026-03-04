package com.mpconnect.repository;

import com.mpconnect.entity.PlanTodayEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanTodayEventRepository extends JpaRepository<PlanTodayEvent, String> {
}
