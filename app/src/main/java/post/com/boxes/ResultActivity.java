package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView boxName = findViewById(R.id.name);
        TextView dimention = findViewById(R.id.dimention);
        TextView price = findViewById(R.id.price);
        int type = getIntent().getIntExtra("BOX", Box.TYPE_3);
        Box box = null;
        switch (type) {
            case Box.TYPE_3:
                box = new Box3();
                break;
            case Box.TYPE_5:
                box = new Box5();
                break;
        }
        boxName.setText(box.name);
        dimention.setText(box.length + "/" + box.width + "/" + box.height);
        price.setText(box.price + "");
    }
}
