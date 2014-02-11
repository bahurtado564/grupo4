
package co.edu.uniandes.csw.product.logic.dto;

public class ProductDTO extends _ProductDTO 
{
    private String descripcion;
    private int unidades;
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int cantidad) {
        this.unidades = cantidad;
    }
}