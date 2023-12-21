package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> respositorio = new ComputadorRepositorio();

//        Computador pc = respositorio
//                .filtrar("asus2")
//                .orElseThrow(IllegalStateException::new);
//
//        System.out.println(pc);

        String archivo = "documento.pdf";

        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);
    }

}
