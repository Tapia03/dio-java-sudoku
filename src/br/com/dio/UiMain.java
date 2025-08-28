package br.com.dio;

import br.com.dio.ui.custom.screen.MainScreen;

import java.util.Map;

public class UiMain {

    public static void main(String[] args) {
        Map<String, String> gameConfig = Map.ofEntries(
                Map.entry("0,0", "4,false"), Map.entry("1,0", "7,false"), Map.entry("2,0", "9,true"),
                Map.entry("3,0", "5,false"), Map.entry("4,0", "8,true"), Map.entry("5,0", "6,true"),
                Map.entry("6,0", "2,true"), Map.entry("7,0", "3,false"), Map.entry("8,0", "1,false"),

                Map.entry("0,1", "1,false"), Map.entry("1,1", "3,true"), Map.entry("2,1", "5,false"),
                Map.entry("3,1", "4,false"), Map.entry("4,1", "7,true"), Map.entry("5,1", "2,false"),
                Map.entry("6,1", "8,false"), Map.entry("7,1", "9,true"), Map.entry("8,1", "6,true"),

                Map.entry("0,2", "2,false"), Map.entry("1,2", "6,true"), Map.entry("2,2", "8,false"),
                Map.entry("3,2", "9,false"), Map.entry("4,2", "1,true"), Map.entry("5,2", "3,false"),
                Map.entry("6,2", "7,false"), Map.entry("7,2", "4,false"), Map.entry("8,2", "5,true"),

                Map.entry("0,3", "5,true"), Map.entry("1,3", "1,false"), Map.entry("2,3", "3,true"),
                Map.entry("3,3", "7,false"), Map.entry("4,3", "6,false"), Map.entry("5,3", "4,false"),
                Map.entry("6,3", "9,false"), Map.entry("7,3", "8,true"), Map.entry("8,3", "2,false"),

                Map.entry("0,4", "8,false"), Map.entry("1,4", "9,true"), Map.entry("2,4", "7,false"),
                Map.entry("3,4", "1,true"), Map.entry("4,4", "2,true"), Map.entry("5,4", "5,true"),
                Map.entry("6,4", "3,false"), Map.entry("7,4", "6,true"), Map.entry("8,4", "4,false"),

                Map.entry("0,5", "6,false"), Map.entry("1,5", "4,true"), Map.entry("2,5", "2,false"),
                Map.entry("3,5", "3,false"), Map.entry("4,5", "9,false"), Map.entry("5,5", "8,false"),
                Map.entry("6,5", "1,true"), Map.entry("7,5", "5,false"), Map.entry("8,5", "7,true"),

                Map.entry("0,6", "7,true"), Map.entry("1,6", "5,false"), Map.entry("2,6", "4,false"),
                Map.entry("3,6", "2,false"), Map.entry("4,6", "3,true"), Map.entry("5,6", "9,false"),
                Map.entry("6,6", "6,false"), Map.entry("7,6", "1,true"), Map.entry("8,6", "8,false"),

                Map.entry("0,7", "9,true"), Map.entry("1,7", "8,true"), Map.entry("2,7", "1,false"),
                Map.entry("3,7", "6,false"), Map.entry("4,7", "4,true"), Map.entry("5,7", "7,false"),
                Map.entry("6,7", "5,false"), Map.entry("7,7", "2,true"), Map.entry("8,7", "3,false"),

                Map.entry("0,8", "3,false"), Map.entry("1,8", "2,false"), Map.entry("2,8", "6,true"),
                Map.entry("3,8", "8,true"), Map.entry("4,8", "5,true"), Map.entry("5,8", "1,false"),
                Map.entry("6,8", "4,true"), Map.entry("7,8", "7,false"), Map.entry("8,8", "9,false")
        );


        MainScreen mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}
