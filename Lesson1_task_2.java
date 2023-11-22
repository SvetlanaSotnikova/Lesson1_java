// 2. Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson1_task_2 {
    public static void main(String[] args) {
        String inputFile1 = "value1.txt";
        String inputFile2 = "value2.txt";
        String outputFile = "sumValues.txt";

        try {
            int[] coefficient1 = readFiles(inputFile1);
            int[] coefficient2 = readFiles(inputFile2);

            int[] sumCoefficients = sumFiles(coefficient1, coefficient2);

            writeFiles(outputFile, sumCoefficients);

            System.out.println("successful writed in " + outputFile);
        } catch (IOException e) {
            System.err.println("Noooooo, erroe" + e.getMessage());
        }
    }

    public static int[] readFiles(String fileName) throws IOException {
        int[] coeffiсients = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] coeffiсientsStr = line.split(" ");

            coeffiсients = new int[coeffiсientsStr.length];
            for (int i = 0; i < coeffiсients.length; i++) {
                coeffiсients[i] = Integer.parseInt(coeffiсientsStr[i]);
            }
        }
        return coeffiсients;
    }

    public static int[] sumFiles(int[] coefficients1, int[] coefficients2) {
        int maxLength = Math.max(coefficients1.length, coefficients2.length);
        int[] sumCoefficients = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int coefficient1 = (i < coefficients1.length) ? coefficients1[i] : 0;
            int coefficient2 = (i < coefficients2.length) ? coefficients2[i] : 0;

            sumCoefficients[i] = coefficient1 + coefficient2;
        }
        return sumCoefficients;
    }

    public static void writeFiles(String fileName, int[] coeffiсients) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < coeffiсients.length; i++) {
                writer.write(Integer.toString(coeffiсients[i]));

                if (i < coeffiсients.length - 1) {
                    writer.write(" ");
                }
            }
        }
    }
}
