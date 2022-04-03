package com.fges.ckonsoru;

public class XML {

    public static void  condition1(String partiesdates[]){
        XMLRequests test=new XMLRequests();
        test.afficherCreneaux(Integer.parseInt(partiesdates[2]),Integer.parseInt(partiesdates[1]),Integer.parseInt(partiesdates[0]));
    }
    public static void condition2(String nomcli)
    {
    XMLRequests test = new XMLRequests();
    test.afficheRDVCli(nomcli);
    }
}


