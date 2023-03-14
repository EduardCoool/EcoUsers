package ecoResourse;

public class ResourceUser {
    private final String id;
    private final String name;
    private final int waterCount;
    private final int gasCount1;
    private final int gasCount2;
    private final int electroCount1;
    private final int electroCount2;

    public ResourceUser(String id, String name, int waterCount, int gasCount1, int gasCount2, int electroCount1,
                        int electroCount2) {
        this.id = id;
        this.name = name;
        this.waterCount = waterCount;
        this.gasCount1 = gasCount1;
        this.gasCount2 = gasCount2;
        this.electroCount1 = electroCount1;
        this.electroCount2 = electroCount2;
    }


    public int getElectroCount2() {
        return electroCount2;
    }

    public int getElectroCount1() {
        return electroCount1;
    }

    public int getGasCount2() {
        return gasCount2;
    }

    public int getGasCount1() {
        return gasCount1;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
