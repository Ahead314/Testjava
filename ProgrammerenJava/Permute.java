class Point
{
public Point (int abs, int ord)
{
x = abs ; y = ord;
}
public void permute ( Point a) // méthode d'Echange les coordonnées du point courant avec celles de a
{
Point c = new Point (0,0);
c.x = a.x; c.y = a.y; // copie de a dans c
a.x=x; a.y=y; // copie du point courant dans c
x = c.x ; y =c.y; // copie de c dans le point courant
}
public void affiche ()
{
System.out.println("Coordonnées : " + x + " " + y);
}
private int x, y;

}

public class Permute
{
public static void main( String [] args)
    {
Point a = new Point ( 1,2);
Point b = new Point ( 5,6);
a.affiche();
b.affiche();
a.permute(b);
a.affiche();
b.affiche();
}

}