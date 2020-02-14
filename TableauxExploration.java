package com.company;

public class TableauxExploration {

    // Tout mettre les données du tableau 2D envoyé à 10
    public static void initTen (int[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++)
            for (int j = 0; j < tab2d[0].length; j++)
                tab2d[i][j] = 10;
    }

    // Met 10 en diagonale du coté gauche supérieur au coté droit inférieur
    public static void initDiagonaleTen (int[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++)
            for ( int j = 0; j < tab2d[0].length; j++)
                if (i == j)
                    tab2d[i][j] = 10;
    }

    // Indique la position de chaque cellule
    public static void initPosition (String[][] tab2d) {
        for (int i = 0; i < tab2d.length; i++)
            for (int j = 0; j < tab2d[0].length; j++)
                tab2d[i][j] = i + ":" + j;
    }

    // Retourne un boolean selon si le tableau est carré
    public static boolean isTabCarre (int[][] tab2d) {
        boolean isCarre = false;
             if (tab2d.length % 2 == 0 && tab2d[0].length % 2 == 0)
                 isCarre = true;
        return isCarre;
    }

    // Retourne un boolean selon si les deux tableaux on la meme longeur et largeur
    public static boolean isTabDimEgal (int[][] tab2d1,int[][] tab2d2) {
        boolean isSameSize = false;
        if (tab2d1.length == tab2d2.length && tab2d1[0].length == tab2d2[0].length)
            isSameSize = true;
        return isSameSize;
    }

    // Retourne la somme des matrices de 2 tableaux
    public static int[][] getSommeMatrices (int[][] tab2d1,int[][] tab2d2) {
        int[][] sommeMatrices = new int[tab2d1.length][tab2d1[0].length];
        for (int i = 0; i < tab2d1.length; i++)
            for (int j = 0; j < tab2d1[0].length; j++)
                sommeMatrices[i][j] = tab2d1[i][j] + tab2d2[i][j];
    return sommeMatrices;
    }
}
