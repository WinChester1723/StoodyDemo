package com.example.StoodyDemo.service;

import com.example.StoodyDemo.model.repository.ContactInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactInfoService {

    private final ContactInfoRepository contactInfoRepository;
}
