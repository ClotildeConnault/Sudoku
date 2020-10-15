package be.technifutur.java2020.sudoku.sudoku9x9;


import be.technifutur.java2020.sudoku.commun.AbstractSudokuModele;

public class Sudoku9x9Modele extends AbstractSudokuModele {
    public static final char EMPTY = 0;
    private char[][] grille = new char[9][9];

    protected Sudoku9x9Modele() {
        super(9, 9);
    }


    public boolean isPositionValid(int line, int column) {
        return line>=0 && line < 4 && column >= 0 && column < 4;
    }

    public boolean isValid(char value) {
        boolean valid = false;
        if(Character.isDigit(value)){
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 4;
        }
        return valid;
    }



}

