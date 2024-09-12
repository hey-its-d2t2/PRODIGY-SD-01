package com.PRODIGY_SD_01.controller;

import com.PRODIGY_SD_01.model.Temperature;
import com.PRODIGY_SD_01.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/convert")
    public String convertTemperature(@RequestParam double value,
                                     @RequestParam String unit,
                                     Model model) {
        Temperature inputTemp = new Temperature(value, unit);

        Temperature celsius = temperatureService.convertToCelsius(inputTemp);
        Temperature fahrenheit = temperatureService.convertToFahrenheit(inputTemp);
        Temperature kelvin = temperatureService.convertToKelvin(inputTemp);

        model.addAttribute("celsius", celsius.getValue());
        model.addAttribute("fahrenheit", fahrenheit.getValue());
        model.addAttribute("kelvin", kelvin.getValue());
        model.addAttribute("inputUnit", unit);

        return "result";
    }
}