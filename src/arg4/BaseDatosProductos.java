/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arg4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class BaseDatosProductos {
    private HashMap<Integer, Articulo> listaProductos = new HashMap<>();

    public BaseDatosProductos() {
        this.listaProductos.put(1, new Articulo(1,"Hogar", "Comfort life", "Cama matrimonial", 100000));
        this.listaProductos.put(2, new Articulo(2,"Hogar", "Mainstays", "Sillon", 75000));
        this.listaProductos.put(3, new Articulo(3,"Hogar", "Mainstays","Comedor", 65000));
        this.listaProductos.put(4, new Articulo(4,"Hogar","RTA", "Mesa de noche", 50000));
        this.listaProductos.put(5, new Articulo(5,"Hogar","Comomodity", "Armario", 70000));
        this.listaProductos.put(6, new Articulo(6,"Entretenimiento", "RCA", "Smart TV 50p", 170000));
        this.listaProductos.put(7, new Articulo(7,"Entretenimiento", "Sony", "Playstation 5", 400000));
        this.listaProductos.put(8, new Articulo(8,"Entretenimiento", "Nintendo", "Nintendo Switch", 200000));
        this.listaProductos.put(9, new Articulo(9,"Entretenimiento", "Samsung", "Celular", 250000));
        this.listaProductos.put(10, new Articulo(10,"Entretenimiento", "Acer", "Laptop", 300000));
        this.listaProductos.put(11, new Articulo(11, "Ferreteria", "Makita", "Caladora", 40000));
        this.listaProductos.put(12, new Articulo(12, "Ferreteria", "Gladiator", "Metado", 43500));
        this.listaProductos.put(13, new Articulo(13, "Ferreteria", "Stanley", "Taladro", 50000));
        this.listaProductos.put(14, new Articulo(14,"Ferreteria", "De Walt", "Lijadora", 20000));
        this.listaProductos.put(15, new Articulo(15, "Ferreteria", "Neo", "Pulidora", 20000));
    }
    
    public List<Articulo> getListaProductos() {
        return new ArrayList(this.listaProductos.values());
        
    }
    public void setListaProductos(HashMap<Integer, Articulo> listaProductos) {
        this.listaProductos = listaProductos;    
    }
    
    public boolean verificarExistencias(Articulo articulo) {
        return this.listaProductos.containsKey(articulo.getCodigo());  
        
    }
    
    public boolean verificarExistencias(String nombre) {
        for (Articulo p : this.listaProductos.values()) {
            if(nombre.toLowerCase().equals(p.getNombre().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
            
    
    public int ultimoCodigo () {
        int codigo = 0;
        for(Articulo p : this.listaProductos.values()){
            codigo = p.getCodigo ();
  
        }
        return codigo;
    }
    
    public void agregar(Articulo p) {
        this.listaProductos.put(p.getCodigo(), p);
    }
    public void actualizar(Articulo p) {
        this.listaProductos.replace(p.getCodigo(), p);
    }
    
    public void borrar (Articulo  p) {
        this.listaProductos.remove(p.getCodigo());
        
    }
    
    public String generarInforme() {
        List<Articulo> listaM = obtenerMayores();
        return listaM.get(0).getNombre()+" "+listaM.get(1).getNombre()+" "+listaM.get(2).getNombre();
}

private List<Articulo> obtenerMayores() {
    List<Articulo> lista = new ArrayList<>(this.listaProductos.values());
    List<Articulo> listaMayores = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        Articulo p = new Articulo();
        for (Articulo pTemp : lista) {
            if(pTemp.getPrecio() > p.getPrecio()) {
                p = pTemp;
                
            }
        }
        listaMayores.add(p);
        lista.remove(p);
        
      
        }
    return listaMayores;
    }

}