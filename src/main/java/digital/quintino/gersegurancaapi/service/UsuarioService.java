package digital.quintino.gersegurancaapi.service;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.repository.UsuarioImplementacaoRepository;
import digital.quintino.gersegurancaapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioImplementacaoRepository usuarioImplementacaoRepository;

    public UsuarioDomain saveOne(UsuarioDomain usuarioDomain) {
        return this.usuarioRepository.save(usuarioDomain);
    }

    public UsuarioDomain recuperarUsuario(String identificador) {
        return this.usuarioImplementacaoRepository.recuperarUsuario(identificador);
    }

    public List<UsuarioDomain> findAll() {
        return this.usuarioRepository.findAll();
    }

}
