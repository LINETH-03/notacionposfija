package gt.edu.umg.progra3.parcial1.pilas;

public class NotationParser  {

    private Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    private static boolean pref(String op) {
        return "^".equals(op)||"*".equals(op) || "/".equals(op) || "+".equals(op) || "- ".equals(op)  || ")".equals(op)||"(".equals(op) ;
    }

    public String posFixToInfix(String expression){
        String A,B,R;
        String[] arrayInfix = expression.split(" ");
        for(String op: arrayInfix){
            if (!pref(op)){
                pila.push(op);
            }else {
                 B = pila.pop();
                 A = pila.pop();
                 //INFIJA A*B
                 R = A + " " + op + " " + B;
                pila.push(R);
            }
        }

        return pila.pop();
    }







}
