package com.company;

import java.util.List;
import java.util.Scanner;

public class Challenge {

    /*
     * o método deve verificar se a entrada (input) é válida para o anagrama proposto.
     *
     * A entrada sempre terá palavras separadas por espaço
     *
     * Exemplo: a entrada "parrot flea lion hornet" pode virar o anagrama "leaf loin raptor throne"
     * ou seja, cada palavra pode ser rearranjada de forma a virar outra, mas sem que as letras entre outras palavras
     * sejam trocadas.
     *
     * no exemplo acima a palavra "flea" virou "leaf", e nao necessariamente precisa estar na mesma posição da frase.
     *
     */

    public static void main(String[] args) {

        System.out.println(nestedAnagrams("bored cat", "robed act"));

    }

    public static boolean nestedAnagrams(String input, String possibleAnagram) {

        if (input.length() == possibleAnagram.length()) {

            String[] phraseInput = input.split(" ");
            String[] possiblePhrase = possibleAnagram.split(" ");

            for (int i = 0; i < phraseInput.length; i++) {
                for (int j = 0; j < phraseInput.length; j++) {
                    if (phraseInput[i].length() == possiblePhrase[j].length()) {
                        if (wordAnagram(phraseInput[i], possiblePhrase[j]) && wordAnagram(phraseInput[i], possiblePhrase[j])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean wordAnagram(String word1, String word2){
        int n = 0;
        for (int i = 0; i < word1.length(); i++) {
            if( word2.contains( word1.substring(i, i+1) ) ) {
                n++;
            }
        }

        if (word1.length() == n)
            return true;

        return false;
    }

}