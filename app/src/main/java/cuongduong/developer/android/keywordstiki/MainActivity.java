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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        KeywordAdapter keywordAdapter = new KeywordAdapter(this, addTempKeywords());

        recyclerViewKeywords.setHasFixedSize(true);
        recyclerViewKeywords.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewKeywords.setAdapter(keywordAdapter);
    }

    private ArrayList<String> addTempKeywords() {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("xiaomi");
        keywords.add("bitis hunter");
        keywords.add("bts");
        keywords.add("balo");
        keywords.add("bitis hunter x");
        keywords.add("tai nghe");

        return keywords;
    }
}
