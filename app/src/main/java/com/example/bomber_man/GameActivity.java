package com.example.bomber_man;

import android.os.Bundle;
import android.view.View;
//import android.widget.GridLayout;
//import android.widget.ImageView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashSet;
import java.util.Set;

public class GameActivity extends AppCompatActivity {


    // 壊せないブロックのIDを格納するセット
    private Set<Integer> unbreakableBlocks = new HashSet<>();
    public static int[][] blocks = new int[10][13];
    private ImageView[][] blockImages = new ImageView[10][13];


    // ブロックの状態に基づいて画像を更新するメソッド
    private void updateBlockImages() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                switch (blocks[i][j]) {
                    case 1: // 道 (road)
                        blockImages[i][j].setImageResource(R.drawable.road); // 道の画像をセット
                        break;
                    case 0: // 壁 (wall)
                        blockImages[i][j].setImageResource(R.drawable.wall); // 壁の画像をセット
                        break;
                    case 2: // ゴール (goal)
                        blockImages[i][j].setImageResource(R.drawable.goal); // ゴールの画像をセット
                        break;
                    case 3: // プレイヤー (player)
                        blockImages[i][j].setImageResource(R.drawable.human); // プレイヤーの画像をセット
                        blockImages[i][j].setScaleX(0.25f);
                        blockImages[i][j].setScaleY(0.25f);
                        break;
                }
            }
        }
    }

    int player_x = 0;
    int player_y = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // 壊せないブロックのIDを追加
        blockImages[0][0] = findViewById(R.id.block00);
        blockImages[0][1] = findViewById(R.id.block01);
        blockImages[0][2] = findViewById(R.id.block02);
        blockImages[0][3] = findViewById(R.id.block03);
        blockImages[0][4] = findViewById(R.id.block04);
        blockImages[0][5] = findViewById(R.id.block05);
        blockImages[0][6] = findViewById(R.id.block06);
        blockImages[0][7] = findViewById(R.id.block07);
        blockImages[0][8] = findViewById(R.id.block08);
        blockImages[0][9] = findViewById(R.id.block09);
        blockImages[0][10] = findViewById(R.id.block010);
        blockImages[0][11] = findViewById(R.id.block011);
        blockImages[0][12] = findViewById(R.id.block012);

        blockImages[1][0] = findViewById(R.id.block10);
        blockImages[1][1] = findViewById(R.id.block11);
        blockImages[1][2] = findViewById(R.id.block12);
        blockImages[1][3] = findViewById(R.id.block13);
        blockImages[1][4] = findViewById(R.id.block14);
        blockImages[1][5] = findViewById(R.id.block15);
        blockImages[1][6] = findViewById(R.id.block16);
        blockImages[1][7] = findViewById(R.id.block17);
        blockImages[1][8] = findViewById(R.id.block18);
        blockImages[1][9] = findViewById(R.id.block19);
        blockImages[1][10] = findViewById(R.id.block110);
        blockImages[1][11] = findViewById(R.id.block111);
        blockImages[1][12] = findViewById(R.id.block112);

        blockImages[2][0] = findViewById(R.id.block20);
        blockImages[2][1] = findViewById(R.id.block21);
        blockImages[2][2] = findViewById(R.id.block22);
        blockImages[2][3] = findViewById(R.id.block23);
        blockImages[2][4] = findViewById(R.id.block24);
        blockImages[2][5] = findViewById(R.id.block25);
        blockImages[2][6] = findViewById(R.id.block26);
        blockImages[2][7] = findViewById(R.id.block27);
        blockImages[2][8] = findViewById(R.id.block28);
        blockImages[2][9] = findViewById(R.id.block29);
        blockImages[2][10] = findViewById(R.id.block210);
        blockImages[2][11] = findViewById(R.id.block211);
        blockImages[2][12] = findViewById(R.id.block212);

        blockImages[3][0] = findViewById(R.id.block30);
        blockImages[3][1] = findViewById(R.id.block31);
        blockImages[3][2] = findViewById(R.id.block32);
        blockImages[3][3] = findViewById(R.id.block33);
        blockImages[3][4] = findViewById(R.id.block34);
        blockImages[3][5] = findViewById(R.id.block35);
        blockImages[3][6] = findViewById(R.id.block36);
        blockImages[3][7] = findViewById(R.id.block37);
        blockImages[3][8] = findViewById(R.id.block38);
        blockImages[3][9] = findViewById(R.id.block39);
        blockImages[3][10] = findViewById(R.id.block310);
        blockImages[3][11] = findViewById(R.id.block311);
        blockImages[3][12] = findViewById(R.id.block312);

        blockImages[4][0] = findViewById(R.id.block40);
        blockImages[4][1] = findViewById(R.id.block41);
        blockImages[4][2] = findViewById(R.id.block42);
        blockImages[4][3] = findViewById(R.id.block43);
        blockImages[4][4] = findViewById(R.id.block44);
        blockImages[4][5] = findViewById(R.id.block45);
        blockImages[4][6] = findViewById(R.id.block46);
        blockImages[4][7] = findViewById(R.id.block47);
        blockImages[4][8] = findViewById(R.id.block48);
        blockImages[4][9] = findViewById(R.id.block49);
        blockImages[4][10] = findViewById(R.id.block410);
        blockImages[4][11] = findViewById(R.id.block411);
        blockImages[4][12] = findViewById(R.id.block412);

        blockImages[5][0] = findViewById(R.id.block50);
        blockImages[5][1] = findViewById(R.id.block51);
        blockImages[5][2] = findViewById(R.id.block52);
        blockImages[5][3] = findViewById(R.id.block53);
        blockImages[5][4] = findViewById(R.id.block54);
        blockImages[5][5] = findViewById(R.id.block55);
        blockImages[5][6] = findViewById(R.id.block56);
        blockImages[5][7] = findViewById(R.id.block57);
        blockImages[5][8] = findViewById(R.id.block58);
        blockImages[5][9] = findViewById(R.id.block59);
        blockImages[5][10] = findViewById(R.id.block510);
        blockImages[5][11] = findViewById(R.id.block511);
        blockImages[5][12] = findViewById(R.id.block512);

        blockImages[6][0] = findViewById(R.id.block60);
        blockImages[6][1] = findViewById(R.id.block61);
        blockImages[6][2] = findViewById(R.id.block62);
        blockImages[6][3] = findViewById(R.id.block63);
        blockImages[6][4] = findViewById(R.id.block64);
        blockImages[6][5] = findViewById(R.id.block65);
        blockImages[6][6] = findViewById(R.id.block66);
        blockImages[6][7] = findViewById(R.id.block67);
        blockImages[6][8] = findViewById(R.id.block68);
        blockImages[6][9] = findViewById(R.id.block69);
        blockImages[6][10] = findViewById(R.id.block610);
        blockImages[6][11] = findViewById(R.id.block611);
        blockImages[6][12] = findViewById(R.id.block612);

        blockImages[7][0] = findViewById(R.id.block70);
        blockImages[7][1] = findViewById(R.id.block71);
        blockImages[7][2] = findViewById(R.id.block72);
        blockImages[7][3] = findViewById(R.id.block73);
        blockImages[7][4] = findViewById(R.id.block74);
        blockImages[7][5] = findViewById(R.id.block75);
        blockImages[7][6] = findViewById(R.id.block76);
        blockImages[7][7] = findViewById(R.id.block77);
        blockImages[7][8] = findViewById(R.id.block78);
        blockImages[7][9] = findViewById(R.id.block79);
        blockImages[7][10] = findViewById(R.id.block710);
        blockImages[7][11] = findViewById(R.id.block711);
        blockImages[7][12] = findViewById(R.id.block712);

        blockImages[8][0] = findViewById(R.id.block80);
        blockImages[8][1] = findViewById(R.id.block81);
        blockImages[8][2] = findViewById(R.id.block82);
        blockImages[8][3] = findViewById(R.id.block83);
        blockImages[8][4] = findViewById(R.id.block84);
        blockImages[8][5] = findViewById(R.id.block85);
        blockImages[8][6] = findViewById(R.id.block86);
        blockImages[8][7] = findViewById(R.id.block87);
        blockImages[8][8] = findViewById(R.id.block88);
        blockImages[8][9] = findViewById(R.id.block89);
        blockImages[8][10] = findViewById(R.id.block810);
        blockImages[8][11] = findViewById(R.id.block811);
        blockImages[8][12] = findViewById(R.id.block812);

        blockImages[9][0] = findViewById(R.id.block90);
        blockImages[9][1] = findViewById(R.id.block91);
        blockImages[9][2] = findViewById(R.id.block92);
        blockImages[9][3] = findViewById(R.id.block93);
        blockImages[9][4] = findViewById(R.id.block94);
        blockImages[9][5] = findViewById(R.id.block95);
        blockImages[9][6] = findViewById(R.id.block96);
        blockImages[9][7] = findViewById(R.id.block97);
        blockImages[9][8] = findViewById(R.id.block98);
        blockImages[9][9] = findViewById(R.id.block99);
        blockImages[9][10] = findViewById(R.id.block910);
        blockImages[9][11] = findViewById(R.id.block911);
        blockImages[9][12] = findViewById(R.id.block912);

