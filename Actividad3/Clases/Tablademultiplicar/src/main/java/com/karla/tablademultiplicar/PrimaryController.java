package com.karla.tablademultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField Digito;

    @FXML
    private TextArea txtAreaResultado;

    @FXML
    private void Calcular() {
        String texto = Digito.getText();
        
        if (texto == null || texto.trim().isEmpty()) {
            txtAreaResultado.setText("Por favor ingresa un número.");
            return;
        }

        try {
            int numero = Integer.parseInt(texto.trim());
            StringBuilder sb = new StringBuilder();
            
            for (int i = 1; i <= 10; i++) {
                sb.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
            }
            
            txtAreaResultado.setText(sb.toString());

        } catch (NumberFormatException e) {
            txtAreaResultado.setText("Error: Ingresa un número entero válido.");
        }
    }

    @FXML
    private void Limpiar() {
        Digito.clear();
        txtAreaResultado.clear();
    }
}