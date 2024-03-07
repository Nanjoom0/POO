import java.io.*;
class coche{

 //Atributos
String color;
String marca;
int km;

//Metodo
public static void main(String [] args){

//Crear odjeto
coche cochel = new coche();

//Modificar atributos
cochel.color="Rojo";
cochel.marca="Mitsubishi";
cochel.km=0;

//Mostrar por pantalla los valores del objeto
System.out.println("El color del coche es:  " +cochel.color);
System.out.println("La marca del coche es:  " +cochel.marca);
System.out.println("El km del coche es:  " +cochel.km);

}
}
