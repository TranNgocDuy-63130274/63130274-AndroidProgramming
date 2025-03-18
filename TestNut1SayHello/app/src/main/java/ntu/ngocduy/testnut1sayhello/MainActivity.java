package ntu.ngocduy.testnut1sayhello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView operand1TextView, operand2TextView, resultTextView;
    private int operand1 = 0, operand2 = 0;
    private boolean isFirstOperand = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1TextView = findViewById(R.id.operand1TextView);
        operand2TextView = findViewById(R.id.operand2TextView);
        resultTextView = findViewById(R.id.resultTextView);

        // Gán sự kiện onClick cho các nút số
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);

        // Gán sự kiện onClick cho nút "Kiểm tra"
        findViewById(R.id.btnKiemtra).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String buttonText = button.getText().toString();

        if (v.getId() == R.id.btnKiemtra) {
            calculateAndDisplayResult();
        } else {
            // Xử lý các nút số
            if (isFirstOperand) {
                operand1 = Integer.parseInt(buttonText);
                operand1TextView.setText(buttonText);
                isFirstOperand = false;
            } else {
                operand2 = Integer.parseInt(buttonText);
                operand2TextView.setText(buttonText);
            }
        }
    }

    private void calculateAndDisplayResult() {
        int result = operand1 + operand2;
        if (result <= 10) {
            resultTextView.setText(String.valueOf(result));
        } else {
            resultTextView.setText("Kết quả > 10");
        }
    }
}