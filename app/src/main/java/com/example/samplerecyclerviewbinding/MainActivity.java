package com.example.samplerecyclerviewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.samplerecyclerviewbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Kitap>kitapList=new ArrayList<>();
        kitapList.add(new Kitap("The State of Grace","Lois Lewandowski",getDrawable(R.drawable.book_1)));
        kitapList.add(new Kitap("Murder At The Rocks","Jill Paterson",getDrawable(R.drawable.book_2)));
        kitapList.add(new Kitap("Sleepless Part One","Marc Layton",getDrawable(R.drawable.book_3)));
        kitapList.add(new Kitap("Devil on Deck","Madison Kent",getDrawable(R.drawable.book_4)));
        kitapList.add(new Kitap("Dark Promise","Julia Crane & Talia Jager",getDrawable(R.drawable.book_5)));
        kitapList.add(new Kitap("The Dawnvel Druids", "William Collins", getDrawable(R.drawable.book_6)));
        kitapList.add(new Kitap("The Frights of Fiji", "Sanayna Prasad", getDrawable(R.drawable.book_7)));
        kitapList.add(new Kitap("Skyborn Ignite", "Hannah Parker", getDrawable(R.drawable.book_8)));

        KitapAdapter adapter=new KitapAdapter(kitapList);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        binding.recyclerView.setAdapter(adapter);
    }
}