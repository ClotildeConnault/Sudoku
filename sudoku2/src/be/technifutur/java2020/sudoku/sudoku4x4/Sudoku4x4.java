package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku4x4 implements be.technifutur.java2020.sudoku.Sudoku{

    private String grilleVide = "" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n";

    @Override
    public void afficherGrilleVide() {
        System.out.println(grilleVide);
    }

    @Override
    public String getName() {
        return "Sudoku 4 X 4";
    }

}