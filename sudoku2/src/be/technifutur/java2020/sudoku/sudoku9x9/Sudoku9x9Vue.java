package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.commun.AbstractSudokuModele;
import be.technifutur.java2020.sudoku.commun.AbstractSudokuVue;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Modele;

public class Sudoku9x9Vue extends AbstractSudokuVue {


        Sudoku9x9Modele modele;

        private String grilleVide = "" +
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

    public Sudoku9x9Vue(int taille) {
        super(taille);
    }


    public void setModele(Sudoku9x9Modele modele) {

            this.modele = modele;

        }

    @Override
    public String getGrilleVide() {
        return null;
    }

    @Override
    public void setGrilleVide(String grilleVide) {

    }

    @Override
    public void setModele(AbstractSudokuModele modele) {

    }

    @Override
    public AbstractSudokuModele getModele() {
        return null;
    }

    @Override
    public void afficherGrille(AbstractSudokuModele modele) {

    }

    public void afficherGrilleVide(){

            internalAfficheGrille(new Sudoku9x9Modele());

        }

        public void afficherGrille(Sudoku9x9Modele modele){

            internalAfficheGrille(modele);

        }

        private void internalAfficheGrille(Sudoku9x9Modele modele) {

            Character[] tabValue = new Character[9*9];

            for (int line = 0; line < 4; line++) {

                for (int column = 0; column < 9; column++) {
                    if(modele.isEmpty(line, column)){
                        tabValue[line*9+column]='.';
                    }
                    else{
                        tabValue[line * 9 + column] = modele.getValue(line, column);
                    }


                }

            }

            System.out.printf(this.grilleVide, tabValue);

        }

        public static void main(String[] args) {



            Sudoku9x9Vue vue = new Sudoku9x9Vue(9);
            Sudoku9x9Modele modele = new Sudoku9x9Modele();

            vue.setModele(modele);

            modele.setValue('2', 1, 1);
            // vue.afficherGrilleVIde();
            vue.afficherGrille(modele);

        }


}


