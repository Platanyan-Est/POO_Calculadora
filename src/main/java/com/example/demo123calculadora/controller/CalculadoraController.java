package com.example.demo123calculadora.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CalculadoraController {
    @FXML
    private TextField numeroUnoText;
    @FXML
    private TextField numeroDosText;
    @FXML
    private Label resultadoLabel;

    @FXML
    private void onSumar(){
        int num1 = Integer.parseInt(numeroUnoText.getText());
        int num2 = Integer.parseInt(numeroDosText.getText());
        int resultado = num1 + num2;
        resultadoLabel.setText("Resultado: "+resultado);
    }
}
