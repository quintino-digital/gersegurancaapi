package digital.quintino.gersegurancaapi.controller;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDomain> findAll() {
        return this.usuarioService.findAll();
    }

}
