package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentProvider {

    private final List<Prelegent> prelegents = new ArrayList<>();
    private final List<Presentation> presentations = new ArrayList<>();
    private final String imageUrl = "http://i.imgur.com/t8YSfYS.jpg";

    public PrelegentProvider() {
        preparePresentationSet();
        prelegents.add(new Prelegent.Builder(1, "Mateusz", "Bratkowski").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(2, "Karol", "Byra").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(3, "Mateusz", "Chudzinski").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(4, "Marek", "Wesolowski").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(5, "Andrzej", "Chmielewski").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(6, "Ewelina", "Berlicka").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(7, "Bartosz", "Wawrzynczyk").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(8, "Maciek", "Lukasiewicz").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(9, "Kamil", "Cholewa").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(10, "Michal", "Kowalski").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(11, "Aleksandra", "Bratkowska").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(12, "Joanna", "Jakubowska").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(13, "Damian", "Piatek").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(14, "Jacek", "Oko").personImage(imageUrl).presentations(presentations).build());
        prelegents.add(new Prelegent.Builder(15, "Mariusz", "Koziol").personImage(imageUrl).presentations(presentations).build());
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
