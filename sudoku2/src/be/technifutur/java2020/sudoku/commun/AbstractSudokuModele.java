package be.technifutur.java2020.sudoku.commun;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Modele;

public abstract class AbstractSudokuModele {
    public static final char EMPTY = 0;

    private char[][] grille;

    protected AbstractSudokuModele(int nbLigne, int nbColonne) {
        grille = new char[nbLigne][nbColonne];
    }


    public void setValue (char value, int line, int column) {
        if (this.isValid(value) && this.isPositionValid(line, column)){
            grille[line][column] = value;
        }
    }

    public void removeValue(int line, int column){
        if(isPositionValid(line, column)){
            grille[line][column] = EMPTY;
        }
    }

    public abstract boolean isPositionValid(int line, int column);

    public abstract boolean isValid(char value);


    public char getValue(int line, int column){
        char val = EMPTY;
        if(isPositionValid(line, column)){
            val = grille[line][column];
        }
        return val;
    }

    public boolean isEmpty(int lig, int col){
        boolean empty = true;
        if(isPositionValid(lig, col)){
            empty = grille[lig][col] == EMPTY;
        }
        return empty;
    }


}
