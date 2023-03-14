package ecoResourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReceivedResourseUser {
    private final String path;
    private String info;

    public ReceivedResourseUser(String path) {
        this.path = path;
    }

    public ResourceUser[] getResourceUser() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path)).useDelimiter("\\r\\n|\\|");
        this.info = scanner.nextLine();
        ResourceUser[] arrayUsers = new ResourceUser[0];
        while (scanner.hasNextLine()) {
            String[] str = new String[7];
            for (int i = 0; i < str.length; i++) {
                str[i] = scanner.next();
            }

            ResourceUser user = new ResourceUser(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
                    Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
            arrayUsers = Arrays.copyOf(arrayUsers, arrayUsers.length + 1);
            arrayUsers[arrayUsers.length - 1] = user;
        }
        return arrayUsers;
    }

    public String getInfo() {
        return info;
    }
}
