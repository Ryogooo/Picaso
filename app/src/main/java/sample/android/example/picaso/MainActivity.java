package sample.android.example.picaso;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.Imageview);

        int ImageID = R.drawable.reika;

        Picasso.with(this)
                .load(ImageID)
                .fit()
                .centerInside()
                .rotate(-270.0f)  // landscape
                .into(imageView);
    }
}
