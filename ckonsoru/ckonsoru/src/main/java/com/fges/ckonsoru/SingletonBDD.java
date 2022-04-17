package com.fges.ckonsoru;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SingletonBDD {
    private static SingletonBDD choix;

    private SingletonBDD() {}
    public static SingletonBDD getInstance() {
        if (choix == null) {
            choix = new SingletonBDD();
        }
        return choix;
    }
    // le reste des méthodes
    public void condition1(String partiesdates[]) {
        BDDRequests test = new BDDRequests();
        test.bdd_creneaux(Integer.parseInt(partiesdates[2]), Integer.parseInt(partiesdates[1]), Integer.parseInt(partiesdates[0]));
    }
    public void condition2(String nomcli) {
        BDDRequests test = new BDDRequests();
        test.listerdv(nomcli);
    }
    public void condition3(String daterdv, String nomcli, String nomveto)
    {
        BDDRequests test = new BDDRequests();
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Date parsedDate = dateFormat.parse(daterdv);
            Timestamp datetimestamp = new java.sql.Timestamp(parsedDate.getTime());
            test.prendrerdv(datetimestamp, nomveto, nomcli);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}