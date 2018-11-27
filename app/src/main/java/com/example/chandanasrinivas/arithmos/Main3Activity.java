package com.example.chandanasrinivas.arithmos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main3Activity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    EditText et;
    DatabaseReference reference = database.getReference("Ashika");
    Long score;
    user uc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       // Log.d("in fire","here");
        et = (EditText)findViewById(R.id.et);
        Intent intent = getIntent();
        score = intent.getLongExtra("Score",0);

        /*reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                changeData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/

        uc = new user();


    }

    /*private void changeData(DataSnapshot dataSnapshot) {
        ArrayList<user> AL = new ArrayList<>();
        for (DataSnapshot D: dataSnapshot.getChildren())
        {
            user uc = D.getValue(user.class);
            AL.add(uc);
            //Do display stuff using the class getters...
        }
    }*/

    public void click(View view) {

        String name = et.getText().toString();
        uc.setName(name);
        uc.setScore(score/1000);
        //reference.child(name).setValue(floor(score/1000));
        reference.push().setValue(uc);
        Toast.makeText(this, "Uploaded", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(i);

    }
}
