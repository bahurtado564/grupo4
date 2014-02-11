
package co.edu.uniandes.csw.client.persistence.entity;

import javax.persistence.Entity;

@Entity
public class ClientEntity extends _ClientEntity 
{
    private String sexo;
    private int edad;
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}