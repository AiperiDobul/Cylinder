package kg.megacom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] r ={3, -6, 11, -5, 22};
        ArrayList<String> result = new ArrayList<>();
        for (int j : r) result.add(cylinder(j, 11));

        for(String v : result) System.out.println(v);

    }
    static String cylinder(int r, int h){
        double v;
        String value;
        try {
            if (r<=0) {
                throw new IllegalArgumentException();
            }
            v = 3.14 * r * r * h;
            value = String.valueOf(v);

        }catch (IllegalArgumentException ex){
            value = "r = " + r + " и h = " + h + ". Радиус не может быть отрицательным.";
        }
        return value;
    }
}