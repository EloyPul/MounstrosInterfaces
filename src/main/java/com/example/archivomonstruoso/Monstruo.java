package com.example.archivomonstruoso;

public class Monstruo {
    private String nombre, tipo, origen, genero, descripcion;
    private String habilidad1, habilidad2, habilidad3, habilidad4;
    private String rutaImagen;

    public Monstruo(String nombre, String tipo, String origen, String genero,
                    String descripcion, String habilidad1, String habilidad2,
                    String habilidad3, String habilidad4, String rutaImagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.origen = origen;
        this.genero = genero;
        this.descripcion = descripcion;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
        this.habilidad3 = habilidad3;
        this.habilidad4 = habilidad4;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getOrigen() { return origen; }
    public String getGenero() { return genero; }
    public String getDescripcion() { return descripcion; }
    public String getHabilidad1() { return habilidad1; }
    public String getHabilidad2() { return habilidad2; }
    public String getHabilidad3() { return habilidad3; }
    public String getHabilidad4() { return habilidad4; }
    public String getRutaImagen() { return rutaImagen; }
}
