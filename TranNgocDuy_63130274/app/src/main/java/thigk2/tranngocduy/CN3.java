package thigk2.tranngocduy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CN3 extends AppCompatActivity {

    ListView listViewNhac;
    ArrayList<String> dsNhac;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewNhac = findViewById(R.id.lv_nhac);

        //Chbi dữ liệu
        dsNhac = new ArrayList<String>();
        dsNhac.add("Tiến Về Sài Gòn");
        dsNhac.add("Giải Phóng Miền Nam");
        dsNhac.add("Đất Nước Trọn Niềm Vui");
        dsNhac.add("Bài ca Thống Nhất");
        dsNhac.add("Mùa Xuân trên thành phố HCM");
        dsNhac.add("...");

        //Khởi tạo adapter
        ArrayAdapter<String> adapterMonHoc = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsNhac
        );

        //Gắn adapter
        listViewNhac.setAdapter(adapterMonHoc);

        //Bộ lắng nghe và xử lí sự kiện
        listViewNhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //Lấy giá trị của item được click
                String giaTriDuocChon = dsNhac.get(i);

                //Hien thi
                Toast.makeText(CN3.this, giaTriDuocChon, Toast.LENGTH_LONG).show();
            }
        });

    }
}