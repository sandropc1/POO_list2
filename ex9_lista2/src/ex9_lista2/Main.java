package ex9_lista2;

//import java.awt.FlowLayout;
//import javax.swing.JFrame;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		new RadioButton();
		
		Musicas [] playlist = new Musicas[3];
		
	
		
		playlist[0] = new Musicas("Bunny Girl","1only");
		playlist[1] = new Musicas("Bungee Gum","Haarper");
		playlist[2] = new Musicas("Drive Safe","Rich Brian");
	
		
		
		Iterator musicasIterator = new MusicasIterator(playlist);
		
		System.out.println("Lista de músicas:\nSelecione a música que deseja ouvir no seletor");
		
		while(musicasIterator.hasNext()) {
			
		Musicas musica = (Musicas)musicasIterator.next();
		int posicao = musicasIterator.getPosicao();
		
		
		System.out.println(posicao +":"+musica.nome+"-"+musica.artista);
			}
		}
			
	}


