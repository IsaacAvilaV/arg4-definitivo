/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arg4;

/**
 *
 * @author Kevin
 */
public class Articulo {
    private int codigo;
    private String categoria;
    private String marca;
    private String nombre;
    private double precio;

    public Articulo(int codigo, String categoria, String marca, String nombre, double precio) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Articulo() {
        
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
