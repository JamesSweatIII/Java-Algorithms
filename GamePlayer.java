import java.io.*;
import java.util.*;


public class GamePlayer{
    public static int playgame_dc(GameBoard gb, int left, int right) {
        // Base case
        if (left == right) {
            return left;
        } else if (left + 1 == right) {
            return (gb.board[left] >= gb.board[right]) ? left : right;
        }
    
        while (left < right) {
            int mid = left + (right - left) / 2;
            double leftDepth = gb.ping(mid - 1);
            double midDepth = gb.ping(mid);
            double rightDepth = gb.ping(mid + 1);
            if (midDepth > leftDepth && midDepth > rightDepth) {
                return mid;
            } else if (leftDepth > midDepth) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }
    
}