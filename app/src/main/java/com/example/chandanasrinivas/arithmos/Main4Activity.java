package com.example.chandanasrinivas.arithmos;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    FirebaseDatabase db = FirebaseDatabase.getInstance();

    TextView tv,tv1,tv2,tv3,tv4,tv5;
    ArrayList<user> AL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        DatabaseReference reference = db.getReference("Ashika");
        Query query= FirebaseDatabase.getInstance().getReference("Ashika").orderByChild("score");

        AL = new ArrayList<>();
        query.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NewApi")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                AL = dataCollection(dataSnapshot);

                for(int i=0;i<AL.size();i++)
                {
                    Log.d("Name",AL.get(i).getName());
                    Log.d("Score",""+AL.get(i).getScore());
                    //Collections.sort(AL);
                    tv.setText(AL.get(0).getName());
                    tv1.setText(""+ AL.get(0).getScore());

                      tv2.setText(AL.get(1).getName());
                      tv3.setText(""+AL.get(1).getScore());
                      tv4.setText(AL.get(2).getName());
                      tv5.setText(""+AL.get(2).getScore());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Main4Activity.this, "Failed to read", Toast.LENGTH_SHORT).show();
            }
        });
        }

   private ArrayList<user> dataCollection(DataSnapshot dataSnapshot) {
        ArrayList<user> AL = new ArrayList<>();
        for (DataSnapshot D: dataSnapshot.getChildren())
        {
            user uc = D.getValue(user.class);
            AL.add(uc);
            //Do display stuff in this part and all... Use getters to access data... Dont do other stuff
            /*Toast.makeText(this, ""+AL.size(), Toast.LENGTH_SHORT).show();
            Log.d("Oth Name", AL.get(0).getName());
            Log.d("Oth Score", String.valueOf(AL.get(0).getScore()));
            tv.setText(AL.get(0).getName());
            tv1.setText(""+ AL.get(0).getScore());*/

            /*tv2.setText(AL.get(1).getName());
            tv3.setText(""+AL.get(1).getScore());
            tv4.setText(AL.get(2).getName());
            tv5.setText(""+AL.get(2).getScore());*/
        }
        return AL;
    }

}

