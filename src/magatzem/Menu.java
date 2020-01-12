package magatzem;

import java.util.ArrayList;
import java.util.Scanner;
import magatzem.Articulo;

 
public class Menu{

	public static void main(String[] args) {
    	
    	

    	Articulo arr[]= {new Articulo("(a44)","[Libro:'El Señor de los Anillos' Tapa blanda]",29.95,15.50,30),
    			new Articulo("(b33)","[Cuaderno: Tamanyo Mediano",9.95,3.50,2),new Articulo("(c3)","[Castillo:Es de gran volumen]",91.95,32.50,21),
    			new Articulo("(d65)","[Caja de Lapices:Tamanyo medio]",3.95,1.50,2),new Articulo("(e32)","[Cortacesped:Motor ultima generacion]",6.95,3.50,2)};
    	Scanner s = new Scanner(System.in);
    	Scanner narr = new Scanner(System.in); //UN SCANNER PARA PEDIR OTRO MUMERO DE LA LISTA DEL ARTICULO QUE QUEREMOS UTILIZANDO ORDEN DEL ARRAY
    	Scanner n = new Scanner(System.in); // UN SCANNER PARA PEDIR EL MUMERO POR TECLADO Y LO OPERE PARA MOSTRAR LA SUMA O LA RESTA[ENTRADA/SALIDA DE MERCADERIA]
        Scanner sn = new Scanner(System.in); // UN SCANNER PARA PEDIR EL MUMERO DE LA LISTA DE DE OPCIONES QUE QUEREMOS[SWITCH1]
        Scanner sn2 = new Scanner(System.in); //UN SCANNER PARA PEDIR EL MUMERO DE LA LISTA DEL ARTICULO QUE QUEREMOS[SWITCH2]
        boolean salir = false; //PARA LA VARIABLE NUMERICA
        int opcion; //GUARDAMOS OPCION DEL USUARIO
        int opcion2;
        String no;
        
        /////////
        int num,narray, suma,resta= 0,stk;  ////// LA CREAMOS PARA QUE NO CONCATENE EL APARTADO 5 A LA HORA DE AÑADIR STOCK
        suma=0;
        /////////
        while (!salir) { //PONEMOS ESTO PARA QUE RECONOZCA QUE (HASTA QUE NOSOTROS NO PONGAMOS [SALIR=TRUE] EL PROGRAMA NO FINALICE
 
            System.out.println("1. Listado ");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificacion");//UTILIZAR LOS SETTERS
            System.out.println("5. Entrada de mercaderia");
            System.out.println("6. Salida de mercaderia");
            System.out.println("7. Salir");
 
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt(); //LO CREAMOS PARA PEDIR EL NUMERO DE LA OPCION QUE QUEREMOS
               
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        for(int i=0;i<arr.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO SIN QUE HAYA ERRORES
                        System.out.println(arr[i]);
                    
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion [ALTA]");
                        
                        System.out.print("Ingrese codigo");

                        String codigo = s.nextLine();

                        System.out.print("Ingrese descripcion");

                        String descripcion = s.nextLine();
                        
                        System.out.print("Ingrese precioCompra");
                        
                        double precioCompra = s.nextInt();
                        
                        System.out.print("Ingrese precioVenta");
                        
                        double precioVenta = s.nextInt();
                        
                        System.out.print("Ingrese stock");
                        
                        int stock = s.nextInt(); 
                        
                    
                       
                        
                        
                        
                        
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion [BAJA]");
                        System.out.println("Selecciona el numero del producto que desea dar de Baja:");
                        for(int i=0;i<arr.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO SIN QUE HAYA ERRORES
                            System.out.println((i)+"."+arr[i]);
                        narray = narr.nextInt();
                        stk=arr[narray].getStock();
                        if(arr[narray].getStock()>0) {
                        stk=-1;
                        System.out.println("Ahora el valor del Articulo es: "+stk);
                        }
                        
                        break;
                        
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion [ENTRADA DE MERCADERIA]");
                        System.out.println("Escoja un valor segun el orden del producto que desea.");
                        System.out.println("Aqui tienes la Lista de Articulos:");
                        
		                        for(int i=0;i<arr.length;i++)
		                            System.out.println((i)+"."+arr[i]); //PONIENDO DELANTE[ (i)+"."]ORDENAMOS LOS VALORES POR NUMERO. 
		                        	System.out.println("5.Otros:");
		                        	System.out.println("6.SALIR");
		                        //OTRO SWITCH
                        opcion2 = sn2.nextInt();
		                        switch (opcion2) {
		                        case 0:
		                        	System.out.println("¿Cuantas unidades desea agregar al Stock?");
		                        	num = n.nextInt();
		                        	stk=arr[0].getStock();
		                        	suma= num + stk;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                            break;
		                        case 1:
		                            System.out.println("¿Cuantas unidades desea agregar al Stock?");
		                            num = n.nextInt();
		                        	stk=arr[1].getStock();
		                        	suma= num + stk;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                            break;
								case 2:
									System.out.println("¿Cuantas unidades desea agregar al Stock?");
		                        	num = n.nextInt();
		                        	stk=arr[2].getStock();
		                        	suma= num + stk;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                            break;
		                        case 3:
		                        	System.out.println("¿Cuantas unidades desea agregar al Stock?");
		                        	num = n.nextInt();
		                        	stk=arr[3].getStock();
		                        	suma= num + stk;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                            break;
		                        case 4:
		                        	System.out.println("¿Cuantas unidades desea agregar al Stock?");
		                        	num = n.nextInt();
		                        	stk=arr[4].getStock();
		                        	suma= num + stk;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                            break;
		                        case 5:
		                        	System.out.println("Digite un numero superior a 5 para elegir otro Articulo.");
		                        	narray = narr.nextInt();
		                        	System.out.println(arr[narray]);
		                        	System.out.println("¿Cuantas unidades desea agregar del Stock?");
		                        	num = n.nextInt();
 		                        	stk=arr[narray].getStock();
 		                        	suma= stk + num;
		                        	if(suma>0) {
		                        		System.out.println("[ Ahora hay un total de "+suma+ " unidades.]");}
		                        	if(suma<=0) { 
	 		                        		System.out.println("ERROR: No queda Stock suficiente para sumar a esa cantidad.");}
		                        	break;
		                        case 6:
		                            salir = true;//CON ESTA OPCION SALDREMOS DEL PROGRAMA
		                            break;
		                        default: System.out.println("PULSE [6] PARA SALIR");
		                    }
                        break;
                    case 6:
                    	 System.out.println("Has seleccionado la opcion [SALIDA DE MERCADERIA]");
                         System.out.println("Escoja un valor segun el orden del producto que desea.");
                         System.out.println("Aqui tienes la Lista de Articulos:");
 		                        for(int i=0;i<arr.length;i++)
 		                            System.out.println((i)+"."+arr[i]); //PONIENDO DELANTE[ (i)+"."]ORDENAMOS LOS VALORES POR NUMERO. 
 		                        	System.out.println("5.Otros");
 		                        	System.out.println("6.SALIR");
 		                        //OTRO SWITCH
                         opcion2 = sn2.nextInt();
 		                        switch (opcion2) {	
 		                        case 0:
 		                        	if(resta>=0) {
 		                        	System.out.println("¿Cuantas unidades desea sacar del Stock?");
 		                        	num = n.nextInt();
 		                        	stk=arr[0].getStock();
 		                        	resta= stk - num;
 		                            System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 		                        	if(resta<0) { 
 		                        		System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 		                        	break;
 		                        case 1:
 		                        	if(resta>=0) {
 		                            System.out.println("¿Cuantas unidades desea sacar del Stock?");
 		                            num = n.nextInt();
 		                        	stk=arr[1].getStock();
 		                        	resta= stk - num;
 		                        	System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 		                        	if(resta<0) { 
 		                        		System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 		                            break;
 								case 2:
 									if(resta>=0) {
 	 		                            System.out.println("¿Cuantas unidades desea sacar del Stock?");
 	 		                            num = n.nextInt();
 	 		                        	stk=arr[2].getStock();
 	 		                        	resta= stk - num;
 	 		                        	System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 									if(resta<0) { 
 	 		                        		System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 	 		                            break;
 		                        case 3:
 		                        	if(resta>=0) {
 	 		                            System.out.println("¿Cuantas unidades desea sacar del Stock?");
 	 		                            num = n.nextInt();
 	 		                        	stk=arr[3].getStock();
 	 		                        	resta= stk - num;
 	 		                        	System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 		                        	if(resta<0) { 
 	 		                        		System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 	 		                            break;
 		                        case 4:
 		                        	if(resta>=0) {
 	 		                            System.out.println("¿Cuantas unidades desea sacar del Stock?");
 	 		                            num = n.nextInt();
 	 		                        	stk=arr[4].getStock();
 	 		                        	resta= stk - num;
 	 		                        	System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 		                        	if(resta<0){ 
 	 		                        		System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 	 		                            break;
 		                        case 5:
 		                        		System.out.println("Digite un numero superior a 5 para elegir otro Articulo.");
 		                        		narray = narr.nextInt();
 		                        		System.out.println(arr[narray]);
 		                        		System.out.println("¿Cuantas unidades desea sacar del Stock?");
 		                        		num = n.nextInt();
 	 		                        	stk=arr[narray].getStock();
 	 		                        	resta= stk - num;
 		                        	if(resta>=0) {
 		                        		System.out.println("[ Ahora hay un total de "+resta+ " unidades.]");}
 		                        	if(resta<0) { 
 	 		                        	System.out.println("ERROR: No queda Stock suficiente para restar a esa cantidad.");}
 	 		                            break;
 		                    
 		                        case 6:
 		                        	 salir = true;//CON ESTA OPCION SALDREMOS DEL PROGRAMA
 		                            break;
 		                        default: System.out.println("PULSE [5] PARA SALIR"); }
 		                        
                      
                    case 7:
                    		salir = true;//CON ESTA OPCION SALDREMOS DEL PROGRAMA
                    		break;
			                default: System.out.println("Solo un numero del 1 al 7"); }
     
            
        }
 
    }
 
}
