package thigk2.tranngocduy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button nutCN2;
    Button nutCN3;
    Button nutCN4;
    Button nutAboutMe;
    void TimDieuKhien(){
        nutCN2 =  (Button) findViewById(R.id.btn2);
        nutCN3 =  (Button) findViewById(R.id.btn3);
        nutCN4 = (Button) findViewById(R.id.btn4);
        nutAboutMe = (Button) findViewById(R.id.btn5);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Tìm điều khiển nút bấm
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện
        nutCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lí chuyển màn hình
                //B1. Tạo 1 Intent 2 tham số: 1) màn hình hiện tại this; 2) Màn hình chuyển tới class
                Intent intentCN2 = new Intent(MainActivity.this, CN2.class);
                //B2. Gửi
                startActivity(intentCN2);
            }
        });

        nutCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lí chuyển màn hình
                //B1. Tạo 1 Intent 2 tham số: 1) màn hình hiện tại this; 2) Màn hình chuyển tới class
                Intent intentCN3 = new Intent(MainActivity.this, CN3.class);
                //B2. Gửi
                startActivity(intentCN3);
            }
        });

        nutCN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lí chuyển màn hình
                //B1. Tạo 1 Intent 2 tham số: 1) màn hình hiện tại this; 2) Màn hình chuyển tới class
                Intent intentCN4 = new Intent(MainActivity.this, CN4.class);
                //B2. Gửi
                startActivity(intentCN4);
            }
        });

        nutAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lí chuyển màn hình
                //B1. Tạo 1 Intent 2 tham số: 1) màn hình hiện tại this; 2) Màn hình chuyển tới class
                Intent intentAboutMe = new Intent(MainActivity.this, Activity_AboutMe.class);
                //B2. Gửi
                startActivity(intentAboutMe);
            }
        });
    }
}