package be.technifutur.java2020.sudoku.sudoku4x4;

public class GenerateNumbers {

    private static final int longueur = 5;

    private int[] tabGeneration = new int[longueur];

    public void genererNombre() {

        for (int i = 0; i < longueur; i++) {

            this.tabGeneration[i] = (int) Math.round(Math.random() * (longueur - 1 + 1) + 1);

        }

    }

}
