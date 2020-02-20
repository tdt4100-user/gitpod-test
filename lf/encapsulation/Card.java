package encapsulation;

import java.util.Arrays;
import java.util.List;

/* 
Denne oppgaven handler om to klasser for kortspill: Card (kort) og CardDeck (kortstokk), der den siste inneholder ett eller flere Card-objekter.
I mange sammenhenger vil objekter av en klasse inneholde eller "eie" objekter av andre klasser. Når en klasse er assosiert med én instans av en (annen) klasse er dette en 1-1-assosiasjon og når en klasse er assosiert med flere instanser av en annen klasse er dette en 1-n-assosiasjon. I denne oppgaven skal du implementere logikk for en kortstokk som inneholder kort. Nedenfor beskrives begge klassene og metodene disse skal inneholde.
Card-klassen er en såkalt verdiklasse, som kodes slik at objektene ikke kan endres etter at de er opprettet. Et Card-objekt har en kortfarge, som er en av bokstavene 'S' (for spades), 'H' (for hearts), 'D' (for diamonds) og 'C' (for clubs), og tallverdi, som er et heltall mellom 1 (ess) og 13 (konge). Følgende metoder må implementeres:


Card(char, int) - konstruktøren initialiserer kortfarge og tallverdi med henholdsvis første og andre argument. Konstruktøren må utløse unntak av typen IllegalArgumentException hvis en (eller begge) av disse verdiene er ugyldige.

getSuit() - returnerer kortfargen som en char, en av 'S', 'H', 'D' eller 'C'.

getFace() - returnerer tallverdien som en int mellom 1 og 13 (inklusive).

toString() - returnerer en streng som består av <suit><face> e.g. for spar ess skal "S1" returneres.

CardDeck-objekter inneholder initielt et visst antall kort av de fire kortfargene 'S', 'H', 'D' og 'C'. Klassen inneholder standardmetoder for å lese hvor mange og hvilke kort, og en metode for å endre tilstand.
Konstruktør:


CardDeck(int n) - fyller kortstokken med de n første kortene av hver kortfarge, totalt n*4 kort, med spar 1 som første kort (indeks nr. 0), spar 2 som andre (nr. 1), spar 3 som tredje (nr. 2), spar 4 som fjerde (nr. 3), ..., hjerter 1 som fjortende (nr. 13), hjerter 2 som femtende (nr. 4) osv. i.e. først alle spar, så hjerter, så ruter og så kløver, alle i stigende rekkefølge.

Lesemetoder:


getCardCount() - returnerer hvor mange Card-objekter som CardDeck-objektet inneholder.

getCard(int n) - returnerer kort nr. n eller utløser et IllegalArgumentException hvis n ikke er gyldig. Kort nr. 0 er det første kortet i kortstokken.

Endringsmetode:


shufflePerfectly() - stokker kortstokken ved å dele den i to like store deler og flette de to delene perfekt, slik at kortet på toppen forblir på toppen og kortet på bunnen forblir på bunnen (se http://en.wikipedia.org/wiki/Out_shuffle).
*/
public class Card {

    private char suite;
    private int face;

    private List<Character> legalSuites = Arrays.asList('S', 'H', 'D','C');
    private List<Integer> legalFaces = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);

    public Card(char suite, int face){
        this.setCard(suite, face);
    }

    private void setCard(char suite, int face){
        if(!legalSuites.contains(suite)){
            throw new IllegalArgumentException();
        }

        if(!legalFaces.contains(face)){
            throw new IllegalArgumentException();
        }

        this.suite = suite;
        this.face = face;
    }

    public char getSuit(){
        return this.suite;
    }

    public int getFace(){
        return this.face;
    }

    public String toString(){
        return ""+ getSuit() + getFace() + "";
    }

}