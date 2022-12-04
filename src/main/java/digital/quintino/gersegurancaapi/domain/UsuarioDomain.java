package digital.quintino.gersegurancaapi.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_USUARIO")
public class UsuarioDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO", unique = true, nullable = false)
    private Long codigo;

    @Column(name = "ID_PESSOA", unique = true, nullable = false)
    private String codigoPessoa;

    @Column(name = "NOME", unique = true, nullable = false)
    private String identificador;

    @Column(name = "DESCRICAO", unique = true, nullable = false)
    private String chaveAcesso;

    public UsuarioDomain() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(String codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

}
