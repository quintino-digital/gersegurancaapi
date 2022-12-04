package digital.quintino.gersegurancaapi.service;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.dto.AutenticadorResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AutenticadorService {

    @Autowired
    private UsuarioService usuarioService;

    // TODO -- Enviar E-mail, SMS ou Whatsapp para o usuário
    public AutenticadorResponseDTO recuperarCodigoNotificacaoUsuario(String identificador) {
        UsuarioDomain usuarioDomain = this.usuarioService.recuperarUsuario(identificador);
        if(usuarioDomain != null) {
            return new AutenticadorResponseDTO(this.gerarCodigoRecuperacaoAlteracaoChaveAcesso());
        }
        return new AutenticadorResponseDTO();
    }

    private String gerarCodigoRecuperacaoAlteracaoChaveAcesso() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }

}
