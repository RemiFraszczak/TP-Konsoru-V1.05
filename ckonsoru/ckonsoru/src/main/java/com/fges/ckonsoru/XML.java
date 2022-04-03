package com.fges.ckonsoru;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XML {

    public static void condition1(String partiesdates[]) {
        XMLRequests test = new XMLRequests();
        test.afficherCreneaux(Integer.parseInt(partiesdates[2]), Integer.parseInt(partiesdates[1]), Integer.parseInt(partiesdates[0]));
    }

    public static void condition2(String nomcli) {
        XMLRequests test = new XMLRequests();
        test.afficheRDVCli(nomcli);
    }

    public static void condition3(String daterdv, String nomcli, String nomveto) {
        XMLRequests test = new XMLRequests();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            Date parsedDate = dateFormat.parse(daterdv);
            Timestamp datetimestamp = new java.sql.Timestamp(parsedDate.getTime());
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(datetimestamp);
            test.AddRdv(timeStamp, nomveto, nomcli);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


