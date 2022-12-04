package digital.quintino.gersegurancaapi.service;

import digital.quintino.gersegurancaapi.domain.UsuarioPapelDomain;
import digital.quintino.gersegurancaapi.repository.UsuarioPapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioPapelService {

    @Autowired
    private UsuarioPapelRepository usuarioPapelRepository;

    public UsuarioPapelDomain saveOne(UsuarioPapelDomain usuarioPapelDomain) {
        return this.usuarioPapelRepository.save(usuarioPapelDomain);
    }

}
