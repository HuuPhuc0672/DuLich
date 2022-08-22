package com.example.dulich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dulich.Mode.DuLich;
import com.squareup.picasso.Picasso;

public class ChiTietActivity extends AppCompatActivity {
    private TextView txtNoidung1;
    private ImageView imgView1;
    private TextView txtNoidung2,txt_TenDl;
    private ImageView imgView2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        txt_TenDl = (TextView) findViewById(R.id.txt_TenDl);
        txtNoidung1 = (TextView) findViewById(R.id.txt_Noidung1);
        imgView1 = (ImageView) findViewById(R.id.imgView1);
        txtNoidung2 = (TextView) findViewById(R.id.txt_Noidung2);
        imgView2 = (ImageView) findViewById(R.id.imgView2);


        Bundle bundle=getIntent().getExtras();
        DuLich duLich= (DuLich) bundle.get("object_Dulieu");

        txt_TenDl.setText(duLich.getTenDL());
        txtNoidung1.setText(duLich.getThongTinDl1());
        Picasso.get().load(duLich.getHinhAnhDL()).into(imgView1);
        txtNoidung2.setText(duLich.getThongTinDl2());
        Picasso.get().load(duLich.getHAnh1()).into(imgView2);

    }
}