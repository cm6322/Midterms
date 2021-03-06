package com.example.midterms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pipe> pipeTypes;
    ArrayAdapter<Pipe> pipeAdapter;
    ArrayList<Bill> bills;
    int month;
    int last_consumption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bills = new ArrayList<>();
        month = 1;
        last_consumption = 0;
        setPipeAdapter();
        btnCalculateListenerMethod();
        setHistoryAdapter();
        nightModeListenerMethod();
    }

    // TODO Milestone A: Use Day-Night mode.
    private void nightModeListenerMethod() {

    }

    // TODO Milestone B: Show History.
    private void setHistoryAdapter() {

    }

    // // TODO Milestone 3: Calculate bill.
    private void btnCalculateListenerMethod() {
        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int packageNumber;
                EditText etPrev = findViewById(R.id.etPrev);
                EditText etCurr = findViewById(R.id.etNew);

                Spinner spPipe = findViewById(R.id.spPipe);

                RadioGroup pack = findViewById(R.id.packageRadioGroup);
                int selectedId = pack.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                String selectedPackage = (String) radioButton.getText();
                switch(selectedPackage){
                    case "Basic":
                        packageNumber = 1;
                        break;
                    case "Regular":
                        packageNumber = 2;
                        break;
                    case "Premium":
                        packageNumber = 3;
                        break;
                }

                Bill resultingBill = new Bill(etPrev,etCurr,,packageNumber,month);
            }
        });
    }

    /**
     * The pipe list is already initialized. There is no need to revise this.
     */
    private void setPipeAdapter() {
        pipeTypes = new ArrayList<>();
        pipeTypes.add(new Pipe("Arad", 0.5));
        pipeTypes.add(new Pipe("Arad", 0.7));
        pipeTypes.add(new Pipe("Arad", 0.2));
        pipeTypes.add(new Pipe("Ace", 0.5));
        pipeTypes.add(new Pipe("Ace", 0.2));
        Spinner spPipe = findViewById(R.id.spPipe);
        pipeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pipeTypes);
        spPipe.setAdapter(pipeAdapter);
    }
}