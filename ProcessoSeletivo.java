package Candidatura;
import java.util.random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		 string [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		 for (String Candidatos: Candidatos) {
			  entrandoemcontato(candidato)
		 }	 
	}
	static void entrandoemContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
	}
	
    //método auxiliar
		static boolean atender() {
			return new Random().nextInt(3)==1;	
		}
		
		
		
	static void imprimirSelecionados() {
	    string [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
	    
		System.out.println("imprimindo a lista de candidatos informando o indice do elemento");
		
		for (int indice=0; indice < candidatos.length;indice++) {
			System.out.println("o candidato de n° " + (indice+1) " é " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato: candidatos ) {
			System.out.println("o candidato selecionado foi " + candidato);
		}
	}
	
	
	static void selecaoCandidatos() {
		string [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
	    
		int candidatosSelecionados = 0;
		int candidatosAtual=0;
		double salarioBase=2000.0;
		while(candidatoSelecionados < 5 && candidatosAtual < Candidatos.length) {
			String candidato = candidatos[candidatosAtual];
		    double salarioPretendido = valorPretendido();
		    
		    System.out.println("o candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido );
		    if(salarioBase >= salarioPretendido) {
		    	System.out.println("o candidatos " + candidato + " foi selecionado para a vaga");
		    	candidatosSelecionados++;
		    }
		    candidatosAtual++;
	    }
    }
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double SalarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > SalarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO")
	    }else if(salarioBase==SalarioPretendido)
	    	System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
	    else {
	    	System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
	    }

    }
}
