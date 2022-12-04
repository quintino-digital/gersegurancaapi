package digital.quintino.gersegurancaapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutenticadorResponseDTO {

    @JsonProperty("codigo")
    private String codigoAlteracaoRecuperacaoUsuario;

    public AutenticadorResponseDTO() { }

    public AutenticadorResponseDTO(String codigoAlteracaoRecuperacaoUsuario) {
        this.codigoAlteracaoRecuperacaoUsuario = codigoAlteracaoRecuperacaoUsuario;
    }

    public String getCodigoAlteracaoRecuperacaoUsuario() {
        return codigoAlteracaoRecuperacaoUsuario;
    }

    public void setCodigoAlteracaoRecuperacaoUsuario(String codigoAlteracaoRecuperacaoUsuario) {
        this.codigoAlteracaoRecuperacaoUsuario = codigoAlteracaoRecuperacaoUsuario;
    }

}
