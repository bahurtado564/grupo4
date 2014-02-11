
package co.edu.uniandes.csw.client.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ClientDTO {

	private Long id;
	private String name;
	private String cc;
        private String sexo;


        private int edad;

            public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
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
	public String getCc() {
		return cc;
	}
 
	public void setCc(String cc) {
		this.cc = cc;
	}
	
}