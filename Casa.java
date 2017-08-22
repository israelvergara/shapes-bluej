
/**
 * Descripción: El programa debe realizar el armado automatico de una casa con las
 * siguientes figuras: triangulo, cuadrado y circulo.
 * Autor: Israel Vergara Navor.
 * Fecha: 17 Agosto de 2017.
 * Profesor: Eloy Hernández.
 */

class Casa
{
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    Casa casa2;

Casa()
{
    ventana = new Circle();
    techo =  new Triangle();
    pared = new Square();
    puerta = new Square();
    
}

void dibujate()
{
    ventana.makeVisible();
    techo.makeVisible();
    pared.makeVisible();
    puerta.makeVisible();
}

void acomodate(int desplazar)
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

void casa2(int y)
{
    casa2 = new Casa();
    
    casa2.dibujate();
    casa2.acomodate(y);
}


}
