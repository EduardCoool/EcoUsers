package ecoResourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SavedEcoUsers {
    private final ResourceUser[] resourceUsers;
    private final String path;
    private final String info;

    public SavedEcoUsers(ResourceUser[] resourceUsers, String path, String info) {
        this.resourceUsers = resourceUsers;
        this.path = path;
        this.info = info;
    }

    public void saveEcoUsers() {
        try (PrintWriter printWriter = new PrintWriter(new File(new File(path).getParent(), "dataNew.csv"))) {
            printWriter.println(info);
            for (ResourceUser ecoUser : resourceUsers) {
                printWriter.println(ecoUser.getId() + "|" + ecoUser.getName() + "|" + ecoUser.getWaterCount() + "|"
                        + ecoUser.getGasCount1() + "|" + ecoUser.getGasCount2() + "|" + ecoUser.getElectroCount1() + "|"
                        + ecoUser.getElectroCount2());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
