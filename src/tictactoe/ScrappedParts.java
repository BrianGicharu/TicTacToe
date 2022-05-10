// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package tictactoe;
//
//import java.awt.Color;
//import javax.swing.JLabel;
//
///**
// *
// * @author user
// */
public class ScrappedParts {
//     private void bestMove(){
//        JLabel gameLabels[] = {
//            gLabel_1, gLabel_2, gLabel_3,
//            gLabel_4,gLabel_5,gLabel_6,
//            gLabel_7, gLabel_8, gLabel_9
//        };
//        String ai = "O", currentPlayer = "Machine";
//        int[] bMove = {0,0};
//        int l=0;
//        board = new JLabel[3][3];
//        //Cloning or Duplicating gLabels to 3D board
//        for(c=0;c<3;c++){
//            for(r=0;r<3;r++){
//                board[c][r] = gameLabels[l];
//                System.out.println(board[c][r].getText());
//                l++;
//            }
//        }
//        //AI LOGIC BEGIN:
//        if(currentPlayer.equals("Machine")){
//            for(x=0;x<3;x++){
//                for(y=0;y<3;y++){
//                    //spot available?
//                    if(board[x][y].getText().isEmpty()){
//                        board[x][y].setText(ai);
//                        board[x][y].setBackground(Color.BLUE);
//                        score = miniMaxAlgo(board,0,true);
//    //                    board[x][y].setText("");
//                        if(score>bScore){
//                            bScore = score;
//                            bMove = new int[]{x,y};                        
//                        }
//                    }
//                }
//            }
//            board[bMove[0]][bMove[1]].setText(ai);
//            currentPlayer = "Human";
//        }
//        else if(currentPlayer.equals("Human")){
//            ((JLabel)mev.getSource()).setText("X");
//            ((JLabel)mev.getSource()).setBackground(Color.RED);
//        }else{
//            currentPlayer="Machine";
//        }
//    }
//
//    
//    //AI Algorithm responsible for Computer intelligent moves
//    private int miniMaxAlgo(JLabel[][] label,int depth, Boolean isMaximizing){
//        //int score,x=0,y=0;
//        //Begin: firing the algo
//        String result = checkWinner();
//        if(!result.equals("")){ //not equals
//           return scores.get(result);
//        }
//        //-------------------------------------------------
//        if(isMaximizing){
//            bScore = 0;
////            Integer.MIN_VALUE;
//            for(x=0;x<3;x++){
//                for(y=0;y<3;y++){
//                    //spot available?
//                    if(board[x][y].getText().isEmpty()){
//                        board[x][y].setText("O");
//                        score = miniMaxAlgo(board,depth+1,false);
////                        board[x][y].setText("");
//                        bScore = (bScore>score)?bScore:score;
//                    }
//                }
//            }
//            return bScore;
////            scores.get(bScore);
//        }
//        else{
//            
//            bScore = 0;
////            Integer.MAX_VALUE;;
//            for(x=0;x<3;x++){
//                for(y=0;y<3;y++){
//                    //spot available?
//                    if(board[x][y].getText().isEmpty()){
//                        board[x][y].setText("");
//                        score = miniMaxAlgo(board,depth+1,true);
////                        board[x][y].setText("");
//                        bScore = (bScore<score)?bScore:score;
////                        return bScore;
//                    }
//                }
//            }
//            return bScore; 
//        }
//    }
//    
//    private String checkWinner(){
//        winScenario();
//        if(gameDraw)
//            return "TIE";
//        else if(winnerJlabel.getText().equals("X"))
//            return "WIN";
//        else if(winnerJlabel.getText().equals("O"))
//            return "LOSS";
//        else
//            return "";
//    }
//    
}
