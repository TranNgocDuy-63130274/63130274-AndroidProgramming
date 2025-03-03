package til.edu.ex5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi dieu khien tuong ung day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = (EditText) findViewById(R.id.editSo1);
        editTextSo2 = (EditText) findViewById(R.id.editSo2);
        editTextKQ = (EditText) findViewById(R.id.editKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút

        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goi Ham xu li cong
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử li chia
                XULY_CHIA();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    void XULY_CONG(){
        //Lay du lieu
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_TRU(){
        //Lay du lieu
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 - num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        //Lay du lieu
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 * num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        //Lay du lieu
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 / num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
}

    //Xử lý cộng
   /* public void XulyCong(View v){
        //Code xử lý cộng ở đây
        //B1: Lấy du liệu hai số
        //B1.1 Tìm EditText số 1 và số 2
        //EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
        //EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        //B1.2 Lấy dữ liệu tu 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2 Tính toán
        float Tong = soA + soB;
        //B3. Hiện kết quả
        //B3.1
        //EditText editTextKQ = (EditText)findViewById(R.id.editKetQua);
        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //B3.3 Gắn kết quả lên dk
        editTextKQ.setText(chuoiKQ);
    }
    public void XulyTru(View v){
        //Code xử lý trừ ở đây
        //B1: Lấy du liệu hai số
        //B1.1 Tìm EditText số 1 và số 2
        //EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
        //EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        //B1.2 Lấy dữ liệu tu 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2 Tính toán
        float Hieu = soA - soB;
        //B3. Hiện kết quả
        //B3.1
        //EditText editTextKQ = (EditText)findViewById(R.id.editKetQua);
        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //B3.3 Gắn kết quả lên dk
        editTextKQ.setText(chuoiKQ);
    }
    public void XulyNhan(View v){
        //Code xử lý nhân ở đây
        //B1: Lấy du liệu hai số
        //B1.1 Tìm EditText số 1 và số 2
        //EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
        //EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        //B1.2 Lấy dữ liệu tu 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2 Tính toán
        float Tich = soA * soB;
        //B3. Hiện kết quả
        //B3.1
        //EditText editTextKQ = (EditText)findViewById(R.id.editKetQua);
        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //B3.3 Gắn kết quả lên dk
        editTextKQ.setText(chuoiKQ);
    }
    public void XulyChia(View v){
        //Code xử lý chia ở đây
        //B1: Lấy du liệu hai số
        //B1.1 Tìm EditText số 1 và số 2
        //EditText editTextSo1 = (EditText) findViewById(R.id.editSo1);
        //EditText editTextSo2 = (EditText) findViewById(R.id.editSo2);
        //B1.2 Lấy dữ liệu tu 2 dkhien đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //B1.3 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2 Tính toán
        float Thuong = soA / soB;
        //B3. Hiện kết quả
        //B3.1
        //EditText editTextKQ = (EditText)findViewById(R.id.editKetQua);
        //B3.2 Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //B3.3 Gắn kết quả lên dk
        editTextKQ.setText(chuoiKQ);
    }
}
*/