package zakrzewp.pl.stackdaggertest;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{

    TextView referenceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        referenceTextView = findViewById(R.id.soundsRepositoryReferenceSecondTV);
        StackDaggerTestApplication application = (StackDaggerTestApplication) getApplication();
        referenceTextView.setText(application.getComponent().soundsRepository().toString());
    }
}
