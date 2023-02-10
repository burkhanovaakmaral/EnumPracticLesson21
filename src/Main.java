public class Main {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        System.out.println(" Write a month: ");
//        String month = console.nextLine();
//
//        Winter snow = Winter.valueOf(month.toUpperCase());
//        switch (snow) {
//            case DECEMBER -> System.out.println(Winter.DECEMBER);
//            case JANUARY -> System.out.println(Winter.JANUARY);
//            case FEBRUARY -> System.out.println(Winter.FEBRUARY);
//
//        }
        Planet[] planets = {Planet.URANUS,Planet.JUPITER,Planet.EARTH,Planet.MERCURY,Planet.MARS,Planet.NEPTUNE,Planet.SATURN,Planet.URANUS,Planet.VENUS};
    }
    static Planet findAPlanetThatIsLessThanDays(Planet[]planets){
        int less = planets[0];

        for (int i = 0; i < planets.length; i++)
            if (less < planets[i])
                less = planets[i];


        return less;
    }
    static int findAPlanetThatIsMoreThanDays(Planet[]planets){
        int more = planets[0];

        for (int i = 0; i < planets.length; i++)
            if (more < planets[i])
                more = planets[i];


        return more;
    }
}