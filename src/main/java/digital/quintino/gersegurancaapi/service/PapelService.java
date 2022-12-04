package digital.quintino.gersegurancaapi.service;

import digital.quintino.gersegurancaapi.domain.PapelDomain;
import digital.quintino.gersegurancaapi.repository.PapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PapelService {

    @Autowired
    private PapelRepository papelRepository;

    public PapelDomain saveOne(PapelDomain papelDomain) {
        return this.papelRepository.save(papelDomain);
    }

}
