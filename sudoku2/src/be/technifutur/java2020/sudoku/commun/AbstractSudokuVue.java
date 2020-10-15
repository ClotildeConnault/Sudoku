package be.technifutur.java2020.sudoku.commun;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Modele;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Modele;

public abstract class AbstractSudokuVue {


    //private AbstractSudokuModele modele;
    private int taille;


    public AbstractSudokuVue(int taille){
        this.taille = taille;
        setGrilleVide(getGrilleVide().replace(".", "%s"));
    }

    public abstract String getGrilleVide();
    public abstract void setGrilleVide(String grilleVide);

    public abstract void setModele(AbstractSudokuModele modele);

    public abstract AbstractSudokuModele getModele();

    public abstract void afficherGrille(AbstractSudokuModele modele);

    protected void internalAfficheGrille(AbstractSudokuModele modele) {

        Character[] tabValue = new Character[taille*taille];

        for (int line = 0; line < taille; line++) {

            for (int column = 0; column < taille; column++) {
                if(modele.isEmpty(line, column)){
                    tabValue[line*taille+column]='.';
                }
                else{

                    tabValue[line * taille + column] = modele.getValue(line, column);
                }


            }

        }


        System.out.printf(getGrilleVide(), tabValue);


    }

//    public void setGrilleVide(String grilleVide){
//        this.grilleVide = grilleVide;
//    }

    public abstract void afficherGrilleVide();


}
