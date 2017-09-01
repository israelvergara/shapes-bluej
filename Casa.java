/**
 * Descripción: El programa debe realizar el armado automatico de una casa con las
 * siguientes figuras: triangulo, cuadrado y circulo.
 * @author Israel Vergara Navor.
 * @version 17 Agosto de 2017.
 * Profesor: Eloy Hernández.
 */

public class Casa
{
    private Circle ventana;
    private Triangle techo;
    private Square pared;
    private Square puerta;
    private Casa casa2;
    
   /**
    * constructor que inicializa las variables ventana, techo, pared y puerta.
    */
   public Casa()
   {   
        ventana = new Circle();
        techo =  new Triangle();
        pared = new Square();
        puerta = new Square();
   }
   
   /**
    * Metodo que dibuja figuras en la terminal grafica
    */
   public void dibujate()
   {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
   }
   
   /**
    * metodo que acomoda las figuras dibujadas y da forma a una casa.
    * @param desplazar permite contener un valor para poder mover la casa
    */
   public void acomodate(int desplazar)
   {   
        ventana.moveHorizontal(30+desplazar);
        ventana.moveDown();
        ventana.moveVertical(-28);
    
        techo.moveHorizontal(15+desplazar);
        techo.changeSize(87,87);
        techo.moveVertical(-16);
        
        ventana.makeVisible();
          
        pared.changeSize(80);
        pared.moveDown();
        pared.moveDown();
        pared.moveHorizontal(-35+desplazar);
        pared.moveVertical(-5);
        
        puerta.changeColor("black");
        puerta.moveVertical(85);
        puerta.moveHorizontal(10+desplazar);
   }

   /**
    * metodo que dibuja otra casa.
    * @param y permite terner un desplazamiento para que la otra cas de mueva y quede 
    * a un lado de la primer casa.
    */
   public void casa2(int y)
   {
       casa2 = new Casa();
    
       casa2.dibujate();
       casa2.acomodate(y);
   }
}
