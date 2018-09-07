package vn.codegym.QuyenLeSy;

public class Triangle {
    public static void main(String[] args) {
        String[][] triangle = new String[5][5];

        for (int row = 0; row < triangle.length; row++) {
            if (row == 0) {
                for (int colunm = 0; colunm < triangle[row].length; colunm++) {
                    System.out.print("*  ");
                }
            } else if (row == triangle.length - 1) {
                System.out.print("\n");
                for (int colunm = 0; colunm < triangle[row].length; colunm++) {
                    System.out.print("*  ");
                }
            } else if (row == (triangle.length) / 2) {
                System.out.print("\n");
                for (int colunm = 0; colunm < triangle[row].length; colunm++) {
                    if (colunm == 0) {
                        System.out.print("* ");
                    } else if (colunm == triangle[row].length / 2) {
                        System.out.print("1");
                    } else if(colunm == triangle[row].length - 1){
                        System.out.print(" *");
                    }else System.out.print("    ");
                }
            } else {
                System.out.print("\n");
                for (int colunm = 0; colunm < triangle[row].length; colunm++) {
                    if (colunm == 0) {
                        System.out.print("* ");
                    } else if(colunm == triangle[row].length - 1) {
                        System.out.print(" *");
                    }else System.out.print("   ");
                }
            }
        }
    }
}
