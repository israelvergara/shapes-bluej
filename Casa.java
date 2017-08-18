
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

void acomodate()
{   
    ventana.moveRight();
    ventana.moveRight();
    ventana.moveRight();
    ventana.slowMoveHorizontal(20);
    
    techo.moveRight();
    techo.moveRight();
    techo.changeSize(130,130);
    techo.moveRight();
    
    ventana.makeVisible();
    ventana.moveDown();
    ventana.moveDown();
    ventana.moveHorizontal(-5);
    
    pared.changeSize(130);
    pared.moveDown();
    pared.moveDown();
    pared.moveDown();
    pared.moveDown();
    pared.moveDown();
    pared.moveHorizontal(-16);
    pared.moveVertical(-5);
    
    puerta.changeColor("black");
    puerta.moveVertical(195);
    puerta.moveHorizontal(50);
           
    
}



}
