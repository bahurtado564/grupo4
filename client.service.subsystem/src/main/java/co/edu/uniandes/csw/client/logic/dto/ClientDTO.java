package co.edu.uniandes.csw.client.logic.dto;

public class ClientDTO extends _ClientDTO 
{
    //Creacion 
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

        public int getEdad() 
        {
            return edad;
        }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
}