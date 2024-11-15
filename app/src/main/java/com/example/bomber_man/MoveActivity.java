package com.example.bomber_man;

public class MoveActivity {
    public static boolean Right_move(int x, int y) {
        if((x + 1) < 13) {
            if (GameActivity.blocks[y][x + 1] == 1) {
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y][x + 1] = 3;
                return true;
            }
        }
        return false;
    }
    public static boolean Left_move(int x, int y) {
        if(0 <= (x-1)){
            if(GameActivity.blocks[y][x-1] == 1){
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y][x-1] = 3;
                return true;
            }
        }
        return false;
    }
    public static boolean up_move(int x, int y) {
        if(0 <= (y - 1)){
            if(GameActivity.blocks[y - 1][x] == 1){
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y - 1][x] = 3;
                return true;
            }
        }
        return false;
    }
    public static boolean down_move(int x, int y) {
        if((y + 1) < 10){
            if(GameActivity.blocks[y + 1][x] == 1) {
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y + 1][x] = 3;
                return true;
            }
        }
        return false;
    }
}
