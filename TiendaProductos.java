import java.util.Scanner;

public class TiendaProductos {

    // Crear clase Producto
    static class Producto {
        String nombre;
        int valor;
        String descripcion;

        Producto(String nombre, int valor, String descripcion) {
            this.nombre = nombre;
            this.valor = valor;
            this.descripcion = descripcion;
        }

        // Método para mostrar el producto
        public void mostrarProducto() {
            System.out.println("PRODUCTO: " + nombre + ", VALOR: " + valor + ", DESCRIPCIÓN: " + descripcion);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista inicial de productos
        Producto[] productos = new Producto[7];
        productos[0] = new Producto("chocolate", 500, "Chocolate amargo, 500 gr.");
        productos[1] = new Producto("leche", 800, "Leche entera, 1 litro.");
        productos[2] = new Producto("arroz", 900, "Arroz grado 2, 1 kilo.");
        int cantidadProductos = 3;  // Inicialmente hay 3 productos

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nElija una opción:");
            System.out.println("1- Ver productos");
            System.out.println("2- Agregar productos");
            System.out.println("3- Modificar producto");
            System.out.println("4- Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    for (int i = 0; i < cantidadProductos; i++) {
                        productos[i].mostrarProducto();
                    }
                    break;

                case 2:
                    if (cantidadProductos < 7) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el valor del producto: ");
                        int valor = scanner.nextInt();
                        scanner.nextLine();  // Limpiar el buffer
                        System.out.print("Ingrese la descripción del producto: ");
                        String descripcion = scanner.nextLine();

                        productos[cantidadProductos] = new Producto(nombre, valor, descripcion);
                        cantidadProductos++;
                        System.out.println("Producto agregado con éxito!");
                        continuar = false;  // Finalizar el programa aquí
                    } else {
                        System.out.println("No se pueden ingresar más productos, ya alcanzó el límite de 7.");
                    }
                    break;

                case 3:
                    System.out.println("Función de modificar productos no implementada.");
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }
}
