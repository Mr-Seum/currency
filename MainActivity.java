package com.example.firstapplication;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spFrom, spTo;
    EditText ed1;
    TextView ed2;
    Button btnConvert, btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (TextView) findViewById(R.id.ed2);
        spFrom = (Spinner) findViewById(R.id.spFrom);
        spTo = (Spinner) findViewById(R.id.spTo);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnReset = (Button) findViewById(R.id.btnReset);

        String[] from = {"Bangladeshi Taka","Chinese Yuan","United States Dollar", "Nepalese Rupee","Swedish Krona","Kuwaiti Dinar","Canadian Dollar"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spFrom.setAdapter(ad);


        String[] to = {"United States Dollar", "Swedish Krona","Chinese Yuan","Nepalese Rupee","Kuwaiti Dinar","Malaysian Ringgit","Indonesian Rupiah","Canadian Dollar","Qatari Rial"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spTo.setAdapter(ad1);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double tot;
                    Double amount = Double.parseDouble(ed1.getText().toString());

                    if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 84.74;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount / 9.57;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Chinese Yuan") {
                        tot = amount / 12.08;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.46;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.71;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 276.61;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 19.87;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.0058;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount / 63.11;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Bangladeshi Taka" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 23.28;
                        ed2.setText(tot.toString());
                    }
                    //Chinese Yuan
                    else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 7.01;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /0.79;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.038;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.059;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 22.89;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 1.65;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.00048;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount / 5.23;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 1.93;
                        ed2.setText(tot.toString());
                    }
                    else if (spFrom.getSelectedItem().toString() == "Chinese Yuan" && spTo.getSelectedItem().toString() == "Chinese Yuan") {
                        tot = amount / 1;
                        ed2.setText(tot.toString());
                    }
                    //United States
                    else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 1;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /0.11;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.0054;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.0084;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 3.26;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 0.23;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.000068;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount /0.75;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "United States Dollar" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 0.27;
                        ed2.setText(tot.toString());
                    }
                    //Nepalese Rupee
                    else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 119.66;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /13.54;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.64;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 1;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 389.96;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 28.10;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.0082;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount /89.23;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Nepalese Rupee" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 32.86;
                        ed2.setText(tot.toString());
                    }
                    //Swedish Krona
                    else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 8.84;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /1;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.048;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.074;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 28.83;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 2.08;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.00060;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount /6.59;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Swedish Krona" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 2.43;
                        ed2.setText(tot.toString());
                    }
                    //Kuwaiti Dinar
                    else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount / 0.31;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /0.035;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.0017;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.0026;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 1;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 0.072;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.000021;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount /0.23;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Kuwaiti Dinar" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 0.084;
                        ed2.setText(tot.toString());
                    }
                    //Colombian Peso
                    else if (spFrom.getSelectedItem().toString() == "Colombian Peso" && spTo.getSelectedItem().toString() == "United States Dollar") {
                        tot = amount /1.34;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Swedish Krona") {
                        tot = amount /0.15;
                        ed2.setText(tot.toString());
                    }  else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Sri Lankan Rupee") {
                        tot = amount / 0.0072;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Nepalese Rupee") {
                        tot = amount / 0.011;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Kuwaiti Dinar") {
                        tot = amount / 4.37;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Malaysian Ringgit") {
                        tot = amount / 0.32;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Indonesian Rupiah") {
                        tot = amount / 0.000092;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Canadian Dollar") {
                        tot = amount / 1;
                        ed2.setText(tot.toString());
                    } else if (spFrom.getSelectedItem().toString() == "Canadian Dollar" && spTo.getSelectedItem().toString() == "Qatari Rial") {
                        tot = amount / 0.37;
                        ed2.setText(tot.toString());
                    }
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please type valid number",Toast.LENGTH_SHORT).show();
                }


            }

        });
    }

    public void me_reset(View view) {
        ed1.setText("");
        ed2.setText("");
    }


}