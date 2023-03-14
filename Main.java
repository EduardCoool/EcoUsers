package ecoResourse;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\79510\\Desktop\\Учёба\\data.csv";

        ReceivedResourseUser receivedResourseUser = new ReceivedResourseUser(path);

        EcoUsers ecoUsers = new EcoUsers(receivedResourseUser.getResourceUser(), 200);

        SavedEcoUsers savedEcoUsers = new SavedEcoUsers(ecoUsers.getEcoUsers(), path, receivedResourseUser.getInfo());
        savedEcoUsers.saveEcoUsers();
    }
}
