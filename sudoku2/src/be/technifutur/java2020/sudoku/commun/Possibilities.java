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

        if (data != updatedData){
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

        return 9 - Integer.bitCount(data);
    }


}
