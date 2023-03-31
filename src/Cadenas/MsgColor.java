package Cadenas;

enum ColorL {NEGRO,ROJO,VERDE,AMARILLO,AZUL,PURPURA,CYAN,BLANCO,RESET}
enum ColorF {NEGRObg,ROJObg,VERDEbg,AMARILLObg,AZULbg,PURPURAbg,CYANbg,BLANCObg,RESET}

public class MsgColor {
    public static final String RESET = "\u001B[0m";
    //***************   COLOR DE LETRA   ********************************
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String CYAN= "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    //***************   COLOR DE FONDO   ***********************
    public static final String NEGRObg = "\u001B[40m";
    public static final String ROJObg = "\u001B[41m";
    public static final String VERDEbg = "\u001B[42m";
    public static final String AMARILLObg = "\u001B[43m";
    public static final String AZULbg = "\u001B[44m";
    public static final String PURPURAbg = "\u001B[45m";
    public static final String CYANbg = "\u001B[46m";
    public static final String BLANCObg = "\u001B[47m";

    public static final String PELIGRO=NEGRO+ROJObg;
    public static final String TITULO=NEGRO+AZULbg;
    public static final String INFO=NEGRO+PURPURAbg;



    private String mensaje;
    private String cLetra;
    private String cFondo;




    public MsgColor() {
        mensaje="default";
        cLetra=BLANCO;
        cFondo=NEGRObg;
        cLetra=cLetra+cFondo;
    }

    public MsgColor(String mensaje,String cLetra){
        super();
        this.mensaje=mensaje;
        this.cLetra=cLetra;
    }



    public MsgColor(String mensaje, String cLetra, String cFondo) {
        this.mensaje = mensaje;
        this.cLetra = cLetra;
        this.cFondo = cFondo;
    }



    public String getMsgColorDetails(){

        String mensajeDetails= mensaje;
        String colorLetraToString="";
        String fondoLetraToString="";

        colorLetraToString=switch (cLetra){
            case NEGRO -> "Negro Fg";
            case ROJO -> "Rojo Fg";
            case VERDE -> "Verde Fg";
            case AMARILLO -> "Amarillo Fg";
            case AZUL -> "Azul Fg";
            case PURPURA -> "Purpura Fg";
            case CYAN -> "Cyan Fg";
            case BLANCO -> "Blanco Fg";
            default -> "RESET";
        };

        fondoLetraToString=switch (cFondo){
            case NEGRObg -> "Negro Bg";
            case ROJObg -> "Rojo Bg";
            case VERDEbg -> "Verde Bg";
            case AMARILLObg -> "Amarillo Bg";
            case AZULbg -> "Azul Bg";
            case PURPURAbg-> "Purpura Bg";
            case CYANbg -> "Cyan Bg";
            case BLANCObg -> "Blanco Bg";
            default -> "RESET";
        };



//        mensajeDetails

        return  " Mensaje : "+mensajeDetails+ " Color de Letra : "+colorLetraToString+ " Color de Fondo : "+fondoLetraToString;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getcLetra() {
        return cLetra;
    }

    public void setcLetra(String cLetra) {
        this.cLetra = cLetra;
    }

    public String getcFondo() {
        return cFondo;
    }

    public void setcFondo(String cFondo) {
        this.cFondo = cFondo;
    }

    @Override
    public String toString() {
        String mensajeColor= cLetra+cFondo+mensaje+RESET;
        return  mensajeColor;

    }
}
