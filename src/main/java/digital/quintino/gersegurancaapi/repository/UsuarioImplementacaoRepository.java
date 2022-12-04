package digital.quintino.gersegurancaapi.repository;

import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class UsuarioImplementacaoRepository {

    @PersistenceContext
    private EntityManager entyEntityManager;

    public UsuarioDomain recuperarUsuario(String identificador) {
        StringBuilder query = new StringBuilder("SELECT usuarioDomain_ ")
                .append("FROM UsuarioDomain usuarioDomain_ ")
                .append("WHERE usuarioDomain_.identificador = :identificador_usuario_ ");
        TypedQuery<UsuarioDomain> typedQuery = this.entyEntityManager.createQuery(query.toString(), UsuarioDomain.class);
            typedQuery.setParameter("identificador_usuario_", identificador);
        return typedQuery.getSingleResult();
    }

}
