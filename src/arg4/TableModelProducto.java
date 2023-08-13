/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arg4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kevin
 */
public class TableModelProducto extends AbstractTableModel {
    
private String[] columnas = {"Codigo", "Categoria", "Marca", "Nombre", "Precio"};
private List<Articulo> articulo = new ArrayList<>();

    public TableModelProducto(List<Articulo> arti) {
        this.articulo = arti;
    }

    @Override
    public int getRowCount() {
        return this.articulo.size();
    }

    @Override
    public int getColumnCount() {
      return this.columnas.length;
    }  

    @Override
    public Object getValueAt(int fila, int columna) {
        Object resp;
        
        switch(columna){
            case 0:
                resp = this.articulo.get(fila).getCodigo();
                break;
            case 1:
                resp = this.articulo.get(fila).getCategoria();
                break;
            case 2:
                resp = this.articulo.get(fila).getMarca();
                break;
            case 3:
                resp = this.articulo.get(fila).getNombre();
                break;
            default:
                resp = this.articulo.get(fila).getPrecio();
                
        }
        
        return resp;
    }
    @Override
    public String getColumnName(int colum){
        return this.columnas[colum];
    }
    
    public void actualizarTabla(){
        fireTableDataChanged();
        
    }
    
    public Articulo detalle(int fila){
        return this.articulo.get(fila);
    }
}
