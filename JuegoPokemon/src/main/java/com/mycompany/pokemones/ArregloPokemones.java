package com.mycompany.pokemones;

/**
 *
 * @author michael
 */
public class ArregloPokemones {
    
    private Pokemon[] pokemon;
    private int cantidadPokemones = 150;

    public ArregloPokemones(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

    public ArregloPokemones() {
    }
    
    public void almacenajePokemones() {
        pokemon[0] = new Bulbasaur("Bulbasaur", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[1] = new Ivysaurio("Ivysaurio", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[2] = new Venusaur("Venusaur", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[3] = new Charmander("Charmander", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[4] = new Charmeleon("Charmeleon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[5] = new Charizard("Charizard", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[6] = new Squirtle("Squirtle", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[7] = new Wartortle("Wartortle", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[8] = new Blastoise("Blastoise", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[9] = new Caterpie("Caterpie", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[10] = new Metapod("Metapod", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[11] = new Butterfree("Butterfree", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[12] = new Weedle("Weedle", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[13] = new Kakuna("Kakuna", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[14] = new Beedrill("Beedrill", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[15] = new Pidgey("Pidgey", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[16] = new Pidgeotto("Pidgeotto", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[17] = new Pidgeot("Pidgeot", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[18] = new Rattata("Rattata", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[19] = new Raticate("Raticate", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[20] = new Spearow("Spearow", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[21] = new Fearow("Fearow", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[22] = new Ekans("Ekans", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[23] = new Arbok("Arbok", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[24] = new Pikachu("Pikachu", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[25] = new Raichu("Raichu", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[26] = new Sandshrew("Sandshrew", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[27] = new Sandslash("Sandslash", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[28] = new Nidoran1("Nidoran♀", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[29] = new Nidorina("Nidorina", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[30] = new Nidoqueen("Nidoqueen", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[31] = new Nidoran2("Nidoran♂", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[32] = new Nidorino("Nidorino", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[33] = new Nidoking("Nidoking", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[34] = new Clefairy("Clefairy", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[35] = new Clefable("Clefable", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[36] = new Vulpix("Vulpix", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[37] = new Ninetales("Ninetales", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[38] = new Jigglypuff("Jigglypuff", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[39] = new Wigglytuff("Wigglytuff", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[40] = new Zubat("Zubat", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[41] = new Golbat("Golbat", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[42] = new Oddish("Oddish", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[43] = new Gloom("Gloom", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[44] = new Vileplume("Vileplume", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[45] = new Paras("Paras", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[46] = new Parasect("Parasect", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[47] = new Venonat("Venonat", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[48] = new Venomoth("Venomoth", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[49] = new Diglett("Diglett", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[50] = new Dugtrio("Dugtrio", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[51] = new Meowth("Meowth", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[52] = new Persian("Persian", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[53] = new Psyduck("Psyduck", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[54] = new Golduck("Golduck", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[55] = new Mankey("Mankey", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[56] = new Primeape("Primeape", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[57] = new Growlithe("Growlithe", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[58] = new Arcanine("Arcanine", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[59] = new Poliwag("Poliwag", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[60] = new Poliwhirl("Poliwhirl", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[61] = new Poliwrath("Poliwrath", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[62] = new Abra("Abra", " ", 0, 0, 0, 0, 0, 0, 0);
    }
}
