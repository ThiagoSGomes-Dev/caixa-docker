package com.caixadocker.caixadocker;

import com.caixadocker.caixadocker.Caixa;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CaixadockerApplication {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		List<Caixa> caixa = new ArrayList();

		try {
			int regra;
			do {
				regra = Integer.parseInt(entrada.readLine());
				switch (regra) {
					case 1:
						String itens = entrada.readLine();
						Caixa objeto = new Caixa(itens);
						caixa.add(objeto);
					case 2:
						break;
					default:
						System.out.println("Número invalido :(");
				}
			} while(regra != 2);

			System.out.print("itens: [");

			for(int i = 0; i < caixa.size(); ++i) {
				if (i > 0) {
					System.out.print(", ");
				}

				System.out.print(caixa.get(i).getCorpo());
			}

			System.out.println("]");
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
