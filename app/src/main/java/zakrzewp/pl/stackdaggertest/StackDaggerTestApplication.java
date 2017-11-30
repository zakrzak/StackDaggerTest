package zakrzewp.pl.stackdaggertest;


import android.app.Application;

public class StackDaggerTestApplication extends Application {

    protected AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getComponent() {
        return appComponent;
    }
}
