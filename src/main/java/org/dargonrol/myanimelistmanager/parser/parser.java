package org.dargonrol.myanimelistmanager.parser;

import com.google.gson.Gson;
import org.dargonrol.myanimelistmanager.framework.AnimeList;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;


public abstract class parser {


    public static AnimeList[] readJSONFile(Path filePath) throws RuntimeException {
        try (FileReader reader = new FileReader(filePath.toString())) {
            // read the json file
            return new AnimeList[]{new Gson().fromJson(reader, AnimeList.class)};
        } catch (Exception e) {
            throw new RuntimeException("Error reading JSON file", e);
        }
    }

    public static void writeJSONFile(Path filePath, AnimeList[] animeList) throws RuntimeException {
        try (FileWriter writer = new FileWriter(filePath.toString())) {
            // write the json file
            new Gson().toJson(animeList, writer);
        } catch (Exception e) {
            throw new RuntimeException("Error writing JSON file", e);
        }
    }

    public static AnimeList[] readTXTFile(Path filePath) throws RuntimeException {
        // read the txt file

        return null;
    }

    public static void writeTXTFile(Path filePath, AnimeList[] animeList) throws RuntimeException {
        // write the txt file

    }


}
