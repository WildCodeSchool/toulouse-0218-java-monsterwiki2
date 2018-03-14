package fr.wcs.wikimobmonsterlegends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MonsterShowActivity extends MainActivity {

    int mLevel = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_show);

        Button previousEv = findViewById(R.id.btn_previous);
        Button nextEv = findViewById(R.id.btn_next);
        updateData(mLevel);

        //Clic sur les boutons
        nextEv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateData(++mLevel);
            }
        });
        previousEv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateData(--mLevel);
            }
        });

    }

    public void updateData(int mLevel) {
        ImageView typePicture = findViewById(R.id.type_picture);
        ImageView weaknessPicture = findViewById(R.id.weakness_picture);
        Button previousEv = findViewById(R.id.btn_previous);
        Button nextEv = findViewById(R.id.btn_next);

        final TextView monsterName = findViewById(R.id.monster_name);
        final ImageView monsterPicture = findViewById(R.id.monster_picture);
        final TextView healthStat = findViewById(R.id.stat_health);
        final TextView powerStat = findViewById(R.id.stat_power);
        final TextView speedStat = findViewById(R.id.stat_speed);
        final TextView staminaStat = findViewById(R.id.stat_stamina);
        final TextView monsterAge = findViewById(R.id.age);

        switch (mLevel) {
        case 0 :
            MonsterModel toEgg = getIntent().getParcelableExtra("EXTRA_PARCEL_EGG");
            monsterName.setText(toEgg.getName());
            typePicture.setImageResource(toEgg.getType());
            monsterPicture.setImageResource(toEgg.getImage());
            weaknessPicture.setImageResource(toEgg.getWeakness());
            healthStat.setText(String.valueOf(toEgg.getStatHealth()));
            powerStat.setText(String.valueOf(toEgg.getStatPower()));
            speedStat.setText(String.valueOf(toEgg.getStatSpeed()));
            staminaStat.setText(String.valueOf(toEgg.getStatStamina()));
            monsterAge.setText(R.string.egg);
            previousEv.setVisibility(View.INVISIBLE);
            nextEv.setVisibility(View.VISIBLE);
            break;
        case 1 :
            MonsterModel toChild = getIntent().getParcelableExtra("EXTRA_PARCEL_CHILD");
            monsterName.setText(toChild.getName());
            typePicture.setImageResource(toChild.getType());
            monsterPicture.setImageResource(toChild.getImage());
            weaknessPicture.setImageResource(toChild.getWeakness());
            healthStat.setText(String.valueOf(toChild.getStatHealth()));
            powerStat.setText(String.valueOf(toChild.getStatPower()));
            speedStat.setText(String.valueOf(toChild.getStatSpeed()));
            staminaStat.setText(String.valueOf(toChild.getStatStamina()));
            monsterAge.setText(R.string.child);
            previousEv.setVisibility(View.VISIBLE);
            nextEv.setVisibility(View.VISIBLE);
            break;
        case 2 :
            MonsterModel toJuv = getIntent().getParcelableExtra("EXTRA_PARCEL_JUV");
            monsterName.setText(toJuv.getName());
            typePicture.setImageResource(toJuv.getType());
            monsterPicture.setImageResource(toJuv.getImage());
            weaknessPicture.setImageResource(toJuv.getWeakness());
            healthStat.setText(String.valueOf(toJuv.getStatHealth()));
            powerStat.setText(String.valueOf(toJuv.getStatPower()));
            speedStat.setText(String.valueOf(toJuv.getStatSpeed()));
            staminaStat.setText(String.valueOf(toJuv.getStatStamina()));
            monsterAge.setText(R.string.juv);
            previousEv.setVisibility(View.VISIBLE);
            nextEv.setVisibility(View.VISIBLE);
            break;
        case 3 :
            MonsterModel toAdult = getIntent().getParcelableExtra("EXTRA_PARCEL_ADULT");
            monsterName.setText(toAdult.getName());
            typePicture.setImageResource(toAdult.getType());
            monsterPicture.setImageResource(toAdult.getImage());
            weaknessPicture.setImageResource(toAdult.getWeakness());
            healthStat.setText(String.valueOf(toAdult.getStatHealth()));
            powerStat.setText(String.valueOf(toAdult.getStatPower()));
            speedStat.setText(String.valueOf(toAdult.getStatSpeed()));
            staminaStat.setText(String.valueOf(toAdult.getStatStamina()));
            monsterAge.setText(R.string.adult);
            previousEv.setVisibility(View.VISIBLE);
            nextEv.setVisibility(View.INVISIBLE);
            break;
    }}
}







