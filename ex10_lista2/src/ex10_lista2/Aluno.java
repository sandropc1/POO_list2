package ex10_lista2;

public class Aluno {

	private static String nome;
	private static String RA;
	
	private static Aluno uniqueInstance;
	
	private Aluno(String nome,String RA) {
		
		Aluno.nome = nome;
		Aluno.RA = RA;
		
	}

	public synchronized static Aluno getAluno() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Aluno(nome,RA);	
		}	
		return uniqueInstance;
	}
	
	public void setNome(String nome) {
		
		Aluno.nome = nome;
		}
	
	public void setRA(String RA) {
		
		Aluno.RA = RA;
		}
	
	
	public String getNome() {
		
		return nome;
		}
		
public String getRA() {
		
		return RA;
		}
	
	
}
