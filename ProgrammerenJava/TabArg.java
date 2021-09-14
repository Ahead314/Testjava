public class TabArg
{ 
public static void main( String [] args)
{
int t[] = {1, 3, 5, 7 };
System.out.print("t avant : ") ;
Util.affiche (t);
Util.raz (t);
System.out.print("\nt après : ");
Util.affiche(t);
}
}

class Util
{
static void raz ( int t [])
{
for ( int i = 0; i <t.length ; i++) // ici for each pas applicable
t[i] = 0;
}

static void affiche ( int t [])
{
for ( int i = 0; i <t.length ; i++)
System.out.print (t[i] + " "); // for ( int v : t)
}
}