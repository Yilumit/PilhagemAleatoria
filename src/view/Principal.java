package view;
/*
 * 	Um pilha qualquer com uma sequencia de operações
 */
import controller.SequenciaController;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PilhaString p = new PilhaString();
		SequenciaController op = new SequenciaController();
		
		//Push dos caracteres da pilha
		p.push("W");
		p.push("L");
		p.push("H");
		p.push("B");
		p.push("R");
		p.push("G");
		p.push("J");
		
		op.operacoesPilha(p); //Faz a chamda das operações, passando a pilha criada como parâmetro
	}

}
