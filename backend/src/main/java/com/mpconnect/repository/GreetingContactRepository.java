package com.mpconnect.repository;

import com.mpconnect.entity.GreetingContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingContactRepository extends JpaRepository<GreetingContact, String> {
}
