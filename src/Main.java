import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\tRegistro del visitante");

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el número de departamento a visitar: ");
        int departamento = sc.nextInt();

        System.out.print("Ingrese su cédula o pasaporte: ");
        int cedula = sc.nextInt();

        System.out.print("Ingrese su teléfono o celular: ");
        long telefono = sc.nextLong();

        System.out.print("Ingrese la altura del visitante en metros: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese la temperatura corporal del visitante en °C: ");
        float temperatura = sc.nextFloat();

        System.out.print("Ingrese el género (M/F): ");
        char genero = sc.next().charAt(0);

        System.out.print("¿Es usted residente? (Si/No): ");
        String respuesta = sc.next();
        boolean residente = respuesta.equalsIgnoreCase("Si");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        int totalVisitas = 0;
        float tiempoTotal = 0;

        System.out.println("\n\n\t\t\tTIEMPO DE VISITA");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese el tiempo de visita del día " + i + ": ");
            float tiempoVisita = sc.nextFloat();
            tiempoTotal += tiempoVisita;
            totalVisitas++;
        }

        float tiempoPromedio = tiempoTotal / totalVisitas;
        String mayorOmenor = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println("\n\n\tRegistro semanal del visitante.");
        System.out.println("Nombre y apellido: " + nombre);
        System.out.println("Edad: " + edad + " años (" + mayorOmenor + ")");
        System.out.println("Número de departamento: " + departamento);
        System.out.println("Cédula o pasaporte: " + cedula);
        System.out.println("Teléfono o celular: " + telefono);
        System.out.println("Altura del visitante: " + altura + " metros");
        System.out.println("Temperatura Corporal: " + temperatura + "°C");
        System.out.println("Género: " + genero);
        System.out.println("¿Es residente?: " + (residente ? "Sí" : "No"));
        System.out.println("Tiempo promedio de su estadia: " + tiempoPromedio + " minutos");

        sc.close();
    }
}