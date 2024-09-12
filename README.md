# Temperature Converter 🌡️

This project is developed as part of my internship at **Prodigy Infotech**. It is **Task No. 01**, where I was assigned to create a web-based Temperature Converter. The application is built with Java Spring Boot for the backend and uses Thymeleaf, HTML, CSS, and JavaScript for the frontend. The converter allows users to easily convert temperatures between Celsius, Fahrenheit, Kelvin, and Reaumur. The design focuses on providing a user-friendly, responsive interface to ensure accurate and efficient temperature conversions.

---

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Conversion Formulas](#conversion-formulas)
- [API Endpoints](#api-endpoints)
- [UI Screenshots](#ui-screenshots)
- [License](#license)
- [Acknowledgements](#acknowledgements)
- [Contact](#contact)

---

## Features

- 🔄 **Convert** temperature between Celsius, Fahrenheit, Kelvin, and Reaumur.
- 📊 **Dynamic Results**: Displays converted results dynamically.
- 🖥️ **Responsive Design** using Tailwind CSS.
- 💻 **Error Handling**: Ensures valid input with required fields.
- 🎨 **Interactive UI**: Includes form input fields, dropdowns, and dynamic result display.

---

## Tech Stack

- **Backend**: Java Spring Boot, Thymeleaf
- **Frontend**: HTML, CSS (Tailwind CSS), JavaScript
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA

---

## Setup and Installation

Follow the instructions below to run this project locally:

### Prerequisites
1. Ensure you have **Java 11** or above installed.
2. Install **Maven** for managing dependencies.
3. Set up your IDE (IntelliJ, Eclipse, or any other Java IDE).

### Steps
1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/your-github-username/temperature-converter.git
    ```

2. Navigate to the project directory:
    ```bash
    cd temperature-converter
    ```

3. Open the project in your IDE and let Maven download the required dependencies.

4. Build the project:
    ```bash
    mvn clean install
    ```

5. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

6. Open your browser and navigate to:
    ```
    http://localhost:8080
    ```

---

## Usage

1. Enter a **temperature value** in the input field.
2. Select the **unit** from which you want to convert (e.g., Celsius, Fahrenheit).
3. Select the **unit** to which you want to convert.
4. Click the **Convert** button to see the result.

The converted temperature will be displayed under the form.

---

## Conversion Formulas

Here are the formulas used for converting between different temperature units:

- **Celsius to Fahrenheit**: (°C × 9/5) + 32
- **Fahrenheit to Celsius**: (°F − 32) × 5/9
- **Celsius to Kelvin**: °C + 273.15
- **Kelvin to Celsius**: K − 273.15
- **Reaumur to Celsius**: °Ré × 1.25

---

## API Endpoints

| Endpoint               | Method | Description                           |
|------------------------|--------|---------------------------------------|
| `/convert`             | POST   | Converts temperature based on input   |

### Request Example:
```json
POST /convert
{
  "value": 100,
  "fromUnit": "Celsius",
  "toUnit": "Fahrenheit"
}
```
### Response Example:
```json
{
  "value": 100,
  "fromUnit": "Celsius",
  "toUnit": "Fahrenheit",
  "convertedValue": 212.0
}
```
---
### UI Screenshots
  ![Temperature Converter](https://github.com/user-attachments/assets/4723126d-efde-4efc-ab8c-710afc147e4e)
  
---
### Acknowledgements
- Thanks to Prodigy Infotech for the opportunity to work on this project.
---
### Contact
Deepak Singh
- For any questions or feedback, please contact me at deepsinghkumar01@gmail.com.
---

### **Explanation of Sections:**

1. **Features**: A short list of key features of the Temperature Converter app.
2. **Tech Stack**: The technologies used to build the project.
3. **Setup and Installation**: Step-by-step instructions to get the project running on a local machine.
4. **Usage**: Details on how to use the web application once it's up and running.
5. **Conversion Formulas**: The mathematical formulas used in the temperature conversions.
6. **API Endpoints**: List of API endpoints for the conversion process.
7. **UI Screenshots**: Placeholder for screenshots of the application.
8. **License**: Information about the licensing of the project.
9. **Acknowledgements**: Credits and thanks to anyone who inspired or contributed to the project.
10. **Contact**: Your contact information for anyone who wishes to reach out.

### Feel free to customize this template with your project details and API specifics!
