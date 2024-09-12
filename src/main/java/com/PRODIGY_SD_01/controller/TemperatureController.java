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
                                     @RequestParam String fromUnit,
                                     @RequestParam String toUnit,
                                     Model model) {

        // Create a Temperature object based on user input
        Temperature inputTemp = new Temperature(value, fromUnit);
        Temperature convertedTemp;

        // Perform the conversion based on the selected "to" unit
        switch (toUnit) {
            case "Celsius":
                convertedTemp = temperatureService.convertToCelsius(inputTemp);
                break;
            case "Fahrenheit":
                convertedTemp = temperatureService.convertToFahrenheit(inputTemp);
                break;
            case "Kelvin":
                convertedTemp = temperatureService.convertToKelvin(inputTemp);
                break;
            case "Reaumur":
                convertedTemp = temperatureService.convertToReaumur(inputTemp);
                break;
            default:
                throw new IllegalArgumentException("Invalid target unit");
        }

        // Add original input and conversion results to the model to be displayed
        model.addAttribute("value", value);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("convertedValue", convertedTemp.getValue());

        return "index"; // Return to the same page with results
    }
}
