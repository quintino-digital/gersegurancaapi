package digital.quintino.gersegurancaapi.service;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDomain saveOne(UsuarioDomain usuarioDomain) {
        return this.usuarioRepository.save(usuarioDomain);
    }

    public List<UsuarioDomain> findAll() {
        return this.usuarioRepository.findAll();
    }

}
