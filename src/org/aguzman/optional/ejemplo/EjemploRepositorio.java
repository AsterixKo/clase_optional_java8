package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> respositorio = new ComputadorRepositorio();

        respositorio
                .filtrar("asus")
                .ifPresentOrElse(System.out::println,
                () -> System.out.println("no se encontro"));

//        Optional<Computador> pc = respositorio.filtrar("asus rog");
//
//        if (pc.isPresent()) {
//            System.out.println(pc.get().getNombre());
//        } else {
//            System.out.println("No se encontró");
//        }

    }
}
