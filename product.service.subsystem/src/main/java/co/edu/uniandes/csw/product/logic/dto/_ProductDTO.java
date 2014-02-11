
package co.edu.uniandes.csw.product.logic.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ProductDTO {

	private Long id;
	private String name;
	private Long value;
        private String descripcion;

        private int unidades;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public Long getValue() {
		return value;
	}
 
	public void setValue(Long value) {
		this.value = value;
	}
	
        
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