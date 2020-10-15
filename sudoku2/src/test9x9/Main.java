package test9x9;

public class Main {

    public static void main(String[] args) {

        Grille9x9test sudoku = new Grille9x9test();
        sudoku.generateNumbers();

        AffichageGrille9x9test nouvelAffichage = new AffichageGrille9x9test();
        nouvelAffichage.affichageGrille(sudoku);

    }

}
