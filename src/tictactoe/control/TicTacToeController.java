/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.control;

import com.sun.jmx.snmp.BerDecoder;

/**
 *
 * @author Amila
 */
public class TicTacToeController {

    public static int judgeTicTagToe(int[][] table, int[] playersMark) {
        

        for (int i = 0; i < playersMark.length; i++) {
            boolean condition1=table[0][0]==playersMark[i]&&table[1][1]==playersMark[i]&&table[2][2]==playersMark[i];
            boolean condition2=table[0][2]==playersMark[i]&&table[1][1]==playersMark[i]&&table[2][0]==playersMark[i];
            boolean condition3=table[0][0]==playersMark[i]&&table[0][1]==playersMark[i]&&table[0][2]==playersMark[i];
            boolean condition4=table[1][0]==playersMark[i]&&table[1][1]==playersMark[i]&&table[1][2]==playersMark[i];
            boolean condition5=table[2][0]==playersMark[i]&&table[2][1]==playersMark[i]&&table[2][2]==playersMark[i];
            boolean condition6=table[0][0]==playersMark[i]&&table[1][0]==playersMark[i]&&table[2][0]==playersMark[i];
            boolean condition7=table[0][1]==playersMark[i]&&table[1][1]==playersMark[i]&&table[2][1]==playersMark[i];
            boolean condition8=table[0][2]==playersMark[i]&&table[1][2]==playersMark[i]&&table[2][2]==playersMark[i];
            
            if(condition1||condition2||condition3||condition4||condition5||condition6||condition7||condition8){
                System.out.println("sdd");
                return Integer.parseInt("1"+(i+1));
            }
            
        }
        for (int[] table1 : table) {
            for (int i : table1) {
                if(i==0){
                    return 0;
                }
            }
        }

        return 2;
    }


}
