package dev.lpa;

import java.util.*;

public class Main {

    private static LinkedList<Town> places = new LinkedList<>();

    private static int index = 0;

    private static boolean isForwards = true;

    public static void main(String[] args) {
        Main.addPlace(new Town("Adelaide", 1374));
        Main.addPlace(new Town("Alice Springs", 2771));
        Main.addPlace(new Town("Brisbane", 917));
        Main.addPlace(new Town("Darwin", 3972));
        Main.addPlace(new Town("Melbourne", 877));
        Main.addPlace(new Town("Perth", 3923));

        Main.sortPlacesByDistance();
        Scanner action = new Scanner(System.in);
        boolean flags = true;
        Main.printAvailableOperation();
        while(flags)
        {
            Main.sortPlacesByDistance();
            switch (action.nextLine().substring(0,1).toUpperCase()){
                case "Q" -> flags = false;
                case "F" -> {
                    Main.forward();
                    isForwards = true;
                }
                case "B" -> {
                    Main.backward();
                    isForwards = false;
                }
                case "L" -> Main.printPlaces();
                case "M" -> Main.printAvailableOperation();
                default  -> System.out.println("Sorry, I haven't understand which operation you want to do.");

            }
        }
        System.exit(0);
    }

    private static void printAvailableOperation(){
        String operations = """
                Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist places
                    (M)enu
                    (Q)uit
                """;
        System.out.println(operations);
    }

    private static void addPlace(Town t){
        for (Town currentTown: places) {
            if (currentTown.getName().equalsIgnoreCase(t.getName())){
                System.out.println("Town already in itinerary.");
                return;
            }
        }
        places.add(new Town(t.getName(), t.getDistance()));
    }
    private static void sortPlacesByDistance(){

        Collections.sort(places, new Comparator<Town>() {
            @Override
            public int compare(Town t1, Town t2) {
                return t1.getDistance() - t2.getDistance();
            }
        });

    }

    private static void adjustIndexFromForwardToBackward(){
        if (isForwards) {
            index--;
            if (index < 0)
            {
                index = places.size();
            }
        }
    }

    private static void adjustIndexFromBackwardToForward(){
        if (!isForwards) {
            index++;
            if (index > places.size())
            {
                index = 0;
            }
        }
    }

    private static void backward(){

        Main.adjustIndexFromForwardToBackward();
        ListIterator<Town> lt = places.listIterator(index);
        if (lt.hasPrevious()){
            System.out.println("- Name: " + lt.previous().getName());
            lt.next();
            System.out.println("- Distance: " + lt.previous().getDistance() + "\n");
            index--;
        } else {
            System.out.println("""
                    There is no more town to visit.
                    Press again 'B' to go back at the end of the list.
                    Press again 'F' to go back at the nextB element of the list.
                    """);
            index = places.size();
        }
    }

    private static void forward(){

        Main.adjustIndexFromBackwardToForward();
        ListIterator<Town> lt = places.listIterator(index);
        if (lt.hasNext()){
            System.out.println("- Name: " + lt.next().getName());
            lt.previous();
            System.out.println("- Distance: " + lt.next().getDistance() + "\n");
            index++;
        } else {
            index = 0;
            System.out.println("""
                    There is no more town to visit.
                    Press again 'F' to go back at the beginning of the list.
                    Press again 'B' to go back at the previous element of the list.
            """);
        }
    }

    private static void printPlaces(){
        System.out.println("Places from Sidney :\n");
        ListIterator<Town> lt = places.listIterator();
        while(lt.hasNext()){
            System.out.println("- Name: " + lt.next().getName());
            lt.previous();
            System.out.println("- Distance: " + lt.next().getDistance() + "\n");
        }
    }


}