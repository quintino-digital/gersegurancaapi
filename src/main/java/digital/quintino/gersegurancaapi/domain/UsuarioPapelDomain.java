package digital.quintino.gersegurancaapi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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

    @Column(name = "DATA_CADASTRO", nullable = false)
    private Date dataCadastro;

    @Column(name = "DATA_DESATIVACAO")
    private Date dataDesativacao;

    public UsuarioPapelDomain() { }

    public UsuarioPapelDomain(UsuarioDomain usuarioDomain, PapelDomain papelDomain, Date dataCadastro, Date dataDesativacao) {
        this.usuarioDomain = usuarioDomain;
        this.papelDomain = papelDomain;
        this.dataCadastro = dataCadastro;
        this.dataDesativacao = dataDesativacao;
    }

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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataDesativacao() {
        return dataDesativacao;
    }

    public void setDataDesativacao(Date dataDesativacao) {
        this.dataDesativacao = dataDesativacao;
    }

}
