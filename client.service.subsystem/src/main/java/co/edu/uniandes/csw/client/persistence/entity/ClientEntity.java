
package co.edu.uniandes.csw.client.persistence.entity;

import javax.persistence.Entity;

@Entity
public class ClientEntity extends _ClientEntity 
{
    //Nuevos atributos y si m�todos getters y settes
    
    /**
     * Atributo que modela el sexo del cliente
     */
    private String sexo;
    
    /**
     * Atributo que modela la edad del cliente
     */
    private int edad;
    
    //--------------------------------------------------
    //    Metodos
    //--------------------------------------------------
    
    /**
     * Retorna el sexo del cliente
     * @return el sexo del cliente
     */
    public String getSexo() 
    {
        return sexo;
    }

    /**
     * Se modifica el sexo del estudiante
     * @param sexo 
     */
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    /**
     * Retorna la edad del cliente
     * @return la edad del cliente
     */
    public int getEdad() 
    {
        return edad;
    }

    /**
     * Se modifica la edad del estudiante
     * @param edad 
     */
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

}