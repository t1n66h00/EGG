import java.util.Scanner;

 
public class ej19 {
 
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            float monto;
            int moneda;
              System.out.println("Ingrese un monto en euros");
              monto = leer.nextInt();
              System.out.println("Seleccione a que moneda desea convertir");
              System.out.println("1- US$");
              System.out.println("2- Libras");
              System.out.println("3- Yenes");
              do {
                tipo_moneda = leer.nextInt();
                 
     }while ( moneda != 1 && moneda != 2 && moneda != 3  );
              float conversion = (float) conversor(monto,moneda) ;
              switch (moneda){
                  case 1:
                      System.out.println(monto+" euros = "+conversion+" dolares");
                      break;
                  case 2:
                      System.out.println(monto+" euros = "+conversion+" Libras");
                      break;
                  case 3:
                      System.out.println(monto+" euros = "+conversion+" Yenes");
                      break;
              }
        }
      }

      public static float conversor(float monto, int moneda){
          float resultado;
          resultado = 1;
          switch (moneda){
              case 1:
                  resultado = (float) (monto * 0.86);
                  break;
              case 2:
                  resultado = (float) (monto * 1.28611);
                  break;
              case 3:
                  resultado = (float) (monto * 129.852);
                  break;
          }
          return resultado;
      }
  }