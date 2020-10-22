package be.technifutur.java2020.sudoku.commun;

public class Possibilities {
    private int data;

    public boolean add(int val){
        boolean change = false;
        int updatedData = data | (1<<val-1);

        if (data != updatedData){
            data = updatedData;
            change = true;
        }

        return change;
    }

    public boolean remove(int val){
        boolean change = false;
        int updatedData = data & (~1<<val-1);

        if ((data ^ updatedData) != 0){
            data = updatedData;
            change = true;
        }

        return change;
    }

    public boolean contains(int val){
        boolean contains = false;

        if ((data & (1<<val-1)) != 0){
            contains = true;
        }

        return contains;
    }

    public int size(){
        int possibilities = 0;

        for(int i=1; i <= 9; i ++){
            if ((data & (1<<i-1)) == 0){
                possibilities ++;
            }
        }

        return possibilities;
    }


}
