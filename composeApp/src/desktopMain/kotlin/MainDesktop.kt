import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import dev.joseluisgs.meteocompose.App
import dev.joseluisgs.meteocompose.utils.getPlatformName


// Cliente de escritorio, lanzamos la aplicación
fun main() = application {
    Window(
        title = "MeteoCompose ${getPlatformName()}",
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        icon = painterResource("app-icon.png"),
        onCloseRequest = ::exitApplication,
    ) { App() }
}