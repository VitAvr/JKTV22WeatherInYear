/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class InitProject {

    public void init() {
        int[][] temperatureArray = new int [12][];
        temperatureArray[0] = new int [31];
        temperatureArray[1] = new int [28];
        temperatureArray[2] = new int [31];
        temperatureArray[3] = new int [30];
        temperatureArray[4] = new int [31];
        temperatureArray[5] = new int [30];
        temperatureArray[6] = new int [31];
        temperatureArray[7] = new int [31];
        temperatureArray[8] = new int [30];
        temperatureArray[9] = new int [31];
        temperatureArray[10] = new int [30];
        temperatureArray[11] = new int [31];
        int max = 40;
        int min = -30;
        Random random = new Random();
        for (int i = 0; i < temperatureArray.length; i++) {
            for (int j = 0; j < temperatureArray[i].length; j++) {
                temperatureArray[i][j] = random.nextInt(max - min +1)+ min;
                
            }
            
        }
        for (int i = 0; i < temperatureArray.length; i++) {
            for (int j = 0; j < temperatureArray[i].length; j++) {
                System.out.printf("%4d", temperatureArray[i][j]);
                }
            System.out.println();
            
        }
    }
    
}
