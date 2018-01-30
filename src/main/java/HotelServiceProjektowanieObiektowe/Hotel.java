package HotelServiceProjektowanieObiektowe;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    @Override
    public String toString() {
        return "Hotel{}";
    }

    /*Dodaj klasę Hotel która będzie zawierała listę pokoi.
                6. W konstruktorze klasy Hotel utwórz kilka obiektów klasy Room i dodaj je do listy (np. 10-15),
            dzięki temu podczas tworzenia instancji obiektu hotel, automatycznie generowana będzie lista
            pokoi.*/
    public Hotel() {


        Room room = new Room(1, 2, true, true);
        //List<String> lista = new ArrayList<String>();
        List <Integer> ListaPokoji = new ArrayList <Integer>();
        //lista.add("Asia");
            ListaPokoji.add(room.ileOsobowy);




    }

}
