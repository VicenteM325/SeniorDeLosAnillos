public class Trasgo extends Bestias{

    private static int contadorInstancias;


    public static int getInstancias(){
        return Trasgo.contadorInstancias;
    }

    public Trasgo(String nombre){
        super(325,46,nombre);
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Trasgo y me llamo: " + this.nombre);
    }

}