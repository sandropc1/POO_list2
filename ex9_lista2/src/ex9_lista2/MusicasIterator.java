package ex9_lista2;

//import java.util.ArrayList;

public class MusicasIterator implements Iterator{

	Musicas[] playlist;
	int posicao = 0;
	
	public MusicasIterator(Musicas[] playlist) {
		this.playlist = playlist;
	}

	
	public boolean hasNext() {
		
		if(posicao >= playlist.length || playlist[posicao] == null) {
			return false;
		}else {
			return true;
		}	
	}

	public int getPosicao() {
		
		return posicao;
	}

	public Object next() {
		
		Musicas musica = playlist[posicao];
		posicao++;
		
		return musica;
	}

}
