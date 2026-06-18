package tasktracker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tasks {

    File file = new File("Tasks.json");
    private static final String jsonString = "[]";

    public Tasks() throws IOException {

        if (!file.exists()) {
            file.createNewFile();

            FileWriter fw = new FileWriter(file);
            fw.write(jsonString);
            fw.close();
        }
    }
}