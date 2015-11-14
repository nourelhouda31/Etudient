

import java.io.*;

class ETUDIENT {

    private String nom ;
    private double note1,note2,note3,note4;
    private double moyenne;
    private String result ;


    public ETUDIENT(String n, double n1, double n2, double n3, double n4) {
        nom = n;
        note1 = n1;
        note2 = n2;
        note3 = n3;
        note4 = n4;
        moyenne = 0;
        result = null;
    }

    public void calcul_moy_res(){
        moyenne =(note1+note2+note3+note4)/4;
        if(moyenne<10)
            result="non admis";
        else
            result="admis";
    }

    public void affiche(){
        System.out.println("nom :"+nom);
        System.out.println("notes :"+note1+" "+note2+" "+note3+" "+note4);
        System.out.println("moyenne :"+moyenne+"resultat :"+result);
    }
}
