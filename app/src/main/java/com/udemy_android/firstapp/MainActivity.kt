package com.udemy_android.firstapp // name of the app package,

// 아래 코드는 이런 의미이다. `안드야 다음 코드들을 나한테 줘 내 어플리케이션 동작하게 만들게'
// 라이브러리를 불러와서 사용하는 것.
// 라이브러리란? 미리 구성된 일련의 코드를 담고 있음. 가져다가 사용할 수 있다.
import android.os.Bundle
import androidx.activity.ComponentActivity // MainActivity의 type인 ComponentActivity가 어떻게 구성되고 처리되어야하는지가 여기에 정의되어 있음. 이걸 가져와야 한다.
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

// 현재는 아래의 compose(Jetpack Compose)가 구글에서 미는 안드로이드 앱 만드는 방법이다.
// 그전에는 XML방식으로 인터페이스를 개발했는데, 선생님은 개인적으로 이 방식이 더 좋았다고 한다..ㅋㅋㅋ
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 아래 Theme은 ui.theme 폴더 내의 스타일링 관련 파일에 내가 정의한 내용을 가져오는 부분이다.
import com.udemy_android.firstapp.ui.theme.UdemyAndroidFirstAppTheme

// class - how bigger chunks of code are called in programming
// 아래 클래스 선언의 의미는,
// 이 MainActivity라는 클래스는 ComponentActivity처럼 행동해야 한다. 라는 뜻이다.
// 근데 Activity가 뭔데? 간단하게 말해서 폰 화면에 보이는 그 모든 것이라고 보면 됨. 화면을 보고 있으면 하나의 Activity를 보고 있는 것.
// 통상적으로 하나의 화면에서 다른 화면으로 이동하면, 하나의 Activity에서 다른 Activity로 이동한다.
class MainActivity : ComponentActivity() { // 앱의 시작점. 항상. Starting Point.
    // 이 override가 뭐야?
    override fun onCreate(savedInstanceState: Bundle?) { // MainActivity가 새롭게 init될 때 항상 블록 안의 코드를 실행하라는 의미.
        // 이 안의 내용은 뭔데?
        super.onCreate(savedInstanceState) // 원래 onCreate에서 실행되어야 하는게 뭐가됐든 그걸 먼저 쫙 실행해달라는 의미. 아하. 원본 객체의 onCreate를 실행해서 기본적으로 처리되어야 하는 로직을 다 실행한 다음에 다음으로 넘어가는구나.
        // 이 다음부터는 우리가 MainActivity초기화 시 실행하고 싶은 로직
        // set the content to be UdemyAndroidFirstAppTheme
        setContent {
            UdemyAndroidFirstAppTheme { // Theme을 세팅하고
                // Theme이 어떻게 표시되어야 하는지 정의한다. Define what the theme should look like
                Surface(
                    modifier = Modifier.fillMaxSize(), // Surface가 전체화면을 차지하도록 한다.
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }

            }
        }
    }
}

@Composable
fun UnitConverter() {
    // SwiftUI의 VStack과 같은 역할을 함
    Column {
       Text("Unit Converter")
        OutlinedTextField(value = "", onValueChange = {
            // 익명함수임.
            // 함수를 받도록 되어있음. 유저가 값을 입력해서 input이 변경되는 경우
        })
    }
}


// Composable is basically an element you can see on the screen
// 다른 Composable을 포함하거나, 아니면 실제로 표시되는 요소 그 자체이다.
// 아래 Composable은 다른 Composable인 Text를 담고 있는 Composable이다.
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    // Text Composable을 표시한다.
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}