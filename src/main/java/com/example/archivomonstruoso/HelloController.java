package com.example.archivomonstruoso;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class HelloController {

    @FXML
    private Button portada_boton_catalogo;
    @FXML
    private Button portada_boton_creditos;
    @FXML
    private Button portada_boton_salir;

    @FXML
    public void initialize() {
        portada_boton_catalogo.setOnAction(e -> cargarVista("catalogo.fxml"));
        portada_boton_creditos.setOnAction(e -> cargarVista("creditos.fxml"));
        portada_boton_salir.setOnAction(e -> ((Stage) portada_boton_salir.getScene().getWindow()).close());
    }

    private void cargarVista(String archivoFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(archivoFXML));
            Parent root = loader.load();
            Stage stage = (Stage) portada_boton_catalogo.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
