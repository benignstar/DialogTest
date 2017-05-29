package benignstar.kr.hs.emirim.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    String itemArr[]={"사과", "바나나", "키위", "포도"};
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=(Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dlg=new AlertDialog.Builder(this);
        dlg.setTitle("좋아하는 과일은?");
        dlg.setIcon(R.drawable.idea);
 /*       dlg.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                but1.setText(itemArr[i]);
            }
        });*/
        dlg.setSingleChoiceItems(itemArr, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                but1.setText(itemArr[i]);
            }
        });
        dlg.setPositiveButton("OK",null);
        dlg.setNegativeButton("Cancel",null);
        dlg.show();
    }
}
