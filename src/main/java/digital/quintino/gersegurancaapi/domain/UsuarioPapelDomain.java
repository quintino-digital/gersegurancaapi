package digital.quintino.gersegurancaapi.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_USUARIO_PAPEL")
public class UsuarioPapelDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO", unique = true, nullable = false)
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioDomain usuarioDomain;

    @ManyToOne
    @JoinColumn(name = "ID_PAPEL")
    private PapelDomain papelDomain;

    public UsuarioPapelDomain() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public UsuarioDomain getUsuarioDomain() {
        return usuarioDomain;
    }

    public void setUsuarioDomain(UsuarioDomain usuarioDomain) {
        this.usuarioDomain = usuarioDomain;
    }

    public PapelDomain getPapelDomain() {
        return papelDomain;
    }

    public void setPapelDomain(PapelDomain papelDomain) {
        this.papelDomain = papelDomain;
    }

}
