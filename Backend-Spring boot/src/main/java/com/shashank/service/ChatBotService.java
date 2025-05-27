package com.shashank.service;

import com.shashank.model.CoinDTO;
import com.shashank.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
