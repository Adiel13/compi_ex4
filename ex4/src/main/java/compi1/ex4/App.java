package compi1.ex4;

import java.io.StringReader;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "---- Ejemplo 4 ----" );
        String entrada = "{x = + * 2 3 5;"+
                        "\ny = + * 2 3 5;"+
                        "\nz = + * 2 3 5;"+
                        "\nx= + * 2 3 5;"+
                        "\nx= + * 2 3 5;"+
                        "\nx= + * 2 3 5;"+
                        "}";

        lexEx3 lex = new lexEx3(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        arbol b = (arbol)sintax.parse().value;
        b.printArbol(b);
        System.out.println( "---- Fin ejemplo 4 ----" );
    }
}
