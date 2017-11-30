package zakrzewp.pl.stackdaggertest;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    Context provideContext() {
        return app;
    }

    @Singleton
    @Provides
    Application provideApp() {
        return app;
    }

    @Singleton
    @Provides
    SoundsRepository provideSoundsRepository() {
        return new SoundsRepository();
    }
}