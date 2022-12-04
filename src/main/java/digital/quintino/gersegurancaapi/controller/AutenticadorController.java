package digital.quintino.gersegurancaapi.controller;

import digital.quintino.gersegurancaapi.dto.AutenticadorRequestDTO;
import digital.quintino.gersegurancaapi.dto.AutenticadorResponseDTO;
import digital.quintino.gersegurancaapi.service.AutenticadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autenticador")
public class AutenticadorController {

    @Autowired
    private AutenticadorService autenticadorService;

    @PostMapping("/recuperar-codigo-usuario")
    public AutenticadorResponseDTO recuperarCodigoNotificacaoUsuario(@RequestBody AutenticadorRequestDTO autenticadorRequestDTO) {
        return this.autenticadorService.recuperarCodigoNotificacaoUsuario(autenticadorRequestDTO.getIdentificadorUsuario());
    }

}
