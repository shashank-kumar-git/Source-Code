package com.shashank.service;

import com.shashank.domain.VerificationType;
import com.shashank.model.ForgotPasswordToken;
import com.shashank.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
