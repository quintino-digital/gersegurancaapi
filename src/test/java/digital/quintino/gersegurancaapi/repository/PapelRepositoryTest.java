package digital.quintino.gersegurancaapi.repository;

import digital.quintino.gersegurancaapi.domain.PapelDomain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PapelRepositoryTest {

    @Autowired
    private PapelRepository papelRepository;

    @Test
    void cadastrarPapelDomain1() {
        PapelDomain papelDomain1 = new PapelDomain("Papel Teste 1", "Descrição do Papel Teste 1");
        PapelDomain retornoPapelDomain = this.papelRepository.save(papelDomain1);
        Assertions.assertEquals(retornoPapelDomain.getCodigo(), this.papelRepository.findById(retornoPapelDomain.getCodigo()).get().getCodigo());
    }

    @Test
    void cadastrarPapelDomain2() {
        PapelDomain papelDomain2 = new PapelDomain("Papel Teste 2", "Descrição do Papel Teste 2");
        PapelDomain retornoPapelDomain = this.papelRepository.save(papelDomain2);
        Assertions.assertEquals(retornoPapelDomain.getCodigo(), this.papelRepository.findById(retornoPapelDomain.getCodigo()).get().getCodigo());
    }
  
}