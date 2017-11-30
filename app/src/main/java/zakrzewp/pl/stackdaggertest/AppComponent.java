package zakrzewp.pl.stackdaggertest;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    Context getContext();

    Application getApplication();

    SoundsRepository soundsRepository();

    //don't use those in your case
    //void inject(MainActivity mainActivity);
    //void inject(SecondActivity mediaPlayerService);
}