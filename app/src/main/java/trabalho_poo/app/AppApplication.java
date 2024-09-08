package trabalho_poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		Aluno a1 = new Aluno(7.5, 10, 1);
		a1.imprimeFicha();
	}

}
