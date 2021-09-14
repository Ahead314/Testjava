class MySuite {
public static int [] suite ( int n)
{
int [] res = new int ( n);
for ( int i = 0, i <n ; i++)
res [i] = i+1;
return res;
}
}


public class TabSuite
{ 
public static void main( String [] args)
{
System.out.print("Le resultat sera : "+ MySuite.suite(2));
}
}