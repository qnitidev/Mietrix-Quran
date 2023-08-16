package com.mietrix.quranprojects.activity;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.mietrix.quranprojects.R;
import com.mietrix.quranprojects.fragment.TafsirFragment;

/** Created by Sadmansamee on 8/20/15. */
public class TafsirActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tafsir);

    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    Bundle bundle = this.getIntent().getExtras();

    if (savedInstanceState == null) {
      FragmentManager fragmentManager = getFragmentManager();

      fragmentManager
          .beginTransaction()
          .replace(R.id.main_container, TafsirFragment.newInstance(bundle))
          .commit();
    }
  }
}
