/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22weatherinyear;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    private final Scanner scanner;

    public App() {
        scanner = new Scanner(System.in);
    }
    public void run(){
        System.out.println("---Weather in year ---");
        boolean repeat = true;
        do {
            System.out.println("Задачи");
            System.out.println("0. Выход из программы");
            System.out.println("1. Погода в указанную дату");
            System.out.println("2. Дни, когда была самая теплая и самая холодная температуры");
            System.out.println("3. Средняя температура за указанный месяц");
            System.out.println("4. Средняя температура по всем месяцам");
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выходим из программы");
                    repeat = false;
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                    
                default:
                    System.out.println("Выберите номер из списка!!!");
            }
        }while(repeat);
        System.out.println("--- END ---");
    }
}
