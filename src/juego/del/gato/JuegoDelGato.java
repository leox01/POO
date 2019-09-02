
package juego.del.gato;

import java.util.Scanner;

public class JuegoDelGato {
    
    
    //creando el array
    public static char array[][] = new char[3][3];
    public static char jugador = 'X';
    
    public static boolean hayGanador;
    public static boolean espaciosDisponibles;
    public static int respuesta;
    public static void cambiarTurno(){
    
        if(jugador=='X'){
                jugador = 'O';
            }else{
                jugador = 'X';
            }
    
    }
    
    public static void llenarArreglo(){
        
        char letra = 'A';
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array.length; columnas++) {
                array[filas][columnas] = letra++;
                
            }
            
        }
    
    }
    
    
    public static void imprimirArreglo(){
    
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array.length; columnas++) {
                 System.out.print(array[filas][columnas]+"  ");
            }
            System.out.println("");

       }
    
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);  
        Scanner tecladoInt = new Scanner(System.in);  
        char casilla;
        
        boolean repetirTurnoMismoJugador = false;
        do{
            //llenar el arreglo
            llenarArreglo();

            do{ // do-while para cambiar de turno
                do{ //do-while para repetir turno del mismo jugador
                    //imprimir arreglo
                    imprimirArreglo();
                    //pedir la casilla al jugador 1
                    System.out.println("Dame la letra donde quieras escribir la "+jugador);
                    casilla = teclado.nextLine().charAt(0);

                    switch(casilla){

                        case 'A':
                        case 'a':
                            if(array[0][0]=='A'){
                                array[0][0] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador = true;
                            }
                            break;
                        case 'B':
                        case 'b':
                            if(array[0][1]=='B'){
                                array[0][1] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'C':
                        case 'c':
                            if(array[0][2]=='C'){
                                array[0][2] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'D':
                        case 'd':
                            if(array[1][0]=='D'){
                                array[1][0] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'E':
                        case 'e':
                            if(array[1][1]=='E'){
                                array[1][1] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'F':
                        case 'f':
                            if(array[1][2]=='F'){
                                array[1][2] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'G':
                        case 'g':
                            if(array[2][0]=='G'){
                                array[2][0] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'H':
                        case 'h':
                            if(array[2][1]=='H'){
                                array[2][1] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;
                        case 'I':
                        case 'i':
                            if(array[2][2]=='I'){
                                array[2][2] = jugador;
                                repetirTurnoMismoJugador = false;
                            }else{
                                System.out.println("Error la casilla ya está ocupada");
                                repetirTurnoMismoJugador= true;
                            }
                            break;

                        default: System.out.println("No existe esa casilla ");
                                 repetirTurnoMismoJugador = true;
                    }

                }while(repetirTurnoMismoJugador);

                //verificar si hay ganador
               hayGanador = verificarGanador(jugador);

                //verificar si hay empate
               espaciosDisponibles = verificarEspaciosDisponibles();


               if(hayGanador)
                   System.out.println("Felicidades el jugador "+jugador+" es el ganador");


               if(!espaciosDisponibles)
                   System.out.println("Hay un empate!!!");

               if(espaciosDisponibles)
                   //cambiar el turno del jugaro
                    cambiarTurno();

            }while(!hayGanador&&espaciosDisponibles); 

            System.out.println("¿Quieres volver a jugar?1.-Si, 2.-No");

            respuesta = tecladoInt.nextInt();
            
        
        
        }while(respuesta==1);
        
       
        
    }

    public static boolean verificarGanador(char jugador) {
        
        
        return (array[0][0]==jugador&&array[0][1]==jugador&&array[0][2]==jugador||
                array[1][0]==jugador&&array[1][1]==jugador&&array[1][2]==jugador|| 
                array[2][0]==jugador&&array[2][1]==jugador&&array[2][2]==jugador||
                array[0][0]==jugador&&array[1][0]==jugador&&array[2][0]==jugador||
                array[0][1]==jugador&&array[1][1]==jugador&&array[2][1]==jugador||
                array[0][2]==jugador&&array[1][2]==jugador&&array[2][2]==jugador||
                array[0][0]==jugador&&array[1][1]==jugador&&array[2][2]==jugador||
                array[0][2]==jugador&&array[1][1]==jugador&&array[2][0]==jugador);
    
 
    }

    public static boolean verificarEspaciosDisponibles() {
        
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                if (array[filas][columnas]=='A'||
                    array[filas][columnas]=='B'|| 
                    array[filas][columnas]=='C'||
                    array[filas][columnas]=='D'|| 
                    array[filas][columnas]=='E'||
                    array[filas][columnas]=='F'|| 
                    array[filas][columnas]=='G'||
                    array[filas][columnas]=='H'|| 
                    array[filas][columnas]=='I'){
                            return true;
                }
            }
            
        }
        
        return false;
    }
    
}
