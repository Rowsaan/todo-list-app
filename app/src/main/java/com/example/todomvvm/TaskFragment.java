package com.example.todomvvm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TaskFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TaskFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String ARG_PARAM1 = "task_desc";
    public static final String ARG_PARAM2 = "dateupdated";
    public static final String ARG_PARAM3 = "priority";

    private TextView Task_desc_v,priority_v,date_updated_v;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TaskFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param task_desc Parameter 1.
     * @param dateupdated Parameter 2.
     *  @param priority Parameter 2.
     * @return A new instance of fragment TaskFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TaskFragment newInstance(String task_desc, String dateupdated, String priority) {
        TaskFragment fragment = new TaskFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, task_desc);
        args.putString(ARG_PARAM2, dateupdated);
        args.putString(ARG_PARAM3, priority);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args =getArguments();
        if (args != null){
            String task_desc = args.getString(ARG_PARAM1);
            String dateupdated = args.getString(ARG_PARAM2);
            String priority = args.getString(ARG_PARAM3);

            Task_desc_v.setText(task_desc);
            date_updated_v.setText(dateupdated);
            priority_v.setText(priority);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_task, container, false);
        Task_desc_v=rootView.findViewById(R.id.Task_desc_v);
        priority_v=rootView.findViewById(R.id.priority_v);
        date_updated_v=rootView.findViewById(R.id.date_updated_v);
        return rootView;
    }
}