package basic_programms;
import java.util.*;
class rock_paper_scissor{
public static void main(String[] args) {
    String []rps = {"r","p","s"};
    String computer_move =rps[new Random().nextInt(rps.length)];
    Scanner ds =new Scanner(System.in);
    String player_move;
    while(true){
        System.out.println("please enter your move (r,p & s)");
        player_move = ds.nextLine();
        if(player_move.equals("r")||player_move.equals("p")||player_move.equals("s")){
        break;
        }
        System.out.println(player_move +"is not a valid move");
        }
        System.out.println("computer move is "+computer_move);
        if(player_move.equals(computer_move)){
            System.out.println("the game was a tie");
        }
        else if(player_move.equals("r")){
            if(computer_move.equals("p")){
                System.out.println("computer wins");
            }else if(computer_move.equals("s")){
                System.out.println("you are the winner");
            }
        }
         else if(player_move.equals("p")){
            if(computer_move.equals("r")){
                System.out.println("you are the winner");
            }else if(computer_move.equals("s")){
                System.out.println("computer wins");
            }
        }
         else if(player_move.equals("s")){
            if(computer_move.equals("p")){
                System.out.println("you are the winner");
            }else if(computer_move.equals("r")){
                System.out.println("computer wins");
            }
        }
        ds.close();
 }
}