package ntu.ngocduy.luyentap_thigk;

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

    ListView listViewMonHoc;
    ArrayList<String> dsMonHoc;

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

        listViewMonHoc = findViewById(R.id.lv_mhoc);

        //Chbi dữ liệu
        dsMonHoc = new ArrayList<String>();
        dsMonHoc.add("Lập trình C");
        dsMonHoc.add("Lập trình Ruby");
        dsMonHoc.add("Lập trình Hướng đối tượng");
        dsMonHoc.add("Lập trình C++");
        dsMonHoc.add("Lập trình Python");

        //Khởi tạo adapter
        ArrayAdapter<String> adapterMonHoc = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsMonHoc
        );

        //Gắn adapter
        listViewMonHoc.setAdapter(adapterMonHoc);

        //Bộ lắng nghe và xử lí sự kiện
        listViewMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //Lấy giá trị của item được click
                String giaTriDuocChon = dsMonHoc.get(i);

                //Hien thi
                Toast.makeText(CN3.this, giaTriDuocChon, Toast.LENGTH_LONG).show();
            }
        });

    }
}