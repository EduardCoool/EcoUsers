package ecoResourse;

import java.util.Arrays;

public class EcoUser {
    private final int maxConsumption;
    private final ResourceUser[] resourceUser;

    public EcoUser(ResourceUser[] resourceUser, int maxConsumption) {
        this.maxConsumption = maxConsumption;
        this.resourceUser = resourceUser;
    }

    public ResourceUser[] getEcoUsers() {
        ResourceUser[] arrayEcoUsers = new ResourceUser[0];
        for (ResourceUser user : resourceUser) {
            if (user.getWaterCount() < maxConsumption & user.getGasCount1() + user.getGasCount2()
                    < maxConsumption & user.getElectroCount1() + user.getElectroCount2() < maxConsumption) {
                arrayEcoUsers = Arrays.copyOf(arrayEcoUsers, arrayEcoUsers.length + 1);
                arrayEcoUsers[arrayEcoUsers.length - 1] = user;

            }
        }
        return arrayEcoUsers;
    }
}
