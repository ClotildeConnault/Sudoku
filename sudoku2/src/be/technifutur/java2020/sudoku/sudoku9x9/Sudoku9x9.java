package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku9x9 implements Sudoku {
    private String grille = "" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" ;

    @Override
    public void afficherGrilleVide() {
        System.out.println(grille);
    }

    @Override
    public String getName() {
        return "Sudoku 9 X 9";
    }

}