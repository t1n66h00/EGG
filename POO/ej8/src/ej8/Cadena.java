package ej8;

import java.util.Scanner;

public class Cadena {

    Scanner leer = new Scanner(System.in).useDelimiter("/n");

// ATRIBUTOS
    private String frase;
    private int longitud;

// Constructores
    public Cadena() {

    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
      
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
       
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    /* • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.*/
    public int mostrarVocales(){
        int contador=0;
        int vocales=0;
        for(int i=1;i<longitud;i++ ){
            //con subtring seria if (frase.subtring i,i++)
            if(frase.charAt(i)==('a')||frase.charAt(i)==('A')||frase.charAt(i)==('e')||frase.charAt(i)==('E')||frase.charAt(i)==('i')||frase.charAt(i)==('I')||frase.charAt(i)==('o')||
                    frase.charAt(i)==('O')||frase.charAt(i)==('u')||frase.charAt(i)==('U')){
             contador++;
            }
        }
        System.out.println(" Cantidad de vocales "+contador);
        return vocales;
    }
    /*• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/

   public String invertirFrase(){
       char[] invertida=frase.toCharArray();
       String contador= "";
       for(int i=frase.length()-1;i>=0;i--){
           contador=contador+ invertida[i];
       }
        System.out.println(""+contador);
        return contador;
        
   }
   /*• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
   public int vecesRepetido(String letra){ 
       int posicion, contador=0;
       posicion=frase.indexOf(letra);
       while(posicion!=-1){// esta funcionde indeox cuando encuentra el caracter retorna -1 por eso el while es con eso
           contador++;
           posicion=frase.indexOf(letra, posicion+1);
       }
       System.out.println(" La letra "+letra+" elegida se repite "+contador+" veces");
       return contador;
   }

 /*• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.*/
   
   public void compararLongitud( String frase2){
       if(frase.length()==frase2.length()){
           System.out.println(" Las 2 frases tienen la misma longitud ");
       }else{
           System.out.println(" Las 2 frases tiene longitud diferente ");
       }
   }
 /*• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
   
   public String unirFrases(String frase3){
       String concten=frase.concat(frase3);
       System.out.println(" Las frases unidas quedarian en " +concten);
        return concten;
   }

/*• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.*/      
   public String reemplazar(String letra2){
       String reemplaza;
        reemplaza = frase.replace("a", ""+letra2);
       System.out.println(" La frase con la letra reemplazada es "+reemplaza);
       return reemplaza;
           }
   /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
   public void contiene(String letra3){
    
           System.out.println(frase.contains(letra3));
      
          
   }
}
