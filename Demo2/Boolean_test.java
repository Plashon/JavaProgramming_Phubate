public class Boolean_test {
    public static void main(String[] args){
        boolean x = false;
        boolean y = true;
        boolean z = x || y ;
        System.out.println("give x + false, y ture and z = x || y then");
        System.out.println("!x = " + !x);
        System.out.println("x && y = " + (x && y) );
        System.out.println("z = " + z);
        System.out.println("x || z && y || x = " +( x || z && y || x));
        System.out.println("(x || z) && (y || x) = " +((x || z) && (y || x)));

    }
}
