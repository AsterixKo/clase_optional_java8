package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.models.Fabricante;
import org.aguzman.optional.ejemplo.models.Procesador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class EjemploMetodosMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> respositorio = new ComputadorRepositorio();

        String f = respositorio
                .filtrar("rog")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);

//        utilizamos flatMap en vez de map porque estamos devolviendo
//        en getProcesador y getFabricante unos Optional<T>

    }

}
