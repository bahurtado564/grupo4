
package co.edu.uniandes.csw.product.persistence.entity;

import javax.persistence.Entity;

@Entity
public class ProductEntity extends _ProductEntity 
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

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}