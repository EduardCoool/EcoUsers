package ecoResourse;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\79510\\Desktop\\Учёба\\data.csv";

        UserReader userReader = new ReceivedResourseUser(path);

        UserAnalyzer userAnalyzer = new UserAnalyzer(userReader.readResourceUser(), 200);

        UserWriter userWriter = new UserWriter(userAnalyzer.getEcoUsers(), path, userReader.getInfo());
        userWriter.writeUser();
    }
}
