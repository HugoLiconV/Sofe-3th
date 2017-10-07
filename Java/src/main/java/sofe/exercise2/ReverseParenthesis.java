package sofe.exercise2;

public class ReverseParenthesis {

    public static String reverseParenthesis(String text)
    {
        int posicionInicial=0;
        int posicionFinal =0;

        String valorEnParentesis = "";

        int[][] posicionesParentesis = positionParentesis(text);

        for (int i = posicionesParentesis.length-1; i > -1; i--){
            posicionInicial = posicionesParentesis[i][0];
            posicionFinal = posicionesParentesis[i][1];
            valorEnParentesis = text.substring(posicionInicial, posicionFinal);
           // System.out.println(posicionInicial +" "+posicionFinal);
            String temporal = reverseText(valorEnParentesis);
            text =text.replace(valorEnParentesis,temporal);
        }
        text=text.replace("(","");
        text=text.replace(")","");
        return text;
    }

    private  static  int[][] positionParentesis(String valor){
        int cantidadParentesis=0;
        for (int i=0;i<valor.length();i++){
            if(valor.charAt(i) == '('){
                cantidadParentesis++;
            }
        }
//        System.out.println(cantidadParentesis);
        int contador =0;
        int validador = 0;
        int[][] array =  new int[cantidadParentesis][2];
        for(int i=0;i<valor.length();i++){
//            System.out.println(valor.charAt(i));
            if(valor.charAt(i)=='('){
                array[contador][0]=i;
//                System.out.println("cont: "+contador);

                for(int j=i+1;j<valor.length();j++){
                    if(valor.charAt(j)=='('){
                        validador++;
                    }else if(valor.charAt(j)==')' && validador!=0){
                        validador--;
                    }
                    else if(validador==0 && valor.charAt(j)==')'){
                        array[contador][1]=j;
                        break ;
                    }
                }//fin segundo for
                contador++;
            }

        }// Fin primer For
        return array;
    }

    private static String reverseText(String valorEnParentesis) {
        String temporal = "";
        for (int i = valorEnParentesis.length() -1; i > -1; i--){
            temporal+= (valorEnParentesis.charAt(i)+"");
        }
        return temporal;
    }

}
