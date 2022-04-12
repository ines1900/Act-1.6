package ProjetMusique;

public class PlayListeUI {
	public static void main(String[] args) {
		MusiqueImpl musique1 = new MusiqueImpl("tit1", "aut1", "interprete1", "genre1");
		MusiqueImpl musique2 = new MusiqueImpl("tit2", "aut2", "interprete2", "genre2");
		MusiqueImpl musique3 = new MusiqueImpl("tit3", "aut3", "interprete3", "genre3");
		MusiqueImpl musique4 = new MusiqueImpl("tit4", "aut4", "interprete4", "genre4");
		MusiqueImpl musique5 = new MusiqueImpl("tit5", "aut5", "interprete5", "genre5");
		MusiqueImpl musique6 = new MusiqueImpl("tit6", "aut6", "interprete6", "genre6");
		MusiqueImpl[] array = null;
		PlayListeImpl playListe = new PlayListeImpl("nom", "genre", 6, array);
		System.out.println(playListe.ajouterMusique(playListe, musique1));
		System.out.println(playListe.ajouterMusique(playListe, musique2));
		System.out.println(playListe.ajouterMusique(playListe, musique3));
		System.out.println(playListe.ajouterMusique(playListe, musique4));
		System.out.println(playListe.ajouterMusique(playListe, musique5));
		System.out.println(playListe.ajouterMusique(playListe, musique6));
		System.out.println(playListe.afficherMusiques(playListe));
	}
}
