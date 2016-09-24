package com.letscodes.appseven;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.letscodes.appseven.data.Movie;


public class WikiDetailsFragment extends Fragment {
    static final String ARG_POSITION = "position";
    int mCurrentPosition=-1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState !=null){
            mCurrentPosition =savedInstanceState.getInt(ARG_POSITION);
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.movie_view, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        Bundle args = getArguments();
        if (args !=null){
            updateWikiView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition !=-1){
            updateWikiView(mCurrentPosition);
        }

    }
    public void updateWikiView(int position){
        TextView wiki=(TextView) getActivity().findViewById(R.id.wiki);
        wiki.setText(Movie.wikiDetails[position]);
        mCurrentPosition=position;
    }
    @Override
    public void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        bundle.putInt(ARG_POSITION,mCurrentPosition);
    }


}
