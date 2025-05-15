package com.example.archivomonstruoso;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CreditosController {

    @FXML
    private ImageView fondo_creditos;
    @FXML
    private ListView<String> informacion;
    @FXML
    private ImageView titulo;

    @FXML
    public void initialize() {
        fondo_creditos.setImage(new Image(getClass().getResource("/imagenes/fondo_creditos.jpg").toExternalForm()));
        titulo.setImage(new Image(getClass().getResource("/imagenes/titulo_creditos.png").toExternalForm()));
        informacion.getItems().addAll(
                "Proyecto creado por [Tu Nombre]",
                "Fecha: Mayo 2025",
                "JavaFX con Maven",
                "Diseño por [Tu equipo]"
        );
    }
}
