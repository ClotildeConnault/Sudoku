package be.technifutur.java2020.sudoku.commun;

public class Possibilities {
    private int data;

    public Possibilities(){

    }

    public void setData(int val){
        data = val;
    }

    public int getData(){
        return data;
    }

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

    public static void main(String[] args) {
        Possibilities poss = new Possibilities();
        poss.setData(0b100111010);

        System.out.println("add");
        System.out.println(poss.add(3));
        System.out.println(Integer.toBinaryString(poss.getData()));
        System.out.println();

        System.out.println("remove");
        System.out.println(poss.remove(2));
        System.out.println(Integer.toBinaryString(poss.getData()));
        System.out.println();

        System.out.println("contains");
        System.out.println(poss.contains(5));
        System.out.println();

        System.out.println("size");
        System.out.println(poss.size());


    }

}
