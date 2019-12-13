package com.example.listasview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintTableLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import WebServices.Asynchtask;
import WebServices.WebServices;

public class MainActivity extends AppCompatActivity implements Asynchtask {
    AdaptadorContactos adaptadornoticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> datos = new HashMap<String, String>();
        WebServices ws= new WebServices("https://api.androidhive.info/contacts/",
                datos, MainActivity.this, MainActivity.this);
        ws.execute("");


    }

    @Override
    public void processFinish(String result) throws JSONException {
        Log.i("ProcessFinish",result);
        String Dt="";
        ArrayList<String> Dts= new ArrayList<String>();
        JSONObject jsonObject = new JSONObject(result);
        try {
            ArrayList<HashMap<String, String>> contactList = new ArrayList<>();
            JSONArray contacts = jsonObject.getJSONArray("contacts");
            for (int i = 0; i < contacts.length(); i++) {
                JSONObject c = contacts.getJSONObject(i);
                String name = c.getString("name");

                JSONObject phone = c.getJSONObject("phone");
                String mobile = phone.getString("mobile");
                String home = phone.getString("home");
                String office = phone.getString("office");

                HashMap<String, String> contact = new HashMap<>();

                contact.put("name", name);
                contact.put("mobile", mobile);
                contact.put("home",home);
                contact.put("office",office);
                contactList.add(contact);
                Dt=name+"\n"+mobile;
                Dts.add(Dt);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        ArrayAdapter adaptadornoticias=new ArrayAdapter(this, android.R.layout.simple_list_item_1,Dts);
        ListView lstOpciones= (ListView)findViewById(R.id.ltsLista);
        lstOpciones.setAdapter(adaptadornoticias);

    }

}
