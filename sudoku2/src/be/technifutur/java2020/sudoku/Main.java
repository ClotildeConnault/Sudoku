package be.technifutur.java2020.sudoku;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoile;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sudoku");
        MenuSudoku menu = new MenuSudoku(3);
        menu.addSudoku(new Sudoku4x4());
        menu.addSudoku(new Sudoku9x9());
        menu.addSudoku(new SudokuEtoile());

        Sudoku choice = menu.getChoice();
        choice.afficherGrilleVide();
    }
}