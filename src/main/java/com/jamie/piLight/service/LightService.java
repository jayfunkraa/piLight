package com.jamie.piLight.service;

import org.springframework.stereotype.Service;

public interface LightService {
    void switchOn();
    void switchOff();
    boolean isOn();
}
