public class TestLamp {
    public static void main() {
        Lamp lamp1 = new Lamp(false, "Incandescent", 60);

        System.out.println(lamp1.getIsOn());
        System.out.println(lamp1.getLightbulbType());
        System.out.println(lamp1.getWattage());
        System.out.println();

        lamp1.setIsOn(true);
        lamp1.setLightbulbType("Compact Fluorescent");
        lamp1.setWattage(50);

        System.out.println(lamp1.getIsOn());
        System.out.println(lamp1.getLightbulbType());
        System.out.println(lamp1.getWattage());
        System.out.println();

        lamp1.setWattage(-5);
        lamp1.setWattage(205);

        System.out.println(lamp1.getWattage());
    }
}
