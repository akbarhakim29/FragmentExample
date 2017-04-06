package com.bymankind.fragmentlistexample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Server-Panduit on 4/4/2017.
 */

public class LstFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_layout,container,false);
        String[] dataSource = {"English","French","Chinese","Khmer","Japanese"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.row_layout,R.id.txtitem,dataSource);
        setListAdapter(adapter);
        setRetainInstance(true);
        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ViewGroup viewGroup = (ViewGroup)v;
        TextView textView = (TextView) viewGroup.findViewById(R.id.txtitem);
        Toast.makeText(getActivity(),textView.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
