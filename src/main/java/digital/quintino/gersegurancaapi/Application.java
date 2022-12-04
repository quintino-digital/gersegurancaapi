package digital.quintino.gersegurancaapi;

import digital.quintino.gersegurancaapi.domain.PapelDomain;
import digital.quintino.gersegurancaapi.domain.UsuarioDomain;
import digital.quintino.gersegurancaapi.domain.UsuarioPapelDomain;
import digital.quintino.gersegurancaapi.repository.PapelRepository;
import digital.quintino.gersegurancaapi.repository.UsuarioPapelRepository;
import digital.quintino.gersegurancaapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PapelRepository papelRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private UsuarioPapelRepository usuarioPapelRepository;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
			application.setBannerMode(Banner.Mode.OFF);
			application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GERSEGURANCAAPI - Sistema de Gestão de Segurança Computacional (API) v1.0.0");
		this.repository();
	}

	private void repository() {

		PapelDomain papelDomain1 = new PapelDomain("Administrador", "Administrador Geral do Sistema");
		PapelDomain papelDomain2 = new PapelDomain("Usuário Padrão", "Usuário Padrão do Sistema");
			this.papelRepository.saveAll(Arrays.asList(papelDomain1, papelDomain2));

		UsuarioDomain usuarioDomain1 = new UsuarioDomain("2cf31501-a964-4440-b3bf-254fe57401ca", "email1@provedor.com.br", "254fe57401ca");
		UsuarioDomain usuarioDomain2 = new UsuarioDomain("61ee4eee-7b0a-49e5-8605-8551f77b9c63", "email2@provedor.com.br", "8551f77b9c63");
			this.usuarioRepository.saveAll(Arrays.asList(usuarioDomain1, usuarioDomain2));

		UsuarioPapelDomain usuarioPapelDomain1 = new UsuarioPapelDomain(usuarioDomain1, papelDomain1, new Date(), null);
		UsuarioPapelDomain usuarioPapelDomain2 = new UsuarioPapelDomain(usuarioDomain1, papelDomain2, new Date(), null);

			this.usuarioPapelRepository.saveAll(Arrays.asList(usuarioPapelDomain1, usuarioPapelDomain2));

		System.out.println("Cadastros Finalizados com Sucesso!");

	}

}
