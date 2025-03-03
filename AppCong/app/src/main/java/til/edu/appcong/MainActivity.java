package til.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Gắn Layout tương ứng với file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void XuLyCong(View view){
        // Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.editA);
        EditText editTextSoB = findViewById(R.id.editB);
        EditText editTextSoKQ = findViewById(R.id.editKQ);

        // Lay du lieu ve o dieu khien so a
        String strA = editTextSoA.getText().toString(); //strA = "2"
        //Lay du lieu ve o dieu kien so b
        String strB = editTextSoB.getText().toString(); //strB = "4"

        //Chuyen du lieu o dang so
        int so_A = Integer.parseInt(strA); //2
        int so_B = Integer.parseInt(strB); //4

        //Tinh toan theo yeu cau
        int tong = so_A + so_B; //6
        String strTong = String.valueOf(tong); //Chuyen sang dang chuoi: "6"

        //Hien ra man hinh
        editTextSoKQ.setText(strTong);

    }
}