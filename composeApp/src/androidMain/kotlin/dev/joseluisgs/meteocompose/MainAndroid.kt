package dev.joseluisgs.meteocompose

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.joseluisgs.meteocompose.utils.getPlatformName

// Cliente de Android, lanzamos la aplicación
class AndroidApp : Application() {
    companion object {
        lateinit var INSTANCE: AndroidApp
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

// Cliente de Android, lanzamos la actividad
class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "MeteoCompose ${getPlatformName()}"
        setContent { App() }

    }
}

