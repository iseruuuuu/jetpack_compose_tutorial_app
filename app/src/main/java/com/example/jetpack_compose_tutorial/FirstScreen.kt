import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {
    Column(
    ) {
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 20.sp,
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Button(onClick = {
            navController.navigate("second")
        }) {
            Text(text = "次の画面に移動")
        }
    }
}
