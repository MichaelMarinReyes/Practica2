package com.dinamicajuego;

import com.pokemones.*;

/**
 *
 * @author michael
 */
public class ListadoPokemones {
    
    private Pokemon[] pokemon;

    public ListadoPokemones(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

    public ListadoPokemones() {
    }
    
    public Pokemon[] almacenajePokemones() {
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
        pokemon[63] = new Kadabra("Kadabra", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[64] = new Alakazam("Alakazam", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[65] = new Machop("Machop", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[66] = new Machoke("Machoke", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[67] = new Machamp("Machamp", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[68] = new Bellsprout("Bellsprout", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[69] = new Weepinbell("Weepinbell", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[70] = new Victreebel("Victreebel", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[71] = new Tentacool("Tentacool", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[72] = new Tentacruel("Tentacruel", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[73] = new Geodude("Geodude", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[74] = new Graveler("Graveler", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[75] = new Golem("Golem", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[76] = new Ponyta("Ponyta", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[77] = new Rapidash("Rapidash", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[78] = new Slowpoke("Slowpoke", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[79] = new Slowbro("Slowbro", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[80] = new Magnemite("Magnemite", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[81] = new Magneton("Magneton", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[82] = new Farfetchd("Farfetch'd", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[83] = new Doduo("Doduo", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[84] = new Dodrio("Dodrio", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[85] = new Seel("Seel", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[86] = new Dewgong("Dewgong", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[87] = new Grimer("Grimer", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[88] = new Muk("Muk", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[89] = new Shellder("Shellder", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[90] = new Cloyster("Cloyster", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[91] = new Gastly("Gastly", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[92] = new Haunter("Haunter", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[93] = new Gengar("Gengar", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[94] = new Onix("Onix", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[95] = new Drowzee("Drowzee", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[96] = new Hypno("Hypno", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[97] = new Krabby("Krabby", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[98] = new Kingler("Kingler", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[99] = new Voltorb("Voltorb", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[100] = new Electrode("Electrode", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[101] = new Exeggcute("Exeggcute", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[102] = new Exeggutor("Exeggutor", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[103] = new Cubone("Cubone", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[104] = new Marowak("Marowak", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[105] = new Hitmonlee("Hitmonlee", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[106] = new Hitmonchan("Hitmonchan", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[107] = new Lickitung("Lickitung", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[108] = new Koffing("Koffing", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[109] = new Weezing("Weezing", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[110] = new Rhyhorn("Rhyhorn", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[111] = new Rhydon("Rhydon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[112] = new Chansey("Chansey", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[113] = new Tangela("Tangela", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[114] = new Kangaskhan("Kangaskhan", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[115] = new Horsea("Horsea", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[116] = new Seadra("Seadra", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[117] = new Goldeen("Goldeen", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[118] = new Seaking("Seaking", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[119] = new Staryu("Staryu", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[120] = new Starmie("Starmie", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[121] = new MrMime("Mr. Mime", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[122] = new Scyther("Scyther", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[123] = new Jynx("Jynx", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[124] = new Electabuzz("Electabuzz", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[125] = new Magmar("Magmar", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[126] = new Pinsir("Pinsir", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[127] = new Tauros("Tauros", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[128] = new Magikarp("Magikarp", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[129] = new Gyarados("Gyarados", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[130] = new Lapras("Lapras", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[131] = new Ditto("Ditto", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[132] = new Eevee("Eevee", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[133] = new Vaporeon("Vaporeon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[134] = new Jolteon("Jolteon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[135] = new Flareon("Flareon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[136] = new Porygon("Porygon", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[137] = new Omanyte("Omanyte", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[138] = new Omastar("Omastar", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[139] = new Kabuto("Kabuto", " ", 0, 0, 0, 0, 0, 0, 0); 
        pokemon[140] = new Kabutops("Kabutops", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[141] = new Aerodactyl("Aerodactyl", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[142] = new Snorlax("Snorlax", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[143] = new Articuno("Articuno", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[144] = new Zapdos("Zapdos", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[145] = new Moltres("Moltres", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[146] = new Dratini("Dratini", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[147] = new Dragonair("Dragonair", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[148] = new Dragonite("Dragonite", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[149] = new Mewtwo("Mewtwo", " ", 0, 0, 0, 0, 0, 0, 0);
        pokemon[150] = new Mew("Mew", " ", 0, 0, 0, 0, 0, 0, 0);
        
        return pokemon;
    }
}
