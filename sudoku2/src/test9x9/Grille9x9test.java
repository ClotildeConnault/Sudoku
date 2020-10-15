package test9x9;

public class Grille9x9test {

    static int longueur = 10;
    static int largeur = 10;

    public int[][] grille = new int[longueur][largeur];

    private static int[] nbPossible = new int[] {1,2,3,4,5,6,7,8,9};

    public void generateNumbers(){

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                this.grille[i][j] = (int)Math.round(Math.random() * (8 - 1 + 1) + 1);

            }

        }

    }

}
