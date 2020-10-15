package be.technifutur.java2020.sudoku.sudoku4x4;


import be.technifutur.java2020.sudoku.commun.AbstractSudokuModele;
import be.technifutur.java2020.sudoku.commun.AbstractSudokuVue;

public class Sudoku4x4Vue extends AbstractSudokuVue {

    Sudoku4x4Modele modele;
    private String grilleVide = "" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n";

    public Sudoku4x4Vue(){
        super(4);
        //grilleVide = grilleVide.replace(".", "%s");

    }




/*    public void setModele(Sudoku4x4Modele modele) {

        this.modele = modele;

    }*/

    @Override
    public String getGrilleVide() {
        return grilleVide;
    }

    @Override
    public void setGrilleVide(String grilleVide) {
        this.grilleVide = grilleVide;
    }

    @Override
    public void setModele(AbstractSudokuModele modele) {
        if(modele instanceof Sudoku4x4Modele) {
            this.modele = (Sudoku4x4Modele) modele;
        }
        else{
            System.out.println("error");
        }
    }

    @Override
    public AbstractSudokuModele getModele() {
        return modele;
    }

/*    @Override
    public void afficherGrille(AbstractSudokuModele modele) {
        if (modele instanceof Sudoku4x4Modele)
        {
            internalAfficheGrille(modele);
        }
        else
        {
            System.out.println("Error2");
        }
    }*/

    public void afficherGrilleVide(){

        internalAfficheGrille(new Sudoku4x4Modele());

    }
    @Override
    public void afficherGrille(AbstractSudokuModele modele){

        internalAfficheGrille(modele);

    }

/*    private void internalAfficheGrille(Sudoku4x4Modele modele) {

        Character[] tabValue = new Character[4*4];

        for (int line = 0; line < 4; line++) {

            for (int column = 0; column < 4; column++) {
                if(modele.isEmpty(line, column)){
                    tabValue[line*4+column]='.';
                }
                else{

                    tabValue[line * 4 + column] = modele.getValue(line, column);
                }


            }

        }

        System.out.printf(this.grilleVide, tabValue);

    }*/

    public static void main(String[] args) {

        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        Sudoku4x4Modele modele = new Sudoku4x4Modele();

        vue.setModele(modele);

        modele.setValue('2', 1, 1);
        // vue.afficherGrilleVIde();
        vue.afficherGrille(modele);

    }

}