//以下山戸
        blocks[0][0] = 3;
        blocks[0][1] = 0;
        blocks[0][2] = 0;
        blocks[0][3] = 0;
        blocks[0][4] = 0;
        blocks[0][5] = 0;
        blocks[0][6] = 0;
        blocks[0][7] = 0;
        blocks[0][8] = 0;
        blocks[0][9] = 1;
        blocks[0][10] = 0;
        blocks[0][11] = 0;
        blocks[0][12] = 0;

        blocks[1][0] = 1;
        blocks[1][1] = 0;
        blocks[1][2] = 1;
        blocks[1][3] = 1;
        blocks[1][4] = 1;
        blocks[1][5] = 1;
        blocks[1][6] = 1;
        blocks[1][7] = 1;
        blocks[1][8] = 0;
        blocks[1][9] = 1;
        blocks[1][10] = 1;
        blocks[1][11] = 1;
        blocks[1][12] = 0;

        blocks[2][0] = 1;
        blocks[2][1] = 0;
        blocks[2][2] = 1;
        blocks[2][3] = 0;
        blocks[2][4] = 0;
        blocks[2][5] = 0;
        blocks[2][6] = 0;
        blocks[2][7] = 1;
        blocks[2][8] = 0;
        blocks[2][9] = 1;
        blocks[2][10] = 0;
        blocks[2][11] = 1;
        blocks[2][12] = 0;

        blocks[3][0] = 1;
        blocks[3][1] = 1;
        blocks[3][2] = 1;
        blocks[3][3] = 1;
        blocks[3][4] = 1;
        blocks[3][5] = 1;
        blocks[3][6] = 1;
        blocks[3][7] = 1;
        blocks[3][8] = 0;
        blocks[3][9] = 1;
        blocks[3][10] = 0;
        blocks[3][11] = 1;
        blocks[3][12] = 0;

        blocks[4][0] = 1;
        blocks[4][1] = 0;
        blocks[4][2] = 1;
        blocks[4][3] = 0;
        blocks[4][4] = 1;
        blocks[4][5] = 0;
        blocks[4][6] = 0;
        blocks[4][7] = 0;
        blocks[4][8] = 0;
        blocks[4][9] = 1;
        blocks[4][10] = 0;
        blocks[4][11] = 1;
        blocks[4][12] = 0;

        blocks[5][0] = 1;
        blocks[5][1] = 0;
        blocks[5][2] = 1;
        blocks[5][3] = 0;
        blocks[5][4] = 1;
        blocks[5][5] = 1;
        blocks[5][6] = 1;
        blocks[5][7] = 1;
        blocks[5][8] = 0;
        blocks[5][9] = 1;
        blocks[5][10] = 0;
        blocks[5][11] = 1;
        blocks[5][12] = 0;

        blocks[6][0] = 1;
        blocks[6][1] = 0;
        blocks[6][2] = 0;
        blocks[6][3] = 0;
        blocks[6][4] = 1;
        blocks[6][5] = 0;
        blocks[6][6] = 0;
        blocks[6][7] = 0;
        blocks[6][8] = 0;
        blocks[6][9] = 1;
        blocks[6][10] = 1;
        blocks[6][11] = 1;
        blocks[6][12] = 1;

        blocks[7][0] = 1;
        blocks[7][1] = 1;
        blocks[7][2] = 1;
        blocks[7][3] = 0;
        blocks[7][4] = 1;
        blocks[7][5] = 1;
        blocks[7][6] = 1;
        blocks[7][7] = 1;
        blocks[7][8] = 1;
        blocks[7][9] = 1;
        blocks[7][10] = 0;
        blocks[7][11] = 0;
        blocks[7][12] = 0;

        blocks[8][0] = 0;
        blocks[8][1] = 0;
        blocks[8][2] = 0;
        blocks[8][3] = 0;
        blocks[8][4] = 1;
        blocks[8][5] = 0;
        blocks[8][6] = 0;
        blocks[8][7] = 0;
        blocks[8][8] = 0;
        blocks[8][9] = 1;
        blocks[8][10] = 0;
        blocks[8][11] = 0;
        blocks[8][12] = 0;

        blocks[9][0] = 0;
        blocks[9][1] = 0;
        blocks[9][2] = 1;
        blocks[9][3] = 1;
        blocks[9][4] = 1;
        blocks[9][5] = 0;
        blocks[9][6] = 1;
        blocks[9][7] = 1;
        blocks[9][8] = 1;
        blocks[9][9] = 1;
        blocks[9][10] = 1;
        blocks[9][11] = 1;
        blocks[9][12] = 2;
        updateBlockImages();

