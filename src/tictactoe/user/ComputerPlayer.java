/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.user;

import java.util.Random;

/**
 *
 * @author Amila
 */
public class ComputerPlayer {

    private int myvalue = 2;
    private final Random random = new Random();
    int[][] table;

    public int[][] play(int[][] table, int opositePlayer) {
        this.table = table;
        boolean checked = false;
        checked = checkOption(myvalue, checked);
        checked = checkOption(opositePlayer, checked);
        /* //00,11,22
         if(((table[0][0]==2 && table[1][1]==2)||(table[0][0]==1 && table[1][1]==1))&&table[2][2]==0){
         System.out.println("1a");
         table[2][2]= myvalue;
         }else if(((table[2][2]==2 && table[1][1]==2)||(table[2][2]==1 && table[1][1]==1))&&table[0][0]==0){
         System.out.println("1b");
         table[0][0]= myvalue;
         }else if(((table[0][0]==2 && table[2][2]==2)||(table[0][0]==1 && table[2][2]==1))&&table[1][1]==0){
         System.out.println("1c");
         table[1][1]= myvalue;
         //02,11,20    
         }else if(((table[0][2]==2 && table[1][1]==2)||(table[0][2]==1 && table[1][1]==1))&&table[2][0]==0){
         System.out.println("2a");
         table[2][0]= myvalue;
         }else if(((table[2][0]==2 && table[1][1]==2)||(table[2][0]==1 && table[1][1]==1))&&table[0][2]==0){
         System.out.println("2b");
         table[0][2]= myvalue;
         }else if(((table[2][0]==2 && table[0][2]==2)||(table[2][0]==1 && table[0][2]==1))&&table[1][1]==0){
         System.out.println("2c");
         table[1][1]= myvalue;
         //00,01,02    
         }else if(((table[0][0]==2 && table[0][1]==2)||(table[0][0]==1 && table[0][1]==1))&&table[0][2]==0){
         table[0][2]= myvalue;
         }else if(((table[0][1]==2 && table[0][2]==2)||(table[0][1]==1 && table[0][2]==1))&&table[0][0]==0){
         table[0][0]= myvalue;
         }else if(((table[0][0]==2 && table[0][2]==2)||(table[0][0]==1 && table[0][2]==1))&&table[0][1]==0){
         table[0][1]= myvalue;
         //10,11,12    
         }else if(((table[1][0]==2 && table[1][1]==2)||(table[1][0]==1 && table[1][1]==1))&&table[1][2]==0){
         table[1][2]= myvalue;
         }else if(((table[1][1]==2 && table[1][2]==2)||(table[1][1]==1 && table[1][2]==1))&&table[1][0]==0){
         table[1][0]= myvalue;
         }else if(((table[1][0]==2 && table[1][2]==2)||(table[1][0]==1 && table[1][2]==1))&&table[1][1]==0){
         table[1][1]= myvalue;
         //20,21,22    
         }else if(((table[2][0]==2 && table[2][1]==2)||(table[2][0]==1 && table[2][1]==1))&&table[2][2]==0){
         table[2][2]= myvalue;
         }else if(((table[2][1]==2 && table[2][2]==2)||(table[2][1]==1 && table[2][2]==1))&&table[2][0]==0){
         table[2][0]= myvalue;
         }else if(((table[2][0]==2 && table[2][2]==2)||(table[2][0]==1 && table[2][2]==1))&&table[2][1]==0){
         table[2][1]= myvalue;
         //00,10,20    
         }else if(((table[0][0]==2 && table[1][0]==2)||(table[0][0]==1 && table[1][0]==1))&&table[2][0]==0){
         table[2][0]= myvalue;
         }else if(((table[2][0]==2 && table[1][0]==2)||(table[2][0]==1 && table[1][0]==1))&&table[0][0]==0){
         table[0][0]= myvalue;
         }else if(((table[2][0]==2 && table[0][0]==2)||(table[2][0]==1 && table[0][0]==1))&&table[1][0]==0){
         table[1][0]= myvalue;
         //01,11,21    
         }else if(((table[0][1]==2 && table[1][1]==2)||(table[0][1]==1 && table[1][1]==1))&&table[2][1]==0){
         table[2][1]= myvalue;
         }else if(((table[2][1]==2 && table[1][1]==2)||(table[2][1]==1 && table[1][1]==1))&&table[0][1]==0){
         table[0][1]= myvalue;
         }else if(((table[2][1]==2 && table[0][1]==2)||(table[2][1]==1 && table[0][1]==1))&&table[1][1]==0){
         table[1][1]= myvalue;
         //02,12,22    
         }else if(((table[0][2]==2 && table[1][2]==2)||(table[0][2]==1 && table[1][2]==1))&&table[2][2]==0){
         table[2][2]= myvalue;
         }else if(((table[2][2]==2 && table[1][2]==2)||(table[2][2]==1 && table[1][2]==1))&&table[0][2]==0){
         table[0][2]= myvalue;
         }else if(((table[2][2]==2 && table[0][2]==2)||(table[2][2]==1 && table[0][2]==1))&&table[1][2]==0){
         table[1][2]= myvalue;
            
         }else*/
        if (!checked) {
            if (table[1][1] == 0) {
                table[1][1] = myvalue;
            } else if (table[0][0] == 0 || table[0][2] == 0 || table[2][0] == 0 || table[2][2] == 0) {
                boolean ran = true;
                while (ran) {
                    int row = random.nextInt(3);
                    int column = random.nextInt(3);
                    if ((row == 0 || row == 2) && (column == 0 || column == 2)) {
                        table[row][column] = myvalue;
                        ran = false;
                    }
                    System.out.println(row + "   " + column);
                }
            } else {
                boolean ran = true;
                L1:
                while (ran) {
                    int row = random.nextInt(3);
                    int column = random.nextInt(3);
                    if (table[row][column] == 0) {
                        table[row][column] = myvalue;
                        ran = false;
                    }
                    for (int[] table1 : table) {
                        for (int j = 0; j < table1.length; j++) {
                            if (table1[j] == 0) {
                                continue L1;
                            }
                        }
                    }
                    ran = false;
                    System.out.println(row + "   " + column);
                }
            }
        }
        return this.table;
    }

