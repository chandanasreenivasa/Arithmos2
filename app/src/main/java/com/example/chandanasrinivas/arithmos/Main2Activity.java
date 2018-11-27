
package com.example.chandanasrinivas.arithmos;

        import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    boolean check = false;

    Button b1,b2,b3,b4,b5, b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t;
        final Chronometer Timer;

        b1=(Button)findViewById(R.id.b8);
        b2=(Button)findViewById(R.id.b17);
        b3=(Button)findViewById(R.id.b14);
        b4=(Button)findViewById(R.id.b1);
        b5=(Button)findViewById(R.id.b4);
        b6=(Button)findViewById(R.id.b12);
        b7=(Button)findViewById(R.id.b2);
        b8=(Button)findViewById(R.id.b5);
        b9=(Button)findViewById(R.id.b23);
        b10=(Button)findViewById(R.id.b7);
        b11=(Button)findViewById(R.id.b21);
        b12=(Button)findViewById(R.id.b20);
        b13=(Button)findViewById(R.id.b11);
        b14=(Button)findViewById(R.id.b22);
        b15=(Button)findViewById(R.id.b15);
        b16=(Button)findViewById(R.id.b18);
        b17=(Button)findViewById(R.id.b25);
        b18=(Button)findViewById(R.id.b3);
        b19=(Button)findViewById(R.id.b13);
        b20=(Button)findViewById(R.id.b16);
        b21=(Button)findViewById(R.id.b19);
        b22=(Button)findViewById(R.id.b24);
        b23=(Button)findViewById(R.id.b6);
        b24=(Button)findViewById(R.id.b9);
        b25=(Button)findViewById(R.id.b10);
        Timer=(Chronometer)findViewById(R.id.timer);
        //long counter=0;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Timer.setBase(SystemClock.elapsedRealtime());
                Timer.start();

                b1.setText("26");
                check =true;

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b2.setText("27");
                        b3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b3.setText("28");

                                b4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        b4.setText("29");

                                        b5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                b5.setText("30");

                                                b6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        b6.setText("31");

                                                        b7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                b7.setText("32");

                                                                b8.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        b8.setText("33");

                                                                        b9.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                b9.setText("34");

                                                                                b10.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        b10.setText("35");

                                                                                        b11.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                b11.setText("36");

                                                                                                b12.setOnClickListener(new View.OnClickListener() {
                                                                                                    @Override
                                                                                                    public void onClick(View v) {
                                                                                                        b12.setText("37");

                                                                                                        b13.setOnClickListener(new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {
                                                                                                                b13.setText("38");

                                                                                                                b14.setOnClickListener(new View.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(View v) {
                                                                                                                        b14.setText("39");

                                                                                                                        b15.setOnClickListener(new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {
                                                                                                                                b15.setText("40");

                                                                                                                                b16.setOnClickListener(new View.OnClickListener() {
                                                                                                                                    @Override
                                                                                                                                    public void onClick(View v) {
                                                                                                                                        b16.setText("41");

                                                                                                                                        b17.setOnClickListener(new View.OnClickListener() {
                                                                                                                                            @Override
                                                                                                                                            public void onClick(View v) {
                                                                                                                                                b17.setText("42");

                                                                                                                                                b18.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                    @Override
                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                        b18.setText("43");

                                                                                                                                                        b19.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                            @Override
                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                b19.setText("44");

                                                                                                                                                                b20.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                    @Override
                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                        b20.setText("45");

                                                                                                                                                                        b21.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                            @Override
                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                b21.setText("46");

                                                                                                                                                                                b22.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                    @Override
                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                        b22.setText("47");

                                                                                                                                                                                        b23.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                            @Override
                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                b23.setText("48");

                                                                                                                                                                                                b24.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                    @Override
                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                        b24.setText("49");

                                                                                                                                                                                                        b25.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                            @Override
                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                b25.setText("50");
                                                                                                                                                                                                                b1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                        b1.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                        b2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                b2.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                b3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                        b3.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                        b4.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                b4.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                b5.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                        b5.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                        b6.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                b6.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                b7.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                        b7.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                        b8.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                b8.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                b9.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                        b9.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                        b10.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                b10.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                b11.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                        b11.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                        b12.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                b12.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                b13.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                        b13.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                        b14.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                b14.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                b15.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                        b15.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                        b16.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                b16.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                b17.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                        b17.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                        b18.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                b18.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                b19.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                        b19.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                        b20.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                b20.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                b21.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                        b21.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                        b22.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                                b22.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                                b23.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                                        b23.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                                        b24.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                                                            @Override
                                                                                                                                                                                                                                                                                                                                                                                                            public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                                                b24.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                                                b25.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                                                                                    @Override
                                                                                                                                                                                                                                                                                                                                                                                                                    public void onClick(View v) {
                                                                                                                                                                                                                                                                                                                                                                                                                        b25.setVisibility(View.INVISIBLE);
                                                                                                                                                                                                                                                                                                                                                                                                                        Timer.stop();
                                                                                                                                                                                                                                                                                                                                                                                                                        callIntent(Timer);

                                                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                });
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        });
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                });
                                                                                                                                                                                                            }
                                                                                                                                                                                                        });
                                                                                                                                                                                                    }
                                                                                                                                                                                                });
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                    }
                                                                                                                                                                                });
                                                                                                                                                                            }
                                                                                                                                                                        });
                                                                                                                                                                    }
                                                                                                                                                                });
                                                                                                                                                            }
                                                                                                                                                        });
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                });
                                                                                                                            }
                                                                                                                        });
                                                                                                                    }
                                                                                                                });
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });





    }
    void callIntent(Chronometer Timer)
    {
        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        intent.putExtra("Score",SystemClock.elapsedRealtime()-Timer.getBase());
        startActivity(intent);
    }


}