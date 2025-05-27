package com.shashank.model;

import com.shashank.domain.VerificationType;

import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
