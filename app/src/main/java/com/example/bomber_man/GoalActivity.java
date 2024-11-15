//GameActivityに書く
//ゴール時に画面が変わるプログラム

//package com.example.bomber_man;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class GameActivity extends AppCompatActivity {
//
//    private int playerX = 0; // プレイヤーの位置（X座標）
//    private int playerY = 0; // プレイヤーの位置（Y座標）
//    private final int goalX = 9; // ゴールの位置（X座標）
//    private final int goalY = 12; // ゴールの位置（Y座標）
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game); // activity_game.xml がレイアウトファイル
//
//        // ゴール判定を呼び出す（プレイヤーが動くたびにこのメソッドを呼び出してください）
//        checkGoalReached();
//    }
//
//    // プレイヤーがゴールに到達したか確認するメソッド
//    private void checkGoalReached() {
//        // プレイヤーの座標が10x13の配列の範囲内にあることを確認
//        if (playerX >= 0 && playerX < 10 && playerY >= 0 && playerY < 13) {
//            // ゴール位置に到達しているか確認
//            if (playerX == goalX && playerY == goalY) {
//                Toast.makeText(this, "ゴールに到達しました！", Toast.LENGTH_SHORT).show();
//                navigateToGoalScreen2();
//            }
//        }
//    }
//
//    // ゴールに到達した場合、GoalActivity に遷移するメソッド
//    private void navigateToGoalScreen2() {
//        Intent intent = new Intent(GameActivity.this, GoalActivity.class);
//        startActivity(intent);
//        finish(); // このアクティビティを終了
//    }
//}