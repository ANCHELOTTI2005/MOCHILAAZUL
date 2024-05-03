package mochila;

import java.util.Scanner;
import java.util.Random;

class Producto {
    String nombre;
    String dimensiones;
    int masa;
    int costo;

    public Producto(String nombre, String dimensiones, int masa, int costo) {
        this.nombre = nombre;
        this.dimensiones = dimensiones;
        this.masa = masa;
        this.costo = costo;
    }

    public void mostrarDetalles() {
        System.out.println(nombre + " - Dimensiones: " + dimensiones + ", Masa: " + masa + " kg, Costo: $" + costo);
    }
}

public class MOCHILA {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Televisor", "Plano", 10, 1200),
            new Producto("Jarron", "Cilindrico", 3, 320),
            new Producto("Estufa", "Cubico", 40, 2500),
            new Producto("Lampara", "Cono", 5, 450),
            new Producto("Ventilador", "Cubo", 8, 350),
            new Producto("Perfume", "Cilindrico", 1, 90),
            new Producto("Libro", "Rectangular", 2, 150),
            new Producto("Cartera", "Irregular", 1, 200),
            new Producto("Reloj", "Circular", 1, 680),
            new Producto("Zapatillas", "Irregular", 2, 600),
            new Producto("Cuadro", "Cuadrado", 3, 1100),
            new Producto("Altavoz", "Cilindrico", 4, 550),
            new Producto("Cámara", "Rectangular", 1, 900),
            new Producto("Sombrero", "Circular", 1, 75),
            new Producto("Cuchillo", "Rectangular", 1, 300),
            new Producto("Maceta", "Cilindrico", 5, 130),
            new Producto("Silla", "Cubico", 15, 400),
            new Producto("Balon", "Esfera", 2, 200),
            new Producto("Toalla", "Rectangular", 1, 50),
            new Producto("Bolso", "Irregular", 2, 250)
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese la capacidad de carga del almacén (kg): ");
        int capacidad = scanner.nextInt();

        int masaTotal = 0;

        System.out.println("Agregando productos al inventario de manera aleatoria...");
        for (int i = 0; i < 15; i++) {
            int indice = random.nextInt(productos.length);
            Producto productoSeleccionado = productos[indice];
            if (masaTotal + productoSeleccionado.masa <= capacidad) {
                productoSeleccionado.mostrarDetalles();
                masaTotal += productoSeleccionado.masa;
            }
        }

        System.out.println("Masa total en el almacén: " + masaTotal + " kg");
        scanner.close();
    }
}