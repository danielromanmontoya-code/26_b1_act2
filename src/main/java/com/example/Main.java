package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Libros ===");
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        Libro libro2 = new Libro("Harry Potter", "J.K. Rowling");
        libro2.mostrarDetalles();

        Libro libro3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 500);
        libro3.mostrarDetalles();


        
        System.out.println(libro1.mostrarDetalles());
        System.out.println(libro2.mostrarDetalles());
        System.out.println(libro3.mostrarDetalles());



        System.out.println("======CuentaBancaria=========");
        CuentaBancaria cuenta = new CuentaBancaria("María", 500);
        cuenta.depositar(200);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
        cuenta.retirar(1000);

        System.out.println("=====estudiante=========");
        Estudiante alumno = new Estudiante("Pedro", 21, 2.5);
        alumno.mostrarInfo();

    




    }
    


    }
