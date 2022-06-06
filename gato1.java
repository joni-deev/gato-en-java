public class gato1 {
    
    public static Scanner objeto= new Scanner(System.in);
    public static String uno[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    public static int i, j, a1, jugador, k=0, l,n=0, o=0;
    public static String m;
    
    public static void mostrar(){
    
        for(i=0; i<uno.length; i++){
        
        for(j=0; j<uno.length; j++){
        
            System.out.print(uno[i][j]);
        }
        
            System.out.println();
        }
    }
    
    public static void gato3(){
    
    n++;
    
    if(n==9){
        j--;
        System.out.println("El numero ingresado es incorrecto o ya existe!");}
    
    }
    
    public static void ganar(){
    
    if(uno[0][0].equals("X") && uno[0][1].equals("X") && uno[0][2].equals("X")){System.out.println("Gano el jugador 1!"); o--;}
    if(uno[1][0].equals("X") && uno[1][1].equals("X") && uno[1][2].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[2][0].equals("X") && uno[2][1].equals("X") && uno[2][2].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[0][0].equals("X") && uno[1][1].equals("X") && uno[2][2].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[0][0].equals("X") && uno[1][0].equals("X") && uno[2][0].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[0][1].equals("X") && uno[1][1].equals("X") && uno[2][1].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[0][2].equals("X") && uno[1][2].equals("X") && uno[2][2].equals("X")){System.out.println("Gano el jugador 1!");}
    if(uno[0][2].equals("X") && uno[1][1].equals("X") && uno[2][0].equals("X")){System.out.println("Gano el jugador 1!");}
    
    
    if(uno[0][0].equals("O") && uno[0][1].equals("O") && uno[0][2].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[1][0].equals("O") && uno[1][1].equals("O") && uno[1][2].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[2][0].equals("O") && uno[2][1].equals("O") && uno[2][2].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[0][0].equals("O") && uno[1][1].equals("O") && uno[2][2].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[0][0].equals("O") && uno[1][0].equals("O") && uno[2][0].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[0][1].equals("O") && uno[1][1].equals("O") && uno[2][1].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[0][2].equals("O") && uno[1][2].equals("O") && uno[2][2].equals("O")){System.out.println("Gano el jugador 2!");}
    if(uno[0][2].equals("O") && uno[1][1].equals("O") && uno[2][0].equals("O")){System.out.println("Gano el jugador 2!");} 
    
    o++;
    
    if(o==9){System.out.println("Nadie gano!");}
    
    }
    
    public static void evaluar(){
    
     for(i=0; i<3; i++){
        
        for(j=0; j<3; j++){
            
            k++;
            m=String.valueOf(a1);
        if(a1==k && uno[i][j].equals(m)){
            
        
           if(jugador==0){
               
              uno[i][j]="X";
           
           }
           
           if(jugador==1){
           
              uno[i][j]="O";
           
           }  
            
           } 
        
        else{gato3();}
        
        
        }} 
    } 
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al juego del gato, inicia el jugador 1 con X ");
        
        mostrar();
        
        for(l=0; l<4; l++){
        
        System.out.println("ingresa el numero de la casilla a cambiar por una X");
        a1=objeto.nextInt();
        
        evaluar();
        
        mostrar();
        
        ganar();
        
        jugador=1;
        k=0;
        
        System.out.println("ingresa el numero de la casilla a cambiar por una O");
        a1=objeto.nextInt();
        
        evaluar();
        
        mostrar();
        
        ganar();
        
        jugador=0;
        k=0;
    }
    
     System.out.println("ingresa el numero de la casilla a cambiar por una X");
        a1=objeto.nextInt();
        
        jugador=0;
        
        evaluar();
        
        mostrar();
        
        ganar();
        
        jugador=1;
        k=0;
    
