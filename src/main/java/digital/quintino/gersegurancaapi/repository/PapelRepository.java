package digital.quintino.gersegurancaapi.repository;

import digital.quintino.gersegurancaapi.domain.PapelDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PapelRepository extends JpaRepository<PapelDomain, Long> { }
