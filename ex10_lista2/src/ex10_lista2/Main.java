package ex10_lista2;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
	
		Aluno aluno = Aluno.getAluno();
		
		
		aluno.setNome("Sandro");
		aluno.setRA("2270404");
	
		String nome_aluno = aluno.getNome();
		String RA_aluno = aluno.getRA();
		
		new CaixaDeTexto(nome_aluno,RA_aluno);
	}

}
