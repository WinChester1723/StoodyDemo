package com.example.StoodyDemo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrivacySettingsDTO {

    private boolean showProfileOnlyLoggedUsers;
    private boolean showOwnedCoursesOnlyLoggedUsers;
}
