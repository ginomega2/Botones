package Cadenas;

//enum ColorL {NEGRO,ROJO,VERDE,AMARILLO,AZUL,PURPURA,CYAN,BLANCO,RESET}
//enum ColorF {NEGRObg,ROJObg,VERDEbg,AMARILLObg,AZULbg,PURPURAbg,CYANbg,BLANCObg,RESET}


public class MsgColorRunner {
    MsgColor msgColor = new MsgColor("OPCION1",MsgColor.NEGRO,MsgColor.ROJObg);

    public static void main(String[] args) {

        String[] coloresLetra = {MsgColor.NEGRO,MsgColor.ROJO,MsgColor.VERDE,MsgColor.AMARILLO,MsgColor.AZUL,MsgColor.PURPURA,MsgColor.CYAN,MsgColor.BLANCO,MsgColor.RESET};
        String[] coloresFondo={MsgColor.NEGRObg,MsgColor.ROJObg,MsgColor.VERDEbg,MsgColor.AMARILLObg,MsgColor.AZULbg,MsgColor.PURPURAbg,MsgColor.CYANbg,MsgColor.BLANCObg,MsgColor.RESET};



        for (int indiceLetra=0;indiceLetra<coloresLetra.length;indiceLetra++){
            String colorActual=coloresLetra[indiceLetra];
            for (int indiceFondo=0;indiceFondo<coloresFondo.length;indiceFondo++){
                String fondoActual=coloresFondo[indiceFondo];
                MsgColor msgColor = new MsgColor(" MENSAJE ",colorActual,fondoActual);
                System.out.print(msgColor);
                System.out.println(msgColor.getMsgColorDetails());
            }

        }
//        MsgColor msgColor = new MsgColor("OPCION1",MsgColor.NEGRO,MsgColor.ROJObg);

//        System.out.println(msgColor);
//        msgColor.setcLetra(MsgColor.INFO);
//        System.out.println(msgColor);


        MsgColor msgCol = new MsgColor("TITULO",MsgColor.NEGRO,MsgColor.AZULbg);
        System.out.println(msgCol);

    }

}
