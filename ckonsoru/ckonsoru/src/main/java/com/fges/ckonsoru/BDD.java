package com.fges.ckonsoru;

public class BDD {
    public static void condition1(String partiesdates[]) {
        BDDRequests test = new BDDRequests();
        test.bdd_creneaux(Integer.parseInt(partiesdates[2]), Integer.parseInt(partiesdates[1]), Integer.parseInt(partiesdates[0]));
    }
    public static void condition2(String nomcli) {
        BDDRequests test = new BDDRequests();
        test.listerdv(nomcli);
    }
}
