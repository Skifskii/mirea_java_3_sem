package prac_13.subprac_4;

public class Main {
    public static void main(String[] args) {
        int SIZE = 11;
        String[] shirts = new String[SIZE];

        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtsObj = new Shirt[SIZE];
        for (int i=0; i < SIZE; i++) {
            String[] shirtData = shirts[i].split(",");
            shirtsObj[i] = new Shirt(shirtData[0], shirtData[1], shirtData[2], shirtData[3]);
        }

        for (Shirt shirt : shirtsObj) {
            System.out.println(shirt);
        }
    }
}
