
package co.edu.uniandes.csw.pyme.persistence.entity;

import javax.persistence.Entity;

@Entity
public class PymeEntity extends _PymeEntity 
{
    private String propietario;
    private String sector;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}