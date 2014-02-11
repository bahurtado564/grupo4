
package co.edu.uniandes.csw.pyme.logic.dto;

public class PymeDTO extends _PymeDTO {
        private String sector;
        private String propietario;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}