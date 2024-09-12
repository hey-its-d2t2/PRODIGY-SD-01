package com.PRODIGY_SD_01.serviceImpl;

import com.PRODIGY_SD_01.model.Temperature;
import com.PRODIGY_SD_01.service.TemperatureService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Override
    public Temperature convertToFahrenheit(Temperature temp) {
        double convertedValue;
        if (temp.getUnit().equalsIgnoreCase("Celsius")) {
            convertedValue = (temp.getValue() * 9/5) + 32;
        } else if (temp.getUnit().equalsIgnoreCase("Kelvin")) {
            convertedValue = (temp.getValue() - 273.15) * 9/5 + 32;
        } else {
            convertedValue = temp.getValue();
        }
        return new Temperature(convertedValue, "Fahrenheit");
    }

    @Override
    public Temperature convertToCelsius(Temperature temp) {
         double convertedValue;
        if (temp.getUnit().equalsIgnoreCase("Fahrenheit")) {
            convertedValue = (temp.getValue() - 32) * 5/9;
        } else if (temp.getUnit().equalsIgnoreCase("Kelvin")) {
            convertedValue = temp.getValue() - 273.15;
        } else {
            convertedValue = temp.getValue();
        }
        return new Temperature(convertedValue, "Celsius");
    }

    @Override
    public Temperature convertToKelvin(Temperature temp) {
        double convertedValue;
        if (temp.getUnit().equalsIgnoreCase("Celsius")) {
            convertedValue = temp.getValue() + 273.15;
        } else if (temp.getUnit().equalsIgnoreCase("Fahrenheit")) {
            convertedValue = (temp.getValue() - 32) * 5/9 + 273.15;
        } else {
            convertedValue = temp.getValue();
        }
        return new Temperature(convertedValue, "Kelvin");
    }

    @Override
    public Temperature convertToReaumur(Temperature temp) {
        double convertedValue;
        if (temp.getUnit().equalsIgnoreCase("Celsius")) {
            convertedValue = temp.getValue() * 0.8;
        } else if (temp.getUnit().equalsIgnoreCase("Fahrenheit")) {
            double celsius = (temp.getValue() - 32) * 5/9;
            convertedValue = celsius * 0.8;
        } else if (temp.getUnit().equalsIgnoreCase("Kelvin")) {
            double celsius = temp.getValue() - 273.15;
            convertedValue = celsius * 0.8;
        } else {
            convertedValue = temp.getValue(); // Reaumur to Reaumur
        }
        return new Temperature(convertedValue, "Reaumur");
    }
}
