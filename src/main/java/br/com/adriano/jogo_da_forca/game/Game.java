package br.com.adriano.jogo_da_forca.game;

import br.com.adriano.jogo_da_forca.core.Word;

public class Game {

	public void start() {
		Word word = new Word("Casa");
		word.hasChar('a');
		word.hasChar('c');
		word.hasChar('s');
		System.out.println(word.discovered());
		System.out.println(word.toString());
	}
}
