package com.letscodes.appseven;

import android.support.v4.app.ListFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.letscodes.appseven.data.Movie;


public class MovieFragment extends ListFragment {

    private OnMovieSelectedListener mListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // we need to use different list item layout for devices older than Honeycomb
        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB?
                    android.R.layout.simple_list_item_activated_1:android.R.layout.simple_list_item_1;

        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Movie.names));

    }
    @Override
    public void onStart(){
        super.onStart();
        // highlight the selected item on the listview when it is in two pane layout. It is better to do this as
        //at this point listview is available.
        if (getFragmentManager().findFragmentById(R.id.wiki_fragment)!=null){
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }
    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        // Notify the parent activity of the selected item
        mListener.onMovieSelected(position);
        // set the item as check to be highlighted when in two-pane layout
        getListView().setItemChecked(position, true);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMovieSelectedListener) {
            mListener = (OnMovieSelectedListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnMovieSelectedListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnMovieSelectedListener {
         public void onMovieSelected(int position);
    }
}
