import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            int matriz_grande [][];
            matriz_grande = new int [10][10];
            int matriz_chica [][];
            matriz_chica = new int [3][3];
            boolean logic=false;
            ///Lleno la matriz grande
            System.out.println("LLene la matriz grande");
            for (int i=0; i<10; i++){
                for (int j=0; j<10; j++ ){
                  matriz_grande [i][j]=leer.nextInt();
                }
            }
            ///Lleno la matriz chica
            System.out.println("LLene la matriz chica");
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++ ){
                  matriz_chica [i][j]=leer.nextInt();
                }
            }
            ///Realizo la busqueda de la matriz chica en la grande 
            for (int i=0; i<8; i++){
                for (int j=0; j<8; j++ ){
                  if(matriz_grande [i][j] == matriz_chica[0][0] ){
                       logic=true;
                       if(matriz_grande [i][j+1] == matriz_chica[0][1] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i][j+2] == matriz_chica[0][2] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+1][j] == matriz_chica[1][0] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+1][j+1] == matriz_chica[1][1] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+1][j+2] == matriz_chica[1][2] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+2][j] == matriz_chica[2][0] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+2][j+1] == matriz_chica[2][1] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                       if(matriz_grande [i+2][j+2] == matriz_chica[2][2] ){
                           logic=true;
                       }else{
                           logic=false;
                           break;
                       }
                  }
                }
            }
            if(logic==true){
                System.out.println("esta dentro");
            }else{
                System.out.println("no esta dentro");
            }
        }
    }
    
}