//移動コマンド
        Button upButton = findViewById(R.id.top);
        Button leftButton = findViewById(R.id.left);
        Button rightButton = findViewById(R.id.right);
        Button downButton = findViewById(R.id.under);
        upButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MoveActivity.up_move(player_x, player_y);
                player_y -= 1;
                updateBlockImages();
            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MoveActivity.Left_move(player_x, player_y);
                player_x -= 1;
                updateBlockImages();
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MoveActivity.Right_move(player_x, player_y);
                player_x += 1;
                updateBlockImages();
            }
        });
        downButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MoveActivity.down_move(player_x, player_y);
                player_y += 1;
                updateBlockImages();
            }
        });




//    for (int i = 0; i < 10; i++) {
//        for (int j = 0; j < 13; j++) {
//            if (blocks[i][j] == 0) {
//                blockImages[i][j].setImageResource(R.id.wall);
//            }elif()
//        }
//    }



//        unbreakableBlocks.add(R.id.imageView28);

        // GridLayout内の各ブロックにクリックリスナーを設定
//        GridLayout gridLayout = findViewById(R.id.gridLayout);
//        for (int i = 0; i < gridLayout.getChildCount(); i++) {
//            View block = gridLayout.getChildAt(i);
//            block.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkBlock(v);
//                }
//            });
//        }
    }

    // ブロックが壊せるかどうかを判定するメソッド
    private void checkBlock(View block) {
        int blockId = block.getId();
        if (unbreakableBlocks.contains(blockId)) {
            // 壊せないブロックの場合
            Toast.makeText(this, "これは壊せないブロックです。", Toast.LENGTH_SHORT).show();
        } else {
            // 壊せるブロックの場合
            Toast.makeText(this, "これは壊せるブロックです！", Toast.LENGTH_SHORT).show();
            block.setVisibility(View.INVISIBLE); // ブロックを壊す（非表示にする）
        }
    }
}