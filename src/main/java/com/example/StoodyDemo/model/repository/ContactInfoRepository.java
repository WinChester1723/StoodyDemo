package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {
}
