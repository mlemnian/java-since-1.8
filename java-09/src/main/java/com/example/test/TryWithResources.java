package com.example.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    void preJava7() {
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("test.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException in finally block =>" + e.getMessage());
            }
        }
    }

    void java7() {
        String line;
        // Autoclosable resources must be local final var
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }

    void java9() throws FileNotFoundException {
        String line;
        // defacto local final
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        try (br) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }

        // Achtung:
        // br.readLine(); //BOOM
    }
}
