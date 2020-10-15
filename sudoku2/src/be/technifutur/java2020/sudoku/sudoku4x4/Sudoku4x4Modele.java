package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.commun.AbstractSudokuModele;

public class Sudoku4x4Modele extends AbstractSudokuModele {

    public static final char EMPTY = 0;
    private char[][] grille = new char[4][4];

    protected Sudoku4x4Modele() {
        super(4, 4);
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



    public static void main(String[] args) {

        Sudoku4x4Modele model = new Sudoku4x4Modele();

        model.setValue('4',1 ,1);
        char val = model.getValue(1, 1);

        System.out.println(val);

    }

}
