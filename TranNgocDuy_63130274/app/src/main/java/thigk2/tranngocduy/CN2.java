package thigk2.tranngocduy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CN2 extends AppCompatActivity {

    private Object view;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
        public void KiemTraCheck (Object view ){
            // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java file
            EditText editTextThang = findViewById(R.id.edtxt1);
            EditText editTextNam = findViewById(R.id.edtxt2);
            EditText editTextCheck = findViewById(R.id.edtxt3);

            // Lay du lieu ve o dieu khien so a
            String strA = editTextThang.getText().toString(); //strA = "4"
            //Lay du lieu ve o dieu kien so b
            String strB = editTextNam.getText().toString(); //strB = "1975"

            //Chuyen du lieu o dang so
            int thang = Integer.parseInt(strA); //4
            int nam = Integer.parseInt(strB); //1975

            //Tinh toan theo yeu cau
            String check = String.valueOf(0);
            if ((thang == 4) && (nam == 1975)) check = "Đúng";
            else check = "Sai";

            //Hien ra man hinh
            editTextCheck.setText(check);
        }
    }
}