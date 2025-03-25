package ntu.ngocduy.lv_hoa;

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

public class MainActivity extends AppCompatActivity {

    ListView listViewHoa;
    ArrayList<String> dsHoa;
    @SuppressLint("MissingInflatedId")
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

        listViewHoa = findViewById(R.id.lv_hoa);

        //Cbi dữ liệu
        dsHoa = new ArrayList<String>();
        dsHoa.add("Hồng");
        dsHoa.add("Lam");
        dsHoa.add("Đào");
        dsHoa.add("Cúc");

        //Khởi tạo adapter
        ArrayAdapter<String> adapterHoa = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsHoa
                );

        //Gắn Adapter
        listViewHoa.setAdapter(adapterHoa);

        //Bộ lắng nghe và xử lí sự kiện
        listViewHoa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //Lấy giá trị của item được click
                String giaTriDuocChon = dsHoa.get(i);

                //Hiển thị
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_LONG).show();
            }
        });

    }
}