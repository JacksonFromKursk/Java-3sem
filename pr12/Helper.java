package com.example.prac_12;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

@Component
public class Helper {
    @Autowired
    private ApplicationArguments arguments;

    private String hash;

    public Helper() {
        hash = "";
    }

    @PostConstruct
    public void Add() throws IOException {
        try (InputStream inputFile = new FileInputStream(arguments.getNonOptionArgs().get(0) + ".txt")) {
            hash = DigestUtils.md5DigestAsHex(inputFile);

            File outputFile = new File(arguments.getNonOptionArgs().get(1) + ".txt");
            if (!outputFile.exists()) outputFile.createNewFile();

            FileWriter writer = new FileWriter(outputFile);
            writer.write(hash);
            writer.close();

        } catch (FileNotFoundException e) {
            File outputFile = new File(arguments.getNonOptionArgs().get(1) + ".txt");
            if (!outputFile.exists()) outputFile.createNewFile();

            FileWriter writer = new FileWriter(outputFile);
            writer.write("null");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void Delete() {
        File inputFile = new File(arguments.getNonOptionArgs().get(0) + ".txt");

        if (inputFile.exists()) {
            inputFile.delete();
        }
    }
}