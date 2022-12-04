package digital.quintino.gersegurancaapi.controller;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuarioDomain cadastrarUsuario(@RequestBody UsuarioDomain usuarioDomain) {
        return this.usuarioService.saveOne(usuarioDomain);
    }

    @GetMapping
    public List<UsuarioDomain> findAll() {
        return this.usuarioService.findAll();
    }

}
