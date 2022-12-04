package digital.quintino.gersegurancaapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutenticadorRequestDTO {

    @JsonProperty("identificador")
    private String identificadorUsuario;

    public AutenticadorRequestDTO() { }

    public String getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

}
