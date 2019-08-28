
package juego.del.gato;

import java.util.Scanner;

public class JuegoDelGato {
    
    
    //creando el array
    public static char array[][] = new char[3][3];
    public static char jugador = 'X';
    
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
        char casilla;
        
        boolean repetirTurnoMismoJugador = false;
       
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
            boolean seguirJugando = verificarGanador(jugador);

            //verificar si hay empate
            verificarEmpate();
             
            //cambiar el turno del jugaro
            cambiarTurno();
            
        }while(true); 
       
        
    }

    public static boolean verificarGanador(char jugador) {
        System.out.println("Verificando ganador....");
    
        
            
        return true;
    }

    public static void verificarEmpate() {
         System.out.println("Verificando empate....");
    }
    
}
