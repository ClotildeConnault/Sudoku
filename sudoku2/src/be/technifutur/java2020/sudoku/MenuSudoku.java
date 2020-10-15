package be.technifutur.java2020.sudoku;

import java.util.Scanner;

public class MenuSudoku {
    private Sudoku[] menu;
    private int nbSudoku = 0;
    private Scanner scan;

    public MenuSudoku(int size){
        menu= new Sudoku[size];
        scan = new Scanner(System.in);
    }
    public void addSudoku(Sudoku sudoku) {
        menu[nbSudoku] = sudoku;
        nbSudoku++;
    }

    public void afficher() {
        System.out.println( "choisissez un type de Sudoku");
        System.out.println( "----------------------------");
        for(int i = 0; i < menu.length; i++)  {
            System.out.printf(" - %d %s%n", i+1,menu[i].getName());
        }

    }

    public Sudoku getChoice() {
        int choice = 0;
        do {
            afficher();
            System.out.print(" choix : ");
            String input = this.scan.nextLine();
            choice = Integer.parseUnsignedInt(input) - 1;
        }while(choice >= nbSudoku);
        return menu[choice];
    }
}