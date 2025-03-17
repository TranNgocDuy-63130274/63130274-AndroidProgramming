package til.edu.testnuthello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kết nối Button và TextView với mã Java
        Button btn = findViewById(R.id.btn);
        TextView txt = findViewById(R.id.txt);

        // Đặt sự kiện xử lý khi nút được nhấn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khi nhấn nút, thay đổi nội dung của TextView
                txt.setText("Xin chào");
            }
        });
    }

    public void XuLyNut(View view){
        Button Nut2 = findViewById(R.id.XuLyNut);
        TextView editTB = findViewById(R.id.text2);
        editTB.setText("Xin Chaoo !!!");

    }
}
