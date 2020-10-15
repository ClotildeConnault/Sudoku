package be.technifutur.java2020.sudoku.sudoku4x4;

import java.util.Scanner;

public class Controler4x4 {

    private Sudoku4x4Modele modele;
    private Sudoku4x4Vue vue;

    public Controler4x4(Sudoku4x4Modele modele, Sudoku4x4Vue vue) {

        this.modele = modele;
        this.vue = vue;

    }


    public InputSudoku saisieUser(){

        Scanner input = new Scanner(System.in); //Création du scanner

        System.out.println("Entrez un chiffre dans la grille sous la forme de : valeur.ligne.colonne");

        String userEntry = input.nextLine(); //Récupération de l'entrée de l'utilsateur et stockage dans un objet string (objet pour pouvoir effectuer des méthodes de la classe String sur l'entrée)

        return new InputSudoku(userEntry); //Création de l'objet InputSudoku qui test les valeurs entrées de sorte qu'elles soient conformes

    }


    public void inputControl(){

        InputSudoku testInput = saisieUser();

        while (!testInput.isOut()){

            if (testInput.isValid()){

                modele.setValue(testInput.getValue(), testInput.getLine(), testInput.getCol());
                vue.afficherGrille(modele);

            }else {

                System.out.println("Valeurs non conformes, entrez de nouvelles valeurs");

            }

            testInput = saisieUser();

        }

    }


    public static void main(String[] args) {

        Controler4x4 controler1 = new Controler4x4(new Sudoku4x4Modele(), new Sudoku4x4Vue());

        controler1.inputControl();

    }

}


//InputControl :  - Affiche le sudoku
// - Demande une entrée
// - Il crée un InputSudoku
// - Si le InputSudoku IsValid -> on boucle (q fait parti du valide -> out à vrai -> arrêt boucle)
// - Si il est pas valide, on redemande une nouvelle valeur
