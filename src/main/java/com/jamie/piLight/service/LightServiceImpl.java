package com.jamie.piLight.service;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Service;

@Service
public class LightServiceImpl implements LightService {

    private GpioPinDigitalOutput lightPin;

    public LightServiceImpl() {
        final GpioController gpio = GpioFactory.getInstance();
        lightPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, PinState.LOW);
    }

    @Override
    public void switchOn() {
        lightPin.high();
    }

    @Override
    public void switchOff() {
        lightPin.low();
    }

    @Override
    public boolean isOn() {
        return lightPin.isHigh();
    }
}
