
package co.edu.uniandes.csw.pyme.logic.dto;

public class PymeDTO extends _PymeDTO {
   
    // Atributos nuevos y sus metodos get & set
    
    
    private String sector;
    private String propietario;

    
    //---------------------------------------
    // Metodos
    //---------------------------------------
    
    /**
     * Retorna el sector del Pyme
     * @return el sector del Pyme
     */
    public String getSector() {
        return sector;
    }

    /**
     * Modifica el sector del Pyme
     * @param sector 
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * Retorna el propietario del Pyme
     * @return el propietario del Pyme
     */
    public String getPropietario() {
        return propietario;
    }

     /**
     * Modifica el propietario del Pyme
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}