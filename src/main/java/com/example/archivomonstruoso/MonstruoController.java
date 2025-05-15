package com.example.archivomonstruoso;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MonstruoController {

    @FXML
    private ImageView fondo_formulario;
    @FXML
    private ImageView foto_monstruo;
    @FXML
    private Button boton_aniadir_foto;
    @FXML
    private TextField entrada_nombre, entrada_tipo, entrada_origen, entrada_descripcion;
    @FXML
    private RadioButton comportamiento_pasivo, comportamiento_agresivo, comportamiento_neutral;
    @FXML
    private MenuButton entrada_genero;
    @FXML
    private Button boton_guardar, boton_salir;

    @FXML
    public void initialize() {
        fondo_formulario.setImage(new Image(getClass().getResource("/imagenes/fondo_formulario.jpg").toExternalForm()));

        boton_guardar.setOnAction(e -> {
            // Guardar lógica a implementar
        });

        boton_salir.setOnAction(e -> ((Stage) boton_salir.getScene().getWindow()).close());
    }
}
