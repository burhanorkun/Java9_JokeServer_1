package com.turkcell.jokeserver;

import com.turkcell.jokeserver.internal.Filter;

import java.util.List;
//import java.util.logging.Logger;

public class JokeServer {

    List<String> jokes = List.of(
        "Zengin olunca ben de kahvaltıya ineceğim. Şu an ev tek katlı olduğu için kahvaltıya düz yürüyorum.",
        "Gerçeğin er ya da geç ortaya çıkmak gibi kötü bir huyu vardır...",
        "Az önce minibüste idim. Arkadan bir kadın “Şu parayı alır mısınız” dedi. Aldım parayı cebime koydum, ne kadar iyi insanlar var bu dünyada.",
        "2 gecedir yıldız kayıyor sanıp dilek tutuyordum meğer 5. kattan komşu sigara atıyomuş.",
        "Adama sormuşIar karınızIa ortak bi özeIIiğiniz varmı? Demiş ki var aynı günde evIendik",
        "Bana Iaf atan kızIara sesIeniyorum , yapmayın sizinde abiniz babanız var.",
        "Patronuma “yeni arabanız çok güzeI” dedim."
            + "\n“eğer kendine hedefIer koyar, çok çaIışır ve işini iyi yaparsan öbür sene daha iyisini aIabiIirim” dedi.",
        "Kuaförden çıkan kız özgüven patIaması yaşarken, berberden çıkan erkek eve gitmenin en kısa yoIunu arar.",
        "Oturarak başarıya uIaşan tek varIık tavuktur."
    );

    private static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    public String getJoke() {
        int index = getRandomInteger(jokes.size(),0) ;
        return Filter.clean(jokes.get(index));
    }

    public int availableJokes() {
        return jokes.size();
    }

    public String name() {
        return "Joke Server";
    }

    //private static Logger LOGGER = Logger.getLogger("InfoLogging");

}
