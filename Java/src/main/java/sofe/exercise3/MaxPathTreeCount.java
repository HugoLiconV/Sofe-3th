package sofe.exercise3;



public class MaxPathTreeCount {
    static int contador =0;
    static int suma = 0;
    static int sumaMaxima = 0;
    static int valorAnterior=0;

    private static void ayudanteInorden( TreeNode nodo)
    {
        if(nodo == null) {
            return;
        }

        suma += nodo.value;
        System.out.println(nodo.value + ": " +suma);

        valorAnterior=nodo.value;


        if(suma > sumaMaxima){
            sumaMaxima = suma;
            contador=1;
        }else if(suma == sumaMaxima){
            contador++;
        }

        ayudanteInorden(nodo.left);

            suma-=nodo.value;

        ayudanteInorden(nodo.right);


    }

    public static int maxPathCount(TreeNode root) {


        ayudanteInorden(root);

        return contador;
        //return contador;
    }

}