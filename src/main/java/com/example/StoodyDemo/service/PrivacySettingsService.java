package com.example.StoodyDemo.service;

import com.example.StoodyDemo.model.repository.PrivacySettingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrivacySettingsService {

    private final PrivacySettingsRepository privacySettingsRepository;
}
