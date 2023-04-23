package com.company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Main {

    static Logger LOGGER;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static {
        try(FileInputStream ins = new FileInputStream("D:\\myPrograms\\Java\\LOG\\Loging\\loger.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            LOGGER.log(Level.INFO,"Запуск програмы");

            int amount = scanner.nextInt();
            LOGGER.log(Level.INFO,"Было введенно коректное число: " + Integer.toString(amount));

            for (int i = 0; i < amount; i++) {
                LOGGER.log(Level.INFO,"Число " + Integer.toString(i) + " - " + Integer.toString(random.nextInt()));
            }

        }catch (Exception ex){
            LOGGER.log(Level.WARNING, "Ошибка: " + ex.getMessage());
        }
    }
}
