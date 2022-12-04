package digital.quintino.gersegurancaapi.repository;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDomain, Long> {
    public UsuarioDomain findByIdentificador(String identificador);
}
