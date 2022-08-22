package com.example.dulich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dulich.Adapter.Adapter_DuLich;
import com.example.dulich.Mode.DuLich;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvData;
    Adapter_DuLich adapter_duLich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvData = (RecyclerView) findViewById(R.id.recyView);
        adapter_duLich=new Adapter_DuLich(arrayList(),this);


        rcvData.setHasFixedSize(true);
        rcvData.setLayoutManager(new GridLayoutManager(this,2));
        rcvData.setAdapter(adapter_duLich);


    }

    private ArrayList<DuLich> arrayList() {
        ArrayList<DuLich> list=new ArrayList<>();
        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-5_1632662666.jpg","Hà Nội",
                getString(R.string.Hanoi_ND1),"https://www.vietnamonline.com/media/uploads/froala_editor/images/Hoan%20Kiem%20Lake.jpg",null));


        list.add(new DuLich("https://www.vietnambooking.com/wp-content/uploads/2020/09/du-lich-ninh-binh-mua-lua-chin-3.jpg","Ninh Bình",
                getString(R.string.Hanoi_ND1),null,null));

        list.add(new DuLich("https://media.cungphuot.info/2017/07/26/hinh1-1501056431_680x0.jpg","Lạng Sơn",
                getString(R.string.Hanoi_ND1),null,null));

        list.add(new DuLich("https://busvietnam.net/wp-content/uploads/2019/01/yen-bai_busvietnam2.jpg","Yên Bái",
                getString(R.string.YenBai_ND1),null,null));



        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-05_1632671806.jpg","Phú Quốc",
                getString(R.string.PhucQuoc_ND1),"https://statics.vinpearl.com/diem-du-lich-02_1648302369.png",getString(R.string.PhucQuoc_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-9_1632662759.jpg","Nha Trang",
                getString(R.string.NhaTrang_ND1),"https://statics.vinpearl.com/diem-du-lich_1648301729.jpg",getString(R.string.NhaTrang_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-3_1632662626.jpg","Hội An",
                getString(R.string.HoiAn_ND1),"https://statics.vinpearl.com/diem-du-lich-04_1648302905.jpg",getString(R.string.HoiAn_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-6_1632662692.jpg","Đà Nẵng",
                getString(R.string.DaNang_ND1),"https://statics.vinpearl.com/diem-du-lich-07_1648303173.jpg",getString(R.string.DaNang_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-2_1632671014.jpg","Hạ Long Quảng Ninh",
                getString(R.string.QuangNinh_ND1),"https://statics.vinpearl.com/hinh-anh-kinh-nghiem-du-lich-ha-long-7.jpg",getString(R.string.QuangNinh_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-7_1632662712.jpg","Sài Gòn",
                getString(R.string.SaiGon_ND1),"https://statics.vinpearl.com/diem-du-lich-21_1632663090.jpeg",getString(R.string.SaiGon_ND2)));


        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-08_1648303746.jpg","Quảng Bình",
                getString(R.string.QuangBinh_ND1),"https://statics.vinpearl.com/diem-du-lich-09_1648303936.jpg",getString(R.string.QuangBinh_ND2)));

        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-17_1632662952.jpg","Thanh Hóa",
                getString(R.string.ThanhHoa_ND1),"https://statics.vinpearl.com/diem-du-lich-11_1648304768.jpg",getString(R.string.ThanhHoa_ND2)));



        list.add(new DuLich("https://statics.vinpearl.com/diem-du-lich-10_1632662781.jpg","Huế",
                getString(R.string.Hue_ND1),"https://statics.vinpearl.com/Hinh-anh-review-vinpearl-Hu%E1%BA%BF.jpg",getString(R.string.Hue_ND2)));



        return list;

    }
}