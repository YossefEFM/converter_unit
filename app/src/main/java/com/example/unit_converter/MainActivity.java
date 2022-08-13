package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    String D1, D2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spiner1=findViewById(R.id.spinner);
        Spinner spiner2=findViewById(R.id.spinner2);
        Button conv = findViewById(R.id.Convert);
        EditText enter = findViewById(R.id.read);
        TextView show = findViewById(R.id.write);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.dilameters));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner1.setAdapter(adapter);
        spiner2.setAdapter(adapter);

spiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
   if (i == 0)
   {
       D1= "Km";
   }
   else if (i == 1)
   {
      D1="m";
   }
   else if (i == 2)
   {
       D1="Cm";
   }
   else if (i == 3)
   {
       D1="mm";
   }
   else if (i == 4)
   {
       D1="Kg";
   }
   else
   {
       D1="g";
   }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});

spiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (i == 0)
        {
            D2= "Km";
        }
        else if (i == 1)
        {
            D2="m";
        }
        else if (i == 2)
        {
            D2="Cm";
        }
        else if (i == 3)
        {
            D2="mm";
        }
        else if (i == 4)
        {
            D2="Kg";
        }
        else
        {
            D2="g";
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double result = Double.parseDouble(enter.getText().toString()) ;
          if(D1 == "m")
          {
              if(D2 == "Km")
              {
                result = result /1000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "mm")
              {
                  result = result *1000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "Cm")
              {
                  result = result *100;
                  show.setText(String.valueOf(result));
              }
              else if(D2 == "m")
              {
                  show.setText(String.valueOf(result));

              }
              else
              {
                  show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
              }
          }
          else if(D1 =="Km")
          {
              if(D2 == "m")
              {
                  result = result *1000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "mm")
              {
                   result =result *1000000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "Cm")
              {
                  result =result *100000;
                  show.setText(String.valueOf(result));
              }
              else if(D2 == "Km")
              {
                  show.setText(String.valueOf(result));

              }
              else
              {
                  show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
              }
          }
          else if(D1 =="mm")
          {
              if(D2 == "Km")
              {
                  result =result /1000000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "m")
              {
                  result = result /1000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "Cm")
              {
                  result =result /10;
                  show.setText(String.valueOf(result));
              }
              else if(D2 == "mm")
              {
                  show.setText(String.valueOf(result));

              }
              else
              {
                  show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
              }
          }
          else if(D1 =="Cm")
          {
              if(D2 == "Km")
              {
                result =result / 100000;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "mm")
              {
                  result = result *10;
                  show.setText(String.valueOf(result));
              }
              else if (D2 == "m")
              {
               result =result /100;
               show.setText(String.valueOf(result));
              }
              else if(D2 == "Cm")
              {
                  show.setText(String.valueOf(result));

              }
              else
              {
                  show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
              }
          }
          else if(D1 =="Kg")
          {
             if(D2 == "g")
             {
                result  = result *1000;
                 show.setText(String.valueOf(result));
             }
             else if(D2 == "Kg")
             {
                 show.setText(String.valueOf(result));

             }
             else
             {
                 show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
             }
          }
          else if(D1 =="g")
          {
            if (D2 == "Kg"){
                result  = result /1000;
                show.setText(String.valueOf(result));
            }
            else if(D2 == "g")
            {
                show.setText(String.valueOf(result));

            }
            else
            {
                show.setText("!!!!!!!!!!   No conversion   !!!!!!!!!!!");
            }
          }

            }
        });
    }


}


