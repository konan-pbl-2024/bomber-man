package com.example.bomber_man;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MazeActivity extends AppCompatActivity {

    private boolean isGoalReached = false; // ゴール到達判定フラグ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maze);

        // 迷路の描画やキャラクターの移動処理を入れる

        // 例: キャラクターがゴールに到達したとき
        checkGoalReached();
    }

    // ゴール到達判定と遷移処理
    private void checkGoalReached() {
        // ゴール到達条件をチェックする
        // ここでは単純にフラグを変更しているが、実際にはキャラクターの位置を判定
        if (isGoalReached) {
            // ゴールに到達した場合、ゴール画面に遷移
            navigateToGoalScreen();
        }
    }

    // ゴール画面に遷移
    private void navigateToGoalScreen() {
        Intent intent = new Intent(MazeActivity.this, GoalActivity.class);
        startActivity(intent);
        finish(); // 迷路画面を終了してゴール画面を表示
    }

    // 例えば、ボタンやタッチイベントなどでゴールに到達した場合に判定
    public void onGoalReached(View view) {
        isGoalReached = true;
        checkGoalReached();
    }
}

