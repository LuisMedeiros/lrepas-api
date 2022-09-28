package com.luismedeiros.lrepasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class LrepasApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrepasApiApplication.class, args);
        try (BufferedReader br = new BufferedReader(new FileReader("LRepas.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}