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

    @Column(name = "IDENTIFICADOR", unique = true, nullable = false)
    private String identificador;

    @Column(name = "CHAVE_ACESSO", unique = true, nullable = false)
    private String chaveAcesso;

    // TODO -- Criar tabela para gerenciar geração de chaves de acesso
    @Column(name = "CODIGO_ALTERACAO_RECUPERACAO_CHAVE_ACESSO", unique = true)
    private String codigoAlteracaoRecuperacaoChave;

    public UsuarioDomain() { }

    public UsuarioDomain(String codigoPessoa, String identificador, String chaveAcesso) {
        this.codigoPessoa = codigoPessoa;
        this.identificador = identificador;
        this.chaveAcesso = chaveAcesso;
    }

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

    public String getCodigoAlteracaoRecuperacaoChave() {
        return codigoAlteracaoRecuperacaoChave;
    }

    public void setCodigoAlteracaoRecuperacaoChave(String codigoAlteracaoRecuperacaoChave) {
        this.codigoAlteracaoRecuperacaoChave = codigoAlteracaoRecuperacaoChave;
    }

}
