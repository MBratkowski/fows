package data.json.data;

import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class JsonProvider {

    private FileReader fileReader;

    public JsonReader getFileWithName(String fileName) throws IOException {
        if (validateName(fileName)) {
            return new JsonReader(new FileReader(fileName));
        }
        return null;
    }

    public boolean validateName(String fileName) {
        return true;
    }
}
