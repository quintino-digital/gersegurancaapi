package digital.quintino.gersegurancaapi.repository;

import digital.quintino.gersegurancaapi.domain.UsuarioPapelDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPapelRepository extends JpaRepository<UsuarioPapelDomain, Long> { }
