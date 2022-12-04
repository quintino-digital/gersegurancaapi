package digital.quintino.gersegurancaapi.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PAPEL")
public class PapelDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO", unique = true, nullable = false)
    private Long codigo;

    @Column(name = "NOME", unique = true, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", unique = true, nullable = false)
    private String descricao;

    public PapelDomain() { }

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
