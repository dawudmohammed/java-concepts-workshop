/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    final String name = "Football";
    int playersNumber =10;
    @Override
    String getName() {
        return name;
    }

    @Override
    void getNumberOfTeamMembers() {

        System.out.println("Each team has "+playersNumber+" player in "+getName());
    }
}

