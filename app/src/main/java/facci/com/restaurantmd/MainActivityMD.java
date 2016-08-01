package facci.com.restaurantmd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityMD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_md);
    }
   public void click1(View v) {
       Toast.makeText(MainActivityMD.this,"Bandeja de Mariscos",Toast.LENGTH_SHORT).show();
}
    public void click2(View v) {
        Toast.makeText(MainActivityMD.this,"Caldo de Gallina Criolla",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v) {
        Toast.makeText(MainActivityMD.this,"Ceviche de Camarón",Toast.LENGTH_SHORT).show();
    }
    public void click4(View v) {
        Toast.makeText(MainActivityMD.this,"Corviche",Toast.LENGTH_SHORT).show();
    }
    public void click5(View v) {
        Toast.makeText(MainActivityMD.this,"Pescado Frito",Toast.LENGTH_SHORT).show();
    } public void click6(View v) {
        Toast.makeText(MainActivityMD.this,"Salprieta",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v) {
        Toast.makeText(MainActivityMD.this,"Arroz Marinero",Toast.LENGTH_SHORT).show();

    }



}