package com.pocketpetcare.educ8.pocketpetcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.pocketpetcare.educ8.pocketpetcare.petsToCareForInst.PetsToCareForContent;

/**
 * A fragment representing a single petCareInst detail screen.
 * This fragment is either contained in a {@link PetCareInstListActivity}
 * in two-pane mode (on tablets) or a {@link PetCareInstDetailActivity}
 * on handsets.
 */
public class PetCareInstDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private PetsToCareForContent.PetsToCareForInst mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PetCareInstDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);








        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = PetsToCareForContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

        }
/*
        nItem = PetsToCareForContent.Hatter
    */






    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cornora, container, false);


        Button ff = ((Button) rootView.findViewById(R.id.button1));
        ff.setText("ooooooog");

        Button qq = ((Button) rootView.findViewById(R.id.button2));


        //Button qq = ((Button) rootView.findViewById(R.id.button2));


        // Show the dummy content as text in a TextView.
        if (mItem != null) {

            //((TextView) rootView.findViewById(R.id.petcareinst_detail)).setText(mItem.content);
            ((TextView) rootView.findViewById(R.id.textViewTest1)).setText(mItem.content);
            //((TextView) rootView.findViewById(R.id.textViewTest1)).setText("Hello World");



            switch (mItem.content){
                case "Amphibians":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Arachnids":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Bird":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Cats":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Dogs":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Fish (Cold Water)":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Fish (Salt Water)":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Guinea Pigs":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Rabbits":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Reptiles":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Small Pets":
                    qq.setText("You clicked on " + mItem.content);
                    break;
                case "Other":
                    qq.setText("You clicked on " + mItem.content + "\n" + "/\n" + "/\n" + "/\n" + "/\n" + "/\n" + "/\n" + "/\n" + "/\n" + "/\n" + "\n" + "/\n" + "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n"+ "/\n" + "lets c");
                    break;

            }
            //((Button) rootView.findViewById(R.id.button2)).setText(mItem.content);

           // qq.setText(mItem.content);

        }

        return rootView;
    }
}
