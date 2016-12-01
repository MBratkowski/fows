package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentProvider {

    private List<Prelegent> prelegents = new ArrayList<>();
    private List<Presentation> presentations = new ArrayList<>();

    public PrelegentProvider() {
        preparePresentationSet();
        prelegents.add(new Prelegent.Builder(1, "Mateusz", "Bratkowski").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(2, "Karol", "Byra").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(3, "Mateusz", "Chudzinski").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(4, "Marek", "Wesolowski").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(5, "Andrzej", "Chmielewski").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(6, "Ewelina", "Berlicka").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(7, "Bartosz", "Wawrzynczyk").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(8, "Maciek", "Lukasiewicz").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(9, "Kamil", "Cholewa").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(10, "Michal", "Kowalski").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(11, "Aleksandra", "Bratkowska").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(12, "Joanna", "Jakubowska").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(13, "Damian", "Piatek").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(14, "Jacek", "Oko").presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(15, "Mariusz", "Koziol").presentations(presentations).build());
    }

    public List<Prelegent> getPrelegents() {
        return prelegents;
    }

    private void preparePresentationSet() {
        for (int i = 0; i < 10; i++) {
            presentations.add(new Presentation.Builder("temat", "autor", "16:00").build());
        }
    }
}
