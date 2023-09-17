package controller;

import model.PilhaString;

public class SequenciaController {

	public void operacoesPilha(PilhaString p) {
		int tamanho = p.size();	//REcebe o tamanho da pilha passada como parâmetro
		
		for (int i = 0; i < tamanho; i++) {
			
			try {	//O try catch assegura que não haverá problema se não for encontrado valor algum quando pop e top for chamado
				
				if (p.top()=="R" || p.top()=="W") {
					System.out.print(p.pop()+" ");
				}else {
					p.pop();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		p.push("L");
		p.push("B");
		p.push("M");
		p.push("G");
		p.push("K");
	}
}
