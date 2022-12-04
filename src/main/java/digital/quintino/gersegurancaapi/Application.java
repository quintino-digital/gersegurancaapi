package digital.quintino.gersegurancaapi;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
			application.setBannerMode(Banner.Mode.OFF);
			application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GERSEGURANCAAPI - Sistema de Gestão de Segurança Computacional (API) v1.0.0");
	}

}
