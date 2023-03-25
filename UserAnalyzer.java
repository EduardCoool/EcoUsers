package ecoResourse;

import java.util.Arrays;

public class UserAnalyzer {
    private final int maxConsumption;
    private final ResourceUser[] resourceUsers;

    public UserAnalyzer(ResourceUser[] resourceUser, int maxConsumption) {
        this.maxConsumption = maxConsumption;
        this.resourceUsers = resourceUser;
    }

    public ResourceUser[] getEcoUsers() {
        ResourceUser[] arrayEcoUsers = new ResourceUser[0];
        for (ResourceUser user : resourceUsers) {
            if (user.getWaterCount() < maxConsumption & user.getGasCount1() + user.getGasCount2()
                    < maxConsumption & user.getElectroCount1() + user.getElectroCount2() < maxConsumption) {
                arrayEcoUsers = Arrays.copyOf(arrayEcoUsers, arrayEcoUsers.length + 1);
                arrayEcoUsers[arrayEcoUsers.length - 1] = user;

            }
        }
        return arrayEcoUsers;
    }
}
