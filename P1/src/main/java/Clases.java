
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emily Barrientos
 */
public class Clases {
    
    private static String [][] matriz= new String [5][11];

    private static final int NOMBRES=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TOTALVENT=5;
    private static final int VEINTEPOR=6;
    private static final int TREINTAYCINCOPOR=7;
    private static final int TOTALVC=8;
    private static final int ISR=9;
    private static final int TOTAL=10;
    
    public static void cargarInfo(){
        matriz[0][NOMBRES]= "Edgar";
        matriz[0][ENERO]= "150";
        matriz[0][FEBRERO]= "425";
        matriz[0][MARZO]= "367";
        matriz[0][ABRIL]= "112";
        
        matriz[1][NOMBRES]= "Esly";
        matriz[1][ENERO]= "357";
        matriz[1][FEBRERO]= "537";
        matriz[1][MARZO]= "268";
        matriz[1][ABRIL]= "151";
        
        matriz[2][NOMBRES]= "Rocio";
        matriz[2][ENERO]= "452";
        matriz[2][FEBRERO]= "175";
        matriz[2][MARZO]= "148";
        matriz[2][ABRIL]= "780";
        
        matriz[3][NOMBRES]= "Elubia";
        matriz[3][ENERO]= "900";
        matriz[3][FEBRERO]= "428";
        matriz[3][MARZO]= "592";
        matriz[3][ABRIL]= "671";
        
        matriz[4][NOMBRES]= "Hego";
        matriz[4][ENERO]= "700";
        matriz[4][FEBRERO]= "400";
        matriz[4][MARZO]= "801";
        matriz[4][ABRIL]= "100";
        
    }
    public static Float MAX= 0f;
    public static Float min= 1000000f;
    public static void Resultados(){
      int total=0;
      for(int i=0; i<5; i++){
          total= Integer.parseInt(matriz[i][ENERO]);
          total= total + Integer.parseInt(matriz[i][FEBRERO]);
          total= total + Integer.parseInt(matriz[i][MARZO]);
          total= total + Integer.parseInt(matriz[i][ABRIL]);
          matriz[i][TOTALVENT]= String.valueOf(total);
          
          if(total < 2000){

              matriz[i][VEINTEPOR] = String.valueOf((total*20)/100);
              matriz[i][TOTALVC]= String.valueOf(total+ Integer.parseInt(matriz[i][VEINTEPOR]));
          }
          else if(total >= 2001){

              matriz[i][TREINTAYCINCOPOR]= String.valueOf((total*35)/100);
              matriz[i][TOTALVC]= String.valueOf(total+ Integer.parseInt(matriz[i][TREINTAYCINCOPOR]));
          }
          matriz[i][ISR]= String.valueOf(Double.parseDouble(matriz[i][TOTALVC])*5/100);
          matriz[i][TOTAL]= String.valueOf(Double.parseDouble(matriz[i][TOTALVC])-Double.parseDouble(matriz[i][ISR]));

          if(Float.parseFloat(matriz[i][TOTAL])>MAX){
          MAX= Float.parseFloat(matriz[i][TOTAL]);
        } else if(Float.parseFloat(matriz[i][TOTAL])<min){
          min= Float.parseFloat(matriz[i][TOTAL]);
        }
      }
       mayorMenor(MAX, min);
    }

    public static void mayorMenor(float MAX, float min){
        System.out.println("El total mayor es de: "+MAX);
        System.out.println("El total menor es de: "+min);
    }
    
    
    
    
    public static void imprimirDecorado(){
        for(int x=0; x<matriz.length; x++){
            System.out.print("|");
            for(int y=0; y<matriz[x].length; y++){
                System.out.print(matriz[x][y]);
                if(y!= matriz[x].length -1){
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
    
    public static void main(String[] args) {
                int op = 0;
        Scanner t = new Scanner(System.in);
        while(op!=3) {
            System.out.println();
            System.out.println("--Bienenido--");
            System.out.println("Estas son las opciones a elegir");
            System.out.println("1. Calcular los resultados.");
            System.out.println("2. Mostrar los resultados.");
            System.out.println("3. Salir.");
            System.out.println("Ingresa la opcion: ");
            op = t.nextInt();
            switch (op) {
                case 1 -> {
                    cargarInfo();
                    Resultados();
                    System.out.println("Estos son los Resultados");
                }
                case 2 -> imprimirDecorado();
                case 3 -> {
                    System.out.println("Gracias por utilizar el programa");
                    System.exit(op);
                }
            }
        }
//        cargarInfo();
//        Resultados();
//        imprimirDecorado();
    }
    
}
