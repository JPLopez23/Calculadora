package PostfixCalculator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PostfixCalculator calculator = new PostfixCalculator();
        String fileName = "datos.txt";

        try (InputStream is = Main.class.getClassLoader().getResourceAsStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int result = calculator.evaluatePostfixExpression(line);
                    System.out.println("Expresión: " + line + " = " + result);
                } catch (Exception e) {
                    System.out.println("Error al evaluar la expresión: " + line + ". " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + fileName);
        } catch (NullPointerException e) {
            System.err.println("Archivo no encontrado: " + fileName);
        }
    }
}
