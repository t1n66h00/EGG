import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            int matriz [][];
            matriz = new int [3][3];
            int matriztranspuesta [][];
            matriztranspuesta = new int [3][3];
            int num;
            boolean logic=false;
            ///Recorro la matriz ungresando los valores de ambas matrices
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    num = leer.nextInt();
                    matriz [i][j]=num;
                    matriztranspuesta [j][i]=num;
                }
            }
            ///Recorro la matriz verificando si son anti-simetricas
             for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    if (matriz [i][j]==matriztranspuesta[i][j]*(-1)){
                        logic = true;
                    }else{
                        logic = false;
                        break;
                    }
                }
            }
            ///Muestro ambas matrices y muestro si son o no antisimetricas 
            System.out.println("Original");
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    System.out.print(matriz [i][j]+"  ");
                }
                System.out.println("");
            }
            System.out.println("Transpuesta");
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    System.out.print(matriztranspuesta[i][j]+"  ");
                }
                System.out.println("");
            }
            if(logic == true){
                System.out.println("Es Anti-Simetrica");
            }else{
                System.out.println("No es Anti-Simetrica");
            }
        }

    }
    
}
