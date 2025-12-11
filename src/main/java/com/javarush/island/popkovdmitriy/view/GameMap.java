package com.javarush.island.popkovdmitriy.view;


import com.javarush.island.popkovdmitriy.island.Cell;
import com.javarush.island.popkovdmitriy.island.Island;
import com.javarush.island.popkovdmitriy.settings.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class GameMap {

    public static boolean cutCols;
    public static String border;
    public static String border1;
    public static ArrayList<String> organismproCell;
    public static ArrayList<String> organismsAll;
    public static boolean sitzer;
    public static Map<String, Integer> elementCountAll;

    public static void cellOrganisms(Island island) {
        sitzer = false;
        border = "═".repeat(Settings.cellWidth);
        border1 = " ".repeat(Settings.cellWidth);
        organismproCell = new ArrayList<>();
        organismsAll = new ArrayList<>();
        Map<String, Integer> elementCount = new HashMap<>();
        GameMap. elementCountAll = new HashMap<>();
        String org;
        String plant;


        Cell[][] islandArrays = island.islandArrays;

        StringBuilder out = new StringBuilder();
        int i = 0;
        int j = 0;
        for (i = 0; i < Settings.rowsIsland; i++) {

            out.append(i == 0
                    ? line(Settings.colsIsland, Symbols.LEFT_TOP, Symbols.TOP, Symbols.RIGHT_TOP)
                    : line(Settings.colsIsland, Symbols.LEFT, Symbols.CENTER, Symbols.RIGHT)
            ).append("\n");

            for (j = 0; j < Settings.colsIsland; j++) {


                Cell organisms = islandArrays[i][j];


                Iterator it = organisms.listAnimal.iterator();
                Iterator itCell = organisms.listGrass.iterator();

                if (organisms != null) {
                    sitzer = true;
                    while (it.hasNext()  ) {
                        org = it.next().getClass().getSimpleName();

                        switch (org){
                            case "Wolf"->organismproCell.add(Settings.iconWolf);
                            case "Sheep"->organismproCell.add(Settings.iconSheep);
                            case "Bear"->organismproCell.add(Settings.iconBear);
                            case "Boa"->organismproCell.add(Settings.iconBoa);
                            case "Fox"->organismproCell.add(Settings.iconFox);
                            case "Eagle"->organismproCell.add(Settings.iconEagle);
                            case "Deer"->organismproCell.add(Settings.iconDeer);
                            case "Buf"->organismproCell.add(Settings.iconBuffalo);
                            case "Rabbit"->organismproCell.add(Settings.iconRabbit);
                            case "Goat"->organismproCell.add(Settings.iconGoat);
                            case "Mouse"->organismproCell.add(Settings.iconMouse);
                            case "Duck"->organismproCell.add(Settings.iconDuck);
                            case "Horse"->organismproCell.add(Settings.iconHorse);
                            case "Boar"->organismproCell.add(Settings.iconBoar);
                            case "Caterpillar"->organismproCell.add(Settings.iconCaterpillar);


                        }

                        organismsAll.add(org);



                    }
                   while (itCell.hasNext()) {
                       plant = itCell.next().getClass().getSimpleName();
                       switch (plant) {
                         case "Grass"->organismproCell.add(Settings.iconPlant);
                        }
                       organismsAll.add(plant);
                    }

                       }else {sitzer=false;}


                for (String element : organismproCell) {

                    elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);

                }
                for (String element :organismsAll) {

                    elementCountAll.put(element, elementCountAll.getOrDefault(element, 0) + 1);

                }

                out.append(sitzer
                        ? String.format(Symbols.CELL_MARGIN + "%-" + (Settings.cellWidth-(elementCount.size()/4)) + "s", elementCount)
                        : String.format(Symbols.CELL_MARGIN + "%-" + Settings.cellWidth + "s", ""));


                organismproCell.removeAll(organismproCell);





                if (j==Settings.colsIsland-1 ){
                    cutCols=true;
                }else {cutCols=false;}
            }
            if (cutCols) {
                out.append( Symbols.CELL_MARGIN)
                        .append("\n");
            }

            if (i == Settings.rowsIsland - 1) {
                out.append(line(Settings.colsIsland, Symbols.LEFT_BOTTOM, Symbols.CENTER_BOTTOM, Symbols.RIGHT_BOTTOM)).append("\n");
            }
        }

        System.out.println(GameMap.elementCountAll);
        System.out.println(out);



    }
    private static String line(int cols, char left, char center, char right) {

        return (IntStream.range(0, cols)
                .mapToObj(col -> (col == 0 ? left : center) + border)
                .collect(Collectors.joining("", "", String.valueOf(right))));
    }

}


