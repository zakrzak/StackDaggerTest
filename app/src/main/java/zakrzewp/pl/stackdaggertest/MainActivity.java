package zakrzewp.pl.stackdaggertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button launchSecondActivityButton;
    TextView referenceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchSecondActivityButton = findViewById(R.id.launchSecondActivityButton);
        launchSecondActivityButton.setOnClickListener(this);

        referenceTextView = findViewById(R.id.soundsRepositoryReferenceTextView);

        StackDaggerTestApplication application = (StackDaggerTestApplication) getApplication();
        referenceTextView.setText(application.getComponent().soundsRepository().toString());
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this.getApplicationContext(), SecondActivity.class));
    }
}
