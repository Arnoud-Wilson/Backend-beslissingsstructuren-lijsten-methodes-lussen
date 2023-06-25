package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
        printList(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        printPositionAndItem(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        System.out.println(checkAndAdd(clubNames));

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        System.out.println("De aangegeven club heeft positie: " + positionOfClub(clubNames, "Fc Utrecht"));


        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        sortClubsAjaxFirst(clubNames);

        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortClubsAjaxFirst(clubNames);

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");


    }

    public static void printList(List<String> listToPrint) {
        for (String item : listToPrint) {
            System.out.println(item);
        }
    }

    public static void printPositionAndItem(List<String> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {
            System.out.println(i + " - " + listToPrint.get(i));
        }
    }

    public static List<String> checkAndAdd(List<String> listToCheck) {
        List<String> checkedList = new ArrayList<>();

        for (String item : listToCheck) {
            if (!checkedList.contains(item)) {
                checkedList.add(item);
            }
        }
        return checkedList;
    }

    public static int positionOfClub(List<String> clubList, String club) {
        int j = 0;
        for (int i = 0; i < clubList.size(); i++) {
            if (club.equals(clubList.get(i))) {
                j += i;
            }
        }
        return j;
    }

    public static void sortClubsAjaxFirst(List<String> clubNames) {
        clubNames.sort(Comparator.naturalOrder());
        System.out.println(clubNames);

        //TODO:
    }
}