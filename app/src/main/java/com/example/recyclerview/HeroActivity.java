package com.example.recyclerview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HeroActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeros;
    private RecyclerView mRecyclerHero;
    private HeroAdapter mHeroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hero);

        mRecyclerHero = findViewById(R.id.recyclerHero);
        mHeros = new ArrayList<>();

        createHeroList();

        mHeroAdapter = new HeroAdapter(this, mHeros);
        mRecyclerHero.setAdapter(mHeroAdapter);
        mRecyclerHero.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createHeroList() {
        mHeros.add(new Hero("Bloom", "Tiên nữ ngọn lửa Rồng", R.drawable.img_bloom, "⭐⭐⭐⭐⭐"));
        mHeros.add(new Hero("Stella", "Tiên nữ mặt trời", R.drawable.img_stella, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Flora", "Tiên nữ thiên nhiên", R.drawable.img_flora, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Aisha", "Tiên nữ của nước", R.drawable.img_aisha, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Tecna", "Tiên nữ công nghệ", R.drawable.img_tecna, "⭐⭐⭐"));
        mHeros.add(new Hero("Musa", "Tiên nữ âm nhạc", R.drawable.img_musa, "⭐⭐⭐"));
        mHeros.add(new Hero("Bloom", "Tiên nữ ngọn lửa Rồng", R.drawable.img_bloom, "⭐⭐⭐⭐⭐"));
        mHeros.add(new Hero("Stella", "Tiên nữ mặt trời", R.drawable.img_stella, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Flora", "Tiên nữ thiên nhiên", R.drawable.img_flora, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Aisha", "Tiên nữ của nước", R.drawable.img_aisha, "⭐⭐⭐⭐"));
        mHeros.add(new Hero("Tecna", "Tiên nữ công nghệ", R.drawable.img_tecna, "⭐⭐⭐"));
        mHeros.add(new Hero("Musa", "Tiên nữ âm nhạc", R.drawable.img_musa, "⭐⭐⭐"));
    }
}
