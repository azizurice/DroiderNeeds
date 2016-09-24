package com.letscodes.appseven;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements MoviesFragment.OnMovieSelectedListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wiki_details);

        if (findViewById(R.id.fragment_container) !=null){
            if (savedInstanceState !=null){
                return;
            }
            MoviesFragment movieNameFragment=new MoviesFragment();

            movieNameFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager()
                     .beginTransaction()
                     .add(R.id.fragment_container, movieNameFragment)
                     .commit();
        }
    }

    public void onMovieSelected(int position){
        WikiDetailsFragment wikiDetailsFragment =(WikiDetailsFragment)getSupportFragmentManager()
                .findFragmentById(R.id.wiki_fragment);
        if (wikiDetailsFragment !=null){
            wikiDetailsFragment.updateWikiView(position);
        } else {
            WikiDetailsFragment newFragment= new WikiDetailsFragment();
            Bundle args=new Bundle();
            args.putInt(WikiDetailsFragment.ARG_POSITION,position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container,newFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
