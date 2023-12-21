package org.aguzman.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Andrés";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println("hola " + valor));

        nombre = null;
        opt = Optional.ofNullable(null);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println("hola " + valor));

        opt.ifPresentOrElse(valor -> System.out.println("hola " + valor), () -> {
            System.out.println("No está presente");
        });

        //es lo mismo que está
        if (opt.isPresent()) {
            System.out.println("hola " + opt.get());
        } else {
            System.out.println("No está presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isEmpty());
    }
}
