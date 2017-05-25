package benignstar.kr.hs.emirim.dialogtest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button but1=(Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dlg=new AlertDialog.Builder(this);
        dlg.setTitle("Title");
        dlg.setMessage("Message");
        dlg.setIcon(R.drawable.idea);
        dlg.setPositiveButton("OK",null);
        dlg.setNegativeButton("Cancel",null);
        dlg.show();
    }
}
