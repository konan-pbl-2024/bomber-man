package com.example.bomber_man;

public class MoveActivity {
    int player_x = 0;
    int player_y = 0;
    void Right_move(int x, int y) {
        if((x += 1) < 13) {
            if (GameActivity.blocks[y][x + 1] == 1) {
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y][x + 1] = 3;
                player_x += 1;
            }
        }
    }
    void Left_move(int x, int y) {
        if(0 <= (x-1)){
            if(GameActivity.blocks[y][x-1] == 1){
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y][x-1] = 3;
                player_x -= 1;
            }
        }
    }
    void up_move(int x, int y) {
        if(0 <= (y -= 1)){
            if(GameActivity.blocks[y-1][x] == 1){
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y-1][x] = 3;
                player_y -= 1;
            }
        }
    }
    void down_move(int x, int y) {
        if((x += 1) < 10){
            if(GameActivity.blocks[y-3][x] == 1){
                GameActivity.blocks[y][x] = 1;
                GameActivity.blocks[y+1][x] = 3;
                player_y += 1;
            }
        }
    }
}
