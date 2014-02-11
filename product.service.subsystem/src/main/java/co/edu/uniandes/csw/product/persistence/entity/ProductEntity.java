
package co.edu.uniandes.csw.product.persistence.entity;

import javax.persistence.Entity;

@Entity
public class ProductEntity extends _ProductEntity 
{
    
    // Atributos nuevos y sus metodos
    
    /**
     * Descripcion del producto
     */
    private String descripcion;
    
    /**
     * Unidades disponibles del producto
     */
    private int unidades;
    
    
    //--------------------------------------------
    //      Metodos
    //--------------------------------------------
    
    /**
     * Retorna la descripcion del producto
     * @return la descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripcion del producto
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Retorna las unidades disponibles del producto
     * @return las unidades disponibles producto
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Modifica las unidades disponibles del producto
     * @param cantidad 
     */
    public void setUnidades(int cantidad) {
        this.unidades = cantidad;
    }
}