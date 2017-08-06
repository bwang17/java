package com.codingdojo.pokemon;

public class PokeTest {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pikachu", "Electric", 90);
        Pokemon p2 = new Pokemon("Mew", "Psychic", 120);
        Pokemon p3 = new Pokemon("Lugia", "Psychic", 120);

        Pokedex pokedex = new Pokedex();
        Pokemon p4 = pokedex.createPokemon("Blastoise", "Water", 100);
        System.out.println(pokedex.pokemonInfo(p1));
        pokedex.attackPokemon(p1);
        System.out.println(pokedex.pokemonInfo(p1));
    }
}
