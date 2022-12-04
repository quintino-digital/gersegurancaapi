package digital.quintino.gersegurancaapi.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PAPEL")
public class PapelDomain implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "CODIGO", unique = true, nullable = false)
    private Long codigo;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    public PapelDomain() { }

    public PapelDomain(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
