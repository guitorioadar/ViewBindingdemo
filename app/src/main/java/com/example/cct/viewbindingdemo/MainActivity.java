package com.example.cct.viewbindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cct.viewbindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
		PersonDemo personDemo = new PersonDemo("Shaikh","Wasi Sadman");
		binding.setPerson(personDemo);
	}
}
