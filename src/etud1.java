/**
 * Created by SONY on 14/10/2015.
 */
public class etud1 {

    public static void main(String[] args) {

        ETUDIENT e1 = new ETUDIENT("martin",11,13,16,14);
        e1.calcul_moy_res();
        e1.affiche();

        ETUDIENT e2 = new ETUDIENT("dupuis",9,14,7,8);
        e2.calcul_moy_res();
        e2.affiche();
    }
}
