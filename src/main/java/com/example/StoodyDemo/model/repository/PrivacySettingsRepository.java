package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.PrivacySettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivacySettingsRepository extends JpaRepository<PrivacySettings, Integer> {
}
