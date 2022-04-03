package com.fges.ckonsoru;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BDD {
    public static void condition1(String partiesdates[]) {
        BDDRequests test = new BDDRequests();
        test.bdd_creneaux(Integer.parseInt(partiesdates[2]), Integer.parseInt(partiesdates[1]), Integer.parseInt(partiesdates[0]));
    }
    public static void condition2(String nomcli) {
        BDDRequests test = new BDDRequests();
        test.listerdv(nomcli);
    }
    public static void condition3(String daterdv, String nomcli, String nomveto)
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
