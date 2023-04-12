package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public ParqueController() {
		super();
	}
	
	public void brinquedo (Fila queue) throws Exception {
		while (!queue.isEmpty()) {
			Pessoa p = (Pessoa) queue.remove();
			
			String canGo = "est� proibido";

			if (p.altura > 1.60 && p.idade > 16) {
				canGo = "est� liberado";
			}
			
			System.out.println(p.nome + " - " + canGo);
		}
	}
	

}
