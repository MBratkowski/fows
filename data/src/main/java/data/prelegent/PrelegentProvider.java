package data.prelegent;

import com.fows.entity.Prelegent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentProvider {

    private List<Prelegent> prelegents=new ArrayList<>();

    public PrelegentProvider() {
        prelegents.add(new Prelegent.Builder(1, "Mateusz", "Bratkowski").build());
        prelegents.add(new Prelegent.Builder(2, "Karol", "Byra").build());
        prelegents.add(new Prelegent.Builder(3, "Mateusz", "Chudzinski").build());
        prelegents.add(new Prelegent.Builder(4, "Marek", "Wesolowski").build());
        prelegents.add(new Prelegent.Builder(5, "Andrzej", "Chmielewski").build());
        prelegents.add(new Prelegent.Builder(6, "Ewelina", "Berlicka").build());
        prelegents.add(new Prelegent.Builder(7, "Bartosz", "Wawrzynczyk").build());
        prelegents.add(new Prelegent.Builder(8, "Maciek", "Lukasiewicz").build());
        prelegents.add(new Prelegent.Builder(9, "Kamil", "Cholewa").build());
        prelegents.add(new Prelegent.Builder(10, "Michal", "Kowalski").build());
        prelegents.add(new Prelegent.Builder(11, "Aleksandra", "Bratkowska").build());
        prelegents.add(new Prelegent.Builder(12, "Joanna", "Jakubowska").build());
        prelegents.add(new Prelegent.Builder(13, "Damian", "Piatek").build());
        prelegents.add(new Prelegent.Builder(14, "Jacek", "Oko").build());
        prelegents.add(new Prelegent.Builder(15, "Mariusz", "Koziol").build());
    }

    public List<Prelegent> getPrelegents() {
        return prelegents;
    }
}
