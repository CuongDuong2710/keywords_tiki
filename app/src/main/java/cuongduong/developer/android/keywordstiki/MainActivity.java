package cuongduong.developer.android.keywordstiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuongduong.developer.android.keywordstiki.adapter.KeywordAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_keywords)
    RecyclerView recyclerViewKeywords;

    String[] array = { "xiaomi", "bitis hunter", "bts", "balo", "bitis hunter x", "tai nghe", "harry potter",
            "anker", "iphone", "balo nữ", "nguyễn nhật ánh", "đắc nhân tâm", "ipad", "senka", "tai nghe bluetooth",
            "son", "maybelline", "laneige", "kem chống nắng", "anh chính là thanh xuân của em" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<String> keywords = Algorithms.displayKeywordsInTwoLines(array);

        KeywordAdapter keywordAdapter = new KeywordAdapter(this, keywords);

        recyclerViewKeywords.setHasFixedSize(true);
        recyclerViewKeywords.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewKeywords.setAdapter(keywordAdapter);
    }
}
