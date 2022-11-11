public class Main
{
    public static void main(String[] args)
    {
        //Instancia

        Jugador player_1 = new Jugador();
        player_1.setVida(100);
        player_1.setClase("Chamamn");
        player_1.setNickname("Melly");
        player_1.setMana(75);
        player_1.setMensaje("Wenas Gente");
        player_1.setObjeto("Llama Oscura");

        Jugador player_2 = new Jugador();
        player_2.setVida(75);
        player_2.setClase("Sacerdote");
        player_2.setNickname("Ralsey");
        player_2.setMana(200);
        player_2.setMensaje("For the light!!");
        player_2.setObjeto("Baston sagrado");

        Jugador player_3 = new Jugador();
        player_3.setVida(150);
        player_3.setClase("Paladin");
        player_3.setNickname("Xawo");
        player_3.setMana(150);
        player_3.setMensaje("Hey!!");
        player_3.setObjeto("Crematoria");

        Jugador player_4 = new Jugador();
        player_4.setVida(100);
        player_4.setClase("Druida");
        player_4.setNickname("Jhowellz");
        player_4.setMana(100);
        player_4.setMensaje("Por Comprar la expa");
        player_4.setObjeto("Collar de Elune");

        //Salida

        System.out.println("-------------------");
        System.out.println(player_1.nickname);
        System.out.println(player_1.clase);
        System.out.println("-------------------");
        System.out.println("Vida: " + player_1.vida);
        System.out.println("Mana: " + player_1.mana);
        System.out.println("Objeto: " + player_1.objeto);
        System.out.println("Mensaje: " + player_1.mensaje);

        System.out.println();

        System.out.println("-------------------");
        System.out.println(player_2.nickname);
        System.out.println(player_2.clase);
        System.out.println("-------------------");
        System.out.println("Vida: " + player_2.vida);
        System.out.println("Mana: " + player_2.mana);
        System.out.println("Objeto: " + player_2.objeto);
        System.out.println("Mensaje: " + player_2.mensaje);

        System.out.println();

        System.out.println("-------------------");
        System.out.println(player_3.nickname);
        System.out.println(player_3.clase);
        System.out.println("-------------------");
        System.out.println("Vida: " + player_3.vida);
        System.out.println("Mana: " + player_3.mana);
        System.out.println("Objeto: " + player_3.objeto);
        System.out.println("Mensaje: " + player_3.mensaje);

        System.out.println();

        System.out.println("-------------------");
        System.out.println(player_4.nickname);
        System.out.println(player_4.clase);
        System.out.println("-------------------");
        System.out.println("Vida: " + player_4.vida);
        System.out.println("Mana: " + player_4.mana);
        System.out.println("Objeto: " + player_4.objeto);
        System.out.println("Mensaje: " + player_4.mensaje);
    }
}