    private boolean checkOption(int mark, boolean checked) {
        if (!checked) {
            if ((table[0][0] == mark && table[1][1] == mark) && table[2][2] == 0) {
                System.out.println("1a");
                table[2][2] = myvalue;
                checked = true;
            } else if ((table[2][2] == mark && table[1][1] == mark) && table[0][0] == 0) {
                System.out.println("1b");
                table[0][0] = myvalue;
                checked = true;
            } else if ((table[0][0] == mark && table[2][2] == mark) && table[1][1] == 0) {
                System.out.println("1c");
                table[1][1] = myvalue;
                checked = true;
                //02,11,20    
            } else if ((table[0][2] == mark && table[1][1] == mark) && table[2][0] == 0) {
                System.out.println("2a");
                table[2][0] = myvalue;
                checked = true;
            } else if ((table[2][0] == mark && table[1][1] == mark) && table[0][2] == 0) {
                System.out.println("2b");
                table[0][2] = myvalue;
                checked = true;
            } else if ((table[2][0] == mark && table[0][2] == mark) && table[1][1] == 0) {
                System.out.println("2c");
                table[1][1] = myvalue;
                checked = true;
                //00,01,02    
            } else if ((table[0][0] == mark && table[0][1] == mark) && table[0][2] == 0) {
                table[0][2] = myvalue;
                checked = true;
            } else if ((table[0][1] == mark && table[0][2] == mark) && table[0][0] == 0) {
                table[0][0] = myvalue;
                checked = true;
            } else if ((table[0][0] == mark && table[0][2] == mark) && table[0][1] == 0) {
                table[0][1] = myvalue;
                checked = true;
                //10,11,12    
            } else if ((table[1][0] == mark && table[1][1] == mark) && table[1][2] == 0) {
                table[1][2] = myvalue;
                checked = true;
            } else if ((table[1][1] == mark && table[1][2] == mark) && table[1][0] == 0) {
                table[1][0] = myvalue;
                checked = true;
            } else if ((table[1][0] == mark && table[1][2] == mark) && table[1][1] == 0) {
                table[1][1] = myvalue;
                checked = true;
                //20,21,22    
            } else if ((table[2][0] == mark && table[2][1] == mark)  && table[2][2] == 0) {
                table[2][2] = myvalue;
                checked = true;
            } else if ((table[2][1] == mark && table[2][2] == mark)  && table[2][0] == 0) {
                table[2][0] = myvalue;
                checked = true;
            } else if ((table[2][0] == mark && table[2][2] == mark) && table[2][1] == 0) {
                table[2][1] = myvalue;
                checked = true;
                //00,10,20    
            } else if ((table[0][0] == mark && table[1][0] == mark) && table[2][0] == 0) {
                table[2][0] = myvalue;
                checked = true;
            } else if ((table[2][0] == mark && table[1][0] == mark) && table[0][0] == 0) {
                table[0][0] = myvalue;
                checked = true;
            } else if ((table[2][0] == mark && table[0][0] == mark) && table[1][0] == 0) {
                table[1][0] = myvalue;
                checked = true;
                //01,11,21    
            } else if ((table[0][1] == mark && table[1][1] == mark) && table[2][1] == 0) {
                table[2][1] = myvalue;
                checked = true;
            } else if ((table[2][1] == mark && table[1][1] == mark) && table[0][1] == 0) {
                table[0][1] = myvalue;
                checked=true;
            } else if ((table[2][1] == mark && table[0][1] == mark) && table[1][1] == 0) {
                table[1][1] = myvalue;
                checked=true;
                //02,12,22    
            } else if ((table[0][2] == mark && table[1][2] == mark) && table[2][2] == 0) {
                table[2][2] = myvalue;
                checked=true;
            } else if ((table[2][2] == mark && table[1][2] == mark) && table[0][2] == 0) {
                table[0][2] = myvalue;
                checked=true;
            } else if ((table[2][2] == mark && table[0][2] == mark) && table[1][2] == 0) {
                table[1][2] = myvalue;
                checked=true;
            }

        }
        return checked;
    }

}