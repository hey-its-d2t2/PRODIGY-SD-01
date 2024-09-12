package com.PRODIGY_SD_01.service;

import com.PRODIGY_SD_01.model.Temperature;

public interface TemperatureService {
    Temperature convertToFahrenheit(Temperature temp);
    Temperature convertToCelsius(Temperature temp);
    Temperature convertToKelvin(Temperature temp);
    Temperature convertToReaumur(Temperature temp);
}
