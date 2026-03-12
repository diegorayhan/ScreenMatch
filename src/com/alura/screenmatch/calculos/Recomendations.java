package com.alura.screenmatch.calculos;

public class Recomendations implements Classify{
    private String recomendation;

    public void filter(Classify classify) {
        if (classify.getClassify() >= 4) {
            System.out.println("Preferidos do momento.");
        } else if (classify.getClassify() >= 2) {
            System.out.println("Boas avaliações no momento.");
        } else {
            System.out.println("Coloque na lista pra Depois.");
        }
    }

    @Override
    public int getClassify() {
        return 0;
    }
}
