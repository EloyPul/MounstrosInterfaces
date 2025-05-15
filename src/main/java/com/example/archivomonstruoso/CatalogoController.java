package com.example.archivomonstruoso;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CatalogoController {

    @FXML
    private ImageView fondo_catalogo;
    @FXML
    private ListView<Monstruo> lista_monstruos;
    @FXML
    private TextArea buscador;
    @FXML
    private ImageView imagen_monstruo;
    @FXML
    private Label nombre_label;
    @FXML
    private Label descripcion_label;
    @FXML
    private Label habilidad1, habilidad2, habilidad3, habilidad4;
    @FXML
    private Button aniadir_boton, salir_boton;

    private ObservableList<Monstruo> monstruos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        fondo_catalogo.setImage(new Image(getClass().getResource("/imagenes/fondo_catalogo.jpg").toExternalForm()));

        lista_monstruos.setItems(monstruos);
        lista_monstruos.setCellFactory(param -> new ListCell<>() {
            private final ImageView imageView = new ImageView();

            @Override
            protected void updateItem(Monstruo item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setGraphic(null);
                    setText(null);
                } else {
                    imageView.setImage(new Image(item.getRutaImagen()));
                    imageView.setFitWidth(30);
                    imageView.setFitHeight(30);
                    setGraphic(imageView);
                    setText(item.getNombre());
                }
            }
        });

        lista_monstruos.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> mostrarMonstruo(newVal));

        aniadir_boton.setOnAction(e -> {
            // Abrir formulario nuevo (lógica a implementar)
        });

        salir_boton.setOnAction(e -> ((Stage) salir_boton.getScene().getWindow()).close());
    }

    private void mostrarMonstruo(Monstruo monstruo) {
        if (monstruo != null) {
            imagen_monstruo.setImage(new Image(monstruo.getRutaImagen()));
            nombre_label.setText(monstruo.getNombre());
            habilidad1.setText(monstruo.getHabilidad1());
            habilidad2.setText(monstruo.getHabilidad2());
            habilidad3.setText(monstruo.getHabilidad3());
            habilidad4.setText(monstruo.getHabilidad4());
            descripcion_label.setText(monstruo.getDescripcion());
        }
    }
}
