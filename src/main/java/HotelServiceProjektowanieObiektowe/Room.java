package HotelServiceProjektowanieObiektowe;

public class Room
{
    /*nr pokoju, ilu osobowy, czy w pokoju jest
    łazienka - true/false oraz czy pokój jest dostępny - true/false).*/
    int numerPokoju;
    int ileOsobowy;
    boolean lazienka;
    boolean pokojDostepny;

    public Room(int numerPokoju, int ileOsobowy, boolean lazienka, boolean pokojDostepny) {
        this.numerPokoju = numerPokoju;
        this.ileOsobowy = ileOsobowy;
        this.lazienka = lazienka;
        this.pokojDostepny = pokojDostepny;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numerPokoju=" + numerPokoju +
                ", ileOsobowy=" + ileOsobowy +
                ", lazienka=" + lazienka +
                ", pokojDostepny=" + pokojDostepny +
                '}';
    }

    public int ileOsobowy(int ileOsobowy) {
        return ileOsobowy;
    }
}
