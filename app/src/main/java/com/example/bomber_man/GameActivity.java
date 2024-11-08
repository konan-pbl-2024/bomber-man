package com.example.bomber_man;

import android.os.Bundle;
import android.view.View;
//import android.widget.GridLayout;
//import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashSet;
import java.util.Set;

public class GameActivity extends AppCompatActivity {

    // 壊せないブロックのIDを格納するセット
    private Set<Integer> unbreakableBlocks = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 壊せないブロックのIDを追加
        unbreakableBlocks.add(R.id.imageView28);


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