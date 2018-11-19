package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edLength;
    private EditText edWidth;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edLength = findViewById(R.id.ed_length);
        edWidth = findViewById(R.id.ed_width);
        edHeight = findViewById(R.id.ed_heigh);
    }

    public void check(View view) {
        float length = Float.parseFloat(edLength.getText().toString());
        float width = Float.parseFloat(edWidth.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        if (new Box3().validate(length, width, height)) {
            intent.putExtra("BOX", Box.TYPE_3);
        } else {
            intent.putExtra("BOX", Box.TYPE_5);
        }
        startActivity(intent);
    }
}
