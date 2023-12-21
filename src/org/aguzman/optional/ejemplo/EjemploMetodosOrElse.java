package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class EjemploMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> respositorio = new ComputadorRepositorio();

//        Computador defecto = new Computador("HP Omen", "LA0001");

        Computador pc = respositorio
                .filtrar("asus2")
                .orElse(valorDefecto());

        System.out.println(pc);

        pc = respositorio
                .filtrar("macbook")
                .orElseGet(EjemploMetodosOrElse::valorDefecto);

        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
