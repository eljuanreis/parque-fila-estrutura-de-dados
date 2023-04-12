package view;

import br.edu.fateczl.filaobj.*;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) throws Exception {
		Fila queue = new Fila();
		
		for (int i = 0; i < 20; i++) {
			Pessoa p = new Pessoa("Pessoa " + i,
					randomIntegerNumber(40, 10), 
					randomFloatNumber(2.00, 1.35)
			);
	
			queue.insert(p);
		}
		
		ParqueController op = new ParqueController();
	
		op.brinquedo(queue);
	}
	
	public static int randomIntegerNumber(int max, int min) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static float randomFloatNumber(double d, double e) {
		return (float) (Math.random() * (d - e) + e);
	}

}
