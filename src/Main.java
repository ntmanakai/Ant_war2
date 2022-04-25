public class Main {
    public static void main(String[] args) {

        int[][] matrice = new int[500][500];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = (int) (Math.random() * 16);
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }


    }
}