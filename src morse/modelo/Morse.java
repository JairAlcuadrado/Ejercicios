package modelo;

import java.util.Scanner;
public class Morse {
   public static final String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
        ".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
   public static final String[] normal={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
        "p","q","r","s","t","u","v","w","x","y","z",
        "1","2","3","4","5","6","7","8","9","0"};
   
   
    
   char [] character;
   String [] simbol;
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    Morse cm = new Morse();
    int opc=0;
    String cadena;
    System.out.println("Menu \n 1.- Normal a Morse \n 2.- Morse a Normal");
    opc=Integer.parseInt(scanner.nextLine());
    if(opc==1){
    System.out.println("Inserte una palabra para convertirla a morse");
    cadena=scanner.nextLine().toLowerCase();
    System.out.println(cm.getCadenaMorse(cadena));
    }else{
    if(opc==2){   
    System.out.println("Inserte código morse para volverlo una palabra normal ");
    cadena=scanner.nextLine().toLowerCase();
    System.out.println(cm.getCadena(cadena)); 
    }else{
        
    }
    }
    }
    
    public String getCadenaMorse(String cadena){
    String cadenaMorse="";
    character=cadena.toCharArray();
    for(int i=0;i<character.length;i++){
    switch(character[i]) {
        case 'a':
        cadenaMorse=cadenaMorse+" "+morse[0];
        break;
        case 'b':
        cadenaMorse=cadenaMorse+" "+morse[1];
        break;
        case 'c':
        cadenaMorse=cadenaMorse+" "+morse[2];
        break;
        case 'd':
        cadenaMorse=cadenaMorse+" "+morse[3];
        break;
        case 'e':
        cadenaMorse=cadenaMorse+" "+morse[4];
        break;
        case 'f':
        cadenaMorse=cadenaMorse+" "+morse[5];
        break;
        case 'g':
        cadenaMorse=cadenaMorse+" "+morse[6];
        break;
        case 'h':
        cadenaMorse=cadenaMorse+" "+morse[7];
        break;
        case 'i':
        cadenaMorse=cadenaMorse+" "+morse[8];
        break;
        case 'j':
        cadenaMorse=cadenaMorse+" "+morse[9];
        break;
        case 'k':
        cadenaMorse=cadenaMorse+" "+morse[10];
        break;
        case 'l':
        cadenaMorse=cadenaMorse+" "+morse[11];
        break;
        case 'm':
        cadenaMorse=cadenaMorse+" "+morse[12];
        break;
        case 'n':
        cadenaMorse=cadenaMorse+" "+morse[13];
        break;
        case 'o':
        cadenaMorse=cadenaMorse+" "+morse[14];
        break;
        case 'p':
        cadenaMorse=cadenaMorse+" "+morse[15];
        break;
        case 'q':
        cadenaMorse=cadenaMorse+" "+morse[16];
        break;
        case 'r':
        cadenaMorse=cadenaMorse+" "+morse[17];
        break;
        case 's':
        cadenaMorse=cadenaMorse+" "+morse[18];
        break;
        case 't':
        cadenaMorse=cadenaMorse+" "+morse[19];
        break;
        case 'u':
        cadenaMorse=cadenaMorse+" "+morse[20];
        break;
        case 'v':
        cadenaMorse=cadenaMorse+" "+morse[21];
        break;
        case 'w':
        cadenaMorse=cadenaMorse+" "+morse[22];
        break;
        case 'x':
        cadenaMorse=cadenaMorse+" "+morse[23];
        break;
        case 'y':
        cadenaMorse=cadenaMorse+" "+morse[24];
        break;
        case 'z':
        cadenaMorse=cadenaMorse+" "+morse[25];
        break;
        case '1':
        cadenaMorse=cadenaMorse+" "+morse[26];
        break;
        case '2':
        cadenaMorse=cadenaMorse+" "+morse[27];
        break;
        case '3':
        cadenaMorse=cadenaMorse+" "+morse[28];
        break;
        case '4':
        cadenaMorse=cadenaMorse+" "+morse[29];
        break;
        case '5':
        cadenaMorse=cadenaMorse+" "+morse[30];
        break;
        case '6':
        cadenaMorse=cadenaMorse+" "+morse[31];
        break;
        case '7':
        cadenaMorse=cadenaMorse+" "+morse[32];
        break;
        case '8':
        cadenaMorse=cadenaMorse+" "+morse[33];
        break;
        case '9':
        cadenaMorse=cadenaMorse+" "+morse[34];
        break;
        case '0':
        cadenaMorse=cadenaMorse+" "+morse[35];
        break;
        case ' ':
        cadenaMorse=cadenaMorse+"   ";
        break;
    }  
    }
        return cadenaMorse; 
    }

    public String getCadena(String cadena){
    String cadenaNormal="";
    simbol=cadena.split(" ");
   for(int i=0;i<simbol.length;i++){
    switch(simbol[i]) {
        case ".-":
        cadenaNormal=cadenaNormal+normal[0];
        break;
        case "-...":
        cadenaNormal=cadenaNormal+normal[1];
        break;
        case "-.-.":
        cadenaNormal=cadenaNormal+normal[2];
        break;
        case "-..":
        cadenaNormal=cadenaNormal+normal[3];
        break;
        case ".":
        cadenaNormal=cadenaNormal+normal[4];
        break;
        case "..-.":
        cadenaNormal=cadenaNormal+normal[5];
        break;
        case "--.":
        cadenaNormal=cadenaNormal+normal[6];
        break;
        case "....":
        cadenaNormal=cadenaNormal+normal[7];
        break;
        case "..":
        cadenaNormal=cadenaNormal+normal[8];
        break;
        case ".---":
        cadenaNormal=cadenaNormal+normal[9];
        break;
        case "-.-":
        cadenaNormal=cadenaNormal+normal[10];
        break;
        case ".-..":
        cadenaNormal=cadenaNormal+normal[11];
        break;
        case "--":
        cadenaNormal=cadenaNormal+normal[12];
        break;
        case "-.":
        cadenaNormal=cadenaNormal+normal[13];
        break;
        case "---":
        cadenaNormal=cadenaNormal+normal[14];
        break;
        case ".--.":
        cadenaNormal=cadenaNormal+normal[15];
        break;
        case "--.-":
        cadenaNormal=cadenaNormal+normal[16];
        break;
        case ".-.":
        cadenaNormal=cadenaNormal+normal[17];
        break;
        case "...":
        cadenaNormal=cadenaNormal+normal[18];
        break;
        case "-":
        cadenaNormal=cadenaNormal+normal[19];
        break;
        case "..-":
        cadenaNormal=cadenaNormal+normal[20];
        break;
        case "...-":
        cadenaNormal=cadenaNormal+normal[21];
        break;
        case ".--":
        cadenaNormal=cadenaNormal+normal[22];
        break;
        case "-..-":
        cadenaNormal=cadenaNormal+normal[23];
        break;
        case "-.--":
        cadenaNormal=cadenaNormal+normal[24];
        break;
        case "--..":
        cadenaNormal=cadenaNormal+normal[25];
        break;
        case "   ":
        cadenaNormal=cadenaNormal+" ";
        break;
        case ".----":
        cadenaNormal=cadenaNormal+normal[26];
        break;
        case "..---":
        cadenaNormal=cadenaNormal+normal[27];
        break;
        case "...--":
        cadenaNormal=cadenaNormal+normal[28];
        break;
        case "....-":
        cadenaNormal=cadenaNormal+normal[29];
        break;
        case ".....":
        cadenaNormal=cadenaNormal+normal[30];
        break;
        case "-....":
        cadenaNormal=cadenaNormal+normal[31];
        break;
        case "--...":
        cadenaNormal=cadenaNormal+normal[32];
        break;
        case "---..":
        cadenaNormal=cadenaNormal+normal[33];
        break;
        case "----.":
        cadenaNormal=cadenaNormal+normal[34];
        break;
        case "-----":
        cadenaNormal=cadenaNormal+normal[35];
        break;
    }  
    }
        return cadenaNormal; 
    }   
}


