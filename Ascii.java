/**
 * Programa que imprime una tabla de códigos ASCII por pantalla.
 * @author yofeliz
 */
public class Ascii {
    public static void main(String[] params) {
        for(int i=0; i<128; i=i+4) {
            System.out.println((char)i + " | " + (char)(i+1) + " | " + (char)(i+2) + " | " + (char)(i+3));
        }//for
    }//main
}//Ascii
