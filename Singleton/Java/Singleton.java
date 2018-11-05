public class Singleton{

    private static Singleton instancia;

    //Evita que el objeto se pueda instaciar por medio del operador new
    private Singleton(){

    }

    public static Singleton getInsatancia() {
        if(instancia == null){
            instancia = new Singleton();
        }

        return instancia;
    }

    public void conectar(){
        System.out.println("Me conecte a la base de datos");
    }

    public void desconectar(){
        System.out.println("Me desconecte de la base de datos");
    }
}